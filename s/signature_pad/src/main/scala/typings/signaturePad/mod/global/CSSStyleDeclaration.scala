package typings.signaturePad.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSStyleDeclaration extends js.Object {
  
  var msTouchAction: String = js.native
}
object CSSStyleDeclaration {
  
  @scala.inline
  def apply(msTouchAction: String): CSSStyleDeclaration = {
    val __obj = js.Dynamic.literal(msTouchAction = msTouchAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSStyleDeclaration]
  }
  
  @scala.inline
  implicit class CSSStyleDeclarationOps[Self <: CSSStyleDeclaration] (val x: Self) extends AnyVal {
    
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
    def setMsTouchAction(value: String): Self = this.set("msTouchAction", value.asInstanceOf[js.Any])
  }
}
