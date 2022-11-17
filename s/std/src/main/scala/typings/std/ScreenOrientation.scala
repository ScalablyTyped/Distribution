package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenOrientation
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_change")
  def addEventListener(`type`: "change", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_change")
  def addEventListener(
    `type`: "change",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  @scala.annotation.targetName("addEventListener_change")
  def addEventListener(
    `type`: "change",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val angle: Double = js.native
  
  /* standard dom */
  def lock(orientation: OrientationLockType): js.Promise[Unit] = js.native
  
  /* standard dom */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_change")
  def removeEventListener(`type`: "change", listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_change")
  def removeEventListener(
    `type`: "change",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  @scala.annotation.targetName("removeEventListener_change")
  def removeEventListener(
    `type`: "change",
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any],
    options: EventListenerOptions
  ): Unit = js.native
  
  /* standard dom */
  val `type`: OrientationType = js.native
  
  /* standard dom */
  def unlock(): Unit = js.native
}
