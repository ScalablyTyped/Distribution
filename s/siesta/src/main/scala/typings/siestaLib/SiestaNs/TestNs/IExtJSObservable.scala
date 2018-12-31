package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IExtJSObservable extends js.Object {
  def firesAtLeastNTimes(observable: js.Any, event: java.lang.String, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def firesOnce(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def hasListener(observable: js.Any, eventName: java.lang.String): scala.Unit = js.native
  def hasListener(observable: js.Any, eventName: java.lang.String, description: java.lang.String): scala.Unit = js.native
  def isFiredWithSignature(observable: js.Any, event: java.lang.String, checkerFn: js.Function, desc: java.lang.String): scala.Unit = js.native
  def waitForEvent(observable: js.Any, event: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForEvent(observable: js.Any, event: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForEvent(
    observable: js.Any,
    event: java.lang.String,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def wontFire(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
}

