package typings.siesta.Siesta.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IExtJSObservable extends js.Object {
  def firesAtLeastNTimes(observable: js.Any, event: String, n: Double, desc: String): Unit = js.native
  def firesOnce(observable: js.Any, event: String, desc: String): Unit = js.native
  def hasListener(observable: js.Any, eventName: String): Unit = js.native
  def hasListener(observable: js.Any, eventName: String, description: String): Unit = js.native
  def isFiredWithSignature(observable: js.Any, event: String, checkerFn: js.Function, desc: String): Unit = js.native
  def waitForEvent(observable: js.Any, event: String, callback: js.Function): Unit = js.native
  def waitForEvent(observable: js.Any, event: String, callback: js.Function, scope: js.Any): Unit = js.native
  def waitForEvent(observable: js.Any, event: String, callback: js.Function, scope: js.Any, timeout: Double): Unit = js.native
  def wontFire(observable: js.Any, event: String, desc: String): Unit = js.native
}

