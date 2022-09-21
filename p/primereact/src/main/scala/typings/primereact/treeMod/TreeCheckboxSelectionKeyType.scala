package typings.primereact.treeMod

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
  
  extension [Self <: TreeCheckboxSelectionKeyType](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setPartialChecked(value: Boolean): Self = StObject.set(x, "partialChecked", value.asInstanceOf[js.Any])
    
    inline def setPartialCheckedUndefined: Self = StObject.set(x, "partialChecked", js.undefined)
  }
}
