package typings.sinonStubPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon", JSImport.Namespace)
@js.native
object sinonAugmentingMod extends js.Object {
  
  @js.native
  trait SinonStub extends js.Object {
    
    def rejects(): SinonStub = js.native
    def rejects(value: js.Any): SinonStub = js.native
    
    def resolves(): SinonStub = js.native
    def resolves(value: js.Any): SinonStub = js.native
    
    def returnsPromise(): SinonStub = js.native
    
    var thenable: SinonThenable = js.native
  }
  
  @js.native
  trait SinonThenable extends js.Object {
    
    def `catch`(onReject: js.Function1[/* rejectValue */ js.UndefOr[js.Any], Unit]): SinonThenable = js.native
    
    def `finally`(callback: js.Function0[Unit]): SinonThenable = js.native
    
    var rejectValue: js.Any = js.native
    
    var rejected: Boolean = js.native
    
    var resolveValue: js.Any = js.native
    
    var resolved: Boolean = js.native
    
    def `then`(onFulfill: js.Function1[/* resolveValue */ js.UndefOr[js.Any], Unit]): SinonThenable = js.native
    def `then`(
      onFulfill: js.Function1[/* resolveValue */ js.UndefOr[js.Any], Unit],
      onReject: js.Function1[/* rejectValue */ js.UndefOr[js.Any], Unit]
    ): SinonThenable = js.native
  }
}
