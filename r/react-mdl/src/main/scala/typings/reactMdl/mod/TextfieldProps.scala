package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextfieldProps
  extends StObject
     with MDLHTMLAttributes
     with DOMAttributes[HTMLInputElement] {
  
  var error: js.UndefOr[ReactNode] = js.undefined
  
  var expandable: js.UndefOr[Boolean] = js.undefined
  
  var expandableIcon: js.UndefOr[String] = js.undefined
  
  var floatingLabel: js.UndefOr[Boolean] = js.undefined
  
  var inputClassName: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var maxRows: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | Double] = js.undefined
}
object TextfieldProps {
  
  inline def apply(label: String): TextfieldProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextfieldProps]
  }
  
  extension [Self <: TextfieldProps](x: Self) {
    
    inline def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    inline def setExpandableIcon(value: String): Self = StObject.set(x, "expandableIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandableIconUndefined: Self = StObject.set(x, "expandableIcon", js.undefined)
    
    inline def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    inline def setFloatingLabel(value: Boolean): Self = StObject.set(x, "floatingLabel", value.asInstanceOf[js.Any])
    
    inline def setFloatingLabelUndefined: Self = StObject.set(x, "floatingLabel", js.undefined)
    
    inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
    
    inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
