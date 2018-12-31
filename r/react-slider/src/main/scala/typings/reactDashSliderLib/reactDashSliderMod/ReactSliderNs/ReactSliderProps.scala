package typings
package reactDashSliderLib.reactDashSliderMod.ReactSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactSliderProps extends js.Object {
  var barClassName: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultValue: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var handleActiveClassName: js.UndefOr[java.lang.String] = js.undefined
  var handleClassName: js.UndefOr[java.lang.String] = js.undefined
  var invert: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var minDistance: js.UndefOr[scala.Double] = js.undefined
  var onAfterChange: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null], 
      scala.Unit
    ]
  ] = js.undefined
  var onBeforeChange: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null], 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[scala.Double | js.Array[scala.Double] | scala.Null], 
      scala.Unit
    ]
  ] = js.undefined
  var onSliderClick: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  var orientation: js.UndefOr[
    reactDashSliderLib.reactDashSliderLibStrings.horizontal | reactDashSliderLib.reactDashSliderLibStrings.vertical
  ] = js.undefined
  var pearling: js.UndefOr[scala.Boolean] = js.undefined
  var snapDragDisabled: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var withBars: js.UndefOr[scala.Boolean] = js.undefined
}

