package typings.sipJs

import typings.sipJs.libApiSessionMod.Session
import typings.sipJs.libPlatformWebSessionManagerSessionManagerOptionsMod.SessionManagerMediaLocal
import typings.sipJs.libPlatformWebSessionManagerSessionManagerOptionsMod.SessionManagerMediaRemote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionManagerManagedSessionMod {
  
  trait ManagedSession extends StObject {
    
    var held: Boolean
    
    var mediaLocal: js.UndefOr[SessionManagerMediaLocal] = js.undefined
    
    var mediaRemote: js.UndefOr[SessionManagerMediaRemote] = js.undefined
    
    var muted: Boolean
    
    var session: Session
  }
  object ManagedSession {
    
    inline def apply(held: Boolean, muted: Boolean, session: Session): ManagedSession = {
      val __obj = js.Dynamic.literal(held = held.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManagedSession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ManagedSession] (val x: Self) extends AnyVal {
      
      inline def setHeld(value: Boolean): Self = StObject.set(x, "held", value.asInstanceOf[js.Any])
      
      inline def setMediaLocal(value: SessionManagerMediaLocal): Self = StObject.set(x, "mediaLocal", value.asInstanceOf[js.Any])
      
      inline def setMediaLocalUndefined: Self = StObject.set(x, "mediaLocal", js.undefined)
      
      inline def setMediaRemote(value: SessionManagerMediaRemote): Self = StObject.set(x, "mediaRemote", value.asInstanceOf[js.Any])
      
      inline def setMediaRemoteUndefined: Self = StObject.set(x, "mediaRemote", js.undefined)
      
      inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    }
  }
}
