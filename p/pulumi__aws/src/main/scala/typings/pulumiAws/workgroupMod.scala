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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
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
    
    @JSImport("@pulumi/aws/athena/workgroup", "Workgroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Workgroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Workgroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Workgroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Workgroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Workgroup]
    inline def get(name: String, id: Input[ID], state: WorkgroupState): Workgroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Workgroup]
    inline def get(name: String, id: Input[ID], state: WorkgroupState, opts: CustomResourceOptions): Workgroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Workgroup]
    
    /**
      * Returns true if the given object is an instance of Workgroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/athena/workgroup.Workgroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/athena/workgroup.Workgroup */ Boolean]
  }
  
  trait WorkgroupArgs extends StObject {
    
    /**
      * Configuration block with various settings for the workgroup. Documented below.
      */
    val configuration: js.UndefOr[Input[typings.pulumiAws.inputMod.athena.WorkgroupConfiguration]] = js.undefined
    
    /**
      * Description of the workgroup.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Name of the workgroup.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags for the workgroup.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object WorkgroupArgs {
    
    inline def apply(): WorkgroupArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupArgs]
    }
    
    extension [Self <: WorkgroupArgs](x: Self) {
      
      inline def setConfiguration(value: Input[typings.pulumiAws.inputMod.athena.WorkgroupConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait WorkgroupState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the workgroup
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with various settings for the workgroup. Documented below.
      */
    val configuration: js.UndefOr[Input[typings.pulumiAws.inputMod.athena.WorkgroupConfiguration]] = js.undefined
    
    /**
      * Description of the workgroup.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
      */
    val forceDestroy: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Name of the workgroup.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags for the workgroup.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object WorkgroupState {
    
    inline def apply(): WorkgroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupState]
    }
    
    extension [Self <: WorkgroupState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setConfiguration(value: Input[typings.pulumiAws.inputMod.athena.WorkgroupConfiguration]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setForceDestroy(value: Input[Boolean]): Self = StObject.set(x, "forceDestroy", value.asInstanceOf[js.Any])
      
      inline def setForceDestroyUndefined: Self = StObject.set(x, "forceDestroy", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
