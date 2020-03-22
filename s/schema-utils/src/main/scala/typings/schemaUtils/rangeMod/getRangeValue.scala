package typings.schemaUtils.rangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils/declarations/util/Range", "getRangeValue")
@js.native
object getRangeValue extends js.Object {
  /**
    * @param {Array<RangeValue>} values
    * @param {boolean} logic is not logic applied
    * @return {RangeValue} computed value and it's exclusive flag
    */
  def apply(values: js.Array[js.Tuple2[Double, Boolean]], logic: Boolean): js.Tuple2[Double, Boolean] = js.native
}

