package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualViewport
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resize")
  def addEventListener(`type`: "resize", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_scroll")
  def addEventListener(`type`: "scroll", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_scroll")
  def addEventListener(
    `type`: "scroll",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resize")
  def addEventListener(
    `type`: "resize",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_scroll")
  def addEventListener(
    `type`: "scroll",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_resize")
  def addEventListener(
    `type`: "resize",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val height: Double = js.native
  
  /* standard dom */
  val offsetLeft: Double = js.native
  
  /* standard dom */
  val offsetTop: Double = js.native
  
  /* standard dom */
  var onresize: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  var onscroll: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  val pageLeft: Double = js.native
  
  /* standard dom */
  val pageTop: Double = js.native
  
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_scroll")
  def removeEventListener(`type`: "scroll", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resize")
  def removeEventListener(`type`: "resize", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_scroll")
  def removeEventListener(
    `type`: "scroll",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resize")
  def removeEventListener(
    `type`: "resize",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_resize")
  def removeEventListener(
    `type`: "resize",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_scroll")
  def removeEventListener(
    `type`: "scroll",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val scale: Double = js.native
  
  /* standard dom */
  val width: Double = js.native
}
