package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def doubleTap(target: js.Any): scala.Unit = js.native
  def doubleTap(target: js.Any, callback: js.Function): scala.Unit = js.native
  def doubleTap(target: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def doubleTap(target: js.Any, callback: js.Function, scope: js.Any, offset: js.Array[scala.Double]): scala.Unit = js.native
  /* InferMemberOverrides */
  override def firesAtLeastNTimes(observable: js.Any, event: java.lang.String, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def firesOnce(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def longpress(target: js.Any): scala.Unit = js.native
  def longpress(target: js.Any, callback: js.Function): scala.Unit = js.native
  def longpress(target: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def longpress(target: js.Any, callback: js.Function, scope: js.Any, offset: js.Array[scala.Double]): scala.Unit = js.native
  def moveFingerBy(delta: js.Array[scala.Double]): scala.Unit = js.native
  def moveFingerBy(delta: js.Array[scala.Double], callback: js.Function): scala.Unit = js.native
  def moveFingerBy(delta: js.Array[scala.Double], callback: js.Function, scope: js.Any): scala.Unit = js.native
  def moveFingerTo(target: js.Any): scala.Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.Function): scala.Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def moveFingerTo(target: js.Any, callback: js.Function, scope: js.Any, offset: js.Array[scala.Double]): scala.Unit = js.native
  def scrollUntilElementVisible(
    scrollable: js.Any,
    direction: java.lang.String,
    actionTarget: js.Any,
    callback: js.Function,
    scope: js.Any
  ): scala.Unit = js.native
  def swipe(target: js.Any, direction: java.lang.String): scala.Unit = js.native
  def swipe(target: js.Any, direction: java.lang.String, callback: js.Function): scala.Unit = js.native
  def swipe(target: js.Any, direction: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def tap(target: js.Any): scala.Unit = js.native
  def tap(target: js.Any, callback: js.Function): scala.Unit = js.native
  def tap(target: js.Any, callback: js.Function, scope: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: js.Any, event: java.lang.String, callback: js.Function): scala.Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(observable: js.Any, event: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  /* InferMemberOverrides */
  override def waitForEvent(
    observable: js.Any,
    event: java.lang.String,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitForScrollerPosition(scroller: js.Any, position: IPositionConfig, callback: js.Function): scala.Unit = js.native
  def waitForScrollerPosition(scroller: js.Any, position: IPositionConfig, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForScrollerPosition(
    scroller: js.Any,
    position: IPositionConfig,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  /* InferMemberOverrides */
  override def wontFire(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
}

