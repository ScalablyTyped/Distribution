package typings.sipJs

import typings.sipJs.libPlatformWebSimpleUserSimpleUserOptionsMod.SimpleUserOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSimpleUserMod {
  
  @JSImport("sip.js/lib/platform/web/simple-user", "SimpleUser")
  @js.native
  open class SimpleUser protected ()
    extends typings.sipJs.libPlatformWebSimpleUserSimpleUserMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param server - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(server: String) = this()
    def this(server: String, options: SimpleUserOptions) = this()
  }
}
