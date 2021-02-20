package typings.sipJs.mod

import typings.sipJs.messagerOptionsMod.MessagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Messager")
@js.native
class Messager protected ()
  extends typings.sipJs.apiMod.Messager {
  /**
    * Constructs a new instance of the `Messager` class.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @param targetURI - Request URI identifying the target of the message.
    * @param content - Content for the body of the message.
    * @param contentType - Content type of the body of the message.
    * @param options - Options bucket. See {@link MessagerOptions} for details.
    */
  def this(
    userAgent: typings.sipJs.userAgentMod.UserAgent,
    targetURI: typings.sipJs.coreMod.URI,
    content: String
  ) = this()
  def this(
    userAgent: typings.sipJs.userAgentMod.UserAgent,
    targetURI: typings.sipJs.coreMod.URI,
    content: String,
    contentType: String
  ) = this()
  def this(
    userAgent: typings.sipJs.userAgentMod.UserAgent,
    targetURI: typings.sipJs.coreMod.URI,
    content: String,
    contentType: js.UndefOr[scala.Nothing],
    options: MessagerOptions
  ) = this()
  def this(
    userAgent: typings.sipJs.userAgentMod.UserAgent,
    targetURI: typings.sipJs.coreMod.URI,
    content: String,
    contentType: String,
    options: MessagerOptions
  ) = this()
}
