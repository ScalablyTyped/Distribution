package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlickGridCheckBoxSelectColumnOptions
  extends StObject
     with PluginOptions {
  
  /**
    * Column to add the checkbox to
    * @default "_checkbox_selector"
    */
  var columnId: js.UndefOr[String] = js.undefined
  
  /**
    * CSS class to be added to cells in this column
    * @default null
    */
  var cssClass: js.UndefOr[String] = js.undefined
  
  /**
    * Tooltip text to display for this column
    * @default "Select/Deselect All"
    */
  var toolTip: js.UndefOr[String] = js.undefined
  
  /**
    * Width of the column
    * @default 30
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SlickGridCheckBoxSelectColumnOptions {
  
  inline def apply(): SlickGridCheckBoxSelectColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickGridCheckBoxSelectColumnOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlickGridCheckBoxSelectColumnOptions] (val x: Self) extends AnyVal {
    
    inline def setColumnId(value: String): Self = StObject.set(x, "columnId", value.asInstanceOf[js.Any])
    
    inline def setColumnIdUndefined: Self = StObject.set(x, "columnId", js.undefined)
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setToolTip(value: String): Self = StObject.set(x, "toolTip", value.asInstanceOf[js.Any])
    
    inline def setToolTipUndefined: Self = StObject.set(x, "toolTip", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
