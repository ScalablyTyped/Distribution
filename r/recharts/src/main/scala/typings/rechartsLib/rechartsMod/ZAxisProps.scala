package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAxisProps extends js.Object {
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  // The name of data displayed in the axis
  var name: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // The range of axis
  var range: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  var `type`: js.UndefOr[rechartsLib.rechartsLibStrings.number | rechartsLib.rechartsLibStrings.category] = js.undefined
  // The unit of data displayed in the axis
  var unit: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  // The unique id of z-axis
  var zAxisId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

