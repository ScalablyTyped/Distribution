package typings.squareDashConnect.squareDashConnectMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CatalogInfoResponse")
@js.native
class CatalogInfoResponse () extends js.Object {
  /**
    * The set of [Error](#type-error)s encountered.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  var limits: js.UndefOr[CatalogInfoResponseLimits] = js.native
  /**
    * Names and abbreviations for standard units.
    */
  var standard_unit_description_group: js.UndefOr[StandardUnitDescriptionGroup] = js.native
}

