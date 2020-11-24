package typings.scratchEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScratchExtension extends js.Object {
  
  /** Returns data about the extension. */
  def getInfo(): ExtensionMetadata = js.native
}
object ScratchExtension {
  
  @scala.inline
  def apply(getInfo: () => ExtensionMetadata): ScratchExtension = {
    val __obj = js.Dynamic.literal(getInfo = js.Any.fromFunction0(getInfo))
    __obj.asInstanceOf[ScratchExtension]
  }
  
  @scala.inline
  implicit class ScratchExtensionOps[Self <: ScratchExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetInfo(value: () => ExtensionMetadata): Self = this.set("getInfo", js.Any.fromFunction0(value))
  }
}
