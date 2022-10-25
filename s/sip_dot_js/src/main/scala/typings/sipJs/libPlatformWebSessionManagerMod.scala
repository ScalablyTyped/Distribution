package typings.sipJs

import typings.sipJs.libPlatformWebSessionManagerManagedSessionFactoryMod.ManagedSessionFactory
import typings.sipJs.libPlatformWebSessionManagerSessionManagerOptionsMod.SessionManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionManagerMod {
  
  @JSImport("sip.js/lib/platform/web/session-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js/lib/platform/web/session-manager", "SessionManager")
  @js.native
  open class SessionManager protected ()
    extends typings.sipJs.libPlatformWebSessionManagerSessionManagerMod.SessionManager {
    /**
      * Constructs a new instance of the `SessionManager` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SessionManagerOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SessionManagerOptions) = this()
  }
  
  inline def defaultManagedSessionFactory(): ManagedSessionFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultManagedSessionFactory")().asInstanceOf[ManagedSessionFactory]
}
