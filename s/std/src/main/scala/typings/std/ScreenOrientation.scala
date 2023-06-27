package typings.std

import typings.std.stdStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation) */
@js.native
trait ScreenOrientation
  extends StObject
     with EventTarget {
  
  /* standard dom */
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/angle) */
  /* standard dom */
  val angle: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/lock) */
  /* standard dom */
  def lock(orientation: OrientationLockType): js.Promise[Unit] = js.native
  
  /* standard dom */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, Any]) | Null = js.native
  
  /* standard dom */
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/type) */
  /* standard dom */
  val `type`: OrientationType = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenOrientation/unlock) */
  /* standard dom */
  def unlock(): Unit = js.native
}
