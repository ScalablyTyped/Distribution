package typings.pulumiAws

import typings.pulumiAws.getReportDefinitionMod.GetReportDefinitionArgs
import typings.pulumiAws.getReportDefinitionMod.GetReportDefinitionResult
import typings.pulumiAws.reportDefinitionMod.ReportDefinitionArgs
import typings.pulumiAws.reportDefinitionMod.ReportDefinitionState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curMod {
  
  @JSImport("@pulumi/aws/cur", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/cur", "ReportDefinition")
  @js.native
  class ReportDefinition protected ()
    extends typings.pulumiAws.reportDefinitionMod.ReportDefinition {
    /**
      * Create a ReportDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReportDefinitionArgs) = this()
    def this(name: String, args: ReportDefinitionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReportDefinition {
    
    @JSImport("@pulumi/aws/cur", "ReportDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReportDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.reportDefinitionMod.ReportDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.reportDefinitionMod.ReportDefinition]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.reportDefinitionMod.ReportDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.reportDefinitionMod.ReportDefinition]
    inline def get(name: String, id: Input[ID], state: ReportDefinitionState): typings.pulumiAws.reportDefinitionMod.ReportDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.reportDefinitionMod.ReportDefinition]
    inline def get(name: String, id: Input[ID], state: ReportDefinitionState, opts: CustomResourceOptions): typings.pulumiAws.reportDefinitionMod.ReportDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.reportDefinitionMod.ReportDefinition]
    
    /**
      * Returns true if the given object is an instance of ReportDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean]
  }
  
  inline def getReportDefinition(args: GetReportDefinitionArgs): js.Promise[GetReportDefinitionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReportDefinition")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetReportDefinitionResult]]
  inline def getReportDefinition(args: GetReportDefinitionArgs, opts: InvokeOptions): js.Promise[GetReportDefinitionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getReportDefinition")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetReportDefinitionResult]]
}
