package typings.reactNativeCommunitySegmentedControl

import typings.react.mod.Component
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.ViewProps
import typings.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.dark
import typings.reactNativeCommunitySegmentedControl.reactNativeCommunitySegmentedControlStrings.light
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/segmented-control", JSImport.Default)
  @js.native
  class default () extends SegmentedControl
  
  @js.native
  trait FontStyle extends StObject {
    
    /**
      * Font Color of Segmented Control when Active
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Font Family of the Segmented Control when Active
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /**
      * Font Size of Segmented Control when Active
      */
    var fontSize: js.UndefOr[Double] = js.native
  }
  object FontStyle {
    
    @scala.inline
    def apply(): FontStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontStyle]
    }
    
    @scala.inline
    implicit class FontStyleMutableBuilder[Self <: FontStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    }
  }
  
  @js.native
  trait NativeSegmentedControlIOSChangeEvent extends TargetedEvent {
    
    var selectedSegmentIndex: Double = js.native
    
    var value: String = js.native
  }
  object NativeSegmentedControlIOSChangeEvent {
    
    @scala.inline
    def apply(selectedSegmentIndex: Double, target: Double, value: String): NativeSegmentedControlIOSChangeEvent = {
      val __obj = js.Dynamic.literal(selectedSegmentIndex = selectedSegmentIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeSegmentedControlIOSChangeEvent]
    }
    
    @scala.inline
    implicit class NativeSegmentedControlIOSChangeEventMutableBuilder[Self <: NativeSegmentedControlIOSChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedSegmentIndex(value: Double): Self = StObject.set(x, "selectedSegmentIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @js.native
  trait SegmentedControl
    extends Component[SegmentedControlProps, js.Object, js.Any]
  
  /**
    * Use `SegmentedControl` to render a UISegmentedControl iOS.
    *
    * #### Programmatically changing selected index
    *
    * The selected index can be changed on the fly by assigning the
    * selectIndex prop to a state variable, then changing that variable.
    * Note that the state variable would need to be updated as the user
    * selects a value and changes the index, as shown in the example below.
    *
    * ````
    * <SegmentedControl
    *   values={['One', 'Two']}
    *   selectedIndex={this.state.selectedIndex}
    *   onChange={(event) => {
    *     this.setState({selectedIndex: event.nativeEvent.selectedSegmentIndex});
    *   }}
    * />
    * ````
    */
  type SegmentedControlComponent = Component[SegmentedControlProps, js.Object, js.Any]
  
  @js.native
  trait SegmentedControlProps extends ViewProps {
    
    /**
      * Active Font style properties of the Segmented Control
      */
    var activeFontStyle: js.UndefOr[FontStyle] = js.native
    
    /**
      * (iOS 13+ only)
      * Overrides the control's appearance irrespective of the OS theme
      */
    var appearance: js.UndefOr[dark | light] = js.native
    
    /**
      * (iOS 13+ only)
      * Background color of the control.
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * If false the user won't be able to interact with the control. Default value is true.
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Font style properties of the Segmented Control
      */
    var fontStyle: js.UndefOr[FontStyle] = js.native
    
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
    var tintColor: js.UndefOr[String] = js.native
    
    /**
      * The labels for the control's segment buttons, in order.
      */
    var values: js.UndefOr[js.Array[String]] = js.native
  }
  object SegmentedControlProps {
    
    @scala.inline
    def apply(): SegmentedControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentedControlProps]
    }
    
    @scala.inline
    implicit class SegmentedControlPropsMutableBuilder[Self <: SegmentedControlProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveFontStyle(value: FontStyle): Self = StObject.set(x, "activeFontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveFontStyleUndefined: Self = StObject.set(x, "activeFontStyle", js.undefined)
      
      @scala.inline
      def setAppearance(value: dark | light): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
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
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
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
}
