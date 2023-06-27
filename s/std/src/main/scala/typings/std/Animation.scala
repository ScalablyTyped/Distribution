package typings.std

import typings.std.stdStrings.cancel
import typings.std.stdStrings.finish
import typings.std.stdStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation) */
@js.native
trait Animation
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remove(`type`: remove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel) */
  /* standard dom */
  def cancel(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/commitStyles) */
  /* standard dom */
  def commitStyles(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/currentTime) */
  /* standard dom */
  var currentTime: CSSNumberish | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/effect) */
  /* standard dom */
  var effect: AnimationEffect | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish) */
  /* standard dom */
  def finish(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finished) */
  /* standard dom */
  val finished: js.Promise[Animation] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/id) */
  /* standard dom */
  var id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/cancel_event) */
  /* standard dom */
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/finish_event) */
  /* standard dom */
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/remove_event) */
  /* standard dom */
  var onremove: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pause) */
  /* standard dom */
  def pause(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/pending) */
  /* standard dom */
  val pending: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/persist) */
  /* standard dom */
  def persist(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/play) */
  /* standard dom */
  def play(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState) */
  /* standard dom */
  val playState: AnimationPlayState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playbackRate) */
  /* standard dom */
  var playbackRate: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/ready) */
  /* standard dom */
  val ready: js.Promise[Animation] = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remove(`type`: remove, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_remove(
    `type`: remove,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState) */
  /* standard dom */
  val replaceState: AnimationReplaceState = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/reverse) */
  /* standard dom */
  def reverse(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/startTime) */
  /* standard dom */
  var startTime: CSSNumberish | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/timeline) */
  /* standard dom */
  var timeline: AnimationTimeline | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/updatePlaybackRate) */
  /* standard dom */
  def updatePlaybackRate(playbackRate: Double): Unit = js.native
}
