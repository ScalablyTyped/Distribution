package typings.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonMock extends js.Object {
  
  /**
    * Overrides obj.method with a mock function and returns it.
    */
  def expects(method: String): SinonExpectation = js.native
  
  /**
    * Restores all mocked methods.
    */
  def restore(): Unit = js.native
  
  /**
    * Verifies all expectations on the mock.
    * If any expectation is not satisfied, an exception is thrown.
    * Also restores the mocked methods.
    */
  def verify(): Unit = js.native
}
object SinonMock {
  
  @scala.inline
  def apply(expects: String => SinonExpectation, restore: () => Unit, verify: () => Unit): SinonMock = {
    val __obj = js.Dynamic.literal(expects = js.Any.fromFunction1(expects), restore = js.Any.fromFunction0(restore), verify = js.Any.fromFunction0(verify))
    __obj.asInstanceOf[SinonMock]
  }
  
  @scala.inline
  implicit class SinonMockOps[Self <: SinonMock] (val x: Self) extends AnyVal {
    
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
    def setExpects(value: String => SinonExpectation): Self = this.set("expects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestore(value: () => Unit): Self = this.set("restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVerify(value: () => Unit): Self = this.set("verify", js.Any.fromFunction0(value))
  }
}
