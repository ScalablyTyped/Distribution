package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chromatic extends js.Object {
  
  var chromatic: Disable = js.native
}
object Chromatic {
  
  @scala.inline
  def apply(chromatic: Disable): Chromatic = {
    val __obj = js.Dynamic.literal(chromatic = chromatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chromatic]
  }
  
  @scala.inline
  implicit class ChromaticOps[Self <: Chromatic] (val x: Self) extends AnyVal {
    
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
    def setChromatic(value: Disable): Self = this.set("chromatic", value.asInstanceOf[js.Any])
  }
}
