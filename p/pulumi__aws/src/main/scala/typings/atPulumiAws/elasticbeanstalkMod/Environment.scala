package typings.atPulumiAws.elasticbeanstalkMod

import typings.atPulumiAws.elasticbeanstalkEnvironmentMod.EnvironmentArgs
import typings.atPulumiAws.elasticbeanstalkEnvironmentMod.EnvironmentState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk", "Environment")
@js.native
class Environment protected ()
  extends typings.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment {
  /**
    * Create a Environment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EnvironmentArgs) = this()
  def this(name: String, args: EnvironmentArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elasticbeanstalk", "Environment")
@js.native
object Environment extends js.Object {
  /**
    * Get an existing Environment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
  def get(name: String, id: Input[ID], state: EnvironmentState): typings.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
  def get(name: String, id: Input[ID], state: EnvironmentState, opts: CustomResourceOptions): typings.atPulumiAws.elasticbeanstalkEnvironmentMod.Environment = js.native
  /**
    * Returns true if the given object is an instance of Environment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/environment.Environment */ Boolean = js.native
}

