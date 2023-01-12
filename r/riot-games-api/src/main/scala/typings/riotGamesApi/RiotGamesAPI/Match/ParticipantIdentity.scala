package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantIdentity extends StObject {
  
  var participantId: Double
  
  var player: Player
}
object ParticipantIdentity {
  
  inline def apply(participantId: Double, player: Player): ParticipantIdentity = {
    val __obj = js.Dynamic.literal(participantId = participantId.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantIdentity] (val x: Self) extends AnyVal {
    
    inline def setParticipantId(value: Double): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setPlayer(value: Player): Self = StObject.set(x, "player", value.asInstanceOf[js.Any])
  }
}
