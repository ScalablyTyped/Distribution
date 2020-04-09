package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "StandardUnitDescriptionGroup")
@js.native
class StandardUnitDescriptionGroup () extends js.Object {
  /**
    * IETF language tag.
    */
  var language_code: js.UndefOr[String] = js.native
  /**
    * List of standard (non-custom) measurement units in this description group.
    */
  var standard_unit_descriptions: js.UndefOr[js.Array[StandardUnitDescription]] = js.native
}

