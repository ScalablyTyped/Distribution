package typings.sailthruDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sailthruDashClientMod {
  import typings.sailthruDashClient.Anon_Error

  type SailthruCallback = js.Function2[/* err */ SailthruError, /* response */ SailthruResponse, Unit]
  type SailthruError = Anon_Error | Null
  type SailthruResponse = js.Object | String
}
