package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackList
  extends EventTarget
     with /* index */ org.scalablytyped.runtime.NumberDictionary[TextTrack] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[TextTrack]] = js.native
  val length: scala.Double = js.native
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]) | scala.Null = js.native
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
  def item(index: scala.Double): TextTrack = js.native
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
}

@JSGlobal("TextTrackList")
@js.native
class TextTrackListCls () extends TextTrackList

@JSGlobal("TextTrackList")
@js.native
object TextTrackList
  extends org.scalablytyped.runtime.Instantiable0[TextTrackList]

