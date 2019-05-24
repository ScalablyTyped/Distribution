package typings
package sipDotJsLib.libSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDescriptionHandler extends js.Object {
  /**
    * Destructor.
    */
  def close(): scala.Unit = js.native
  /**
    * Gets the local description from the underlying media implementation.
    * @param options Options object to be used by getDescription.
    * @param modifiers Array with one time use description modifiers.
    * @returns Promise that resolves with the local description to be used for the session.
    * @throws {ClosedSessionDescriptionHandlerError} When this method
    *         is called after close or when close occurs before complete.
    */
  def getDescription(): js.Promise[BodyObj] = js.native
  def getDescription(options: SessionDescriptionHandlerOptions): js.Promise[BodyObj] = js.native
  def getDescription(options: SessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): js.Promise[BodyObj] = js.native
  /**
    * Returns true if the Session Description Handler can handle the Content-Type described by a SIP message.
    * @param contentType The content type that is in the SIP Message.
    * @returns True if the content type is  handled by this session description handler. False otherwise.
    */
  def hasDescription(contentType: java.lang.String): scala.Boolean = js.native
  /**
    * The modifier that should be used when the session would like to place the call on hold.
    * @param sessionDescription The description that will be modified.
    * @returns Promise that resolves with modified SDP.
    * @throws {ClosedSessionDescriptionHandlerError} When this method
    *         is called after close or when close occurs before complete.
    */
  def holdModifier(sessionDescription: stdLib.RTCSessionDescriptionInit): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  /**
    * Send DTMF via RTP (RFC 4733).
    * Returns true if DTMF send is successful, false otherwise.
    * @param tones A string containing DTMF digits.
    * @param options Options object to be used by sendDtmf.
    * @returns True if DTMF send is successful, false otherwise.
    */
  def sendDtmf(tones: java.lang.String): scala.Boolean = js.native
  def sendDtmf(tones: java.lang.String, options: js.Any): scala.Boolean = js.native
  /**
    * Sets the remote description to the underlying media implementation.
    * @param  sessionDescription The description provided by a SIP message to be set on the media implementation.
    * @param options Options object to be used by setDescription.
    * @param modifiers Array with one time use description modifiers.
    * @returns Promise that resolves once the description is set.
    * @throws {ClosedSessionDescriptionHandlerError} When this method
    *         is called after close or when close occurs before complete.
    */
  def setDescription(sdp: java.lang.String): js.Promise[scala.Unit] = js.native
  def setDescription(sdp: java.lang.String, options: SessionDescriptionHandlerOptions): js.Promise[scala.Unit] = js.native
  def setDescription(
    sdp: java.lang.String,
    options: SessionDescriptionHandlerOptions,
    modifiers: SessionDescriptionHandlerModifiers
  ): js.Promise[scala.Unit] = js.native
}

