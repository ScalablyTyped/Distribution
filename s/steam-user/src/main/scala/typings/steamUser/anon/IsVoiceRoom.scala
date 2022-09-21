package typings.steamUser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVoiceRoom extends StObject {
  
  var isVoiceRoom: Boolean
}
object IsVoiceRoom {
  
  inline def apply(isVoiceRoom: Boolean): IsVoiceRoom = {
    val __obj = js.Dynamic.literal(isVoiceRoom = isVoiceRoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVoiceRoom]
  }
  
  extension [Self <: IsVoiceRoom](x: Self) {
    
    inline def setIsVoiceRoom(value: Boolean): Self = StObject.set(x, "isVoiceRoom", value.asInstanceOf[js.Any])
  }
}
