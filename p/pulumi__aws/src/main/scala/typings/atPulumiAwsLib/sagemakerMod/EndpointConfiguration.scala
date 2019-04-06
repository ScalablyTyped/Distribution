package typings
package atPulumiAwsLib.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sagemaker", "EndpointConfiguration")
@js.native
class EndpointConfiguration protected ()
  extends atPulumiAwsLib.sagemakerEndpointConfigurationMod.EndpointConfiguration {
  /**
    * Create a EndpointConfiguration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.sagemakerEndpointConfigurationMod.EndpointConfigurationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sagemakerEndpointConfigurationMod.EndpointConfigurationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sagemakerEndpointConfigurationMod.EndpointConfigurationState
  ): atPulumiAwsLib.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sagemakerEndpointConfigurationMod.EndpointConfigurationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sagemakerEndpointConfigurationMod.EndpointConfiguration = js.native
}

