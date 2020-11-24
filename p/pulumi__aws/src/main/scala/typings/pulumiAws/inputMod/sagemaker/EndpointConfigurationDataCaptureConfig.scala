package typings.pulumiAws.inputMod.sagemaker

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointConfigurationDataCaptureConfig extends js.Object {
  
  /**
    * The content type headers to capture. Fields are documented below.
    */
  var captureContentTypeHeader: js.UndefOr[Input[EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader]] = js.native
  
  /**
    * Specifies what data to capture. Fields are documented below.
    */
  var captureOptions: Input[js.Array[Input[EndpointConfigurationDataCaptureConfigCaptureOption]]] = js.native
  
  /**
    * The URL for S3 location where the captured data is stored.
    */
  var destinationS3Uri: Input[String] = js.native
  
  /**
    * Flag to enable data capture. Defaults to `false`.
    */
  var enableCapture: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Portion of data to capture. Should be between 0 and 100.
    */
  var initialSamplingPercentage: Input[Double] = js.native
  
  /**
    * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt the captured data on Amazon S3.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.native
}
object EndpointConfigurationDataCaptureConfig {
  
  @scala.inline
  def apply(
    captureOptions: Input[js.Array[Input[EndpointConfigurationDataCaptureConfigCaptureOption]]],
    destinationS3Uri: Input[String],
    initialSamplingPercentage: Input[Double]
  ): EndpointConfigurationDataCaptureConfig = {
    val __obj = js.Dynamic.literal(captureOptions = captureOptions.asInstanceOf[js.Any], destinationS3Uri = destinationS3Uri.asInstanceOf[js.Any], initialSamplingPercentage = initialSamplingPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationDataCaptureConfig]
  }
  
  @scala.inline
  implicit class EndpointConfigurationDataCaptureConfigOps[Self <: EndpointConfigurationDataCaptureConfig] (val x: Self) extends AnyVal {
    
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
    def setCaptureOptionsVarargs(value: Input[EndpointConfigurationDataCaptureConfigCaptureOption]*): Self = this.set("captureOptions", js.Array(value :_*))
    
    @scala.inline
    def setCaptureOptions(value: Input[js.Array[Input[EndpointConfigurationDataCaptureConfigCaptureOption]]]): Self = this.set("captureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationS3Uri(value: Input[String]): Self = this.set("destinationS3Uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSamplingPercentage(value: Input[Double]): Self = this.set("initialSamplingPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureContentTypeHeader(value: Input[EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader]): Self = this.set("captureContentTypeHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureContentTypeHeader: Self = this.set("captureContentTypeHeader", js.undefined)
    
    @scala.inline
    def setEnableCapture(value: Input[Boolean]): Self = this.set("enableCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCapture: Self = this.set("enableCapture", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
  }
}
