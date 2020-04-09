package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogInfoResponse")
@js.native
class CatalogInfoResponse () extends js.Object {
  /**
    * The set of errors encountered.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  /**
    * Response limit
    */
  var limits: js.UndefOr[CatalogInfoResponseLimits] = js.native
  /**
    * Names and abbreviations for standard units.
    */
  var standard_unit_description_group: js.UndefOr[StandardUnitDescriptionGroup] = js.native
}

