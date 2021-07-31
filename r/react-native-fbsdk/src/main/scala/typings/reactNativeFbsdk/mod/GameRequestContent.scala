package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameRequestContent extends StObject {
  
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
  def apply(message: String): GameRequestContent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameRequestContent]
  }
  
  @scala.inline
  implicit class GameRequestContentMutableBuilder[Self <: GameRequestContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionType(value: GameRequestActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFilters(value: GameRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
