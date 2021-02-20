package typings.reactMdl.mod

import typings.react.mod.DOMAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextfieldProps
  extends MDLHTMLAttributes
     with DOMAttributes[HTMLInputElement] {
  
  var error: js.UndefOr[ReactNode] = js.native
  
  var expandable: js.UndefOr[Boolean] = js.native
  
  var expandableIcon: js.UndefOr[String] = js.native
  
  var floatingLabel: js.UndefOr[Boolean] = js.native
  
  var inputClassName: js.UndefOr[String] = js.native
  
  var label: String = js.native
  
  var maxRows: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String | Double] = js.native
}
object TextfieldProps {
  
  @scala.inline
  def apply(label: String): TextfieldProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextfieldProps]
  }
  
  @scala.inline
  implicit class TextfieldPropsMutableBuilder[Self <: TextfieldProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExpandable(value: Boolean): Self = StObject.set(x, "expandable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableIcon(value: String): Self = StObject.set(x, "expandableIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandableIconUndefined: Self = StObject.set(x, "expandableIcon", js.undefined)
    
    @scala.inline
    def setExpandableUndefined: Self = StObject.set(x, "expandable", js.undefined)
    
    @scala.inline
    def setFloatingLabel(value: Boolean): Self = StObject.set(x, "floatingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatingLabelUndefined: Self = StObject.set(x, "floatingLabel", js.undefined)
    
    @scala.inline
    def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
