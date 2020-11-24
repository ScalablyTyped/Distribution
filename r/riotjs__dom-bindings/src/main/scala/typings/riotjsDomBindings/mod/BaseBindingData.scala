package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseBindingData extends js.Object {
  
  var evaluate: js.UndefOr[js.Function1[/* scope */ js.Any, _]] = js.native
  
  var redundantAttribute: js.UndefOr[String] = js.native
  
  var selector: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[BindingType] = js.native
}
object BaseBindingData {
  
  @scala.inline
  def apply(): BaseBindingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBindingData]
  }
  
  @scala.inline
  implicit class BaseBindingDataOps[Self <: BaseBindingData] (val x: Self) extends AnyVal {
    
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
    def setEvaluate(value: /* scope */ js.Any => _): Self = this.set("evaluate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEvaluate: Self = this.set("evaluate", js.undefined)
    
    @scala.inline
    def setRedundantAttribute(value: String): Self = this.set("redundantAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedundantAttribute: Self = this.set("redundantAttribute", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setType(value: BindingType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
