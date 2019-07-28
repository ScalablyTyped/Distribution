package typings.atPulumiAws.guarddutyMod

import typings.atPulumiAws.guarddutyDetectorMod.DetectorArgs
import typings.atPulumiAws.guarddutyDetectorMod.DetectorState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/guardduty", "Detector")
@js.native
class Detector protected ()
  extends typings.atPulumiAws.guarddutyDetectorMod.Detector {
  /**
    * Create a Detector resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DetectorArgs) = this()
  def this(name: String, args: DetectorArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/guardduty", "Detector")
@js.native
object Detector extends js.Object {
  /**
    * Get an existing Detector resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.guarddutyDetectorMod.Detector = js.native
  def get(name: String, id: Input[ID], state: DetectorState): typings.atPulumiAws.guarddutyDetectorMod.Detector = js.native
  def get(name: String, id: Input[ID], state: DetectorState, opts: CustomResourceOptions): typings.atPulumiAws.guarddutyDetectorMod.Detector = js.native
  /**
    * Returns true if the given object is an instance of Detector.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/guardduty/detector.Detector */ Boolean = js.native
}

