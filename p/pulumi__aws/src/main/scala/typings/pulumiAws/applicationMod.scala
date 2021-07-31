package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicationMod {
  
  @JSImport("@pulumi/aws/codedeploy/application", "Application")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ApplicationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
      */
    val computePlatform: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the application.
      */
    val name: Output_[String] = js.native
    
    val uniqueId: Output_[String] = js.native
  }
  /* static members */
  object Application {
    
    @JSImport("@pulumi/aws/codedeploy/application", "Application")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Application resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Application]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Application]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApplicationState): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Application]
    @scala.inline
    def get(name: String, id: Input[ID], state: ApplicationState, opts: CustomResourceOptions): Application = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Application]
    
    /**
      * Returns true if the given object is an instance of Application.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codedeploy/application.Application */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codedeploy/application.Application */ Boolean]
  }
  
  trait ApplicationArgs extends StObject {
    
    /**
      * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
      */
    val computePlatform: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the application.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    val uniqueId: js.UndefOr[Input[String]] = js.undefined
  }
  object ApplicationArgs {
    
    @scala.inline
    def apply(): ApplicationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationArgs]
    }
    
    @scala.inline
    implicit class ApplicationArgsMutableBuilder[Self <: ApplicationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputePlatform(value: Input[String]): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUniqueId(value: Input[String]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    }
  }
  
  trait ApplicationState extends StObject {
    
    /**
      * The compute platform can either be `ECS`, `Lambda`, or `Server`. Default is `Server`.
      */
    val computePlatform: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the application.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    val uniqueId: js.UndefOr[Input[String]] = js.undefined
  }
  object ApplicationState {
    
    @scala.inline
    def apply(): ApplicationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApplicationState]
    }
    
    @scala.inline
    implicit class ApplicationStateMutableBuilder[Self <: ApplicationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComputePlatform(value: Input[String]): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUniqueId(value: Input[String]): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
    }
  }
}
