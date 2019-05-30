package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data. */
@js.native
trait MediaDevices extends EventTarget {
  var ondevicechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: stdLib.stdLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: stdLib.stdLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_devicechange(
    `type`: stdLib.stdLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]] = js.native
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native
  def getUserMedia(): js.Promise[MediaStream] = js.native
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: stdLib.stdLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: stdLib.stdLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_devicechange(
    `type`: stdLib.stdLibStrings.devicechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("MediaDevices")
@js.native
class MediaDevicesCls () extends MediaDevices

@JSGlobal("MediaDevices")
@js.native
object MediaDevices
  extends org.scalablytyped.runtime.Instantiable0[MediaDevices]

