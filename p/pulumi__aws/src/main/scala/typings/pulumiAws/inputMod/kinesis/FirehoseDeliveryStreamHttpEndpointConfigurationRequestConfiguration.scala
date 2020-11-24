package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfiguration extends js.Object {
  
  /**
    * Describes the metadata sent to the HTTP endpoint destination. More details are given below
    */
  var commonAttributes: js.UndefOr[
    Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute
        ]
      ]
    ]
  ] = js.native
  
  /**
    * Kinesis Data Firehose uses the content encoding to compress the body of a request before sending the request to the destination. Valid values are `NONE` and `GZIP`.  Default value is `NONE`.
    */
  var contentEncoding: js.UndefOr[Input[String]] = js.native
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
    def setCommonAttributesVarargs(
      value: (Input[
          FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute
        ])*
    ): Self = this.set("commonAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCommonAttributes(
      value: Input[
          js.Array[
            Input[
              FirehoseDeliveryStreamHttpEndpointConfigurationRequestConfigurationCommonAttribute
            ]
          ]
        ]
    ): Self = this.set("commonAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonAttributes: Self = this.set("commonAttributes", js.undefined)
    
    @scala.inline
    def setContentEncoding(value: Input[String]): Self = this.set("contentEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentEncoding: Self = this.set("contentEncoding", js.undefined)
  }
}
