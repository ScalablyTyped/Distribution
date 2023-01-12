package typings.steamUser.anon

import typings.steamUser.componentsChatroomMod.Ban
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bans] (val x: Self) extends AnyVal {
    
    inline def setBans(value: js.Array[Ban]): Self = StObject.set(x, "bans", value.asInstanceOf[js.Any])
    
    inline def setBansVarargs(value: Ban*): Self = StObject.set(x, "bans", js.Array(value*))
  }
}
