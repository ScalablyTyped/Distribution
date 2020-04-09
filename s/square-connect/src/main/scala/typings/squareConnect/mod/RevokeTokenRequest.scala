package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RevokeTokenRequest")
@js.native
class RevokeTokenRequest () extends js.Object {
  /**
    * The access token of the merchant whose token you want to revoke.
    * Do not provide a value for merchant_id if you provide this parameter.
    */
  var access_token: js.UndefOr[String] = js.native
  /**
    * The Square issued ID for your application, available from the [application dashboard](https://connect.squareup.com/apps).
    */
  var client_id: js.UndefOr[String] = js.native
  /**
    * The ID of the merchant whose token you want to revoke.
    * Do not provide a value for access_token if you provide this parameter.
    */
  var merchant_id: js.UndefOr[String] = js.native
}

