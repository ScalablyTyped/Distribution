package typings.shouldDashSinon.sinonMod

import typings.should.shouldMod.Assertion
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldSinonAssertion extends Assertion {
  /**
    * Assert stub was called with given object as this always. So if you call stub several times
    * all should be with the same object
    */
  def alwaysCalledOn(obj: js.Any): Unit = js.native
  def alwaysCalledWith(args: js.Any*): Unit = js.native
  /**
    * Passes if the spy was always called with the provided arguments and no others.
    */
  def alwaysCalledWithExactly(args: js.Any*): Unit = js.native
  /**
    * Returns true if spy was always called with matching arguments (and possibly others).
    */
  def alwaysCalledWithMatch(args: js.Any*): Unit = js.native
  def alwaysCalledWithNew(): Unit = js.native
  /**
    * Passes if the spy always threw the given exception. The exception can be a
    * string denoting its type, or an actual object. If no argument is
    * provided, the assertion passes if the spy ever threw any exception.
    */
  def alwaysThrew(ex: String): Unit = js.native
  def alwaysThrew(ex: Error): Unit = js.native
  /**
    * Assert stub was called at exact number of times
    */
  def callCount(count: Double): Unit = js.native
  /**
    * Assert stub was called at least once
    */
  def called(): Unit = js.native
  /**
    * Assert stub was called with given object as this
    */
  def calledOn(obj: js.Any): Unit = js.native
  /**
    * Assert stub was called at exactly once
    */
  def calledOnce(): Unit = js.native
  /**
    * Assert stub was called at exactly thrice
    */
  def calledThrice(): Unit = js.native
  /**
    * Assert stub was called at exactly twice
    */
  def calledTwice(): Unit = js.native
  /**
    * Asserts that stub was called with given arguments
    */
  def calledWith(args: js.Any*): Unit = js.native
  /**
    * Returns true if call received provided arguments and no others.
    */
  def calledWithExactly(args: js.Any*): Unit = js.native
  /**
    * Returns true if spy was called with matching arguments (and possibly others).
    */
  def calledWithMatch(args: js.Any*): Unit = js.native
  /**
    * Asserts that stub was called with new
    */
  def calledWithNew(): Unit = js.native
  /**
    * Returns true if the spy/stub was never called with the provided arguments.
    */
  def neverCalledWith(args: js.Any*): Unit = js.native
  /**
    * Returns true if the spy/stub was never called with matching arguments.
    */
  def neverCalledWithMatch(args: js.Any*): Unit = js.native
  /**
    * Passes if the spy threw the given exception. The exception can be a
    * string denoting its type, or an actual object. If no argument is
    * provided, the assertion passes if the spy ever threw any exception.
    */
  def threw(ex: String): Unit = js.native
  def threw(ex: Error): Unit = js.native
}

