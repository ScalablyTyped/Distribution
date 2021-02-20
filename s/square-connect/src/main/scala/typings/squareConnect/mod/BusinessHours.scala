package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BusinessHours")
@js.native
class BusinessHours () extends StObject {
  
  /**
    * The list of time periods during which the business is open. There may be at most 10 periods per day.
    */
  var periods: js.UndefOr[js.Array[BusinessHoursPeriod]] = js.native
}
