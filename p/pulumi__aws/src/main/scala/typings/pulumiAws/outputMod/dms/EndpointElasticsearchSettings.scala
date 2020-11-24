package typings.pulumiAws.outputMod.dms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointElasticsearchSettings extends js.Object {
  
  /**
    * Endpoint for the Elasticsearch cluster.
    */
  var endpointUri: String = js.native
  
  /**
    * Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
    */
  var errorRetryDuration: js.UndefOr[Double] = js.native
  
  /**
    * Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
    */
  var fullLoadErrorPercentage: js.UndefOr[Double] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
    */
  var serviceAccessRoleArn: String = js.native
}
object EndpointElasticsearchSettings {
  
  @scala.inline
  def apply(endpointUri: String, serviceAccessRoleArn: String): EndpointElasticsearchSettings = {
    val __obj = js.Dynamic.literal(endpointUri = endpointUri.asInstanceOf[js.Any], serviceAccessRoleArn = serviceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointElasticsearchSettings]
  }
  
  @scala.inline
  implicit class EndpointElasticsearchSettingsOps[Self <: EndpointElasticsearchSettings] (val x: Self) extends AnyVal {
    
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
    def setEndpointUri(value: String): Self = this.set("endpointUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = this.set("serviceAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorRetryDuration(value: Double): Self = this.set("errorRetryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorRetryDuration: Self = this.set("errorRetryDuration", js.undefined)
    
    @scala.inline
    def setFullLoadErrorPercentage(value: Double): Self = this.set("fullLoadErrorPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullLoadErrorPercentage: Self = this.set("fullLoadErrorPercentage", js.undefined)
  }
}
