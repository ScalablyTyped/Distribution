package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @mixin
         */
@js.native
trait IBDD extends js.Object {
  def any(clsConstructor: js.Function): js.Any = js.native
  def ddescribe(name: java.lang.String, code: js.Function): scala.Unit = js.native
  def ddescribe(name: java.lang.String, code: js.Function, timeout: scala.Double): scala.Unit = js.native
  def describe(name: java.lang.String, code: js.Function): scala.Unit = js.native
  def describe(name: java.lang.String, code: js.Function, timeout: scala.Double): scala.Unit = js.native
  def expect(value: js.Any): siestaLib.SiestaNs.TestNs.BDDNs.Expectation = js.native
  def iit(name: java.lang.String, code: js.Function): scala.Unit = js.native
  def iit(name: java.lang.String, code: js.Function, timeout: scala.Double): scala.Unit = js.native
  def it(name: java.lang.String, code: js.Function): scala.Unit = js.native
  def it(name: java.lang.String, code: js.Function, timeout: scala.Double): scala.Unit = js.native
  def xdescribe(name: java.lang.String, code: js.Function): scala.Unit = js.native
  def xdescribe(name: java.lang.String, code: js.Function, timeout: scala.Double): scala.Unit = js.native
  def xit(name: java.lang.String, code: js.Function): scala.Unit = js.native
  def xit(name: java.lang.String, code: js.Function, timeout: scala.Double): scala.Unit = js.native
}

