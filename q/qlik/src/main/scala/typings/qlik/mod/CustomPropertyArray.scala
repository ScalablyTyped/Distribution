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
  
  @scala.inline
  def apply(component: Unit): CustomPropertyArray = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[CustomPropertyArray]
  }
  
  @scala.inline
  implicit class CustomPropertyArrayMutableBuilder[Self <: CustomPropertyArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTranslation(value: String): Self = StObject.set(x, "addTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTranslationUndefined: Self = StObject.set(x, "addTranslation", js.undefined)
    
    @scala.inline
    def setAllowAdd(value: Boolean): Self = StObject.set(x, "allowAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAddUndefined: Self = StObject.set(x, "allowAdd", js.undefined)
    
    @scala.inline
    def setAllowMove(value: Boolean): Self = StObject.set(x, "allowMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMoveUndefined: Self = StObject.set(x, "allowMove", js.undefined)
    
    @scala.inline
    def setAllowRemove(value: Boolean): Self = StObject.set(x, "allowRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRemoveUndefined: Self = StObject.set(x, "allowRemove", js.undefined)
    
    @scala.inline
    def setComponent(value: Unit): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTitleRef(value: String): Self = StObject.set(x, "itemTitleRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTitleRefUndefined: Self = StObject.set(x, "itemTitleRef", js.undefined)
    
    @scala.inline
    def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
