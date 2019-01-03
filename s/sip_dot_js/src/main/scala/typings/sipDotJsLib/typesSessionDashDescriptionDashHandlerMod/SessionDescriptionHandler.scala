package typings
package sipDotJsLib.typesSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDescriptionHandler extends js.Object {
  /**
    * Destructor
    */
  def close(): scala.Unit = js.native
  /**
    * Gets the local description from the underlying media implementation.
    * @param options Options object to be used by getDescription.
    * @param modifiers Array with one time use description modifiers.
    */
  def getDescription(): js.Promise[sipDotJsLib.Anon_Body] = js.native
  def getDescription(options: SessionDescriptionHandlerOptions): js.Promise[sipDotJsLib.Anon_Body] = js.native
  def getDescription(options: SessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): js.Promise[sipDotJsLib.Anon_Body] = js.native
  /**
    * True if the Session Description Handler can handle the Content-Type described by a SIP Message.
    * @param contentType The content type that is in the SIP Message.
    */
  def hasDescription(contentType: java.lang.String): scala.Boolean = js.native
  /**
    * The modifier which should be used when the session would like to place the call on hold.
    * @param sessionDescription The description that will be modified.
    */
  def holdModifier(sessionDescription: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  /**
    * Set the remote description to the underlying media implementation.
    * @param sdp The description provided by a SIP message to be set on the media implementation.
    * @param options Options object to be used by setDescription.
    * @param modifiers Array with one time use description modifiers.
    */
  def setDescription(sdp: java.lang.String): js.Promise[scala.Unit] = js.native
  def setDescription(sdp: java.lang.String, options: SessionDescriptionHandlerOptions): js.Promise[scala.Unit] = js.native
  def setDescription(
    sdp: java.lang.String,
    options: SessionDescriptionHandlerOptions,
    modifiers: SessionDescriptionHandlerModifiers
  ): js.Promise[scala.Unit] = js.native
}

