package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "UA")
@js.native
class UA () extends js.Object {
  def this(configuration: ConfigurationParameters) = this()
  def invite(target: java.lang.String): Session = js.native
  def invite(target: java.lang.String, element: InviteOptions): Session = js.native
  def invite(target: java.lang.String, element: stdLib.HTMLAudioElement): Session = js.native
  def invite(target: java.lang.String, element: stdLib.HTMLVideoElement): Session = js.native
  def invite(target: URI): Session = js.native
  def invite(target: URI, element: InviteOptions): Session = js.native
  def invite(target: URI, element: stdLib.HTMLAudioElement): Session = js.native
  def invite(target: URI, element: stdLib.HTMLVideoElement): Session = js.native
  def isConnected(): scala.Boolean = js.native
  def isRegistered(): scala.Boolean = js.native
  def message(target: java.lang.String, body: java.lang.String): Message = js.native
  def message(target: java.lang.String, body: java.lang.String, options: MessageOptions): Message = js.native
  def message(target: URI, body: java.lang.String): Message = js.native
  def message(target: URI, body: java.lang.String, options: MessageOptions): Message = js.native
  def on(name: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_connected(
    name: sipDotJsLib.sipDotJsLibStrings.connected,
    callback: js.Function1[/* args */ sipDotJsLib.sipDotJsMod.UANs.EventArgsNs.ConnectedArgs, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_disconnected(name: sipDotJsLib.sipDotJsLibStrings.disconnected, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_invite(
    name: sipDotJsLib.sipDotJsLibStrings.invite,
    callback: js.Function1[/* session */ Session, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_message(
    name: sipDotJsLib.sipDotJsLibStrings.message,
    callback: js.Function1[/* message */ Message, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_registered(name: sipDotJsLib.sipDotJsLibStrings.registered, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_registrationFailed(
    name: sipDotJsLib.sipDotJsLibStrings.registrationFailed,
    callback: js.Function1[
      /* args */ sipDotJsLib.sipDotJsMod.UANs.EventArgsNs.RegistrationFailedArgs, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_unregistered(
    name: sipDotJsLib.sipDotJsLibStrings.unregistered,
    callback: js.Function1[/* args */ sipDotJsLib.sipDotJsMod.UANs.EventArgsNs.UnregisteredArgs, scala.Unit]
  ): scala.Unit = js.native
  def register(): UA = js.native
  def register(options: ExtraHeadersOptions): UA = js.native
  def request(method: java.lang.String, target: java.lang.String): ClientContext = js.native
  def request(method: java.lang.String, target: java.lang.String, options: RequestOptions): ClientContext = js.native
  def request(method: java.lang.String, target: URI): ClientContext = js.native
  def request(method: java.lang.String, target: URI, options: RequestOptions): ClientContext = js.native
  def start(): UA = js.native
  def stop(): UA = js.native
  def subscribe(target: java.lang.String, event: java.lang.String): Subscription = js.native
  def subscribe(target: java.lang.String, event: java.lang.String, options: SubscribeOptions): Subscription = js.native
  def subscribe(target: URI, event: java.lang.String): Subscription = js.native
  def subscribe(target: URI, event: java.lang.String, options: SubscribeOptions): Subscription = js.native
  def unregister(): UA = js.native
  def unregister(options: UnregisterOptions): UA = js.native
}

