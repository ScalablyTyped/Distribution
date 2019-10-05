package typings.atPulumiAws.elasticbeanstalkApplicationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.elasticbeanstalk.ApplicationAppversionLifecycle
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticbeanstalk/application", "Application")
@js.native
class Application protected () extends CustomResource {
  /**
    * Create a Application resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ApplicationArgs) = this()
  def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
  val appversionLifecycle: Output[js.UndefOr[ApplicationAppversionLifecycle]] = js.native
  /**
    * The ARN assigned by AWS for this Elastic Beanstalk Application.
    */
  val arn: Output[String] = js.native
  /**
    * Short description of the application
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the application, must be unique within your account
    */
  val name: Output[String] = js.native
  /**
    * Key-value mapping of tags for the Elastic Beanstalk Application.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticbeanstalk/application", "Application")
@js.native
object Application extends js.Object {
  /**
    * Get an existing Application resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Application = js.native
  def get(name: String, id: Input[ID], state: ApplicationState): Application = js.native
  def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): Application = js.native
  /**
    * Returns true if the given object is an instance of Application.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticbeanstalk/application.Application */ Boolean = js.native
}

