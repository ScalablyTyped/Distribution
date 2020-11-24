package typings.pulumiPulumi.providerProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvokeResult extends js.Object {
  
  /**
    * Any validation failures that occurred.
    */
  val failures: js.UndefOr[js.Array[CheckFailure]] = js.native
  
  /**
    * The outputs returned by the invoked function, if any.
    */
  val outputs: js.UndefOr[js.Any] = js.native
}
object InvokeResult {
  
  @scala.inline
  def apply(): InvokeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvokeResult]
  }
  
  @scala.inline
  implicit class InvokeResultOps[Self <: InvokeResult] (val x: Self) extends AnyVal {
    
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
    def setFailuresVarargs(value: CheckFailure*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: js.Array[CheckFailure]): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    
    @scala.inline
    def setOutputs(value: js.Any): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputs: Self = this.set("outputs", js.undefined)
  }
}
