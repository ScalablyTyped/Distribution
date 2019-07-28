package typings.atPulumiAws.cloudtrailMod

import typings.atPulumiAws.cloudtrailTrailMod.TrailArgs
import typings.atPulumiAws.cloudtrailTrailMod.TrailState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudtrail", "Trail")
@js.native
class Trail protected ()
  extends typings.atPulumiAws.cloudtrailTrailMod.Trail {
  /**
    * Create a Trail resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TrailArgs) = this()
  def this(name: String, args: TrailArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudtrail", "Trail")
@js.native
object Trail extends js.Object {
  /**
    * Get an existing Trail resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.cloudtrailTrailMod.Trail = js.native
  def get(name: String, id: Input[ID], state: TrailState): typings.atPulumiAws.cloudtrailTrailMod.Trail = js.native
  def get(name: String, id: Input[ID], state: TrailState, opts: CustomResourceOptions): typings.atPulumiAws.cloudtrailTrailMod.Trail = js.native
  /**
    * Returns true if the given object is an instance of Trail.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudtrail/trail.Trail */ Boolean = js.native
}

