package typings
package reactDashRangesliderLib.reactDashRangesliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends js.Object {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[
    js.Function1[/* value */ scala.Double, js.UndefOr[java.lang.String | scala.Double]]
  ] = js.undefined
  var handleLabel: js.UndefOr[scala.Boolean] = js.undefined
  var labels: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[java.lang.String]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  var onChangeComplete: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  var onChangeStart: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var tooltip: js.UndefOr[scala.Boolean] = js.undefined
  var value: scala.Double
}

