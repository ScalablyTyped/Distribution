package typings.siesta.Siesta.Test

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait IExtJSObservable extends StObject {
  
  def firesAtLeastNTimes(observable: Any, event: String, n: Double, desc: String): Unit = js.native
  
  def firesOnce(observable: Any, event: String, desc: String): Unit = js.native
  
  def hasListener(observable: Any, eventName: String): Unit = js.native
  def hasListener(observable: Any, eventName: String, description: String): Unit = js.native
  
  def isFiredWithSignature(observable: Any, event: String, checkerFn: js.Function, desc: String): Unit = js.native
  
  def waitForEvent(observable: Any, event: String, callback: js.Function): Unit = js.native
  def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def wontFire(observable: Any, event: String, desc: String): Unit = js.native
}
