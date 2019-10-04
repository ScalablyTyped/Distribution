package typings.relayDashTestDashUtils.libRelayModernMockEnvironmentMod

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
    val __obj = js.Dynamic.literal(mock = mock, mockClear = js.Any.fromFunction0(mockClear))
  
    __obj.asInstanceOf[MockEnvironment]
  }
}

