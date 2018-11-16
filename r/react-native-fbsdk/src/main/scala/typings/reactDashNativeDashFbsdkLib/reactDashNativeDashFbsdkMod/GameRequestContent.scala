package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GameRequestContent extends js.Object {
  /**
       * Used when defining additional context about the nature of the request.
       * The parameter 'objectID' is required if the action type is either 'send' or 'ask-for'.
       */
  var actionType: js.UndefOr[GameRequestActionType] = js.undefined
  /**
       * Additional freeform data you may pass for tracking. The maximum length is 255 characters.
       */
  var data: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Controls the set of friends someone sees if a multi-friend selector is shown.
       */
  var filters: js.UndefOr[GameRequestFilters] = js.undefined
  /**
       * A plain-text message to be sent as part of the request.  Required.
       */
  var message: java.lang.String
  /**
       * The Open Graph object ID of the object being sent/asked for. This cannot be null for ActionType SEND and
       * ASKFOR.
       */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An array of user IDs, usernames or invite tokens of people to send requests to.
       */
  var recipients: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * An array of user IDs that will be included in the dialog as the first suggested friends.
       * Can't be used together with filters.
       */
  var suggestions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * The title for the dialog.
       */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

