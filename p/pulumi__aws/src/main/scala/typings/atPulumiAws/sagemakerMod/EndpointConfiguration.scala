package typings.atPulumiAws.sagemakerMod

import typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfigurationArgs
import typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfigurationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration")
@js.native
class EndpointConfiguration protected ()
  extends typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfiguration {
  /**
    * Create a EndpointConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EndpointConfigurationArgs) = this()
  def this(name: String, args: EndpointConfigurationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration")
@js.native
object EndpointConfiguration extends js.Object {
  /**
    * Get an existing EndpointConfiguration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
  def get(name: String, id: Input[ID], state: EndpointConfigurationState): typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
  def get(name: String, id: Input[ID], state: EndpointConfigurationState, opts: CustomResourceOptions): typings.atPulumiAws.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
  /**
    * Returns true if the given object is an instance of EndpointConfiguration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sagemaker/endpointConfiguration.EndpointConfiguration */ Boolean = js.native
}

