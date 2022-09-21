package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notifications extends StObject {
  
  var accountAlerts: Double
  
  var chat: Double
  
  var comments: Double
  
  var gameTurns: Double
  
  var gifts: Double
  
  var helpRequestReplies: Double
  
  var invites: Double
  
  var items: Double
  
  var moderatorMessages: Double
  
  var trades: Double
}
object Notifications {
  
  inline def apply(
    accountAlerts: Double,
    chat: Double,
    comments: Double,
    gameTurns: Double,
    gifts: Double,
    helpRequestReplies: Double,
    invites: Double,
    items: Double,
    moderatorMessages: Double,
    trades: Double
  ): Notifications = {
    val __obj = js.Dynamic.literal(accountAlerts = accountAlerts.asInstanceOf[js.Any], chat = chat.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], gameTurns = gameTurns.asInstanceOf[js.Any], gifts = gifts.asInstanceOf[js.Any], helpRequestReplies = helpRequestReplies.asInstanceOf[js.Any], invites = invites.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], moderatorMessages = moderatorMessages.asInstanceOf[js.Any], trades = trades.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
  
  extension [Self <: Notifications](x: Self) {
    
    inline def setAccountAlerts(value: Double): Self = StObject.set(x, "accountAlerts", value.asInstanceOf[js.Any])
    
    inline def setChat(value: Double): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setComments(value: Double): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setGameTurns(value: Double): Self = StObject.set(x, "gameTurns", value.asInstanceOf[js.Any])
    
    inline def setGifts(value: Double): Self = StObject.set(x, "gifts", value.asInstanceOf[js.Any])
    
    inline def setHelpRequestReplies(value: Double): Self = StObject.set(x, "helpRequestReplies", value.asInstanceOf[js.Any])
    
    inline def setInvites(value: Double): Self = StObject.set(x, "invites", value.asInstanceOf[js.Any])
    
    inline def setItems(value: Double): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setModeratorMessages(value: Double): Self = StObject.set(x, "moderatorMessages", value.asInstanceOf[js.Any])
    
    inline def setTrades(value: Double): Self = StObject.set(x, "trades", value.asInstanceOf[js.Any])
  }
}
