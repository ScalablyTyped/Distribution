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
  /* static members */
  object SessionManager {
    
    @JSImport("sip.js/lib/platform/web/session-manager", "SessionManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/platform/web/session-manager", "SessionManager.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: Any = js.native
    inline def stripUndefinedProperties_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
  
  inline def defaultManagedSessionFactory(): ManagedSessionFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultManagedSessionFactory")().asInstanceOf[ManagedSessionFactory]
}
