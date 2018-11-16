package typings
package siestaLib.SiestaNs.TestNs.BDDNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             @class
             */
@js.native
trait Expectation extends js.Object {
  var not: Expectation = js.native
  def toBe(expectedValue: js.Any): scala.Unit = js.native
  def toBeCloseTo(expectedValue: scala.Double): scala.Unit = js.native
  def toBeCloseTo(expectedValue: scala.Double, precision: scala.Double): scala.Unit = js.native
  def toBeDefined(expectedValue: js.Any): scala.Unit = js.native
  def toBeFalsy(expectedValue: js.Any): scala.Unit = js.native
  def toBeGreaterThan(expectedValue: js.Any): scala.Unit = js.native
  def toBeLessThan(expectedValue: js.Any): scala.Unit = js.native
  def toBeNaN(expectedValue: js.Any): scala.Unit = js.native
  def toBeNull(expectedValue: js.Any): scala.Unit = js.native
  def toBeTruthy(expectedValue: js.Any): scala.Unit = js.native
  def toBeUndefined(value: js.Any): scala.Unit = js.native
  def toContain(element: js.Any): scala.Unit = js.native
  def toEqual(expectedValue: js.Any): scala.Unit = js.native
  def toMatch(regexp: stdLib.RegExp): scala.Unit = js.native
  def toThrow(): scala.Unit = js.native
}

