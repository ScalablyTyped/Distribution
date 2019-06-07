package typings
package atPulumiAwsLib.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/glue", "Classifier")
@js.native
class Classifier protected ()
  extends atPulumiAwsLib.glueClassifierMod.Classifier {
  /**
    * Create a Classifier resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.glueClassifierMod.ClassifierArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.glueClassifierMod.ClassifierArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/glue", "Classifier")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.glueClassifierMod.Classifier = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueClassifierMod.ClassifierState
  ): atPulumiAwsLib.glueClassifierMod.Classifier = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.glueClassifierMod.ClassifierState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.glueClassifierMod.Classifier = js.native
  /**
    * Returns true if the given object is an instance of Classifier.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ scala.Boolean = js.native
}

