package typings.sentryTypes.transactionMod

import typings.sentryTypes.miscMod.ExtractedNodeRequestData
import typings.sentryTypes.miscMod.WorkerLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingContext extends CustomSamplingContext {
  
  /**
    * Object representing the URL of the current page or worker script. Passed by default in a browser or service worker
    * context.
    */
  var location: js.UndefOr[WorkerLocation] = js.native
  
  /**
    * Sampling decision from the parent transaction, if any.
    */
  var parentSampled: js.UndefOr[Boolean] = js.native
  
  /**
    * Object representing the incoming request to a node server. Passed by default when using the TracingHandler.
    */
  var request: js.UndefOr[ExtractedNodeRequestData] = js.native
  
  /**
    * Context data with which transaction being sampled was created
    */
  var transactionContext: TransactionContext = js.native
}
object SamplingContext {
  
  @scala.inline
  def apply(transactionContext: TransactionContext): SamplingContext = {
    val __obj = js.Dynamic.literal(transactionContext = transactionContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingContext]
  }
  
  @scala.inline
  implicit class SamplingContextOps[Self <: SamplingContext] (val x: Self) extends AnyVal {
    
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
    def setTransactionContext(value: TransactionContext): Self = this.set("transactionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: WorkerLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setParentSampled(value: Boolean): Self = this.set("parentSampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSampled: Self = this.set("parentSampled", js.undefined)
    
    @scala.inline
    def setRequest(value: ExtractedNodeRequestData): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
