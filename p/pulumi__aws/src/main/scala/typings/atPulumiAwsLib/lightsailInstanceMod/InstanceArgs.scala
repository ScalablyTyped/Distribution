package typings
package atPulumiAwsLib.lightsailInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceArgs extends js.Object {
  /**
    * The Availability Zone in which to create your
    * instance (see list below)
    */
  val availabilityZone: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID for a virtual private server image
    * (see list below)
    */
  val blueprintId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The bundle of specification information (see list below)
    */
  val bundleId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of your key pair. Created in the
    * Lightsail console (cannot use `aws_key_pair` at this time)
    */
  val keyPairName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the Lightsail Instance
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * launch script to configure server with additional user data
    */
  val userData: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

