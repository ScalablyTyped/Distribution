package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrack extends EventTarget {
  val DISABLED: scala.Double = js.native
  val ERROR: scala.Double = js.native
  val HIDDEN: scala.Double = js.native
  val LOADED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val NONE: scala.Double = js.native
  val SHOWING: scala.Double = js.native
  val activeCues: TextTrackCueList = js.native
  val cues: TextTrackCueList = js.native
  val inBandMetadataTrackDispatchType: java.lang.String = js.native
  val kind: java.lang.String = js.native
  val label: java.lang.String = js.native
  val language: java.lang.String = js.native
  var mode: TextTrackMode | scala.Double = js.native
  var oncuechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val readyState: scala.Double = js.native
  def addCue(cue: TextTrackCue): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def removeCue(cue: TextTrackCue): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cuechange(
    `type`: stdLib.stdLibStrings.cuechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: stdLib.stdLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_load(
    `type`: stdLib.stdLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("TextTrack")
@js.native
class TextTrackCls () extends TextTrack

@JSGlobal("TextTrack")
@js.native
object TextTrack
  extends org.scalablytyped.runtime.Instantiable0[TextTrack] {
  val DISABLED: scala.Double = js.native
  val ERROR: scala.Double = js.native
  val HIDDEN: scala.Double = js.native
  val LOADED: scala.Double = js.native
  val LOADING: scala.Double = js.native
  val NONE: scala.Double = js.native
  val SHOWING: scala.Double = js.native
}

