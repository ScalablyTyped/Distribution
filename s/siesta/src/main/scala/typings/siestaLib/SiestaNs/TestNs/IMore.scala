package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @mixin
         */
@js.native
trait IMore extends js.Object {
  var waitForTimeout: scala.Double = js.native
  def chain(step: IAction*): scala.Unit = js.native
  def chain(steps: js.Array[IAction]): scala.Unit = js.native
  def expectGlobals(names: js.Any*): scala.Unit = js.native
  def isApprox(value1: scala.Double, value2: scala.Double, threshHold: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def isArray(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isBoolean(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isDate(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isDeeply(obj1: js.Any, obj2: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isDeeplyStrict(obj1: js.Any, obj2: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isFunction(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isGreater(value1: js.Any, value2: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isGreaterOrEqual(value1: js.Any, value2: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isLess(value1: js.Any, value2: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isLessOrEqual(value1: js.Any, value2: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isNumber(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isObject(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isRegExp(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isString(value: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isaOk(value: js.Any, className: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def isaOk(value: js.Any, className: js.Function, desc: java.lang.String): scala.Unit = js.native
  def like(string: java.lang.String, regex: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def like(string: java.lang.String, regex: stdLib.RegExp, desc: java.lang.String): scala.Unit = js.native
  def livesOk(func: js.Function, desc: java.lang.String): scala.Unit = js.native
  def throwsOk(func: js.Function, expected: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def throwsOk(func: js.Function, expected: stdLib.RegExp, desc: java.lang.String): scala.Unit = js.native
  def unlike(string: java.lang.String, regex: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def unlike(string: java.lang.String, regex: stdLib.RegExp, desc: java.lang.String): scala.Unit = js.native
  def verifyGlobals(names: java.lang.String*): scala.Unit = js.native
  def waitFor(config: IWaitForConfig): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: js.Any): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: js.Any, timeout: scala.Double): IWaitForReturn = js.native
  def waitFor(
    method: js.Function,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double,
    interval: scala.Double
  ): IWaitForReturn = js.native
  def waitFor(wait: scala.Double, callback: js.Function): IWaitForReturn = js.native
  def waitFor(wait: scala.Double, callback: js.Function, scope: js.Any): IWaitForReturn = js.native
  def waitFor(wait: scala.Double, callback: js.Function, scope: js.Any, timeout: scala.Double): IWaitForReturn = js.native
  def waitFor(
    wait: scala.Double,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double,
    interval: scala.Double
  ): IWaitForReturn = js.native
}

