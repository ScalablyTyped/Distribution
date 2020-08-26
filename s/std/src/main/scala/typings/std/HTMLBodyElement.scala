package typings.std

import typings.std.stdStrings.orientationchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties (beyond those inherited from the regular HTMLElement interface) for manipulating <body> elements. */
@js.native
trait HTMLBodyElement
  extends HTMLElement
     with WindowEventHandlers {
  /** @deprecated */
  var aLink: java.lang.String = js.native
  /** @deprecated */
  var background: java.lang.String = js.native
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /** @deprecated */
  var link: java.lang.String = js.native
  /** @deprecated */
  var onorientationchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | Null = js.native
  /** @deprecated */
  var text: java.lang.String = js.native
  /** @deprecated */
  var vLink: java.lang.String = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(`type`: orientationchange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_orientationchange(
    `type`: orientationchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
}

