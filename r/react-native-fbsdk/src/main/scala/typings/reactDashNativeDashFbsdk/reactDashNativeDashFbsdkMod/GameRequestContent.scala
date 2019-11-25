package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

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
  var data: js.UndefOr[String] = js.undefined
  /**
    * Controls the set of friends someone sees if a multi-friend selector is shown.
    */
  var filters: js.UndefOr[GameRequestFilters] = js.undefined
  /**
    * A plain-text message to be sent as part of the request.  Required.
    */
  var message: String
  /**
    * The Open Graph object ID of the object being sent/asked for. This cannot be null for ActionType SEND and
    * ASKFOR.
    */
  var objectId: js.UndefOr[String] = js.undefined
  /**
    * An array of user IDs, usernames or invite tokens of people to send requests to.
    */
  var recipients: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An array of user IDs that will be included in the dialog as the first suggested friends.
    * Can't be used together with filters.
    */
  var suggestions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The title for the dialog.
    */
  var title: js.UndefOr[String] = js.undefined
}

object GameRequestContent {
  @scala.inline
  def apply(
    message: String,
    actionType: GameRequestActionType = null,
    data: String = null,
    filters: GameRequestFilters = null,
    objectId: String = null,
    recipients: js.Array[String] = null,
    suggestions: js.Array[String] = null,
    title: String = null
  ): GameRequestContent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (actionType != null) __obj.updateDynamic("actionType")(actionType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (suggestions != null) __obj.updateDynamic("suggestions")(suggestions.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestContent]
  }
}

