package typings.sipDotJs

import typings.sipDotJs.libPlatformWebSimpleDashUserSimpleDashUserDashOptionsMod.SimpleUserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/platform/web/simple-user", JSImport.Namespace)
@js.native
object libPlatformWebSimpleDashUserMod extends js.Object {
  @js.native
  class SimpleUser protected ()
    extends typings.sipDotJs.libPlatformWebSimpleDashUserSimpleDashUserMod.SimpleUser {
    /**
      * Constructs a new instance of the `SimpleUser` class.
      * @param webSocketServerURL - SIP WebSocket Server URL.
      * @param options - Options bucket. See {@link SimpleUserOptions} for details.
      */
    def this(webSocketServerURL: String) = this()
    def this(webSocketServerURL: String, options: SimpleUserOptions) = this()
  }
  
}

