package typings.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shard extends StObject {
  
  var room: String
  
  var shard: String
}
object Shard {
  
  inline def apply(room: String, shard: String): Shard = {
    val __obj = js.Dynamic.literal(room = room.asInstanceOf[js.Any], shard = shard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
  
  extension [Self <: Shard](x: Self) {
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setShard(value: String): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
  }
}
