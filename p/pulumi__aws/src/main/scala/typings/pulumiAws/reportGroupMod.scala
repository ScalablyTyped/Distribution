package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.codebuild.ReportGroupExportConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportGroupMod {
  
  @JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup")
  @js.native
  class ReportGroup protected () extends CustomResource {
    /**
      * Create a ReportGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReportGroupArgs) = this()
    def this(name: String, args: ReportGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of Report Group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The date and time this Report Group was created.
      */
    val created: Output_[String] = js.native
    
    /**
      * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
      */
    val exportConfig: Output_[ReportGroupExportConfig] = js.native
    
    /**
      * The name of a Report Group.
      */
    val name: Output_[String] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object ReportGroup {
    
    @JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReportGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ReportGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ReportGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ReportGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReportGroup]
    inline def get(name: String, id: Input[ID], state: ReportGroupState): ReportGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReportGroup]
    inline def get(name: String, id: Input[ID], state: ReportGroupState, opts: CustomResourceOptions): ReportGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ReportGroup]
    
    /**
      * Returns true if the given object is an instance of ReportGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/reportGroup.ReportGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/codebuild/reportGroup.ReportGroup */ Boolean]
  }
  
  trait ReportGroupArgs extends StObject {
    
    /**
      * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
      */
    val exportConfig: Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig]
    
    /**
      * The name of a Report Group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
      */
    val `type`: Input[String]
  }
  object ReportGroupArgs {
    
    inline def apply(
      exportConfig: Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig],
      `type`: Input[String]
    ): ReportGroupArgs = {
      val __obj = js.Dynamic.literal(exportConfig = exportConfig.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportGroupArgs]
    }
    
    extension [Self <: ReportGroupArgs](x: Self) {
      
      inline def setExportConfig(value: Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig]): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReportGroupState extends StObject {
    
    /**
      * The ARN of Report Group.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The date and time this Report Group was created.
      */
    val created: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
      */
    val exportConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig]] = js.undefined
    
    /**
      * The name of a Report Group.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object ReportGroupState {
    
    inline def apply(): ReportGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportGroupState]
    }
    
    extension [Self <: ReportGroupState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCreated(value: Input[String]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setExportConfig(value: Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig]): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
      
      inline def setExportConfigUndefined: Self = StObject.set(x, "exportConfig", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
