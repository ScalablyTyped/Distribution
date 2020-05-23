package typings.std

import typings.std.stdStrings.bounce
import typings.std.stdStrings.finish
import typings.std.stdStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods to manipulate <marquee> elements. */
@js.native
trait HTMLMarqueeElement extends HTMLElement {
  /** @deprecated */
  var behavior: java.lang.String = js.native
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /** @deprecated */
  var direction: java.lang.String = js.native
  /** @deprecated */
  var height: java.lang.String = js.native
  /** @deprecated */
  var hspace: Double = js.native
  /** @deprecated */
  var loop: Double = js.native
  /** @deprecated */
  var onbounce: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  /** @deprecated */
  var onfinish: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  /** @deprecated */
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  /** @deprecated */
  var scrollAmount: Double = js.native
  /** @deprecated */
  var scrollDelay: Double = js.native
  /** @deprecated */
  var trueSpeed: scala.Boolean = js.native
  /** @deprecated */
  var vspace: Double = js.native
  /** @deprecated */
  var width: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(`type`: bounce, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(`type`: finish, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bounce(`type`: bounce, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bounce(
    `type`: bounce,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(`type`: finish, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_finish(
    `type`: finish,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  /** @deprecated */
  def start(): Unit = js.native
  /** @deprecated */
  def stop(): Unit = js.native
}

