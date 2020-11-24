package typings.pulumiAws.endpointConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationDataCaptureConfig
import typings.pulumiAws.inputMod.sagemaker.EndpointConfigurationProductionVariant
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointConfigurationState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this endpoint configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Specifies the parameters to capture input/output of Sagemaker models endpoints. Fields are documented below.
    */
  val dataCaptureConfig: js.UndefOr[Input[EndpointConfigurationDataCaptureConfig]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the endpoint configuration. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Fields are documented below.
    */
  val productionVariants: js.UndefOr[Input[js.Array[Input[EndpointConfigurationProductionVariant]]]] = js.native
  
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object EndpointConfigurationState {
  
  @scala.inline
  def apply(): EndpointConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConfigurationState]
  }
  
  @scala.inline
  implicit class EndpointConfigurationStateOps[Self <: EndpointConfigurationState] (val x: Self) extends AnyVal {
    
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
    def setDataCaptureConfig(value: Input[EndpointConfigurationDataCaptureConfig]): Self = this.set("dataCaptureConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataCaptureConfig: Self = this.set("dataCaptureConfig", js.undefined)
    
    @scala.inline
    def setKmsKeyArn(value: Input[String]): Self = this.set("kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyArn: Self = this.set("kmsKeyArn", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProductionVariantsVarargs(value: Input[EndpointConfigurationProductionVariant]*): Self = this.set("productionVariants", js.Array(value :_*))
    
    @scala.inline
    def setProductionVariants(value: Input[js.Array[Input[EndpointConfigurationProductionVariant]]]): Self = this.set("productionVariants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductionVariants: Self = this.set("productionVariants", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
