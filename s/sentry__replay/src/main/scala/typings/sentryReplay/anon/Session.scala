package typings.sentryReplay.anon

import typings.sentryReplay.sentryReplayStrings.`new`
import typings.sentryReplay.sentryReplayStrings.saved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  var session: typings.sentryReplay.typesTypesMod.Session
  
  var `type`: `new` | saved
}
object Session {
  
  inline def apply(session: typings.sentryReplay.typesTypesMod.Session, `type`: `new` | saved): Session = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    inline def setSession(value: typings.sentryReplay.typesTypesMod.Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setType(value: `new` | saved): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
