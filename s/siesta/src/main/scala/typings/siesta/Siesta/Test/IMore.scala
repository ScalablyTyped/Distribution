package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait IMore extends StObject {
  
  def chain(step: IAction*): Unit = js.native
  def chain(steps: js.Array[IAction]): Unit = js.native
  
  def expectGlobals(names: Any*): Unit = js.native
  
  def isApprox(value1: Double, value2: Double, threshHold: Double, desc: String): Unit = js.native
  
  def isArray(value: Any, desc: String): Unit = js.native
  
  def isBoolean(value: Any, desc: String): Unit = js.native
  
  def isDate(value: Any, desc: String): Unit = js.native
  
  def isDeeply(obj1: Any, obj2: Any, desc: String): Unit = js.native
  
  def isDeeplyStrict(obj1: Any, obj2: Any, desc: String): Unit = js.native
  
  def isFunction(value: Any, desc: String): Unit = js.native
  
  def isGreater(value1: Any, value2: Any, desc: String): Unit = js.native
  
  def isGreaterOrEqual(value1: Any, value2: Any, desc: String): Unit = js.native
  
  def isLess(value1: Any, value2: Any, desc: String): Unit = js.native
  
  def isLessOrEqual(value1: Any, value2: Any, desc: String): Unit = js.native
  
  def isNumber(value: Any, desc: String): Unit = js.native
  
  def isObject(value: Any, desc: String): Unit = js.native
  
  def isRegExp(value: Any, desc: String): Unit = js.native
  
  def isString(value: Any, desc: String): Unit = js.native
  
  def isaOk(value: Any, className: String, desc: String): Unit = js.native
  def isaOk(value: Any, className: js.Function, desc: String): Unit = js.native
  
  def like(string: String, regex: String, desc: String): Unit = js.native
  def like(string: String, regex: js.RegExp, desc: String): Unit = js.native
  
  def livesOk(func: js.Function, desc: String): Unit = js.native
  
  def throwsOk(func: js.Function, expected: String, desc: String): Unit = js.native
  def throwsOk(func: js.Function, expected: js.RegExp, desc: String): Unit = js.native
  
  def unlike(string: String, regex: String, desc: String): Unit = js.native
  def unlike(string: String, regex: js.RegExp, desc: String): Unit = js.native
  
  def verifyGlobals(names: String*): Unit = js.native
  
  def waitFor(config: IWaitForConfig): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: Any): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: Any, timeout: Double): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: Any, timeout: Double, interval: Double): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: Any, timeout: Unit, interval: Double): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: Unit, timeout: Double): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: Unit, timeout: Double, interval: Double): IWaitForReturn = js.native
  def waitFor(method: js.Function, callback: js.Function, scope: Unit, timeout: Unit, interval: Double): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: Any): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: Any, timeout: Double): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: Any, timeout: Double, interval: Double): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: Any, timeout: Unit, interval: Double): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: Unit, timeout: Double): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: Unit, timeout: Double, interval: Double): IWaitForReturn = js.native
  def waitFor(wait: Double, callback: js.Function, scope: Unit, timeout: Unit, interval: Double): IWaitForReturn = js.native
  
  var waitForTimeout: Double = js.native
}
