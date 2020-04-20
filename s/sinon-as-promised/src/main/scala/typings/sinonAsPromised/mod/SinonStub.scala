package typings.sinonAsPromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonStub extends js.Object {
  /**
    * Causes the stub to reject with the provided error.
    *
    * @param error   Rejection error.
    * @returns A thenable which will return a rejected promise with the provided error.
    * @remarks If error is a string, it will be set as the message on an Error object.
    */
  def rejects(error: js.Any): SinonStub
  /**
    * Causes the stub to resolve with the provided value.
    *
    * @param value   Resolve value.
    * @remarks Any Promises/A+ compliant library will handle this object properly.
    */
  def resolves[T](value: T): SinonStub
}

object SinonStub {
  @scala.inline
  def apply(rejects: js.Any => SinonStub, resolves: js.Any => SinonStub): SinonStub = {
    val __obj = js.Dynamic.literal(rejects = js.Any.fromFunction1(rejects), resolves = js.Any.fromFunction1(resolves))
    __obj.asInstanceOf[SinonStub]
  }
}

