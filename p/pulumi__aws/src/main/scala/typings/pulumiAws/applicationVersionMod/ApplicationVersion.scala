package typings.pulumiAws.applicationVersionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk/applicationVersion", "ApplicationVersion")
@js.native
class ApplicationVersion protected () extends CustomResource {
  /**
    * Create a ApplicationVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApplicationVersionArgs) = this()
  def this(name: String, args: ApplicationVersionArgs, opts: CustomResourceOptions) = this()
  /**
    * Name of the Beanstalk Application the version is associated with.
    */
  val application: Output_[String] = js.native
  /**
    * The ARN assigned by AWS for this Elastic Beanstalk Application.
    */
  val arn: Output_[String] = js.native
  /**
    * S3 bucket that contains the Application Version source bundle.
    */
  val bucket: Output_[String] = js.native
  /**
    * Short description of the Application Version.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * On delete, force an Application Version to be deleted when it may be in use
    * by multiple Elastic Beanstalk Environments.
    */
  val forceDelete: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * S3 object that is the Application Version source bundle.
    */
  val key: Output_[String] = js.native
  /**
    * A unique name for the this Application Version.
    */
  val name: Output_[String] = js.native
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application Version.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
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
  def get(name: String, id: Input[ID]): ApplicationVersion = js.native
  def get(name: String, id: Input[ID], state: ApplicationVersionState): ApplicationVersion = js.native
  def get(name: String, id: Input[ID], state: ApplicationVersionState, opts: CustomResourceOptions): ApplicationVersion = js.native
  /**
    * Returns true if the given object is an instance of ApplicationVersion.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/applicationVersion.ApplicationVersion */ Boolean = js.native
}

