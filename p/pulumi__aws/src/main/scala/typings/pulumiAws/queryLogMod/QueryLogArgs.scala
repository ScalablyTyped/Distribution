package typings.pulumiAws.queryLogMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryLogArgs extends js.Object {
  
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: Input[String] = js.native
  
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: Input[String] = js.native
}
object QueryLogArgs {
  
  @scala.inline
  def apply(cloudwatchLogGroupArn: Input[String], zoneId: Input[String]): QueryLogArgs = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryLogArgs]
  }
  
  @scala.inline
  implicit class QueryLogArgsOps[Self <: QueryLogArgs] (val x: Self) extends AnyVal {
    
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
    def setZoneId(value: Input[String]): Self = this.set("zoneId", value.asInstanceOf[js.Any])
  }
}
