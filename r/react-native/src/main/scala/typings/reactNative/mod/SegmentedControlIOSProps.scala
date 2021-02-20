package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentedControlIOSProps extends ViewProps {
  
  /**
    * If false the user won't be able to interact with the control. Default value is true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, then selecting a segment won't persist visually.
    * The onValueChange callback will still work as expected.
    */
  var momentary: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback that is called when the user taps a segment;
    * passes the event as an argument
    */
  var onChange: js.UndefOr[
    js.Function1[/* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent], Unit]
  ] = js.native
  
  /**
    * Callback that is called when the user taps a segment; passes the segment's value as an argument
    */
  var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  
  /**
    * The index in props.values of the segment to be (pre)selected.
    */
  var selectedIndex: js.UndefOr[Double] = js.native
  
  /**
    * Accent color of the control.
    */
  var tintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The labels for the control's segment buttons, in order.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object SegmentedControlIOSProps {
  
  @scala.inline
  def apply(): SegmentedControlIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentedControlIOSProps]
  }
  
  @scala.inline
  implicit class SegmentedControlIOSPropsMutableBuilder[Self <: SegmentedControlIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setMomentary(value: Boolean): Self = StObject.set(x, "momentary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentaryUndefined: Self = StObject.set(x, "momentary", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
