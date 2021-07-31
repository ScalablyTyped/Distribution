package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EachBindingData
  extends StObject
     with BaseBindingData
     with BindingData {
  
  var condition: js.UndefOr[(js.Function1[/* scope */ js.Any, js.Any]) | Null] = js.undefined
  
  var getKey: js.UndefOr[(js.Function1[/* scope */ js.Any, js.Any]) | Null] = js.undefined
  
  var indexName: js.UndefOr[Double] = js.undefined
  
  var itemName: String
  
  var template: TemplateChunk[js.Any, js.Any]
}
object EachBindingData {
  
  @scala.inline
  def apply(itemName: String, template: TemplateChunk[js.Any, js.Any]): EachBindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachBindingData]
  }
  
  @scala.inline
  implicit class EachBindingDataMutableBuilder[Self <: EachBindingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: /* scope */ js.Any => js.Any): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConditionNull: Self = StObject.set(x, "condition", null)
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setGetKey(value: /* scope */ js.Any => js.Any): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetKeyNull: Self = StObject.set(x, "getKey", null)
    
    @scala.inline
    def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    @scala.inline
    def setIndexName(value: Double): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    @scala.inline
    def setItemName(value: String): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: TemplateChunk[js.Any, js.Any]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
