package typings.pulumiAws.endpointConfigurationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.sagemaker.EndpointConfigurationDataCaptureConfig
import typings.pulumiAws.outputMod.sagemaker.EndpointConfigurationProductionVariant
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sagemaker/endpointConfiguration", "EndpointConfiguration")
@js.native
class EndpointConfiguration protected () extends CustomResource {
  /**
    * Create a EndpointConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointConfigurationArgs) = this()
  def this(name: String, args: EndpointConfigurationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) assigned by AWS to this endpoint configuration.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Specifies the parameters to capture input/output of Sagemaker models endpoints. Fields are documented below.
    */
  val dataCaptureConfig: Output_[js.UndefOr[EndpointConfigurationDataCaptureConfig]] = js.native
  
  /**
    * Amazon Resource Name (ARN) of a AWS Key Management Service key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint.
    */
  val kmsKeyArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The name of the endpoint configuration. If omitted, this provider will assign a random, unique name.
    */
  val name: Output_[String] = js.native
  
  /**
    * Fields are documented below.
    */
  val productionVariants: Output_[js.Array[EndpointConfigurationProductionVariant]] = js.native
  
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/sagemaker/endpointConfiguration", "EndpointConfiguration")
@js.native
object EndpointConfiguration extends js.Object {
  
  /**
    * Get an existing EndpointConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EndpointConfiguration = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EndpointConfiguration = js.native
  def get(name: String, id: Input[ID], state: EndpointConfigurationState): EndpointConfiguration = js.native
  def get(name: String, id: Input[ID], state: EndpointConfigurationState, opts: CustomResourceOptions): EndpointConfiguration = js.native
  
  /**
    * Returns true if the given object is an instance of EndpointConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean = js.native
}
