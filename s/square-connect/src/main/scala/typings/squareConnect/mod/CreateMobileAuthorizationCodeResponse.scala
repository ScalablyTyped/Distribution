package typings.squareConnect.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "CreateMobileAuthorizationCodeResponse")
@js.native
class CreateMobileAuthorizationCodeResponse () extends js.Object {
  
  /**
    * Generated authorization code that connects a mobile application instance to a Square account.
    */
  var authorization_code: js.UndefOr[String] = js.native
  
  /**
    * An error object that provides details about how creation of authorization code failed.
    */
  var error: js.UndefOr[Error] = js.native
  
  /**
    * The timestamp when `authorization_code` expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format,
    * e.g., "2016-09-04T23:59:33.123Z".
    */
  var expires_at: js.UndefOr[String] = js.native
}
