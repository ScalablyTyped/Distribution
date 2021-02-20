package typings.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "RenewTokenResponse")
@js.native
class RenewTokenResponse () extends StObject {
  
  /**
    * The renewed access token. This value might be different from the `access_token` you provided in your request.
    * You provide this token in a header with every request to Connect API endpoints.
    * See [Request and response headers](https://developer.squareup.com/docs/api/connect/v2/#requestandresponseheaders) for the format of this header.
    */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * The date when access_token expires, in [ISO 8601](http://www.iso.org/iso/home/standards/iso8601.htm) format.
    */
  var expires_at: js.UndefOr[String] = js.native
  
  /**
    * The ID of the authorizing merchant's business.
    */
  var merchant_id: js.UndefOr[String] = js.native
  
  /**
    * @deprecated
    * The ID of the subscription plan the merchant signed up for. Only present if the merchant signed up for a
    * subscription during authorization.
    */
  var plan_id: js.UndefOr[String] = js.native
  
  /**
    * @deprecated
    * The ID of the merchant subscription associated with the authorization. Only present if the merchant signed up for
    * a subscription during authorization.
    */
  var subscription_id: js.UndefOr[String] = js.native
  
  /**
    * This value is always _bearer_.
    */
  var token_type: js.UndefOr[String] = js.native
}
