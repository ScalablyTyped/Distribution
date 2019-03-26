package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoTrackList
  extends EventTarget
     with /* index */ org.scalablytyped.runtime.NumberDictionary[VideoTrack] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[VideoTrack]] = js.native
  val length: scala.Double = js.native
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]) | scala.Null = js.native
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]) | scala.Null = js.native
  val selectedIndex: scala.Double = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getTrackById(id: java.lang.String): VideoTrack | scala.Null = js.native
  def item(index: scala.Double): VideoTrack = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("VideoTrackList")
@js.native
class VideoTrackListCls () extends VideoTrackList

@JSGlobal("VideoTrackList")
@js.native
object VideoTrackList
  extends org.scalablytyped.runtime.Instantiable0[VideoTrackList]

