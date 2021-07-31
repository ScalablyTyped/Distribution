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
  
  @scala.inline
  def apply(): TableToggleCommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableToggleCommonProps]
  }
  
  @scala.inline
  implicit class TableToggleCommonPropsMutableBuilder[Self <: TableToggleCommonProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    @scala.inline
    def setOnChange(value: () => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
