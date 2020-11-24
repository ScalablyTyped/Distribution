package typings.semanticUiVisibility.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'continuous'> */
@js.native
trait PickImplcontinuous extends js.Object {
  
  var continuous: Boolean = js.native
}
object PickImplcontinuous {
  
  @scala.inline
  def apply(continuous: Boolean): PickImplcontinuous = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplcontinuous]
  }
  
  @scala.inline
  implicit class PickImplcontinuousOps[Self <: PickImplcontinuous] (val x: Self) extends AnyVal {
    
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
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
  }
}
