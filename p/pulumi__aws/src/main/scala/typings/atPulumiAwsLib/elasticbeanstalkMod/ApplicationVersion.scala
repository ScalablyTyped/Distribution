package typings
package atPulumiAwsLib.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk", "ApplicationVersion")
@js.native
class ApplicationVersion protected ()
  extends atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion {
  /**
    * Create a ApplicationVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/elasticbeanstalk", "ApplicationVersion")
@js.native
object ApplicationVersion extends js.Object {
  /**
    * Get an existing ApplicationVersion resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionState
  ): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion = js.native
}

