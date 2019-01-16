package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamTrack extends EventTarget {
  var enabled: scala.Boolean = js.native
  val id: java.lang.String = js.native
  val isolated: scala.Boolean = js.native
  val kind: java.lang.String = js.native
  val label: java.lang.String = js.native
  val muted: scala.Boolean = js.native
  var onended: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]) | scala.Null = js.native
  var onisolationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmute: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onoverconstrained: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]) | scala.Null = js.native
  var onunmute: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val readonly: scala.Boolean = js.native
  val readyState: MediaStreamTrackState = js.native
  val remote: scala.Boolean = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_isolationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overconstrained(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overconstrained(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_overconstrained(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unmute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def applyConstraints(constraints: MediaTrackConstraints): Promise[scala.Unit] = js.native
  def getCapabilities(): MediaTrackCapabilities = js.native
  def getConstraints(): MediaTrackConstraints = js.native
  def getSettings(): MediaTrackSettings = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_ended(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.ended,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_isolationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_isolationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_isolationchange(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.isolationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.mute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_overconstrained(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_overconstrained(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_overconstrained(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.overconstrained,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaStreamErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unmute(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.unmute,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

@JSGlobal("MediaStreamTrack")
@js.native
object MediaStreamTrack
  extends org.scalablytyped.runtime.Instantiable0[MediaStreamTrack]

