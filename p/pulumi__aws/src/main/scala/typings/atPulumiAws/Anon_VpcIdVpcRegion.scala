package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VpcIdVpcRegion extends js.Object {
  var vpcId: Input[String]
  var vpcRegion: js.UndefOr[Input[String]] = js.undefined
}

object Anon_VpcIdVpcRegion {
  @scala.inline
  def apply(vpcId: Input[String], vpcRegion: Input[String] = null): Anon_VpcIdVpcRegion = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    if (vpcRegion != null) __obj.updateDynamic("vpcRegion")(vpcRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_VpcIdVpcRegion]
  }
}

