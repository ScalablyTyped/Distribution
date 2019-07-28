package typings.reactDashAdal.reactDashAdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestInfo extends js.Object {
  /**
    * Object comprising of fields such as id_token/error, session_state, state, e.t.c.
    */
  var parameters: js.Any
  /**
    * Request type.
    */
  var requestType: RequestType
  /**
    * Whether state is valid.
    */
  var stateMatch: Boolean
  /**
    * Unique guid used to match the response with the request.
    */
  var stateResponse: String
  /**
    * Whether `requestType` contains `id_token`, `access_token` or error.
    */
  var valid: Boolean
}

object RequestInfo {
  @scala.inline
  def apply(
    parameters: js.Any,
    requestType: RequestType,
    stateMatch: Boolean,
    stateResponse: String,
    valid: Boolean
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(parameters = parameters, requestType = requestType, stateMatch = stateMatch, stateResponse = stateResponse, valid = valid)
  
    __obj.asInstanceOf[RequestInfo]
  }
}

