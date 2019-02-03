package typings
package atPulumiAwsLib.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "EventPermission")
@js.native
class EventPermission protected ()
  extends atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermission {
  /**
    * Create a EventPermission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermissionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermissionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch", "EventPermission")
@js.native
object EventPermission extends js.Object {
  /**
    * Get an existing EventPermission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermission = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermissionState
  ): atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermission = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermissionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloudwatchEventPermissionMod.EventPermission = js.native
}

