package typings.should.shouldMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("should", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val not: ShouldAssertExt = js.native
  def apply(obj: js.Any): Assertion = js.native
  def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def doesNotThrow(block: js.Function): Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function): Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def doesNotThrow(block: js.Function, error: js.Function, message: String): Unit = js.native
  def doesNotThrow(block: js.Function, error: RegExp): Unit = js.native
  def doesNotThrow(block: js.Function, error: RegExp, message: String): Unit = js.native
  def doesNotThrow(block: js.Function, message: String): Unit = js.native
  def equal(actual: js.Any, expected: js.Any): Unit = js.native
  def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def exist(obj: js.Any): Unit = js.native
  def exist(obj: js.Any, msg: String): Unit = js.native
  def exists(obj: js.Any): Unit = js.native
  def exists(obj: js.Any, msg: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def fail(actual: js.Any, expected: js.Any, message: String, operator: String): Unit = js.native
  def ifError(value: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notDeepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def ok(value: js.Any): Unit = js.native
  def ok(value: js.Any, message: String): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
  def throws(block: js.Function): Unit = js.native
  def throws(block: js.Function, error: js.Function): Unit = js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
  def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
  def throws(block: js.Function, error: js.Function, message: String): Unit = js.native
  def throws(block: js.Function, error: RegExp): Unit = js.native
  def throws(block: js.Function, error: RegExp, message: String): Unit = js.native
  def throws(block: js.Function, message: String): Unit = js.native
}

