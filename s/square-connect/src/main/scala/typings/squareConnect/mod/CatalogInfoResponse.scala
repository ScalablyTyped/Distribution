package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CatalogInfoResponse")
@js.native
class CatalogInfoResponse () extends js.Object {
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[Error]] = js.native
  
  /**
    * Limits that apply to this API.
    */
  var limits: js.UndefOr[CatalogInfoResponseLimits] = js.native
  
  /**
    * Names and abbreviations for standard units.
    */
  var standard_unit_description_group: js.UndefOr[StandardUnitDescriptionGroup] = js.native
}
