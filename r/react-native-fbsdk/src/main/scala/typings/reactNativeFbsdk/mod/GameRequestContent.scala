package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameRequestContent extends js.Object {
  
  /**
    * Used when defining additional context about the nature of the request.
    * The parameter 'objectID' is required if the action type is either 'send' or 'ask-for'.
    */
  var actionType: js.UndefOr[GameRequestActionType] = js.native
  
  /**
    * Additional freeform data you may pass for tracking. The maximum length is 255 characters.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * Controls the set of friends someone sees if a multi-friend selector is shown.
    */
  var filters: js.UndefOr[GameRequestFilters] = js.native
  
  /**
    * A plain-text message to be sent as part of the request.  Required.
    */
  var message: String = js.native
  
  /**
    * The Open Graph object ID of the object being sent/asked for. This cannot be null for ActionType SEND and
    * ASKFOR.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * An array of user IDs, usernames or invite tokens of people to send requests to.
    */
  var recipients: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of user IDs that will be included in the dialog as the first suggested friends.
    * Can't be used together with filters.
    */
  var suggestions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The title for the dialog.
    */
  var title: js.UndefOr[String] = js.native
}
object GameRequestContent {
  
  @scala.inline
  def apply(message: String): GameRequestContent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestContent]
  }
  
  @scala.inline
  implicit class GameRequestContentOps[Self <: GameRequestContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionType(value: GameRequestActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFilters(value: GameRequestFilters): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
