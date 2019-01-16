package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackCue extends EventTarget {
  var endTime: scala.Double = js.native
  var id: java.lang.String = js.native
  var onenter: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onexit: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var pauseOnExit: scala.Boolean = js.native
  var startTime: scala.Double = js.native
  var text: java.lang.String = js.native
  val track: TextTrack = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_enter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_exit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def getCueAsHTML(): DocumentFragment = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_enter(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.enter,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_exit(
    `type`: atSindresorhusIsLib.atSindresorhusIsLibStrings.exit,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("TextTrackCue")
@js.native
object TextTrackCue
  extends org.scalablytyped.runtime.Instantiable3[
      /* startTime */ scala.Double, 
      /* endTime */ scala.Double, 
      /* text */ java.lang.String, 
      TextTrackCue
    ]

