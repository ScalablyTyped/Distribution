package typings.pulumiAws.devicefarmProjectMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/devicefarm/project", "Project")
@js.native
class Project protected () extends CustomResource {
  /**
    * Create a Project resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ProjectArgs) = this()
  def this(name: String, args: ProjectArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name of this project
    */
  val arn: Output_[String] = js.native
  /**
    * The name of the project
    */
  val name: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/devicefarm/project", "Project")
@js.native
object Project extends js.Object {
  /**
    * Get an existing Project resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Project = js.native
  def get(name: String, id: Input[ID], state: ProjectState): Project = js.native
  def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): Project = js.native
  /**
    * Returns true if the given object is an instance of Project.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/devicefarm/project.Project */ Boolean = js.native
}

