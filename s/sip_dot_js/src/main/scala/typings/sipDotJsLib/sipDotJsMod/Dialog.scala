package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Dialog")
@js.native
class Dialog protected ()
  extends sipDotJsLib.libDialogsMod.Dialog {
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteClientContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSessionMod.InviteServerContext, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingRequest, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAC, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
  def this(owner: sipDotJsLib.libSubscriptionMod.Subscription, message: sipDotJsLib.libSIPMessageMod.IncomingResponse, `type`: sipDotJsLib.sipDotJsLibStrings.UAS, state: sipDotJsLib.libEnumsMod.DialogStatus) = this()
}

/* static members */
@JSImport("sip.js", "Dialog")
@js.native
object Dialog extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DialogStatus */ js.Any = js.native
}

