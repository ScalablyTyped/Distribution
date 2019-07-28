package typings.atPulumiAws.route53Mod

import typings.atPulumiAws.route53HealthCheckMod.HealthCheckArgs
import typings.atPulumiAws.route53HealthCheckMod.HealthCheckState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53", "HealthCheck")
@js.native
class HealthCheck protected ()
  extends typings.atPulumiAws.route53HealthCheckMod.HealthCheck {
  /**
    * Create a HealthCheck resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HealthCheckArgs) = this()
  def this(name: String, args: HealthCheckArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/route53", "HealthCheck")
@js.native
object HealthCheck extends js.Object {
  /**
    * Get an existing HealthCheck resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.route53HealthCheckMod.HealthCheck = js.native
  def get(name: String, id: Input[ID], state: HealthCheckState): typings.atPulumiAws.route53HealthCheckMod.HealthCheck = js.native
  def get(name: String, id: Input[ID], state: HealthCheckState, opts: CustomResourceOptions): typings.atPulumiAws.route53HealthCheckMod.HealthCheck = js.native
  /**
    * Returns true if the given object is an instance of HealthCheck.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/route53/healthCheck.HealthCheck */ Boolean = js.native
}

