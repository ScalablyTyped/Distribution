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
import scala.scalajs.js.`|`
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
    
    /**
      * Get an existing ReportGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): ReportGroup = js.native
    @JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReportGroup = js.native
    @JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReportGroupState): ReportGroup = js.native
    @JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReportGroupState, opts: CustomResourceOptions): ReportGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ReportGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/codebuild/reportGroup", "ReportGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/codebuild/reportGroup.ReportGroup */ Boolean = js.native
  }
  
  @js.native
  trait ReportGroupArgs extends StObject {
    
    /**
      * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
      */
    val exportConfig: Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig] = js.native
    
    /**
      * The name of a Report Group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
      */
    val `type`: Input[String] = js.native
  }
  object ReportGroupArgs {
    
    @scala.inline
    def apply(
      exportConfig: Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig],
      `type`: Input[String]
    ): ReportGroupArgs = {
      val __obj = js.Dynamic.literal(exportConfig = exportConfig.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportGroupArgs]
    }
    
    @scala.inline
    implicit class ReportGroupArgsMutableBuilder[Self <: ReportGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportConfig(value: Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig]): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReportGroupState extends StObject {
    
    /**
      * The ARN of Report Group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The date and time this Report Group was created.
      */
    val created: js.UndefOr[Input[String]] = js.native
    
    /**
      * Information about the destination where the raw data of this Report Group is exported. see Export Config documented below.
      */
    val exportConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig]] = js.native
    
    /**
      * The name of a Report Group.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The export configuration type. Valid values are `S3` and `NO_EXPORT`.
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object ReportGroupState {
    
    @scala.inline
    def apply(): ReportGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReportGroupState]
    }
    
    @scala.inline
    implicit class ReportGroupStateMutableBuilder[Self <: ReportGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCreated(value: Input[String]): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      @scala.inline
      def setExportConfig(value: Input[typings.pulumiAws.inputMod.codebuild.ReportGroupExportConfig]): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportConfigUndefined: Self = StObject.set(x, "exportConfig", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
