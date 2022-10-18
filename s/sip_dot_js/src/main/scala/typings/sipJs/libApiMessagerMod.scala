package typings.sipJs

import typings.sipJs.libApiMessagerMessageOptionsMod.MessagerMessageOptions
import typings.sipJs.libApiMessagerOptionsMod.MessagerOptions
import typings.sipJs.libApiUserAgentMod.UserAgent
import typings.sipJs.libCoreMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiMessagerMod {
  
  @JSImport("sip.js/lib/api/messager", "Messager")
  @js.native
  open class Messager protected () extends StObject {
    /**
      * Constructs a new instance of the `Messager` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param content - Content for the body of the message.
      * @param contentType - Content type of the body of the message.
      * @param options - Options bucket. See {@link MessagerOptions} for details.
      */
    def this(userAgent: UserAgent, targetURI: URI, content: String) = this()
    def this(userAgent: UserAgent, targetURI: URI, content: String, contentType: String) = this()
    def this(
      userAgent: UserAgent,
      targetURI: URI,
      content: String,
      contentType: String,
      options: MessagerOptions
    ) = this()
    def this(userAgent: UserAgent, targetURI: URI, content: String, contentType: Unit, options: MessagerOptions) = this()
    
    /* private */ var logger: Any = js.native
    
    /**
      * Send the message.
      */
    def message(): js.Promise[Unit] = js.native
    def message(options: MessagerMessageOptions): js.Promise[Unit] = js.native
    
    /* private */ var request: Any = js.native
    
    /* private */ var userAgent: Any = js.native
  }
}
