package typings.steamUser.anon

import typings.steamUser.chatroomMod.Ban
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bans extends StObject {
  
  var bans: js.Array[Ban]
}
object Bans {
  
  inline def apply(bans: js.Array[Ban]): Bans = {
    val __obj = js.Dynamic.literal(bans = bans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bans]
  }
  
  extension [Self <: Bans](x: Self) {
    
    inline def setBans(value: js.Array[Ban]): Self = StObject.set(x, "bans", value.asInstanceOf[js.Any])
    
    inline def setBansVarargs(value: Ban*): Self = StObject.set(x, "bans", js.Array(value*))
  }
}
