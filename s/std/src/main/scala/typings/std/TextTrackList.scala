package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackList
  extends StObject
     with EventTarget
     with /* standard dom */
/* index */ NumberDictionary[TextTrack] {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addtrack")
  def addEventListener(`type`: "addtrack", listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removetrack")
  def addEventListener(`type`: "removetrack", listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_change")
  def addEventListener(`type`: "change", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addtrack")
  def addEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removetrack")
  def addEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_change")
  def addEventListener(
    `type`: "change",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_addtrack")
  def addEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_change")
  def addEventListener(
    `type`: "change",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_removetrack")
  def addEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def getTrackById(id: java.lang.String): TextTrack | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[TextTrack]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]) | Null = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removetrack")
  def removeEventListener(`type`: "removetrack", listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addtrack")
  def removeEventListener(`type`: "addtrack", listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_change")
  def removeEventListener(`type`: "change", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removetrack")
  def removeEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_change")
  def removeEventListener(
    `type`: "change",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addtrack")
  def removeEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_change")
  def removeEventListener(
    `type`: "change",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_removetrack")
  def removeEventListener(
    `type`: "removetrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_addtrack")
  def removeEventListener(
    `type`: "addtrack",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
}
