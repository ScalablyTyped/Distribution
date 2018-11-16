package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @class
         */
@js.native
trait ExtJS
  extends Browser
     with IExtJSAjax
     with IExtJSComponent
     with IExtJSDataView
     with IExtJSElement
     with IExtJSFormField
     with IExtJSGrid
     with IExtJSObservable
     with IExtJSStore
     with IExtJSCore {
  def assertMaxNumberOfGlobalExtOverrides(maxNumber: scala.Double): scala.Unit = js.native
  def assertMaxNumberOfGlobalExtOverrides(maxNumber: scala.Double, description: js.Any): scala.Unit = js.native
  def assertNoGlobalExtOverrides(): scala.Unit = js.native
  def assertNoGlobalExtOverrides(description: java.lang.String): scala.Unit = js.native
  def assertNoLayoutTriggered(fn: js.Function, scope: js.Any): scala.Unit = js.native
  def assertNoLayoutTriggered(fn: js.Function, scope: js.Any, description: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def firesAtLeastNTimes(observable: js.Any, event: java.lang.String, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  /* InferMemberOverrides */
  override def firesOnce(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def getTotalLayoutCounter(): scala.Double = js.native
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
  /* InferMemberOverrides */
  override def wontFire(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
}

