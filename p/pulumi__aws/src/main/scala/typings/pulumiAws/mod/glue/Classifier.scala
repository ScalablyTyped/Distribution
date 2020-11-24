package typings.pulumiAws.mod.glue

import typings.pulumiAws.classifierMod.ClassifierArgs
import typings.pulumiAws.classifierMod.ClassifierState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "glue.Classifier")
@js.native
class Classifier protected ()
  extends typings.pulumiAws.glueMod.Classifier {
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
}
/* static members */
@JSImport("@pulumi/aws", "glue.Classifier")
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
  def get(name: String, id: Input[ID]): typings.pulumiAws.classifierMod.Classifier = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.classifierMod.Classifier = js.native
  def get(name: String, id: Input[ID], state: ClassifierState): typings.pulumiAws.classifierMod.Classifier = js.native
  def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): typings.pulumiAws.classifierMod.Classifier = js.native
  
  /**
    * Returns true if the given object is an instance of Classifier.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = js.native
}
