package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animation
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_finish")
  def addEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cancel")
  def addEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_remove")
  def addEventListener(`type`: "remove", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_finish")
  def addEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cancel")
  def addEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_remove")
  def addEventListener(
    `type`: "remove",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_cancel")
  def addEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_finish")
  def addEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_remove")
  def addEventListener(
    `type`: "remove",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  def cancel(): Unit = js.native
  
  /* standard dom */
  def commitStyles(): Unit = js.native
  
  /* standard dom */
  var currentTime: CSSNumberish | Null = js.native
  
  /* standard dom */
  var effect: AnimationEffect | Null = js.native
  
  /* standard dom */
  def finish(): Unit = js.native
  
  /* standard dom */
  val finished: js.Promise[Animation] = js.native
  
  /* standard dom */
  var id: java.lang.String = js.native
  
  /* standard dom */
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null = js.native
  
  /* standard dom */
  var onremove: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  def pause(): Unit = js.native
  
  /* standard dom */
  val pending: scala.Boolean = js.native
  
  /* standard dom */
  def persist(): Unit = js.native
  
  /* standard dom */
  def play(): Unit = js.native
  
  /* standard dom */
  val playState: AnimationPlayState = js.native
  
  /* standard dom */
  var playbackRate: Double = js.native
  
  /* standard dom */
  val ready: js.Promise[Animation] = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_remove")
  def removeEventListener(`type`: "remove", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_finish")
  def removeEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cancel")
  def removeEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_remove")
  def removeEventListener(
    `type`: "remove",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_finish")
  def removeEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cancel")
  def removeEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_finish")
  def removeEventListener(
    `type`: "finish",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_cancel")
  def removeEventListener(
    `type`: "cancel",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_remove")
  def removeEventListener(
    `type`: "remove",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val replaceState: AnimationReplaceState = js.native
  
  /* standard dom */
  def reverse(): Unit = js.native
  
  /* standard dom */
  var startTime: CSSNumberish | Null = js.native
  
  /* standard dom */
  var timeline: AnimationTimeline | Null = js.native
  
  /* standard dom */
  def updatePlaybackRate(playbackRate: Double): Unit = js.native
}
