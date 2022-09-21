package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionsFacets extends StObject {
  
  @JSName("$action")
  var $action: java.lang.String
  
  @JSName("$conditions")
  var $conditions: Unit
  
  @JSName("$toChildren")
  var $toChildren: Unit
  
  @JSName("/\\(.+\\)/")
  var SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String
  
  var facets: Action
  
  var items: java.lang.String
  
  var properties: `0`
  
  var `type`: java.lang.String
}
object ConditionsFacets {
  
  inline def apply(
    $action: java.lang.String,
    $conditions: Unit,
    $toChildren: Unit,
    SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String,
    facets: Action,
    items: java.lang.String,
    properties: `0`,
    `type`: java.lang.String
  ): ConditionsFacets = {
    val __obj = js.Dynamic.literal($action = $action.asInstanceOf[js.Any], $conditions = $conditions.asInstanceOf[js.Any], $toChildren = $toChildren.asInstanceOf[js.Any], facets = facets.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("/\\(.+\\)/")(SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionsFacets]
  }
  
  extension [Self <: ConditionsFacets](x: Self) {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
    
    inline def set$conditions(value: Unit): Self = StObject.set(x, "$conditions", value.asInstanceOf[js.Any])
    
    inline def set$toChildren(value: Unit): Self = StObject.set(x, "$toChildren", value.asInstanceOf[js.Any])
    
    inline def setFacets(value: Action): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setItems(value: java.lang.String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: `0`): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash(value: java.lang.String): Self = StObject.set(x, "/\\(.+\\)/", value.asInstanceOf[js.Any])
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
