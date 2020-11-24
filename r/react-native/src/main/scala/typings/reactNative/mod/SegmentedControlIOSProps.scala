package typings.reactNative.mod

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
  implicit class SegmentedControlIOSPropsOps[Self <: SegmentedControlIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setMomentary(value: Boolean): Self = this.set("momentary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMomentary: Self = this.set("momentary", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ String => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    
    @scala.inline
    def setTintColor(value: ColorValue): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
