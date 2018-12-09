package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Animation extends EventTarget {
  var currentTime: scala.Double | scala.Null = js.native
  var effect: AnimationEffect | scala.Null = js.native
  val finished: js.Promise[Animation] = js.native
  var id: java.lang.String = js.native
  var oncancel: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]) | scala.Null = js.native
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]) | scala.Null = js.native
  val pending: scala.Boolean = js.native
  val playState: AnimationPlayState = js.native
  var playbackRate: scala.Double = js.native
  val ready: js.Promise[Animation] = js.native
  var startTime: scala.Double | scala.Null = js.native
  var timeline: AnimationTimeline | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  def finish(): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    `type`: stdLib.stdLibStrings.cancel,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: stdLib.stdLibStrings.finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ AnimationPlaybackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def reverse(): scala.Unit = js.native
  def updatePlaybackRate(playbackRate: scala.Double): scala.Unit = js.native
}

@JSGlobal("Animation")
@js.native
object Animation
  extends ScalablyTyped.runtime.Instantiable1[/* effect */ AnimationEffect, Animation]
     with ScalablyTyped.runtime.Instantiable2[
      (/* effect */ AnimationEffect) | (/* effect */ scala.Null), 
      /* timeline */ AnimationTimeline, 
      Animation
    ]
     with ScalablyTyped.runtime.Instantiable0[Animation]

