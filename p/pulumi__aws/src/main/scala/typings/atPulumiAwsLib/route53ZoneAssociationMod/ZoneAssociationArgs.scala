package typings
package atPulumiAwsLib.route53ZoneAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneAssociationArgs extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The private hosted zone to associate.
    */
  val zoneId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

