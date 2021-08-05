package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
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
    
    @JSImport("@pulumi/aws/devicefarm/project", "Project")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Project resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Project]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Project]
    inline def get(name: String, id: Input[ID], state: ProjectState): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Project]
    inline def get(name: String, id: Input[ID], state: ProjectState, opts: CustomResourceOptions): Project = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Project]
    
    /**
      * Returns true if the given object is an instance of Project.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/devicefarm/project.Project */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/devicefarm/project.Project */ Boolean]
  }
  
  trait ProjectArgs extends StObject {
    
    /**
      * The name of the project
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ProjectArgs {
    
    inline def apply(): ProjectArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectArgs]
    }
    
    extension [Self <: ProjectArgs](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ProjectState extends StObject {
    
    /**
      * The Amazon Resource Name of this project
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the project
      */
    val name: js.UndefOr[Input[String]] = js.undefined
  }
  object ProjectState {
    
    inline def apply(): ProjectState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProjectState]
    }
    
    extension [Self <: ProjectState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
