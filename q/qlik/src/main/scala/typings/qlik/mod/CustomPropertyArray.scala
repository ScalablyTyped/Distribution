package typings.qlik.mod

import typings.qlik.qlikStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyArray
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var addTranslation: js.UndefOr[String] = js.undefined
  
  var allowAdd: js.UndefOr[Boolean] = js.undefined
  
  var allowMove: js.UndefOr[Boolean] = js.undefined
  
  var allowRemove: js.UndefOr[Boolean] = js.undefined
  
  var component: Unit
  
  var itemTitleRef: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_CustomPropertyArray: array
}
object CustomPropertyArray {
  
  inline def apply(component: Unit): CustomPropertyArray = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[CustomPropertyArray]
  }
  
  extension [Self <: CustomPropertyArray](x: Self) {
    
    inline def setAddTranslation(value: String): Self = StObject.set(x, "addTranslation", value.asInstanceOf[js.Any])
    
    inline def setAddTranslationUndefined: Self = StObject.set(x, "addTranslation", js.undefined)
    
    inline def setAllowAdd(value: Boolean): Self = StObject.set(x, "allowAdd", value.asInstanceOf[js.Any])
    
    inline def setAllowAddUndefined: Self = StObject.set(x, "allowAdd", js.undefined)
    
    inline def setAllowMove(value: Boolean): Self = StObject.set(x, "allowMove", value.asInstanceOf[js.Any])
    
    inline def setAllowMoveUndefined: Self = StObject.set(x, "allowMove", js.undefined)
    
    inline def setAllowRemove(value: Boolean): Self = StObject.set(x, "allowRemove", value.asInstanceOf[js.Any])
    
    inline def setAllowRemoveUndefined: Self = StObject.set(x, "allowRemove", js.undefined)
    
    inline def setComponent(value: Unit): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setItemTitleRef(value: String): Self = StObject.set(x, "itemTitleRef", value.asInstanceOf[js.Any])
    
    inline def setItemTitleRefUndefined: Self = StObject.set(x, "itemTitleRef", js.undefined)
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
