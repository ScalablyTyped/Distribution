package typings.pulumiAws.getIpRangesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIpRangesArgs extends js.Object {
  
  /**
    * Filter IP ranges by regions (or include all regions, if
    * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
    * (e.g. `eu-central-1`)
    */
  val regions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Filter IP ranges by services. Valid items are `amazon`
    * (for amazon.com), `amazonConnect`, `apiGateway`, `cloud9`, `cloudfront`,
    * `codebuild`, `dynamodb`, `ec2`, `ec2InstanceConnect`, `globalaccelerator`,
    * `route53`, `route53Healthchecks`, `s3` and `workspacesGateways`. See the
    * [`service` attribute][2] documentation for other possible values.
    */
  val services: js.Array[String] = js.native
  
  /**
    * Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html). Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
    */
  val url: js.UndefOr[String] = js.native
}
object GetIpRangesArgs {
  
  @scala.inline
  def apply(services: js.Array[String]): GetIpRangesArgs = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpRangesArgs]
  }
  
  @scala.inline
  implicit class GetIpRangesArgsOps[Self <: GetIpRangesArgs] (val x: Self) extends AnyVal {
    
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
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionsVarargs(value: String*): Self = this.set("regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: js.Array[String]): Self = this.set("regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
