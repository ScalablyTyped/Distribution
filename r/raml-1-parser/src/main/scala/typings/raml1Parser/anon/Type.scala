package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  @JSName("$action")
  var $action: java.lang.String
  
  @JSName("$conditions")
  var $conditions: js.Array[java.lang.String]
  
  @JSName("$toChildren")
  var $toChildren: Unit
  
  @JSName("/\\(.+\\)/")
  var SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: Unit
  
  var facets: Unit
  
  var items: Unit
  
  var properties: Unit
  
  var `type`: Unit
}
object Type {
  
  inline def apply(
    $action: java.lang.String,
    $conditions: js.Array[java.lang.String],
    $toChildren: Unit,
    SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: Unit,
    facets: Unit,
    items: Unit,
    properties: Unit,
    `type`: Unit
  ): Type = {
    val __obj = js.Dynamic.literal($action = $action.asInstanceOf[js.Any], $conditions = $conditions.asInstanceOf[js.Any], $toChildren = $toChildren.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("/\\(.+\\)/")(SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
    
    inline def set$conditions(value: js.Array[java.lang.String]): Self = StObject.set(x, "$conditions", value.asInstanceOf[js.Any])
    
    inline def set$conditionsVarargs(value: java.lang.String*): Self = StObject.set(x, "$conditions", js.Array(value*))
    
    inline def set$toChildren(value: Unit): Self = StObject.set(x, "$toChildren", value.asInstanceOf[js.Any])
    
    inline def setFacets(value: Unit): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Unit): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Unit): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash(value: Unit): Self = StObject.set(x, "/\\(.+\\)/", value.asInstanceOf[js.Any])
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
