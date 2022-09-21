package typings.rcPicker

import typings.rcPicker.interfaceMod.DisabledTimes
import typings.rcPicker.interfaceMod.PickerMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warnUtilMod {
  
  @JSImport("rc-picker/es/utils/warnUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def legacyPropsWarning(props: WarningProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("legacyPropsWarning")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait WarningProps
    extends StObject
       with DisabledTimes {
    
    var picker: js.UndefOr[PickerMode] = js.undefined
  }
  object WarningProps {
    
    inline def apply(): WarningProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WarningProps]
    }
    
    extension [Self <: WarningProps](x: Self) {
      
      inline def setPicker(value: PickerMode): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      inline def setPickerUndefined: Self = StObject.set(x, "picker", js.undefined)
    }
  }
}
