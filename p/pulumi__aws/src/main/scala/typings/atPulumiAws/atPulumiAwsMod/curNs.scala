package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.curGetReportDefinitionMod.GetReportDefinitionArgs
import typings.atPulumiAws.curGetReportDefinitionMod.GetReportDefinitionResult
import typings.atPulumiAws.curReportDefinitionMod.ReportDefinitionArgs
import typings.atPulumiAws.curReportDefinitionMod.ReportDefinitionState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cur")
@js.native
object curNs extends js.Object {
  @js.native
  class ReportDefinition protected ()
    extends typings.atPulumiAws.curMod.ReportDefinition {
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
  
  def getReportDefinition(args: GetReportDefinitionArgs): js.Promise[GetReportDefinitionResult] with GetReportDefinitionResult = js.native
  def getReportDefinition(args: GetReportDefinitionArgs, opts: InvokeOptions): js.Promise[GetReportDefinitionResult] with GetReportDefinitionResult = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.curReportDefinitionMod.ReportDefinition = js.native
    def get(name: String, id: Input[ID], state: ReportDefinitionState): typings.atPulumiAws.curReportDefinitionMod.ReportDefinition = js.native
    def get(name: String, id: Input[ID], state: ReportDefinitionState, opts: CustomResourceOptions): typings.atPulumiAws.curReportDefinitionMod.ReportDefinition = js.native
    /**
      * Returns true if the given object is an instance of ReportDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cur/reportDefinition.ReportDefinition */ Boolean = js.native
  }
  
}

