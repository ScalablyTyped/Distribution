package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableToggleCommonProps
  extends StObject
     with TableCommonProps {
  
  var checked: js.UndefOr[Boolean] = js.undefined
  
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object TableToggleCommonProps {
  
  inline def apply(): TableToggleCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableToggleCommonProps]
  }
  
  extension [Self <: TableToggleCommonProps](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
