package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "StandardUnitDescription")
@js.native
class StandardUnitDescription () extends js.Object {
  /**
    * Abbreviation for the measurement unit. For example, 'lb'.
    */
  var abbreviation: js.UndefOr[String] = js.native
  /**
    * Display name of the measurement unit. For example, 'Pound'.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Identifies the measurement unit being described.
    */
  var unit: js.UndefOr[MeasurementUnit] = js.native
}

