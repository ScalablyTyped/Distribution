package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStream extends EventTarget {
  val active: scala.Boolean = js.native
  val id: java.lang.String = js.native
  var onactive: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]) | scala.Null = js.native
  var oninactive: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_active(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.active,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_active(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.active,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_active(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.active,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inactive(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.inactive,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inactive(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.inactive,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_inactive(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.inactive,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def addTrack(track: MediaStreamTrack): scala.Unit = js.native
  def getAudioTracks(): Array[MediaStreamTrack] = js.native
  def getTrackById(trackId: java.lang.String): MediaStreamTrack | scala.Null = js.native
  def getTracks(): Array[MediaStreamTrack] = js.native
  def getVideoTracks(): Array[MediaStreamTrack] = js.native
  @JSName("removeEventListener")
  def removeEventListener_active(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.active,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_active(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.active,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_active(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.active,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inactive(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.inactive,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inactive(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.inactive,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_inactive(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.inactive,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamTrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def removeTrack(track: MediaStreamTrack): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

@JSGlobal("MediaStream")
@js.native
object MediaStream
  extends org.scalablytyped.runtime.Instantiable0[MediaStream]
     with org.scalablytyped.runtime.Instantiable1[(/* tracks */ Array[MediaStreamTrack]) | (/* stream */ MediaStream), MediaStream]

