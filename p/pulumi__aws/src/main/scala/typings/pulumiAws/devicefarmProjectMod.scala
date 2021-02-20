package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devicefarmProjectMod {
  
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws/devicefarm/project", "Project.get")
    @js.native
    def get(name: String, id: Input[ID]): Project = js.native
    @JSImport("@pulumi/aws/devicefarm/project", "Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Project = js.native
    @JSImport("@pulumi/aws/devicefarm/project", "Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProjectState): Project = js.native
    @JSImport("@pulumi/aws/devicefarm/project", "Project.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): Project = js.native
    
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/devicefarm/project", "Project.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/devicefarm/project.Project */ Boolean = js.native
  }
  
  @js.native
  trait ProjectArgs extends StObject {
    
    /**
      * The name of the project
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object ProjectArgs {
    
    @scala.inline
    def apply(): ProjectArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectArgs]
    }
    
    @scala.inline
    implicit class ProjectArgsMutableBuilder[Self <: ProjectArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait ProjectState extends StObject {
    
    /**
      * The Amazon Resource Name of this project
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the project
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object ProjectState {
    
    @scala.inline
    def apply(): ProjectState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectState]
    }
    
    @scala.inline
    implicit class ProjectStateMutableBuilder[Self <: ProjectState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
