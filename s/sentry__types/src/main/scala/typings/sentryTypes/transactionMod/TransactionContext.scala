package typings.sentryTypes.transactionMod

import typings.sentryTypes.spanMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionContext extends SpanContext {
  
  /**
    * Human-readable identifier for the transaction
    */
  var name: String = js.native
  
  /**
    * If this transaction has a parent, the parent's sampling decision
    */
  var parentSampled: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, sets the end timestamp of the transaction to the highest timestamp of child spans, trimming
    * the duration of the transaction. This is useful to discard extra time in the transaction that is not
    * accounted for in child spans, like what happens in the idle transaction Tracing integration, where we finish the
    * transaction after a given "idle time" and we don't want this "idle time" to be part of the transaction.
    */
  var trimEnd: js.UndefOr[Boolean] = js.native
}
object TransactionContext {
  
  @scala.inline
  def apply(name: String): TransactionContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionContext]
  }
  
  @scala.inline
  implicit class TransactionContextOps[Self <: TransactionContext] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentSampled(value: Boolean): Self = this.set("parentSampled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSampled: Self = this.set("parentSampled", js.undefined)
    
    @scala.inline
    def setTrimEnd(value: Boolean): Self = this.set("trimEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimEnd: Self = this.set("trimEnd", js.undefined)
  }
}
