package typings
package atPulumiAwsLib.elasticbeanstalkApplicationVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion")
@js.native
class ApplicationVersion protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ApplicationVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ApplicationVersionArgs) = this()
  def this(name: java.lang.String, args: ApplicationVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application] = js.native
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Short description of the Application Version.
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * On delete, force an Application Version to be deleted when it may be in use
    * by multiple Elastic Beanstalk Environments.
    */
  val forceDelete: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * S3 object that is the Application Version source bundle.
    */
  val key: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A unique name for the this Application Version.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion")
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

