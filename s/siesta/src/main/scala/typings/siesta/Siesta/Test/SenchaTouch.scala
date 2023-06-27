package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  */
@js.native
trait SenchaTouch
  extends StObject
     with Browser
     with IExtJSComponent
     with IExtJSElement
     with IExtJSFormField
     with IExtJSObservable
     with IExtJSStore
     with IExtJSCore {
  
  def doubleTap(target: Any): Unit = js.native
  def doubleTap(target: Any, callback: js.Function): Unit = js.native
  def doubleTap(target: Any, callback: js.Function, scope: Any): Unit = js.native
  def doubleTap(target: Any, callback: js.Function, scope: Any, offset: js.Array[Double]): Unit = js.native
  def doubleTap(target: Any, callback: js.Function, scope: Unit, offset: js.Array[Double]): Unit = js.native
  def doubleTap(target: Any, callback: Unit, scope: Any): Unit = js.native
  def doubleTap(target: Any, callback: Unit, scope: Any, offset: js.Array[Double]): Unit = js.native
  def doubleTap(target: Any, callback: Unit, scope: Unit, offset: js.Array[Double]): Unit = js.native
  
  /* InferMemberOverrides */
  override def firesAtLeastNTimes(observable: Any, event: String, n: Double, desc: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def firesOnce(observable: Any, event: String, desc: String): Unit = js.native
  
  def longpress(target: Any): Unit = js.native
  def longpress(target: Any, callback: js.Function): Unit = js.native
  def longpress(target: Any, callback: js.Function, scope: Any): Unit = js.native
  def longpress(target: Any, callback: js.Function, scope: Any, offset: js.Array[Double]): Unit = js.native
  def longpress(target: Any, callback: js.Function, scope: Unit, offset: js.Array[Double]): Unit = js.native
  def longpress(target: Any, callback: Unit, scope: Any): Unit = js.native
  def longpress(target: Any, callback: Unit, scope: Any, offset: js.Array[Double]): Unit = js.native
  def longpress(target: Any, callback: Unit, scope: Unit, offset: js.Array[Double]): Unit = js.native
  
  def moveFingerBy(delta: js.Array[Double]): Unit = js.native
  def moveFingerBy(delta: js.Array[Double], callback: js.Function): Unit = js.native
  def moveFingerBy(delta: js.Array[Double], callback: js.Function, scope: Any): Unit = js.native
  def moveFingerBy(delta: js.Array[Double], callback: Unit, scope: Any): Unit = js.native
  
  def moveFingerTo(target: Any): Unit = js.native
  def moveFingerTo(target: Any, callback: js.Function): Unit = js.native
  def moveFingerTo(target: Any, callback: js.Function, scope: Any): Unit = js.native
  def moveFingerTo(target: Any, callback: js.Function, scope: Any, offset: js.Array[Double]): Unit = js.native
  def moveFingerTo(target: Any, callback: js.Function, scope: Unit, offset: js.Array[Double]): Unit = js.native
  def moveFingerTo(target: Any, callback: Unit, scope: Any): Unit = js.native
  def moveFingerTo(target: Any, callback: Unit, scope: Any, offset: js.Array[Double]): Unit = js.native
  def moveFingerTo(target: Any, callback: Unit, scope: Unit, offset: js.Array[Double]): Unit = js.native
  
  def scrollUntilElementVisible(scrollable: Any, direction: String, actionTarget: Any, callback: js.Function, scope: Any): Unit = js.native
  
  def swipe(target: Any, direction: String): Unit = js.native
  def swipe(target: Any, direction: String, callback: js.Function): Unit = js.native
  def swipe(target: Any, direction: String, callback: js.Function, scope: Any): Unit = js.native
  def swipe(target: Any, direction: String, callback: Unit, scope: Any): Unit = js.native
  
  def tap(target: Any): Unit = js.native
  def tap(target: Any, callback: js.Function): Unit = js.native
  def tap(target: Any, callback: js.Function, scope: Any): Unit = js.native
  def tap(target: Any, callback: Unit, scope: Any): Unit = js.native
  
  /* InferMemberOverrides */
  override def waitForEvent(observable: Any, event: String, callback: js.Function): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Any): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForScrollerPosition(scroller: Any, position: IPositionConfig, callback: js.Function): Unit = js.native
  def waitForScrollerPosition(scroller: Any, position: IPositionConfig, callback: js.Function, scope: Any): Unit = js.native
  def waitForScrollerPosition(scroller: Any, position: IPositionConfig, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForScrollerPosition(scroller: Any, position: IPositionConfig, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def wontFire(observable: Any, event: String, desc: String): Unit = js.native
}
