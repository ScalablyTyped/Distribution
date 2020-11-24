package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassArgsFirst extends js.Object {
  
  var passArgsFirst: Boolean = js.native
}
object PassArgsFirst {
  
  @scala.inline
  def apply(passArgsFirst: Boolean): PassArgsFirst = {
    val __obj = js.Dynamic.literal(passArgsFirst = passArgsFirst.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassArgsFirst]
  }
  
  @scala.inline
  implicit class PassArgsFirstOps[Self <: PassArgsFirst] (val x: Self) extends AnyVal {
    
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
    def setPassArgsFirst(value: Boolean): Self = this.set("passArgsFirst", value.asInstanceOf[js.Any])
  }
}
