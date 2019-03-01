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

object SinonMock {
  @scala.inline
  def apply(
    expects: js.Function1[java.lang.String, SinonExpectation],
    restore: js.Function0[scala.Unit],
    verify: js.Function0[scala.Unit]
  ): SinonMock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expects")(expects)
    __obj.updateDynamic("restore")(restore)
    __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[SinonMock]
  }
}

