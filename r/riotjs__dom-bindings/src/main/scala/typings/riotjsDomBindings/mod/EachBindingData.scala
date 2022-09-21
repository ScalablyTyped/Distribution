package typings.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EachBindingData[Scope, ItemName /* <: String */, IndexName /* <: String */, ItemValue /* <: Any */, ExtendedScope] extends StObject {
  
  var condition: js.UndefOr[(js.Function1[/* scope */ ExtendedScope, Any]) | Null] = js.undefined
  
  def evaluate(scope: Scope): js.Array[ItemValue]
  
  var getKey: js.UndefOr[(js.Function1[/* scope */ ExtendedScope, Any]) | Null] = js.undefined
  
  var indexName: js.UndefOr[IndexName | Null] = js.undefined
  
  var itemName: ItemName
  
  var redundantAttribute: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var template: TemplateChunk[ExtendedScope, Any]
}
object EachBindingData {
  
  inline def apply[Scope, ItemName /* <: String */, IndexName /* <: String */, ItemValue /* <: Any */, ExtendedScope](
    evaluate: Scope => js.Array[ItemValue],
    itemName: ItemName,
    template: TemplateChunk[ExtendedScope, Any]
  ): EachBindingData[Scope, ItemName, IndexName, ItemValue, ExtendedScope] = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachBindingData[Scope, ItemName, IndexName, ItemValue, ExtendedScope]]
  }
  
  extension [Self <: EachBindingData[?, ?, ?, ?, ?], Scope, ItemName /* <: String */, IndexName /* <: String */, ItemValue /* <: Any */, ExtendedScope](x: Self & (EachBindingData[Scope, ItemName, IndexName, ItemValue, ExtendedScope])) {
    
    inline def setCondition(value: /* scope */ ExtendedScope => Any): Self = StObject.set(x, "condition", js.Any.fromFunction1(value))
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setEvaluate(value: Scope => js.Array[ItemValue]): Self = StObject.set(x, "evaluate", js.Any.fromFunction1(value))
    
    inline def setGetKey(value: /* scope */ ExtendedScope => Any): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setGetKeyNull: Self = StObject.set(x, "getKey", null)
    
    inline def setGetKeyUndefined: Self = StObject.set(x, "getKey", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameNull: Self = StObject.set(x, "indexName", null)
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    inline def setItemName(value: ItemName): Self = StObject.set(x, "itemName", value.asInstanceOf[js.Any])
    
    inline def setRedundantAttribute(value: String): Self = StObject.set(x, "redundantAttribute", value.asInstanceOf[js.Any])
    
    inline def setRedundantAttributeUndefined: Self = StObject.set(x, "redundantAttribute", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setTemplate(value: TemplateChunk[ExtendedScope, Any]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
