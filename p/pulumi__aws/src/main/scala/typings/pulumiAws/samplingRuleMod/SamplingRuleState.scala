package typings.pulumiAws.samplingRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRuleState extends js.Object {
  
  /**
    * The ARN of the sampling rule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Matches attributes derived from the request.
    */
  val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  val fixedRate: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Matches the hostname from a request URL.
    */
  val host: js.UndefOr[Input[String]] = js.native
  
  /**
    * Matches the HTTP method of a request.
    */
  val httpMethod: js.UndefOr[Input[String]] = js.native
  
  /**
    * The priority of the sampling rule.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
  
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  val reservoirSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  val resourceArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the sampling rule.
    */
  val ruleName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Matches the `name` that the service uses to identify itself in segments.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Matches the `origin` that the service uses to identify its type in segments.
    */
  val serviceType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Matches the path from a request URL.
    */
  val urlPath: js.UndefOr[Input[String]] = js.native
  
  /**
    * The version of the sampling rule format (`1` )
    */
  val version: js.UndefOr[Input[Double]] = js.native
}
object SamplingRuleState {
  
  @scala.inline
  def apply(): SamplingRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingRuleState]
  }
  
  @scala.inline
  implicit class SamplingRuleStateOps[Self <: SamplingRuleState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setFixedRate(value: Input[Double]): Self = this.set("fixedRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedRate: Self = this.set("fixedRate", js.undefined)
    
    @scala.inline
    def setHost(value: Input[String]): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: Input[String]): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpMethod: Self = this.set("httpMethod", js.undefined)
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReservoirSize(value: Input[Double]): Self = this.set("reservoirSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservoirSize: Self = this.set("reservoirSize", js.undefined)
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("resourceArn", js.undefined)
    
    @scala.inline
    def setRuleName(value: Input[String]): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleName: Self = this.set("ruleName", js.undefined)
    
    @scala.inline
    def setServiceName(value: Input[String]): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setServiceType(value: Input[String]): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceType: Self = this.set("serviceType", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setUrlPath(value: Input[String]): Self = this.set("urlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlPath: Self = this.set("urlPath", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[Double]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
