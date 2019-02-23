package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cur")
@js.native
object curNs extends js.Object {
  @js.native
  class ReportDefinition protected ()
    extends atPulumiAwsLib.curMod.ReportDefinition {
    /**
      * Create a ReportDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.curReportDefinitionMod.ReportDefinitionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.curReportDefinitionMod.ReportDefinitionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getReportDefinition(args: atPulumiAwsLib.curGetReportDefinitionMod.GetReportDefinitionArgs): js.Promise[atPulumiAwsLib.curGetReportDefinitionMod.GetReportDefinitionResult] = js.native
  def getReportDefinition(
    args: atPulumiAwsLib.curGetReportDefinitionMod.GetReportDefinitionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.curGetReportDefinitionMod.GetReportDefinitionResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.curReportDefinitionMod.ReportDefinition = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.curReportDefinitionMod.ReportDefinitionState
    ): atPulumiAwsLib.curReportDefinitionMod.ReportDefinition = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.curReportDefinitionMod.ReportDefinitionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.curReportDefinitionMod.ReportDefinition = js.native
  }
  
}

