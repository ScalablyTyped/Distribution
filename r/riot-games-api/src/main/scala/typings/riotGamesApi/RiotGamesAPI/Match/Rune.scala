package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rune extends StObject {
  
  var rank: Double
  
  var runeId: Double
}
object Rune {
  
  inline def apply(rank: Double, runeId: Double): Rune = {
    val __obj = js.Dynamic.literal(rank = rank.asInstanceOf[js.Any], runeId = runeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rune]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rune] (val x: Self) extends AnyVal {
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRuneId(value: Double): Self = StObject.set(x, "runeId", value.asInstanceOf[js.Any])
  }
}
