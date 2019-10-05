package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.devicefarmProjectMod.ProjectArgs
import typings.atPulumiAws.devicefarmProjectMod.ProjectState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "devicefarm")
@js.native
object devicefarm extends js.Object {
  @js.native
  class Project protected ()
    extends typings.atPulumiAws.devicefarmMod.Project {
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
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.devicefarmProjectMod.Project = js.native
    def get(name: String, id: Input[ID], state: ProjectState): typings.atPulumiAws.devicefarmProjectMod.Project = js.native
    def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): typings.atPulumiAws.devicefarmProjectMod.Project = js.native
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/devicefarm/project.Project */ Boolean = js.native
  }
  
}

