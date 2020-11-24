package typings.relayTestUtils.relayModernMockEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockEnvironment extends js.Object {
  
  var mock: MockFunctions = js.native
  
  def mockClear(): Unit = js.native
}
object MockEnvironment {
  
  @scala.inline
  def apply(mock: MockFunctions, mockClear: () => Unit): MockEnvironment = {
    val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any], mockClear = js.Any.fromFunction0(mockClear))
    __obj.asInstanceOf[MockEnvironment]
  }
  
  @scala.inline
  implicit class MockEnvironmentOps[Self <: MockEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMock(value: MockFunctions): Self = this.set("mock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMockClear(value: () => Unit): Self = this.set("mockClear", js.Any.fromFunction0(value))
  }
}
