package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlickGridAutoTooltipsOption
  extends StObject
     with PluginOptions {
  
  /**
    * Enable tooltip for grid cells
    * @default true
    */
  var enableForCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable tooltip for header cells
    * @default false
    */
  var enableForHeaderCells: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum length for a tooltip
    * @default null
    */
  var maxToolTipLength: js.UndefOr[Double] = js.undefined
}
object SlickGridAutoTooltipsOption {
  
  inline def apply(): SlickGridAutoTooltipsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickGridAutoTooltipsOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlickGridAutoTooltipsOption] (val x: Self) extends AnyVal {
    
    inline def setEnableForCells(value: Boolean): Self = StObject.set(x, "enableForCells", value.asInstanceOf[js.Any])
    
    inline def setEnableForCellsUndefined: Self = StObject.set(x, "enableForCells", js.undefined)
    
    inline def setEnableForHeaderCells(value: Boolean): Self = StObject.set(x, "enableForHeaderCells", value.asInstanceOf[js.Any])
    
    inline def setEnableForHeaderCellsUndefined: Self = StObject.set(x, "enableForHeaderCells", js.undefined)
    
    inline def setMaxToolTipLength(value: Double): Self = StObject.set(x, "maxToolTipLength", value.asInstanceOf[js.Any])
    
    inline def setMaxToolTipLengthUndefined: Self = StObject.set(x, "maxToolTipLength", js.undefined)
  }
}
