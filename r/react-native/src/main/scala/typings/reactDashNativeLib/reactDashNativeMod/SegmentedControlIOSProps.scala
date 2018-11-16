package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SegmentedControlIOSProps extends ViewProps {
  /**
       * If false the user won't be able to interact with the control. Default value is true.
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If true, then selecting a segment won't persist visually.
       * The onValueChange callback will still work as expected.
       */
  var momentary: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Callback that is called when the user taps a segment;
       * passes the event as an argument
       */
  var onChange: js.UndefOr[
    js.Function1[/* event */ NativeSyntheticEvent[NativeSegmentedControlIOSChangeEvent], scala.Unit]
  ] = js.undefined
  /**
       * Callback that is called when the user taps a segment; passes the segment's value as an argument
       */
  var onValueChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  /**
       * The index in props.values of the segment to be (pre)selected.
       */
  var selectedIndex: js.UndefOr[scala.Double] = js.undefined
  /**
       * Accent color of the control.
       */
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The labels for the control's segment buttons, in order.
       */
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

