package typings.steamapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Achievement extends StObject {
  
  var achieved: Boolean
  
  var api: String
  
  var description: String
  
  var name: String
  
  var unlockTime: Double
  
  /**
    * Date when this achievement was unlocked at.
    */
  val unlockedAt: js.Date
}
object Achievement {
  
  inline def apply(
    achieved: Boolean,
    api: String,
    description: String,
    name: String,
    unlockTime: Double,
    unlockedAt: js.Date
  ): Achievement = {
    val __obj = js.Dynamic.literal(achieved = achieved.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], unlockTime = unlockTime.asInstanceOf[js.Any], unlockedAt = unlockedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Achievement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Achievement] (val x: Self) extends AnyVal {
    
    inline def setAchieved(value: Boolean): Self = StObject.set(x, "achieved", value.asInstanceOf[js.Any])
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnlockTime(value: Double): Self = StObject.set(x, "unlockTime", value.asInstanceOf[js.Any])
    
    inline def setUnlockedAt(value: js.Date): Self = StObject.set(x, "unlockedAt", value.asInstanceOf[js.Any])
  }
}
