package typings.squareDashConnect.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "MobileAuthorizationApi")
@js.native
class MobileAuthorizationApi () extends js.Object {
  /**
    * Generates code to authorize a mobile application to connect to a Square card reader Authorization codes are
    * one-time-use and expire __60 minutes__ after being issued.
    * @note The `Authorization` header you provide to this endpoint must have the following format:
    * `Authorization: Bearer ACCESS_TOKEN` Replace `ACCESS_TOKEN` with a [valid production authorization credential]
    * @link https://docs.connect.squareup.com/get-started#step-4-understand-the-different-application-credentials
    */
  def createMobileAuthorizationCode(body: CreateMobileAuthorizationCodeRequest): js.Promise[CreateMobileAuthorizationCodeResponse] = js.native
}

