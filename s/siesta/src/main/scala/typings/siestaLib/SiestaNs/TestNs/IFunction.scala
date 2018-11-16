package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @mixin
         */
@js.native
trait IFunction extends js.Object {
  def isCalled(fn: java.lang.String, host: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isCalled(fn: js.Function, host: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isCalledNTimes(fn: java.lang.String, host: js.Any, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def isCalledNTimes(fn: js.Function, host: js.Any, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def isCalledOnce(fn: java.lang.String, host: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isCalledOnce(fn: js.Function, host: js.Any, desc: java.lang.String): scala.Unit = js.native
  def isntCalled(fn: java.lang.String, host: js.Any, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def isntCalled(fn: js.Function, host: js.Any, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def methodIsCalled(fn: java.lang.String, className: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def methodIsCalled(fn: java.lang.String, className: js.Function, desc: java.lang.String): scala.Unit = js.native
  def methodIsCalled(fn: js.Function, className: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def methodIsCalled(fn: js.Function, className: js.Function, desc: java.lang.String): scala.Unit = js.native
  def methodIsCalledNTimes(fn: java.lang.String, className: java.lang.String, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def methodIsCalledNTimes(fn: java.lang.String, className: js.Function, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def methodIsCalledNTimes(fn: js.Function, className: java.lang.String, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def methodIsCalledNTimes(fn: js.Function, className: js.Function, n: scala.Double, desc: java.lang.String): scala.Unit = js.native
  def methodIsntCalled(fn: java.lang.String, className: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def methodIsntCalled(fn: java.lang.String, className: js.Function, desc: java.lang.String): scala.Unit = js.native
  def methodIsntCalled(fn: js.Function, className: java.lang.String, desc: java.lang.String): scala.Unit = js.native
  def methodIsntCalled(fn: js.Function, className: js.Function, desc: java.lang.String): scala.Unit = js.native
}

