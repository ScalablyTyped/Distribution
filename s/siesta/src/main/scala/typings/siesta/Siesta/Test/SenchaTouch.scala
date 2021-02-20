package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
@js.native
trait SenchaTouch
  extends Browser
     with IExtJSComponent
     with IExtJSElement
     with IExtJSFormField
     with IExtJSObservable
     with IExtJSStore
     with IExtJSCore {
  
  def doubleTap(target: js.Any): Unit = js.native
  def doubleTap(
    target: js.Any,
    callback: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    offset: js.Array[Double]
  ): Unit = js.native
  def doubleTap(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def doubleTap(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any, offset: js.Array[Double]): Unit = js.native
  def doubleTap(target: js.Any, callback: js.Function): Unit = js.native
  def doubleTap(target: js.Any, callback: js.Function, scope: js.UndefOr[scala.Nothing], offset: js.Array[Double]): Unit = js.native
  def doubleTap(target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def doubleTap(target: js.Any, callback: js.Function, scope: js.Any, offset: js.Array[Double]): Unit = js.native
  
  /* InferMemberOverrides */
  override def firesAtLeastNTimes(observable: js.Any, event: String, n: Double, desc: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def firesOnce(observable: js.Any, event: String, desc: String): Unit = js.native
  
  def longpress(target: js.Any): Unit = js.native
  def longpress(
    target: js.Any,
    callback: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    offset: js.Array[Double]
  ): Unit = js.native
  def longpress(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def longpress(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any, offset: js.Array[Double]): Unit = js.native
  def longpress(target: js.Any, callback: js.Function): Unit = js.native
  def longpress(target: js.Any, callback: js.Function, scope: js.UndefOr[scala.Nothing], offset: js.Array[Double]): Unit = js.native
  def longpress(target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def longpress(target: js.Any, callback: js.Function, scope: js.Any, offset: js.Array[Double]): Unit = js.native
  
  def moveFingerBy(delta: js.Array[Double]): Unit = js.native
  def moveFingerBy(delta: js.Array[Double], callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def moveFingerBy(delta: js.Array[Double], callback: js.Function): Unit = js.native
  def moveFingerBy(delta: js.Array[Double], callback: js.Function, scope: js.Any): Unit = js.native
  
  def moveFingerTo(target: js.Any): Unit = js.native
  def moveFingerTo(
    target: js.Any,
    callback: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    offset: js.Array[Double]
  ): Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any, offset: js.Array[Double]): Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.Function): Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.Function, scope: js.UndefOr[scala.Nothing], offset: js.Array[Double]): Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.Function, scope: js.Any, offset: js.Array[Double]): Unit = js.native
  
  def scrollUntilElementVisible(scrollable: js.Any, direction: String, actionTarget: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  
  def swipe(target: js.Any, direction: String): Unit = js.native
  def swipe(target: js.Any, direction: String, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def swipe(target: js.Any, direction: String, callback: js.Function): Unit = js.native
  def swipe(target: js.Any, direction: String, callback: js.Function, scope: js.Any): Unit = js.native
  
  def tap(target: js.Any): Unit = js.native
  def tap(target: js.Any, callback: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  def tap(target: js.Any, callback: js.Function): Unit = js.native
  def tap(target: js.Any, callback: js.Function, scope: js.Any): Unit = js.native
  
  /* InferMemberOverrides */
  override def waitForEvent(observable: js.Any, event: String, callback: js.Function): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(
    observable: js.Any,
    event: String,
    callback: js.Function,
    scope: js.UndefOr[scala.Nothing],
    timeout: Double
  ): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: js.Any, event: String, callback: js.Function, scope: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: js.Any, event: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  
  def waitForScrollerPosition(scroller: js.Any, position: IPositionConfig, callback: js.Function): Unit = js.native
  def waitForScrollerPosition(
    scroller: js.Any,
    position: IPositionConfig,
    callback: js.Function,
    scope: js.UndefOr[scala.Nothing],
    timeout: Double
  ): Unit = js.native
  def waitForScrollerPosition(scroller: js.Any, position: IPositionConfig, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForScrollerPosition(scroller: js.Any, position: IPositionConfig, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  
  /* InferMemberOverrides */
  override def wontFire(observable: js.Any, event: String, desc: String): Unit = js.native
}
