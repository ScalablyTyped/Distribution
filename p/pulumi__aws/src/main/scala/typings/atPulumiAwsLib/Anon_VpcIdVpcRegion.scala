package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VpcIdVpcRegion extends js.Object {
  var vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var vpcRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_VpcIdVpcRegion {
  @scala.inline
  def apply(
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_VpcIdVpcRegion = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_VpcIdVpcRegion]
  }
}

