package typings
package shouldDashSinonLib.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldSinonAssertion
  extends shouldLib.shouldMod.Assertion {
  /**
    * Assert stub was called with given object as this always. So if you call stub several times
    * all should be with the same object
    */
  def alwaysCalledOn(obj: js.Any): scala.Unit = js.native
  def alwaysCalledWith(args: js.Any*): scala.Unit = js.native
  /**
    * Passes if the spy was always called with the provided arguments and no others.
    */
  def alwaysCalledWithExactly(args: js.Any*): scala.Unit = js.native
  /**
    * Returns true if spy was always called with matching arguments (and possibly others).
    */
  def alwaysCalledWithMatch(args: js.Any*): scala.Unit = js.native
  def alwaysCalledWithNew(): scala.Unit = js.native
  /**
    * Passes if the spy always threw the given exception. The exception can be a
    * string denoting its type, or an actual object. If no argument is
    * provided, the assertion passes if the spy ever threw any exception.
    */
  def alwaysThrew(ex: java.lang.String): scala.Unit = js.native
  def alwaysThrew(ex: stdLib.Error): scala.Unit = js.native
  /**
    * Assert stub was called at exact number of times
    */
  def callCount(count: scala.Double): scala.Unit = js.native
  /**
    * Assert stub was called at least once
    */
  def called(): scala.Unit = js.native
  /**
    * Assert stub was called with given object as this
    */
  def calledOn(obj: js.Any): scala.Unit = js.native
  /**
    * Assert stub was called at exactly once
    */
  def calledOnce(): scala.Unit = js.native
  /**
    * Assert stub was called at exactly thrice
    */
  def calledThrice(): scala.Unit = js.native
  /**
    * Assert stub was called at exactly twice
    */
  def calledTwice(): scala.Unit = js.native
  /**
    * Asserts that stub was called with given arguments
    */
  def calledWith(args: js.Any*): scala.Unit = js.native
  /**
    * Returns true if call received provided arguments and no others.
    */
  def calledWithExactly(args: js.Any*): scala.Unit = js.native
  /**
    * Returns true if spy was called with matching arguments (and possibly others).
    */
  def calledWithMatch(args: js.Any*): scala.Unit = js.native
  /**
    * Asserts that stub was called with new
    */
  def calledWithNew(): scala.Unit = js.native
  /**
    * Returns true if the spy/stub was never called with the provided arguments.
    */
  def neverCalledWith(args: js.Any*): scala.Unit = js.native
  /**
    * Returns true if the spy/stub was never called with matching arguments.
    */
  def neverCalledWithMatch(args: js.Any*): scala.Unit = js.native
  /**
    * Passes if the spy threw the given exception. The exception can be a
    * string denoting its type, or an actual object. If no argument is
    * provided, the assertion passes if the spy ever threw any exception.
    */
  def threw(ex: java.lang.String): scala.Unit = js.native
  def threw(ex: stdLib.Error): scala.Unit = js.native
}

