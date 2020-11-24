package typings.semanticUiRating.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-rating.SemanticUI.RatingSettings._Impl, 'fireOnInit'> */
@js.native
trait PickImplfireOnInit extends js.Object {
  
  var fireOnInit: Boolean = js.native
}
object PickImplfireOnInit {
  
  @scala.inline
  def apply(fireOnInit: Boolean): PickImplfireOnInit = {
    val __obj = js.Dynamic.literal(fireOnInit = fireOnInit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfireOnInit]
  }
  
  @scala.inline
  implicit class PickImplfireOnInitOps[Self <: PickImplfireOnInit] (val x: Self) extends AnyVal {
    
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
    def setFireOnInit(value: Boolean): Self = this.set("fireOnInit", value.asInstanceOf[js.Any])
  }
}
