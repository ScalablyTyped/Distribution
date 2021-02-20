package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.athena.WorkgroupConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workgroupMod {
  
  @JSImport("@pulumi/aws/athena/workgroup", "Workgroup")
  @js.native
  class Workgroup protected () extends CustomResource {
    /**
      * Create a Workgroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: WorkgroupArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: WorkgroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the workgroup
      */
    val arn: Output_[String] = js.native
    
    /**
      * Configuration block with various settings for the workgroup. Documented below.
      */
    val configuration: Output_[js.UndefOr[WorkgroupConfiguration]] = js.native
    
    /**
      * Description of the workgroup.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
      */
    val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Name of the workgroup.
      */
    val name: Output_[String] = js.native
    
    /**
      * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
      */
    val state: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags for the workgroup.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Workgroup {
    
    /**
      * Get an existing Workgroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/athena/workgroup", "Workgroup.get")
    @js.native
    def get(name: String, id: Input[ID]): Workgroup = js.native
    @JSImport("@pulumi/aws/athena/workgroup", "Workgroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Workgroup = js.native
    @JSImport("@pulumi/aws/athena/workgroup", "Workgroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkgroupState): Workgroup = js.native
    @JSImport("@pulumi/aws/athena/workgroup", "Workgroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: WorkgroupState, opts: CustomResourceOptions): Workgroup = js.native
    
    /**
      * Returns true if the given object is an instance of Workgroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/athena/workgroup", "Workgroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/workgroup.Workgroup */ Boolean = js.native
  }
  
  @js.native
  trait WorkgroupArgs extends StObject {
    
    /**
      * Configuration block with various settings for the workgroup. Documented below.
      */
    val configuration: js.UndefOr[Input[typings.pulumiAws.inputMod.athena.WorkgroupConfiguration]] = js.native
    
    /**
      * Description of the workgroup.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Name of the workgroup.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
      */
    val state: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags for the workgroup.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object WorkgroupArgs {
    
    @scala.inline
    def apply(): WorkgroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupArgs]
    }
    
    @scala.inline
    implicit class WorkgroupArgsMutableBuilder[Self <: WorkgroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfiguration(value: Input[typings.pulumiAws.inputMod.athena.WorkgroupConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait WorkgroupState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the workgroup
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block with various settings for the workgroup. Documented below.
      */
    val configuration: js.UndefOr[Input[typings.pulumiAws.inputMod.athena.WorkgroupConfiguration]] = js.native
    
    /**
      * Description of the workgroup.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * Name of the workgroup.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
      */
    val state: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value map of resource tags for the workgroup.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object WorkgroupState {
    
    @scala.inline
    def apply(): WorkgroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupState]
    }
    
    @scala.inline
    implicit class WorkgroupStateMutableBuilder[Self <: WorkgroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setConfiguration(value: Input[typings.pulumiAws.inputMod.athena.WorkgroupConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
