package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EachBindingData
  extends BaseBindingData
     with BindingData {
  
  var condition: js.UndefOr[(js.Function1[/* scope */ js.Any, _]) | Null] = js.native
  
  var getKey: js.UndefOr[(js.Function1[/* scope */ js.Any, _]) | Null] = js.native
  
  var indexName: js.UndefOr[Double] = js.native
  
  var itemName: String = js.native
  
  var template: TemplateChunk[_, _] = js.native
}
object EachBindingData {
  
  @scala.inline
  def apply(itemName: String, template: TemplateChunk[_, _]): EachBindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachBindingData]
  }
  
  @scala.inline
  implicit class EachBindingDataOps[Self <: EachBindingData] (val x: Self) extends AnyVal {
    
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
    def setItemName(value: String): Self = this.set("itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: TemplateChunk[_, _]): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondition(value: /* scope */ js.Any => _): Self = this.set("condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setConditionNull: Self = this.set("condition", null)
    
    @scala.inline
    def setGetKey(value: /* scope */ js.Any => _): Self = this.set("getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetKey: Self = this.set("getKey", js.undefined)
    
    @scala.inline
    def setGetKeyNull: Self = this.set("getKey", null)
    
    @scala.inline
    def setIndexName(value: Double): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexName: Self = this.set("indexName", js.undefined)
  }
}
