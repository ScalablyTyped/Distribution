package typings.pulumiAws.apigatewayMod

import typings.pulumiAws.integrationMod.IntegrationArgs
import typings.pulumiAws.integrationMod.IntegrationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "Integration")
@js.native
class Integration protected ()
  extends typings.pulumiAws.integrationMod.Integration {
  /**
    * Create a Integration resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: IntegrationArgs) = this()
  def this(name: String, args: IntegrationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "Integration")
@js.native
object Integration extends js.Object {
  /**
    * Get an existing Integration resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.integrationMod.Integration = js.native
  def get(name: String, id: Input[ID], state: IntegrationState): typings.pulumiAws.integrationMod.Integration = js.native
  def get(name: String, id: Input[ID], state: IntegrationState, opts: CustomResourceOptions): typings.pulumiAws.integrationMod.Integration = js.native
  /**
    * Returns true if the given object is an instance of Integration.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/integration.Integration */ Boolean = js.native
}

