package typings.pulumiAws

import typings.pulumiAws.analyzerMod.AnalyzerArgs
import typings.pulumiAws.analyzerMod.AnalyzerState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/accessanalyzer", JSImport.Namespace)
@js.native
object accessanalyzerMod extends js.Object {
  @js.native
  class Analyzer protected ()
    extends typings.pulumiAws.analyzerMod.Analyzer {
    /**
      * Create a Analyzer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AnalyzerArgs) = this()
    def this(name: String, args: AnalyzerArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Analyzer extends js.Object {
    /**
      * Get an existing Analyzer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.analyzerMod.Analyzer = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.analyzerMod.Analyzer = js.native
    def get(name: String, id: Input[ID], state: AnalyzerState): typings.pulumiAws.analyzerMod.Analyzer = js.native
    def get(name: String, id: Input[ID], state: AnalyzerState, opts: CustomResourceOptions): typings.pulumiAws.analyzerMod.Analyzer = js.native
    /**
      * Returns true if the given object is an instance of Analyzer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/accessanalyzer/analyzer.Analyzer */ Boolean = js.native
  }
  
}

