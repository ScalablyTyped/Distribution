package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple user interface events.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent)
  */
@js.native
trait UIEvent
  extends StObject
     with Event {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/detail) */
  /* standard dom */
  val detail: Double = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/initUIEvent)
    */
  /* standard dom */
  def initUIEvent(typeArg: java.lang.String): Unit = js.native
  def initUIEvent(typeArg: java.lang.String, bubblesArg: scala.Boolean): Unit = js.native
  def initUIEvent(typeArg: java.lang.String, bubblesArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Null,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Unit,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window
  ): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: Unit,
    viewArg: Null,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: Unit,
    viewArg: Unit,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(typeArg: java.lang.String, bubblesArg: scala.Boolean, cancelableArg: Unit, viewArg: Window): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: Unit,
    viewArg: Window,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(typeArg: java.lang.String, bubblesArg: Unit, cancelableArg: scala.Boolean): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: scala.Boolean,
    viewArg: Null,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: scala.Boolean,
    viewArg: Unit,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(typeArg: java.lang.String, bubblesArg: Unit, cancelableArg: scala.Boolean, viewArg: Window): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double
  ): Unit = js.native
  def initUIEvent(typeArg: java.lang.String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Null, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: java.lang.String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Unit, detailArg: Double): Unit = js.native
  def initUIEvent(typeArg: java.lang.String, bubblesArg: Unit, cancelableArg: Unit, viewArg: Window): Unit = js.native
  def initUIEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: Unit,
    viewArg: Window,
    detailArg: Double
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/view) */
  /* standard dom */
  val view: Window | Null = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/UIEvent/which)
    */
  /* standard dom */
  val which: Double = js.native
}
