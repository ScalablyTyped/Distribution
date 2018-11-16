package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SliderProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
       * Whether the Slider is enabled.
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The maximum value for the slider.
       */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
       * The minimum value for the slider.
       */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
       * Called when the value of the slider is changed. The current value is passed as an argument.
       */
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
       * The current value of the Slider (0-100).
       */
  var value: js.UndefOr[scala.Double] = js.undefined
  /**
       * Whether the Slider can be seen.
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

