package typings.std

import org.scalablytyped.runtime.NumberDictionary
import typings.std.stdStrings.addtrack
import typings.std.stdStrings.change
import typings.std.stdStrings.removetrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList) */
@js.native
trait TextTrackList
  extends StObject
     with EventTarget
     with /* standard dom */
/* index */ NumberDictionary[TextTrack] {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(`type`: removetrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/getTrackById) */
  /* standard dom */
  def getTrackById(id: java.lang.String): TextTrack | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[TextTrack]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/addtrack_event) */
  /* standard dom */
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/change_event) */
  /* standard dom */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextTrackList/removetrack_event) */
  /* standard dom */
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_addtrack(`type`: addtrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(`type`: removetrack, listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
