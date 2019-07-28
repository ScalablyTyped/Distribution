package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllRegionsRegions extends js.Object {
  var allRegions: js.UndefOr[Input[Boolean]] = js.undefined
  var regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var roleArn: Input[String]
}

object Anon_AllRegionsRegions {
  @scala.inline
  def apply(
    roleArn: Input[String],
    allRegions: Input[Boolean] = null,
    regions: Input[js.Array[Input[String]]] = null
  ): Anon_AllRegionsRegions = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    if (allRegions != null) __obj.updateDynamic("allRegions")(allRegions.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllRegionsRegions]
  }
}

