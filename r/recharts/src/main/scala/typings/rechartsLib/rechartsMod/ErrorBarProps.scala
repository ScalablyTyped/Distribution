package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorBarProps extends js.Object {
   // As the source code states, dataKey will replace valueKey in 1.1.0 and it'll be required (it's already required in current implementation).
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var dataKey: DataKey
  var dataPointFormatter: js.UndefOr[DataPointFormatter] = js.undefined
  var layout: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var xAxis: js.UndefOr[js.Object] = js.undefined
  var yAxis: js.UndefOr[js.Object] = js.undefined
}

