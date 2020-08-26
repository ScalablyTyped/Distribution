package typings.pulumiAws.classifierMod

import typings.pulumiAws.outputMod.glue.ClassifierCsvClassifier
import typings.pulumiAws.outputMod.glue.ClassifierGrokClassifier
import typings.pulumiAws.outputMod.glue.ClassifierJsonClassifier
import typings.pulumiAws.outputMod.glue.ClassifierXmlClassifier
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue/classifier", "Classifier")
@js.native
class Classifier protected () extends CustomResource {
  /**
    * Create a Classifier resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClassifierArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ClassifierArgs, opts: CustomResourceOptions) = this()
  /**
    * A classifier for Csv content. Defined below.
    */
  val csvClassifier: Output_[js.UndefOr[ClassifierCsvClassifier]] = js.native
  /**
    * A classifier that uses grok patterns. Defined below.
    */
  val grokClassifier: Output_[js.UndefOr[ClassifierGrokClassifier]] = js.native
  /**
    * A classifier for JSON content. Defined below.
    */
  val jsonClassifier: Output_[js.UndefOr[ClassifierJsonClassifier]] = js.native
  /**
    * The name of the classifier.
    */
  val name: Output_[String] = js.native
  /**
    * A classifier for XML content. Defined below.
    */
  val xmlClassifier: Output_[js.UndefOr[ClassifierXmlClassifier]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/glue/classifier", "Classifier")
@js.native
object Classifier extends js.Object {
  /**
    * Get an existing Classifier resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Classifier = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Classifier = js.native
  def get(name: String, id: Input[ID], state: ClassifierState): Classifier = js.native
  def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): Classifier = js.native
  /**
    * Returns true if the given object is an instance of Classifier.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = js.native
}

