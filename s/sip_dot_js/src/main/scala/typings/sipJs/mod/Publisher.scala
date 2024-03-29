package typings.sipJs.mod

import typings.sipJs.libApiPublisherOptionsMod.PublisherOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Publisher")
@js.native
open class Publisher protected ()
  extends typings.sipJs.libApiMod.Publisher {
  /**
    * Constructs a new instance of the `Publisher` class.
    *
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param eventType - The event type identifying the published document.
    * @param options - Options bucket. See {@link PublisherOptions} for details.
    */
  def this(
    userAgent: typings.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typings.sipJs.libGrammarUriMod.URI,
    eventType: String
  ) = this()
  def this(
    userAgent: typings.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typings.sipJs.libGrammarUriMod.URI,
    eventType: String,
    options: PublisherOptions
  ) = this()
}
