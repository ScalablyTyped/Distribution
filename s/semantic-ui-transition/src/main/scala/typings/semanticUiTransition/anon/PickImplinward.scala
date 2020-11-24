package typings.semanticUiTransition.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.Transition.ClassNameSettings._Impl, 'inward'> */
@js.native
trait PickImplinward extends js.Object {
  
  var inward: String = js.native
}
object PickImplinward {
  
  @scala.inline
  def apply(inward: String): PickImplinward = {
    val __obj = js.Dynamic.literal(inward = inward.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinward]
  }
  
  @scala.inline
  implicit class PickImplinwardOps[Self <: PickImplinward] (val x: Self) extends AnyVal {
    
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
    def setInward(value: String): Self = this.set("inward", value.asInstanceOf[js.Any])
  }
}
