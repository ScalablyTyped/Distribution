package typings
package sinonLib.sinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SinonMock extends js.Object {
  /**
           * Overrides obj.method with a mock function and returns it.
           */
  def expects(method: java.lang.String): SinonExpectation
  /**
           * Restores all mocked methods.
           */
  def restore(): scala.Unit
  /**
           * Verifies all expectations on the mock.
           * If any expectation is not satisfied, an exception is thrown.
           * Also restores the mocked methods.
           */
  def verify(): scala.Unit
}

