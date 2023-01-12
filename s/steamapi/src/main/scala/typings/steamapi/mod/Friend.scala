package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Friend
  extends StObject
     with Player {
  
  var friendSince: Double
  
  /**
    * Date when this person was friended.
    */
  val friendedAt: js.Date
  
  var relationship: Double
  
  var steamID: String
}
object Friend {
  
  inline def apply(
    friendSince: Double,
    friendedAt: js.Date,
    profileUrl: String,
    relationship: Double,
    steamID: String
  ): Friend = {
    val __obj = js.Dynamic.literal(friendSince = friendSince.asInstanceOf[js.Any], friendedAt = friendedAt.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Friend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Friend] (val x: Self) extends AnyVal {
    
    inline def setFriendSince(value: Double): Self = StObject.set(x, "friendSince", value.asInstanceOf[js.Any])
    
    inline def setFriendedAt(value: js.Date): Self = StObject.set(x, "friendedAt", value.asInstanceOf[js.Any])
    
    inline def setRelationship(value: Double): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setSteamID(value: String): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
  }
}
