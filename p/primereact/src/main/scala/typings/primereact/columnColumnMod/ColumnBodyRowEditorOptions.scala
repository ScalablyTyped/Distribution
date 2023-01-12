package typings.primereact.columnColumnMod

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnBodyRowEditorOptions extends StObject {
  
  var cancelClassName: js.UndefOr[String] = js.undefined
  
  var cancelIconClassName: js.UndefOr[String] = js.undefined
  
  var editing: js.UndefOr[Boolean] = js.undefined
  
  var element: js.UndefOr[Element] = js.undefined
  
  var initClassName: js.UndefOr[String] = js.undefined
  
  var initIconClassName: js.UndefOr[String] = js.undefined
  
  var onCancelClick: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
  
  var onInitClick: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
  
  var onSaveClick: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
  
  var saveClassName: js.UndefOr[String] = js.undefined
  
  var saveIconClassName: js.UndefOr[String] = js.undefined
}
object ColumnBodyRowEditorOptions {
  
  inline def apply(): ColumnBodyRowEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnBodyRowEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnBodyRowEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setCancelClassName(value: String): Self = StObject.set(x, "cancelClassName", value.asInstanceOf[js.Any])
    
    inline def setCancelClassNameUndefined: Self = StObject.set(x, "cancelClassName", js.undefined)
    
    inline def setCancelIconClassName(value: String): Self = StObject.set(x, "cancelIconClassName", value.asInstanceOf[js.Any])
    
    inline def setCancelIconClassNameUndefined: Self = StObject.set(x, "cancelIconClassName", js.undefined)
    
    inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setInitClassName(value: String): Self = StObject.set(x, "initClassName", value.asInstanceOf[js.Any])
    
    inline def setInitClassNameUndefined: Self = StObject.set(x, "initClassName", js.undefined)
    
    inline def setInitIconClassName(value: String): Self = StObject.set(x, "initIconClassName", value.asInstanceOf[js.Any])
    
    inline def setInitIconClassNameUndefined: Self = StObject.set(x, "initIconClassName", js.undefined)
    
    inline def setOnCancelClick(value: /* e */ Any => Unit): Self = StObject.set(x, "onCancelClick", js.Any.fromFunction1(value))
    
    inline def setOnCancelClickUndefined: Self = StObject.set(x, "onCancelClick", js.undefined)
    
    inline def setOnInitClick(value: /* e */ Any => Unit): Self = StObject.set(x, "onInitClick", js.Any.fromFunction1(value))
    
    inline def setOnInitClickUndefined: Self = StObject.set(x, "onInitClick", js.undefined)
    
    inline def setOnSaveClick(value: /* e */ Any => Unit): Self = StObject.set(x, "onSaveClick", js.Any.fromFunction1(value))
    
    inline def setOnSaveClickUndefined: Self = StObject.set(x, "onSaveClick", js.undefined)
    
    inline def setSaveClassName(value: String): Self = StObject.set(x, "saveClassName", value.asInstanceOf[js.Any])
    
    inline def setSaveClassNameUndefined: Self = StObject.set(x, "saveClassName", js.undefined)
    
    inline def setSaveIconClassName(value: String): Self = StObject.set(x, "saveIconClassName", value.asInstanceOf[js.Any])
    
    inline def setSaveIconClassNameUndefined: Self = StObject.set(x, "saveIconClassName", js.undefined)
  }
}
