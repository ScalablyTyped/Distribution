package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to connected media input devices like cameras and microphones, as well as screen sharing. In essence, it lets you obtain access to any hardware source of media data.
  * Available only in secure contexts.
  */
@js.native
trait MediaDevices
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devicechange")
  def addEventListener(`type`: "devicechange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devicechange")
  def addEventListener(
    `type`: "devicechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_devicechange")
  def addEventListener(
    `type`: "devicechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def enumerateDevices(): js.Promise[js.Array[MediaDeviceInfo]] = js.native
  
  /* standard dom */
  def getDisplayMedia(): js.Promise[MediaStream] = js.native
  def getDisplayMedia(options: DisplayMediaStreamOptions): js.Promise[MediaStream] = js.native
  
  /* standard dom */
  def getSupportedConstraints(): MediaTrackSupportedConstraints = js.native
  
  /* standard dom */
  def getUserMedia(): js.Promise[MediaStream] = js.native
  def getUserMedia(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
  
  /* standard dom */
  var ondevicechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_devicechange")
  def removeEventListener(`type`: "devicechange", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_devicechange")
  def removeEventListener(
    `type`: "devicechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_devicechange")
  def removeEventListener(
    `type`: "devicechange",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
