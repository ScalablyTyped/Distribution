package typings.sinonAsPromised.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonStub extends js.Object {
  
  /**
    * Causes the stub to reject with the provided error.
    *
    * @param error   Rejection error.
    * @returns A thenable which will return a rejected promise with the provided error.
    * @remarks If error is a string, it will be set as the message on an Error object.
    */
  def rejects(error: js.Any): SinonStub = js.native
  
  /**
    * Causes the stub to resolve with the provided value.
    *
    * @param value   Resolve value.
    * @remarks Any Promises/A+ compliant library will handle this object properly.
    */
  def resolves[T](value: T): SinonStub = js.native
}
object SinonStub {
  
  @scala.inline
  def apply(rejects: js.Any => SinonStub, resolves: js.Any => SinonStub): SinonStub = {
    val __obj = js.Dynamic.literal(rejects = js.Any.fromFunction1(rejects), resolves = js.Any.fromFunction1(resolves))
    __obj.asInstanceOf[SinonStub]
  }
  
  @scala.inline
  implicit class SinonStubOps[Self <: SinonStub] (val x: Self) extends AnyVal {
    
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
    def setRejects(value: js.Any => SinonStub): Self = this.set("rejects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolves(value: js.Any => SinonStub): Self = this.set("resolves", js.Any.fromFunction1(value))
  }
}
