package typings.steamcommunity

import typings.steamcommunity.mod.EResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHelpersMod {
  
  trait Helpers extends StObject {
    
    def decodeSteamTime(time: String): js.Date
    
    /**
      * Get an Error object for a particular EResult
      * @param eresult
      * @returns null|Error
      */
    def eresultError(eresult: EResult): Null | js.Error
    
    def isSteamID(input: Any): Boolean
  }
  object Helpers {
    
    inline def apply(
      decodeSteamTime: String => js.Date,
      eresultError: EResult => Null | js.Error,
      isSteamID: Any => Boolean
    ): Helpers = {
      val __obj = js.Dynamic.literal(decodeSteamTime = js.Any.fromFunction1(decodeSteamTime), eresultError = js.Any.fromFunction1(eresultError), isSteamID = js.Any.fromFunction1(isSteamID))
      __obj.asInstanceOf[Helpers]
    }
    
    extension [Self <: Helpers](x: Self) {
      
      inline def setDecodeSteamTime(value: String => js.Date): Self = StObject.set(x, "decodeSteamTime", js.Any.fromFunction1(value))
      
      inline def setEresultError(value: EResult => Null | js.Error): Self = StObject.set(x, "eresultError", js.Any.fromFunction1(value))
      
      inline def setIsSteamID(value: Any => Boolean): Self = StObject.set(x, "isSteamID", js.Any.fromFunction1(value))
    }
  }
}
