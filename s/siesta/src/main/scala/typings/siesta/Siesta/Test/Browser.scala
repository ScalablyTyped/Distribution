package typings.siesta.Siesta.Test

import typings.siesta.Siesta.ITest
import typings.siesta.Siesta.Test.Simulate.IEvent
import typings.siesta.Siesta.Test.Simulate.IKeyboard
import typings.siesta.Siesta.Test.Simulate.IMouse
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  */
@js.native
trait Browser
  extends StObject
     with ITest
     with IEvent
     with IKeyboard
     with IMouse
     with IElement
     with ITextSelection {
  
  def clearTimeout(timeoutId: Double): Unit = js.native
  
  def elementFromPoint(x: Double, y: Double): HTMLElement = js.native
  def elementFromPoint(x: Double, y: Double, shallow: Boolean): HTMLElement = js.native
  
  def firesAtLeastNTimes(observable: Any, event: String, n: Double, desc: String): Unit = js.native
  
  def firesOk(options: Any): Unit = js.native
  
  def firesOnce(observable: Any, event: String, desc: String): Unit = js.native
  
  def isntFired(observable: Any, event: String, desc: String): Unit = js.native
  
  def setTimeout(func: js.Function, delay: Double): Double = js.native
  
  def waitForEvent(observable: Any, event: String, callback: js.Function): Unit = js.native
  def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Any): Unit = js.native
  def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Any, timeout: Double): Unit = js.native
  def waitForEvent(observable: Any, event: String, callback: js.Function, scope: Unit, timeout: Double): Unit = js.native
  
  def waitForPageLoad(callback: js.Function): Unit = js.native
  def waitForPageLoad(callback: js.Function, scope: Any): Unit = js.native
  
  def willFireNTimes(observable: Any, event: String, n: Double, desc: String): Unit = js.native
  
  def wontFire(observable: Any, event: String, desc: String): Unit = js.native
}
