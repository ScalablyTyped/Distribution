package typings.sipJs.mod

import typings.sipJs.libApiMessagerOptionsMod.MessagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Messager")
@js.native
open class Messager protected ()
  extends typings.sipJs.libApiMod.Messager {
  /**
    * Constructs a new instance of the `Messager` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param content - Content for the body of the message.
    * @param contentType - Content type of the body of the message.
    * @param options - Options bucket. See {@link MessagerOptions} for details.
    */
  def this(
    userAgent: typings.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typings.sipJs.libGrammarUriMod.URI,
    content: String
  ) = this()
  def this(
    userAgent: typings.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typings.sipJs.libGrammarUriMod.URI,
    content: String,
    contentType: String
  ) = this()
  def this(
    userAgent: typings.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typings.sipJs.libGrammarUriMod.URI,
    content: String,
    contentType: String,
    options: MessagerOptions
  ) = this()
  def this(
    userAgent: typings.sipJs.libApiUserAgentMod.UserAgent,
    targetURI: typings.sipJs.libGrammarUriMod.URI,
    content: String,
    contentType: Unit,
    options: MessagerOptions
  ) = this()
}
