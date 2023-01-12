package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameServer extends StObject {
  
  var actor: String
  
  var appID: Double
  
  var deleted: Boolean
  
  var expired: Boolean
  
  /**
    * Date the last time this token was used.
    */
  val lastLoginAt: js.Date
  
  var lastLoginTime: Double
  
  var memo: String
  
  var token: String
  
  /**
    * Whether or not this token is usable.
    */
  val usable: Boolean
}
object GameServer {
  
  inline def apply(
    actor: String,
    appID: Double,
    deleted: Boolean,
    expired: Boolean,
    lastLoginAt: js.Date,
    lastLoginTime: Double,
    memo: String,
    token: String,
    usable: Boolean
  ): GameServer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any], appID = appID.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], expired = expired.asInstanceOf[js.Any], lastLoginAt = lastLoginAt.asInstanceOf[js.Any], lastLoginTime = lastLoginTime.asInstanceOf[js.Any], memo = memo.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], usable = usable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GameServer] (val x: Self) extends AnyVal {
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setAppID(value: Double): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setExpired(value: Boolean): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setLastLoginAt(value: js.Date): Self = StObject.set(x, "lastLoginAt", value.asInstanceOf[js.Any])
    
    inline def setLastLoginTime(value: Double): Self = StObject.set(x, "lastLoginTime", value.asInstanceOf[js.Any])
    
    inline def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUsable(value: Boolean): Self = StObject.set(x, "usable", value.asInstanceOf[js.Any])
  }
}
