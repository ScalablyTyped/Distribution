package typings.pulumiAws.mod

import typings.pulumiAws.devicefarmProjectMod.ProjectArgs
import typings.pulumiAws.devicefarmProjectMod.ProjectState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devicefarm {
  
  @JSImport("@pulumi/aws", "devicefarm.Project")
  @js.native
  class Project protected ()
    extends typings.pulumiAws.devicefarmMod.Project {
    /**
      * Create a Project resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ProjectArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ProjectArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Project {
    
    /**
      * Get an existing Project resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "devicefarm.Project.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.devicefarmProjectMod.Project = js.native
    @JSImport("@pulumi/aws", "devicefarm.Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.devicefarmProjectMod.Project = js.native
    @JSImport("@pulumi/aws", "devicefarm.Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProjectState): typings.pulumiAws.devicefarmProjectMod.Project = js.native
    @JSImport("@pulumi/aws", "devicefarm.Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): typings.pulumiAws.devicefarmProjectMod.Project = js.native
    
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "devicefarm.Project.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/devicefarm/project.Project */ Boolean = js.native
  }
}
