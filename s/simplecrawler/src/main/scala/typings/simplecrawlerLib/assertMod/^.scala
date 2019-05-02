package typings
package simplecrawlerLib.assertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("assert", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(value: js.Any): scala.Unit = js.native
  def apply(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: stdLib.RegExp): scala.Unit = js.native
  def doesNotThrow(block: js.Function, error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def doesNotThrow(block: js.Function, message: java.lang.String): scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def fail(): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Nothing = js.native
  def fail(actual: js.Any, expected: js.Any, message: java.lang.String, operator: java.lang.String): scala.Nothing = js.native
  def fail(
    actual: js.Any,
    expected: js.Any,
    message: java.lang.String,
    operator: java.lang.String,
    stackStartFn: js.Function
  ): scala.Nothing = js.native
  def fail(message: java.lang.String): scala.Nothing = js.native
  def ifError(value: js.Any): scala.Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def ok(value: js.Any): scala.Unit = js.native
  def ok(value: js.Any, message: java.lang.String): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function): scala.Unit = js.native
  def throws(block: js.Function, error: js.Function): scala.Unit = js.native
  def throws(block: js.Function, error: js.Function, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, error: stdLib.RegExp): scala.Unit = js.native
  def throws(block: js.Function, error: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def throws(block: js.Function, message: java.lang.String): scala.Unit = js.native
}

