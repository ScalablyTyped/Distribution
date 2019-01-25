package typings
package rheostatLib.rheostatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var getNextHandlePosition: js.UndefOr[
    js.Function2[/* handleIdx */ scala.Double, /* percentPosition */ scala.Double, scala.Double]
  ] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.undefined
  var onClick: js.UndefOr[js.Function0[_]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragEnd: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragMove: js.UndefOr[js.Function0[_]] = js.undefined
  var onSliderDragStart: js.UndefOr[js.Function0[_]] = js.undefined
  var onValuesUpdated: js.UndefOr[js.Function1[/* publicState */ PublicState, _]] = js.undefined
}

