package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoilBadgeLavel extends StObject {
  
  var foilBadgeLavel: Double
  
  var regularBadgeLevel: Double
  
  var steamLevel: Double
}
object FoilBadgeLavel {
  
  inline def apply(foilBadgeLavel: Double, regularBadgeLevel: Double, steamLevel: Double): FoilBadgeLavel = {
    val __obj = js.Dynamic.literal(foilBadgeLavel = foilBadgeLavel.asInstanceOf[js.Any], regularBadgeLevel = regularBadgeLevel.asInstanceOf[js.Any], steamLevel = steamLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoilBadgeLavel]
  }
  
  extension [Self <: FoilBadgeLavel](x: Self) {
    
    inline def setFoilBadgeLavel(value: Double): Self = StObject.set(x, "foilBadgeLavel", value.asInstanceOf[js.Any])
    
    inline def setRegularBadgeLevel(value: Double): Self = StObject.set(x, "regularBadgeLevel", value.asInstanceOf[js.Any])
    
    inline def setSteamLevel(value: Double): Self = StObject.set(x, "steamLevel", value.asInstanceOf[js.Any])
  }
}
