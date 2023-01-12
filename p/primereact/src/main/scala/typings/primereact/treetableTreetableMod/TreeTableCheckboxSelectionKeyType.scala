package typings.primereact.treetableTreetableMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTableCheckboxSelectionKeyType extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var partialChecked: js.UndefOr[Boolean] = js.undefined
}
object TreeTableCheckboxSelectionKeyType {
  
  inline def apply(): TreeTableCheckboxSelectionKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeTableCheckboxSelectionKeyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeTableCheckboxSelectionKeyType] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setPartialChecked(value: Boolean): Self = StObject.set(x, "partialChecked", value.asInstanceOf[js.Any])
    
    inline def setPartialCheckedUndefined: Self = StObject.set(x, "partialChecked", js.undefined)
  }
}
