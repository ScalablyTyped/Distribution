package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The DOM CompositionEvent represents events that occur due to the user indirectly entering text.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent)
  */
@js.native
trait CompositionEvent
  extends StObject
     with UIEvent {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/data) */
  /* standard dom */
  val data: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompositionEvent/initCompositionEvent)
    */
  /* standard dom */
  def initCompositionEvent(typeArg: java.lang.String): Unit = js.native
  def initCompositionEvent(typeArg: java.lang.String, bubblesArg: scala.Boolean): Unit = js.native
  def initCompositionEvent(typeArg: java.lang.String, bubblesArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Null,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Unit,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: WindowProxy
  ): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: WindowProxy,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: Unit,
    viewArg: Null,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: Unit,
    viewArg: Unit,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(typeArg: java.lang.String, bubblesArg: scala.Boolean, cancelableArg: Unit, viewArg: WindowProxy): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: scala.Boolean,
    cancelableArg: Unit,
    viewArg: WindowProxy,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(typeArg: java.lang.String, bubblesArg: Unit, cancelableArg: scala.Boolean): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: scala.Boolean,
    viewArg: Null,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: scala.Boolean,
    viewArg: Unit,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(typeArg: java.lang.String, bubblesArg: Unit, cancelableArg: scala.Boolean, viewArg: WindowProxy): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: scala.Boolean,
    viewArg: WindowProxy,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: Unit,
    viewArg: Null,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: Unit,
    viewArg: Unit,
    dataArg: java.lang.String
  ): Unit = js.native
  def initCompositionEvent(typeArg: java.lang.String, bubblesArg: Unit, cancelableArg: Unit, viewArg: WindowProxy): Unit = js.native
  def initCompositionEvent(
    typeArg: java.lang.String,
    bubblesArg: Unit,
    cancelableArg: Unit,
    viewArg: WindowProxy,
    dataArg: java.lang.String
  ): Unit = js.native
}
