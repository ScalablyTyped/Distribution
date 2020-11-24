package typings.pulumiAws.queryLogMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryLogState extends js.Object {
  
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}
object QueryLogState {
  
  @scala.inline
  def apply(): QueryLogState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLogState]
  }
  
  @scala.inline
  implicit class QueryLogStateOps[Self <: QueryLogState] (val x: Self) extends AnyVal {
    
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
    def setCloudwatchLogGroupArn(value: Input[String]): Self = this.set("cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLogGroupArn: Self = this.set("cloudwatchLogGroupArn", js.undefined)
    
    @scala.inline
    def setZoneId(value: Input[String]): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
}
