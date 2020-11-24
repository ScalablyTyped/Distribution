package typings.pulumiAws.inputMod.sagemaker

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader extends js.Object {
  
  /**
    * The CSV content type headers to capture.
    */
  var csvContentTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The JSON content type headers to capture.
    */
  var jsonContentTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader {
  
  @scala.inline
  def apply(): EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader]
  }
  
  @scala.inline
  implicit class EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderOps[Self <: EndpointConfigurationDataCaptureConfigCaptureContentTypeHeader] (val x: Self) extends AnyVal {
    
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
    def setCsvContentTypesVarargs(value: Input[String]*): Self = this.set("csvContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setCsvContentTypes(value: Input[js.Array[Input[String]]]): Self = this.set("csvContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCsvContentTypes: Self = this.set("csvContentTypes", js.undefined)
    
    @scala.inline
    def setJsonContentTypesVarargs(value: Input[String]*): Self = this.set("jsonContentTypes", js.Array(value :_*))
    
    @scala.inline
    def setJsonContentTypes(value: Input[js.Array[Input[String]]]): Self = this.set("jsonContentTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonContentTypes: Self = this.set("jsonContentTypes", js.undefined)
  }
}
