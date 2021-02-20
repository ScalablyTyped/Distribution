package typings.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlickGridAutoTooltipsOption extends PluginOptions {
  
  /**
    * Enable tooltip for grid cells
    * @default true
    */
  var enableForCells: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable tooltip for header cells
    * @default false
    */
  var enableForHeaderCells: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum length for a tooltip
    * @default null
    */
  var maxToolTipLength: js.UndefOr[Double] = js.native
}
object SlickGridAutoTooltipsOption {
  
  @scala.inline
  def apply(): SlickGridAutoTooltipsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlickGridAutoTooltipsOption]
  }
  
  @scala.inline
  implicit class SlickGridAutoTooltipsOptionMutableBuilder[Self <: SlickGridAutoTooltipsOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableForCells(value: Boolean): Self = StObject.set(x, "enableForCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableForCellsUndefined: Self = StObject.set(x, "enableForCells", js.undefined)
    
    @scala.inline
    def setEnableForHeaderCells(value: Boolean): Self = StObject.set(x, "enableForHeaderCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableForHeaderCellsUndefined: Self = StObject.set(x, "enableForHeaderCells", js.undefined)
    
    @scala.inline
    def setMaxToolTipLength(value: Double): Self = StObject.set(x, "maxToolTipLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxToolTipLengthUndefined: Self = StObject.set(x, "maxToolTipLength", js.undefined)
  }
}
