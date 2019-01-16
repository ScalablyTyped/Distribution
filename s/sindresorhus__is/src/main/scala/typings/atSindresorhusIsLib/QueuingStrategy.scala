package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueuingStrategy[T] extends js.Object {
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[QueuingStrategySizeCallback[T]] = js.undefined
}

