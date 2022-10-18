package typings.rcPicker

import org.scalablytyped.runtime.Shortcut
import typings.rcPicker.esInterfaceMod.NullableDateType
import typings.rcPicker.esInterfaceMod.RangeValue
import typings.rcPicker.rcPickerBooleans.`false`
import typings.rcPicker.rcPickerStrings.left
import typings.rcPicker.rcPickerStrings.right
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esRangeContextMod extends Shortcut {
  
  @JSImport("rc-picker/es/RangeContext", JSImport.Default)
  @js.native
  val default: Context[RangeContextProps] = js.native
  
  trait RangeContextProps extends StObject {
    
    var hoverRangedValue: js.UndefOr[RangeValue[Any]] = js.undefined
    
    var inRange: js.UndefOr[Boolean] = js.undefined
    
    var panelPosition: js.UndefOr[left | right | `false`] = js.undefined
    
    /**
      * Set displayed range value style.
      * Panel only has one value, this is only style effect.
      */
    var rangedValue: js.UndefOr[(js.Tuple2[NullableDateType[Any], NullableDateType[Any]]) | Null] = js.undefined
  }
  object RangeContextProps {
    
    inline def apply(): RangeContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeContextProps]
    }
    
    extension [Self <: RangeContextProps](x: Self) {
      
      inline def setHoverRangedValue(value: RangeValue[Any]): Self = StObject.set(x, "hoverRangedValue", value.asInstanceOf[js.Any])
      
      inline def setHoverRangedValueNull: Self = StObject.set(x, "hoverRangedValue", null)
      
      inline def setHoverRangedValueUndefined: Self = StObject.set(x, "hoverRangedValue", js.undefined)
      
      inline def setInRange(value: Boolean): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      inline def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
      
      inline def setPanelPosition(value: left | right | `false`): Self = StObject.set(x, "panelPosition", value.asInstanceOf[js.Any])
      
      inline def setPanelPositionUndefined: Self = StObject.set(x, "panelPosition", js.undefined)
      
      inline def setRangedValue(value: js.Tuple2[NullableDateType[Any], NullableDateType[Any]]): Self = StObject.set(x, "rangedValue", value.asInstanceOf[js.Any])
      
      inline def setRangedValueNull: Self = StObject.set(x, "rangedValue", null)
      
      inline def setRangedValueUndefined: Self = StObject.set(x, "rangedValue", js.undefined)
    }
  }
  
  type _To = Context[RangeContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esRangeContextMod.foo` */
  override def _to: Context[RangeContextProps] = default
}
