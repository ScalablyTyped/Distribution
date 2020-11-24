package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to limits. It addresses two issues:
  *  * How are requests for this priority level limited?
  *  * What should be done with requests that exceed the limit?
  */
@js.native
trait LimitedPriorityLevelConfiguration extends js.Object {
  
  /**
    * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the number of requests of this priority level that may be exeucting at a given time.  ACS must be a positive number. The server's concurrency limit (SCL) is divided among the concurrency-controlled priority levels in proportion to their assured concurrency shares. This produces the assured concurrency value (ACV) --- the number of requests that may be executing at a time --- for each such priority level:
    *
    *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
    *
    * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other PL). This field has a default value of 30.
    */
  var assuredConcurrencyShares: js.UndefOr[Input[Double]] = js.native
  
  /**
    * `limitResponse` indicates what to do with requests that can not be executed right now
    */
  var limitResponse: js.UndefOr[Input[LimitResponse]] = js.native
}
object LimitedPriorityLevelConfiguration {
  
  @scala.inline
  def apply(): LimitedPriorityLevelConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LimitedPriorityLevelConfiguration]
  }
  
  @scala.inline
  implicit class LimitedPriorityLevelConfigurationOps[Self <: LimitedPriorityLevelConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAssuredConcurrencyShares(value: Input[Double]): Self = this.set("assuredConcurrencyShares", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssuredConcurrencyShares: Self = this.set("assuredConcurrencyShares", js.undefined)
    
    @scala.inline
    def setLimitResponse(value: Input[LimitResponse]): Self = this.set("limitResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitResponse: Self = this.set("limitResponse", js.undefined)
  }
}
