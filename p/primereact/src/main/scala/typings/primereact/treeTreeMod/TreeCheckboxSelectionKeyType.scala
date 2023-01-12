package typings.primereact.treeTreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeCheckboxSelectionKeyType extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var partialChecked: js.UndefOr[Boolean] = js.undefined
}
object TreeCheckboxSelectionKeyType {
  
  inline def apply(): TreeCheckboxSelectionKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeCheckboxSelectionKeyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeCheckboxSelectionKeyType] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setPartialChecked(value: Boolean): Self = StObject.set(x, "partialChecked", value.asInstanceOf[js.Any])
    
    inline def setPartialCheckedUndefined: Self = StObject.set(x, "partialChecked", js.undefined)
  }
}
