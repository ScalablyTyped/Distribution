package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import typings.std.stdStrings.addtrack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackList
  extends EventTarget
     with /* index */ NumberDictionary[TextTrack] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[TextTrack]] = js.native
  val length: Double = js.native
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def item(index: Double): TextTrack = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("TextTrackList")
@js.native
object TextTrackList extends Instantiable0[TextTrackList]

