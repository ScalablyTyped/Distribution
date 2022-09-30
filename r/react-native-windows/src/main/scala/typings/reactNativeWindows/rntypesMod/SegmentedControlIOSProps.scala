package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentedControlIOSProps
  extends StObject
     with ViewProps {
  
  /**
    * If false the user won't be able to interact with the control. Default value is true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, then selecting a segment won't persist visually.
    * The onValueChange callback will still work as expected.
    */
  var momentary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback that is called when the user taps a segment;
    * passes the event as an argument
    */
  var onChange: js.UndefOr[
    js.Function1[/* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent], Unit]
  ] = js.undefined
  
  /**
    * Callback that is called when the user taps a segment; passes the segment's value as an argument
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  
  /**
    * The index in props.values of the segment to be (pre)selected.
    */
  var selectedIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Accent color of the control.
    */
  var tintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * The labels for the control's segment buttons, in order.
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object SegmentedControlIOSProps {
  
  inline def apply(): SegmentedControlIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentedControlIOSProps]
  }
  
  extension [Self <: SegmentedControlIOSProps](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMomentary(value: Boolean): Self = StObject.set(x, "momentary", value.asInstanceOf[js.Any])
    
    inline def setMomentaryUndefined: Self = StObject.set(x, "momentary", js.undefined)
    
    inline def setOnChange(value: /* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnValueChange(value: /* value */ String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    inline def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
