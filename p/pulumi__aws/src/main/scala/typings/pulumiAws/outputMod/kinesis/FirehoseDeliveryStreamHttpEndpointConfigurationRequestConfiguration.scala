package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration extends js.Object {
  
  /**
    * Describes the metadata sent to the HTTP endpoint destination. More details are given below
    */
  var commonAttributes: js.UndefOr[
    js.Array[
      FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute
    ]
  ] = js.native
  
  /**
    * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. Valid values are `NONE` and `GZIP`.  Default value is `NONE`.
    */
  var contentEncoding: js.UndefOr[String] = js.native
}
object FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationOps[Self <: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration] (val x: Self) extends AnyVal {
    
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
    def setCommonAttributesVarargs(value: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute*): Self = this.set("commonAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCommonAttributes(
      value: js.Array[
          FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute
        ]
    ): Self = this.set("commonAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAttributes: Self = this.set("commonAttributes", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: String): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
  }
}
