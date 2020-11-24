package typings.pulumiAws.inputMod.sagemaker

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointConfigurationDataCaptureConfigCaptureOption extends js.Object {
  
  /**
    * Specifies the data to be captured. Should be one of `Input` or `Output`.
    */
  var captureMode: Input[String] = js.native
}
object EndpointConfigurationDataCaptureConfigCaptureOption {
  
  @scala.inline
  def apply(captureMode: Input[String]): EndpointConfigurationDataCaptureConfigCaptureOption = {
    val __obj = js.Dynamic.literal(captureMode = captureMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointConfigurationDataCaptureConfigCaptureOption]
  }
  
  @scala.inline
  implicit class EndpointConfigurationDataCaptureConfigCaptureOptionOps[Self <: EndpointConfigurationDataCaptureConfigCaptureOption] (val x: Self) extends AnyVal {
    
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
    def setCaptureMode(value: Input[String]): Self = this.set("captureMode", value.asInstanceOf[js.Any])
  }
}
