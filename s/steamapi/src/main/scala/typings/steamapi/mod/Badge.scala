package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  var appID: Double
  
  var badgeID: Double
  
  var borderColor: Double
  
  var communityItemID: String
  
  /**
    * Date when this badge was completed.
    */
  val completedAt: js.Date
  
  var completionTime: Double
  
  var leve: Double
  
  var scarcity: Double
  
  var xp: Double
}
object Badge {
  
  inline def apply(
    appID: Double,
    badgeID: Double,
    borderColor: Double,
    communityItemID: String,
    completedAt: js.Date,
    completionTime: Double,
    leve: Double,
    scarcity: Double,
    xp: Double
  ): Badge = {
    val __obj = js.Dynamic.literal(appID = appID.asInstanceOf[js.Any], badgeID = badgeID.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], communityItemID = communityItemID.asInstanceOf[js.Any], completedAt = completedAt.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any], leve = leve.asInstanceOf[js.Any], scarcity = scarcity.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    inline def setAppID(value: Double): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
    
    inline def setBadgeID(value: Double): Self = StObject.set(x, "badgeID", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setCommunityItemID(value: String): Self = StObject.set(x, "communityItemID", value.asInstanceOf[js.Any])
    
    inline def setCompletedAt(value: js.Date): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletionTime(value: Double): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setLeve(value: Double): Self = StObject.set(x, "leve", value.asInstanceOf[js.Any])
    
    inline def setScarcity(value: Double): Self = StObject.set(x, "scarcity", value.asInstanceOf[js.Any])
    
    inline def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
  }
}
