package typings.rascal.mod

import typings.rascal.rascalStrings.ack
import typings.rascal.rascalStrings.forward
import typings.rascal.rascalStrings.nack
import typings.rascal.rascalStrings.republish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Recovery extends js.Object {
  
  var attempts: js.UndefOr[Double] = js.native
  
  var defer: js.UndefOr[Double] = js.native
  
  var immediateNack: js.UndefOr[Boolean] = js.native
  
  var options: js.UndefOr[PublicationConfig] = js.native
  
  var publication: js.UndefOr[String] = js.native
  
  var requeue: js.UndefOr[Boolean] = js.native
  
  var strategy: ack | nack | republish | forward = js.native
  
  var xDeathFix: js.UndefOr[Boolean] = js.native
}
object Recovery {
  
  @scala.inline
  def apply(strategy: ack | nack | republish | forward): Recovery = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recovery]
  }
  
  @scala.inline
  implicit class RecoveryOps[Self <: Recovery] (val x: Self) extends AnyVal {
    
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
    def setStrategy(value: ack | nack | republish | forward): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttempts: Self = this.set("attempts", js.undefined)
    
    @scala.inline
    def setDefer(value: Double): Self = this.set("defer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefer: Self = this.set("defer", js.undefined)
    
    @scala.inline
    def setImmediateNack(value: Boolean): Self = this.set("immediateNack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImmediateNack: Self = this.set("immediateNack", js.undefined)
    
    @scala.inline
    def setOptions(value: PublicationConfig): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPublication(value: String): Self = this.set("publication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublication: Self = this.set("publication", js.undefined)
    
    @scala.inline
    def setRequeue(value: Boolean): Self = this.set("requeue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequeue: Self = this.set("requeue", js.undefined)
    
    @scala.inline
    def setXDeathFix(value: Boolean): Self = this.set("xDeathFix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXDeathFix: Self = this.set("xDeathFix", js.undefined)
  }
}
