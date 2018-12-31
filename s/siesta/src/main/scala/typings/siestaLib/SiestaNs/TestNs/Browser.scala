package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
@js.native
trait Browser
  extends siestaLib.SiestaNs.ITest
     with siestaLib.SiestaNs.TestNs.SimulateNs.IEvent
     with siestaLib.SiestaNs.TestNs.SimulateNs.IKeyboard
     with siestaLib.SiestaNs.TestNs.SimulateNs.IMouse
     with IElement
     with ITextSelection {
  def clearTimeout(timeoutId: scala.Double): scala.Unit = js.native
  def elementFromPoint(x: scala.Double, y: scala.Double): stdLib.HTMLElement = js.native
  def elementFromPoint(x: scala.Double, y: scala.Double, shallow: scala.Boolean): stdLib.HTMLElement = js.native
  def firesAtLeastNTimes(observable: js.Any, event: java.lang.String, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def firesOk(options: js.Any): scala.Unit = js.native
  def firesOnce(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def isntFired(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def setTimeout(func: js.Function, delay: scala.Double): scala.Double = js.native
  def waitForEvent(observable: js.Any, event: java.lang.String, callback: js.Function): scala.Unit = js.native
  def waitForEvent(observable: js.Any, event: java.lang.String, callback: js.Function, scope: js.Any): scala.Unit = js.native
  def waitForEvent(
    observable: js.Any,
    event: java.lang.String,
    callback: js.Function,
    scope: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def waitForPageLoad(callback: js.Function): scala.Unit = js.native
  def waitForPageLoad(callback: js.Function, scope: js.Any): scala.Unit = js.native
  def willFireNTimes(observable: js.Any, event: java.lang.String, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def wontFire(observable: js.Any, event: java.lang.String, desc: java.lang.String): scala.Unit = js.native
}

