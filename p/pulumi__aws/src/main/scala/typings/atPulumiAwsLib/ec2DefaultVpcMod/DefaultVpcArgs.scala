package typings
package atPulumiAwsLib.ec2DefaultVpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultVpcArgs extends js.Object {
  /**
    * A boolean flag to enable/disable ClassicLink
    * for the VPC. Only valid in regions and accounts that support EC2 Classic.
    * See the [ClassicLink documentation][1] for more information. Defaults false.
    */
  val enableClassiclink: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  val enableClassiclinkDnsSupport: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
    */
  val enableDnsHostnames: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
    */
  val enableDnsSupport: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

