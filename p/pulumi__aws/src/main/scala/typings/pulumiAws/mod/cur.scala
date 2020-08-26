package typings.pulumiAws.mod

import typings.pulumiAws.getReportDefinitionMod.GetReportDefinitionArgs
import typings.pulumiAws.getReportDefinitionMod.GetReportDefinitionResult
import typings.pulumiAws.reportDefinitionMod.ReportDefinitionArgs
import typings.pulumiAws.reportDefinitionMod.ReportDefinitionState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cur")
@js.native
object cur extends js.Object {
  @js.native
  class ReportDefinition protected ()
    extends typings.pulumiAws.curMod.ReportDefinition {
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
  
  def getReportDefinition(args: GetReportDefinitionArgs): js.Promise[GetReportDefinitionResult] = js.native
  def getReportDefinition(args: GetReportDefinitionArgs, opts: InvokeOptions): js.Promise[GetReportDefinitionResult] = js.native
  /* static members */
  @js.native
  object ReportDefinition extends js.Object {
    /**
      * Get an existing ReportDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.reportDefinitionMod.ReportDefinition = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.reportDefinitionMod.ReportDefinition = js.native
    def get(name: String, id: Input[ID], state: ReportDefinitionState): typings.pulumiAws.reportDefinitionMod.ReportDefinition = js.native
    def get(name: String, id: Input[ID], state: ReportDefinitionState, opts: CustomResourceOptions): typings.pulumiAws.reportDefinitionMod.ReportDefinition = js.native
    /**
      * Returns true if the given object is an instance of ReportDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean = js.native
  }
  
}

