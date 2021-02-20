package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomArray extends ICustomControl {
  
  var addTranslation: String = js.native
  
  var allowAdd: Boolean = js.native
  
  var allowMove: Boolean = js.native
  
  var allowRemove: Boolean = js.native
  
  var itemTitleRef: String = js.native
}
object ICustomArray {
  
  @scala.inline
  def apply(
    addTranslation: String,
    allowAdd: Boolean,
    allowMove: Boolean,
    allowRemove: Boolean,
    itemTitleRef: String,
    label: String,
    ref: String,
    `type`: String
  ): ICustomArray = {
    val __obj = js.Dynamic.literal(addTranslation = addTranslation.asInstanceOf[js.Any], allowAdd = allowAdd.asInstanceOf[js.Any], allowMove = allowMove.asInstanceOf[js.Any], allowRemove = allowRemove.asInstanceOf[js.Any], itemTitleRef = itemTitleRef.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomArray]
  }
  
  @scala.inline
  implicit class ICustomArrayMutableBuilder[Self <: ICustomArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTranslation(value: String): Self = StObject.set(x, "addTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAdd(value: Boolean): Self = StObject.set(x, "allowAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMove(value: Boolean): Self = StObject.set(x, "allowMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRemove(value: Boolean): Self = StObject.set(x, "allowRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTitleRef(value: String): Self = StObject.set(x, "itemTitleRef", value.asInstanceOf[js.Any])
  }
}
