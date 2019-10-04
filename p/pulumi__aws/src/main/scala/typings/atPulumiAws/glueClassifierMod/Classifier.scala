package typings.atPulumiAws.glueClassifierMod

import typings.atPulumiAws.typesOutputMod.glueNs.ClassifierGrokClassifier
import typings.atPulumiAws.typesOutputMod.glueNs.ClassifierJsonClassifier
import typings.atPulumiAws.typesOutputMod.glueNs.ClassifierXmlClassifier
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  def this(name: String, args: ClassifierArgs, opts: CustomResourceOptions) = this()
  /**
    * A classifier that uses grok patterns. Defined below.
    */
  val grokClassifier: Output[js.UndefOr[ClassifierGrokClassifier]] = js.native
  /**
    * A classifier for JSON content. Defined below.
    */
  val jsonClassifier: Output[js.UndefOr[ClassifierJsonClassifier]] = js.native
  /**
    * The name of the classifier.
    */
  val name: Output[String] = js.native
  /**
    * A classifier for XML content. Defined below.
    */
  val xmlClassifier: Output[js.UndefOr[ClassifierXmlClassifier]] = js.native
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
    */
  def get(name: String, id: Input[ID]): Classifier = js.native
  def get(name: String, id: Input[ID], state: ClassifierState): Classifier = js.native
  def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): Classifier = js.native
  /**
    * Returns true if the given object is an instance of Classifier.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = js.native
}

