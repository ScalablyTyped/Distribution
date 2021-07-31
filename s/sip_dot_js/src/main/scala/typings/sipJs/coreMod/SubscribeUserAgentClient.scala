package typings.sipJs.coreMod

import typings.sipJs.subscribeMod.OutgoingSubscribeRequestDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core", "SubscribeUserAgentClient")
@js.native
class SubscribeUserAgentClient protected ()
  extends typings.sipJs.userAgentsMod.SubscribeUserAgentClient {
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage
  ) = this()
  def this(
    core: typings.sipJs.userAgentCoreMod.UserAgentCore,
    message: typings.sipJs.messagesMod.OutgoingRequestMessage,
    delegate: OutgoingSubscribeRequestDelegate
  ) = this()
}
