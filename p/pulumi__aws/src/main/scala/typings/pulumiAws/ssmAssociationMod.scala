package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ssm.AssociationOutputLocation
import typings.pulumiAws.outputMod.ssm.AssociationTarget
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ssmAssociationMod {
  
  @JSImport("@pulumi/aws/ssm/association", "Association")
  @js.native
  class Association protected () extends CustomResource {
    /**
      * Create a Association resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AssociationArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: AssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the SSM association.
      */
    val associationId: Output_[String] = js.native
    
    /**
      * The descriptive name for the association.
      */
    val associationName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls.
      */
    val automationTargetParameterName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
      */
    val complianceSeverity: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The document version you want to associate with the target(s). Can be a specific version or the default version.
      */
    val documentVersion: Output_[String] = js.native
    
    /**
      * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
      */
    val instanceId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
      */
    val maxConcurrency: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
      */
    val maxErrors: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the SSM document to apply.
      */
    val name: Output_[String] = js.native
    
    /**
      * An output location block. Output Location is documented below.
      */
    val outputLocation: Output_[js.UndefOr[AssociationOutputLocation]] = js.native
    
    /**
      * A block of arbitrary string parameters to pass to the SSM document.
      */
    val parameters: Output_[StringDictionary[String]] = js.native
    
    /**
      * A cron expression when the association will be applied to the target(s).
      */
    val scheduleExpression: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
      */
    val targets: Output_[js.Array[AssociationTarget]] = js.native
  }
  /* static members */
  object Association {
    
    @JSImport("@pulumi/aws/ssm/association", "Association")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Association resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Association]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Association]
    @scala.inline
    def get(name: String, id: Input[ID], state: AssociationState): Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Association]
    @scala.inline
    def get(name: String, id: Input[ID], state: AssociationState, opts: CustomResourceOptions): Association = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Association]
    
    /**
      * Returns true if the given object is an instance of Association.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/association.Association */ Boolean]
  }
  
  trait AssociationArgs extends StObject {
    
    /**
      * The descriptive name for the association.
      */
    val associationName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls.
      */
    val automationTargetParameterName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
      */
    val complianceSeverity: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The document version you want to associate with the target(s). Can be a specific version or the default version.
      */
    val documentVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
      */
    val instanceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
      */
    val maxConcurrency: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
      */
    val maxErrors: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the SSM document to apply.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An output location block. Output Location is documented below.
      */
    val outputLocation: js.UndefOr[Input[typings.pulumiAws.inputMod.ssm.AssociationOutputLocation]] = js.undefined
    
    /**
      * A block of arbitrary string parameters to pass to the SSM document.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A cron expression when the association will be applied to the target(s).
      */
    val scheduleExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
      */
    val targets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.AssociationTarget]]]] = js.undefined
  }
  object AssociationArgs {
    
    @scala.inline
    def apply(): AssociationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociationArgs]
    }
    
    @scala.inline
    implicit class AssociationArgsMutableBuilder[Self <: AssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociationName(value: Input[String]): Self = StObject.set(x, "associationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationNameUndefined: Self = StObject.set(x, "associationName", js.undefined)
      
      @scala.inline
      def setAutomationTargetParameterName(value: Input[String]): Self = StObject.set(x, "automationTargetParameterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomationTargetParameterNameUndefined: Self = StObject.set(x, "automationTargetParameterName", js.undefined)
      
      @scala.inline
      def setComplianceSeverity(value: Input[String]): Self = StObject.set(x, "complianceSeverity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplianceSeverityUndefined: Self = StObject.set(x, "complianceSeverity", js.undefined)
      
      @scala.inline
      def setDocumentVersion(value: Input[String]): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setMaxConcurrency(value: Input[String]): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      @scala.inline
      def setMaxErrors(value: Input[String]): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutputLocation(value: Input[typings.pulumiAws.inputMod.ssm.AssociationOutputLocation]): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setScheduleExpression(value: Input[String]): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleExpressionUndefined: Self = StObject.set(x, "scheduleExpression", js.undefined)
      
      @scala.inline
      def setTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.AssociationTarget]]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: Input[typings.pulumiAws.inputMod.ssm.AssociationTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
  
  trait AssociationState extends StObject {
    
    /**
      * The ID of the SSM association.
      */
    val associationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The descriptive name for the association.
      */
    val associationName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specify the target for the association. This target is required for associations that use an `Automation` document and target resources by using rate controls.
      */
    val automationTargetParameterName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The compliance severity for the association. Can be one of the following: `UNSPECIFIED`, `LOW`, `MEDIUM`, `HIGH` or `CRITICAL`
      */
    val complianceSeverity: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The document version you want to associate with the target(s). Can be a specific version or the default version.
      */
    val documentVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The instance ID to apply an SSM document to. Use `targets` with key `InstanceIds` for document schema versions 2.0 and above.
      */
    val instanceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
      */
    val maxConcurrency: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify a number, for example 10, or a percentage of the target set, for example 10%.
      */
    val maxErrors: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the SSM document to apply.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An output location block. Output Location is documented below.
      */
    val outputLocation: js.UndefOr[Input[typings.pulumiAws.inputMod.ssm.AssociationOutputLocation]] = js.undefined
    
    /**
      * A block of arbitrary string parameters to pass to the SSM document.
      */
    val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A cron expression when the association will be applied to the target(s).
      */
    val scheduleExpression: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A block containing the targets of the SSM association. Targets are documented below. AWS currently supports a maximum of 5 targets.
      */
    val targets: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.AssociationTarget]]]] = js.undefined
  }
  object AssociationState {
    
    @scala.inline
    def apply(): AssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociationState]
    }
    
    @scala.inline
    implicit class AssociationStateMutableBuilder[Self <: AssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociationId(value: Input[String]): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationIdUndefined: Self = StObject.set(x, "associationId", js.undefined)
      
      @scala.inline
      def setAssociationName(value: Input[String]): Self = StObject.set(x, "associationName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationNameUndefined: Self = StObject.set(x, "associationName", js.undefined)
      
      @scala.inline
      def setAutomationTargetParameterName(value: Input[String]): Self = StObject.set(x, "automationTargetParameterName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomationTargetParameterNameUndefined: Self = StObject.set(x, "automationTargetParameterName", js.undefined)
      
      @scala.inline
      def setComplianceSeverity(value: Input[String]): Self = StObject.set(x, "complianceSeverity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplianceSeverityUndefined: Self = StObject.set(x, "complianceSeverity", js.undefined)
      
      @scala.inline
      def setDocumentVersion(value: Input[String]): Self = StObject.set(x, "documentVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentVersionUndefined: Self = StObject.set(x, "documentVersion", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setMaxConcurrency(value: Input[String]): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      @scala.inline
      def setMaxErrors(value: Input[String]): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOutputLocation(value: Input[typings.pulumiAws.inputMod.ssm.AssociationOutputLocation]): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
      
      @scala.inline
      def setParameters(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      
      @scala.inline
      def setScheduleExpression(value: Input[String]): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleExpressionUndefined: Self = StObject.set(x, "scheduleExpression", js.undefined)
      
      @scala.inline
      def setTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.AssociationTarget]]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: Input[typings.pulumiAws.inputMod.ssm.AssociationTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
}
