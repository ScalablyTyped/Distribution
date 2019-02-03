package typings
package atPulumiAwsLib.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lightsail", "StaticIp")
@js.native
class StaticIp protected ()
  extends atPulumiAwsLib.lightsailStaticIpMod.StaticIp {
  /**
    * Create a StaticIp resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.lightsailStaticIpMod.StaticIpArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.lightsailStaticIpMod.StaticIpArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/lightsail", "StaticIp")
@js.native
object StaticIp extends js.Object {
  /**
    * Get an existing StaticIp resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lightsailStaticIpMod.StaticIp = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lightsailStaticIpMod.StaticIpState
  ): atPulumiAwsLib.lightsailStaticIpMod.StaticIp = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lightsailStaticIpMod.StaticIpState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lightsailStaticIpMod.StaticIp = js.native
}

