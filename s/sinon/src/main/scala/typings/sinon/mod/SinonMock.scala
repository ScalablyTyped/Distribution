package typings.sinon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonMock extends StObject {
  
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
  implicit class SinonMockMutableBuilder[Self <: SinonMock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpects(value: String => SinonExpectation): Self = StObject.set(x, "expects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVerify(value: () => Unit): Self = StObject.set(x, "verify", js.Any.fromFunction0(value))
  }
}
