package typings.pulumiAws.samplingRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRuleArgs extends js.Object {
  
  /**
    * Matches attributes derived from the request.
    */
  val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The percentage of matching requests to instrument, after the reservoir is exhausted.
    */
  val fixedRate: Input[Double] = js.native
  
  /**
    * Matches the hostname from a request URL.
    */
  val host: Input[String] = js.native
  
  /**
    * Matches the HTTP method of a request.
    */
  val httpMethod: Input[String] = js.native
  
  /**
    * The priority of the sampling rule.
    */
  val priority: Input[Double] = js.native
  
  /**
    * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
    */
  val reservoirSize: Input[Double] = js.native
  
  /**
    * Matches the ARN of the AWS resource on which the service runs.
    */
  val resourceArn: Input[String] = js.native
  
  /**
    * The name of the sampling rule.
    */
  val ruleName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Matches the `name` that the service uses to identify itself in segments.
    */
  val serviceName: Input[String] = js.native
  
  /**
    * Matches the `origin` that the service uses to identify its type in segments.
    */
  val serviceType: Input[String] = js.native
  
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Matches the path from a request URL.
    */
  val urlPath: Input[String] = js.native
  
  /**
    * The version of the sampling rule format (`1` )
    */
  val version: Input[Double] = js.native
}
object SamplingRuleArgs {
  
  @scala.inline
  def apply(
    fixedRate: Input[Double],
    host: Input[String],
    httpMethod: Input[String],
    priority: Input[Double],
    reservoirSize: Input[Double],
    resourceArn: Input[String],
    serviceName: Input[String],
    serviceType: Input[String],
    urlPath: Input[String],
    version: Input[Double]
  ): SamplingRuleArgs = {
    val __obj = js.Dynamic.literal(fixedRate = fixedRate.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], reservoirSize = reservoirSize.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRuleArgs]
  }
  
  @scala.inline
  implicit class SamplingRuleArgsOps[Self <: SamplingRuleArgs] (val x: Self) extends AnyVal {
    
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
    def setFixedRate(value: Input[Double]): Self = this.set("fixedRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: Input[String]): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethod(value: Input[String]): Self = this.set("httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservoirSize(value: Input[Double]): Self = this.set("reservoirSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: Input[String]): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceType(value: Input[String]): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPath(value: Input[String]): Self = this.set("urlPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Input[Double]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setRuleName(value: Input[String]): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleName: Self = this.set("ruleName", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
