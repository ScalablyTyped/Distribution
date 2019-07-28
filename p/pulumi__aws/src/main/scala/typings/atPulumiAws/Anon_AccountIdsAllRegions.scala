package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdsAllRegions extends js.Object {
  var accountIds: Input[js.Array[Input[String]]]
  var allRegions: js.UndefOr[Input[Boolean]] = js.undefined
  var regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_AccountIdsAllRegions {
  @scala.inline
  def apply(
    accountIds: Input[js.Array[Input[String]]],
    allRegions: Input[Boolean] = null,
    regions: Input[js.Array[Input[String]]] = null
  ): Anon_AccountIdsAllRegions = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    if (allRegions != null) __obj.updateDynamic("allRegions")(allRegions.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AccountIdsAllRegions]
  }
}

