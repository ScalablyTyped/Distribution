package typings.schemaUtils.rangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils/declarations/util/Range", "formatRange")
@js.native
object formatRange extends js.Object {
  /**
    * @param {number} start left side value
    * @param {number} end right side value
    * @param {boolean} startExclusive is range exclusive from left side
    * @param {boolean} endExclusive is range exclusive from right side
    * @param {boolean} logic is not logic applied
    * @returns {string}
    */
  def apply(start: Double, end: Double, startExclusive: Boolean, endExclusive: Boolean, logic: Boolean): String = js.native
}

