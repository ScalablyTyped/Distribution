package typings.sinon.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFake extends js.Object {
  /**
    * Creates a basic fake, with no behavior
    */
  def apply(): SinonSpy = js.native
  /**
    * Wraps an existing Function to record all interactions, while leaving it up to the func to provide the behavior.
    * This is useful when complex behavior not covered by the sinon.fake.* methods is required or when wrapping an existing function or method.
    */
  def apply(fn: js.Function): SinonSpy = js.native
  /**
    * Creates a fake that returns a rejected Promise for the passed value.
    * If an Error is passed as the value argument, then that will be the value of the promise.
    * If any other value is passed, then that will be used for the message property of the Error returned by the promise.
    * @param val Rejected promise
    */
  def rejects(`val`: js.Any): SinonSpy = js.native
  /**
    * Creates a fake that returns a resolved Promise for the passed value.
    * @param val Resolved promise
    */
  def resolves(`val`: js.Any): SinonSpy = js.native
  /**
    * Creates a fake that returns the val argument
    * @param val Returned value
    */
  def returns(`val`: js.Any): SinonSpy = js.native
  def throws(`val`: String): SinonSpy = js.native
  /**
    * Creates a fake that throws an Error with the provided value as the message property.
    * If an Error is passed as the val argument, then that will be the thrown value. If any other value is passed, then that will be used for the message property of the thrown Error.
    * @param val Returned value or throw value if an Error
    */
  def throws(`val`: Error): SinonSpy = js.native
  /**
    * fake expects the last argument to be a callback and will invoke it with the given arguments.
    */
  def yields(args: js.Any*): SinonSpy = js.native
  /**
    * fake expects the last argument to be a callback and will invoke it asynchronously with the given arguments.
    */
  def yieldsAsync(args: js.Any*): SinonSpy = js.native
}

