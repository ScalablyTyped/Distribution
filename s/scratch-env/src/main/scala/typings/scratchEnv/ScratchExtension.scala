package typings.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScratchExtension extends StObject {
  
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
  implicit class ScratchExtensionMutableBuilder[Self <: ScratchExtension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInfo(value: () => ExtensionMetadata): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
  }
}
