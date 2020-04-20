package typings.relayTestUtils.relayModernMockEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockEnvironment extends js.Object {
  var mock: MockFunctions
  def mockClear(): Unit
}

object MockEnvironment {
  @scala.inline
  def apply(mock: MockFunctions, mockClear: () => Unit): MockEnvironment = {
    val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any], mockClear = js.Any.fromFunction0(mockClear))
    __obj.asInstanceOf[MockEnvironment]
  }
}

