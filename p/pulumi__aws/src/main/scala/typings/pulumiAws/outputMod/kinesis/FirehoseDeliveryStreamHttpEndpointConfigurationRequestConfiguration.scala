package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration extends StObject {
  
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
  implicit class FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonAttributes(
      value: js.Array[
          FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute
        ]
    ): Self = StObject.set(x, "commonAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonAttributesUndefined: Self = StObject.set(x, "commonAttributes", js.undefined)
    
    @scala.inline
    def setCommonAttributesVarargs(value: FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute*): Self = StObject.set(x, "commonAttributes", js.Array(value :_*))
    
    @scala.inline
    def setContentEncoding(value: String): Self = StObject.set(x, "contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentEncodingUndefined: Self = StObject.set(x, "contentEncoding", js.undefined)
  }
}
