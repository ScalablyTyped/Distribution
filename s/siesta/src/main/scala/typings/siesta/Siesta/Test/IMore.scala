package typings.siesta.Siesta.Test

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait IMore extends js.Object {
  var waitForTimeout: Double = js.native
  def chain(step: IAction*): Unit = js.native
  def chain(steps: js.Array[IAction]): Unit = js.native
  def expectGlobals(names: js.Any*): Unit = js.native
  def isApprox(value1: Double, value2: Double, threshHold: Double, desc: String): Unit = js.native
  def isArray(value: js.Any, desc: String): Unit = js.native
  def isBoolean(value: js.Any, desc: String): Unit = js.native
  def isDate(value: js.Any, desc: String): Unit = js.native
  def isDeeply(obj1: js.Any, obj2: js.Any, desc: String): Unit = js.native
  def isDeeplyStrict(obj1: js.Any, obj2: js.Any, desc: String): Unit = js.native
  def isFunction(value: js.Any, desc: String): Unit = js.native
  def isGreater(value1: js.Any, value2: js.Any, desc: String): Unit = js.native
  def isGreaterOrEqual(value1: js.Any, value2: js.Any, desc: String): Unit = js.native
  def isLess(value1: js.Any, value2: js.Any, desc: String): Unit = js.native
  def isLessOrEqual(value1: js.Any, value2: js.Any, desc: String): Unit = js.native
  def isNumber(value: js.Any, desc: String): Unit = js.native
  def isObject(value: js.Any, desc: String): Unit = js.native
  def isRegExp(value: js.Any, desc: String): Unit = js.native
  def isString(value: js.Any, desc: String): Unit = js.native
  def isaOk(value: js.Any, className: String, desc: String): Unit = js.native
  def isaOk(value: js.Any, className: js.Function, desc: String): Unit = js.native
  def like(string: String, regex: String, desc: String): Unit = js.native
  def like(string: String, regex: RegExp, desc: String): Unit = js.native
  def livesOk(func: js.Function, desc: String): Unit = js.native
  def throwsOk(func: js.Function, expected: String, desc: String): Unit = js.native
  def throwsOk(func: js.Function, expected: RegExp, desc: String): Unit = js.native
  def unlike(string: String, regex: String, desc: String): Unit = js.native
  def unlike(string: String, regex: RegExp, desc: String): Unit = js.native
  def verifyGlobals(names: String*): Unit = js.native
  def waitFor(config: IWaitForConfig): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function): IWaitForReturn = js.native
  def waitFor(
    method: js.Function,
    callback: js.Function,
    scope: js.UndefOr[scala.Nothing],
    timeout: js.UndefOr[scala.Nothing],
    interval: Double
  ): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: js.UndefOr[scala.Nothing], timeout: Double): IWaitForReturn = js.native
  def waitFor(
    method: js.Function,
    callback: js.Function,
    scope: js.UndefOr[scala.Nothing],
    timeout: Double,
    interval: Double
  ): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: js.Any): IWaitForReturn = js.native
  def waitFor(
    method: js.Function,
    callback: js.Function,
    scope: js.Any,
    timeout: js.UndefOr[scala.Nothing],
    interval: Double
  ): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: js.Any, timeout: Double): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: js.Any, timeout: Double, interval: Double): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function): IWaitForReturn = js.native
  def waitFor(
    wait: Double,
    callback: js.Function,
    scope: js.UndefOr[scala.Nothing],
    timeout: js.UndefOr[scala.Nothing],
    interval: Double
  ): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: js.UndefOr[scala.Nothing], timeout: Double): IWaitForReturn = js.native
  def waitFor(
    wait: Double,
    callback: js.Function,
    scope: js.UndefOr[scala.Nothing],
    timeout: Double,
    interval: Double
  ): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: js.Any): IWaitForReturn = js.native
  def waitFor(
    wait: Double,
    callback: js.Function,
    scope: js.Any,
    timeout: js.UndefOr[scala.Nothing],
    interval: Double
  ): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: js.Any, timeout: Double): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: js.Any, timeout: Double, interval: Double): IWaitForReturn = js.native
}

