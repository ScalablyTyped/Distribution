package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllRegions extends js.Object {
  var allRegions: js.UndefOr[Boolean] = js.undefined
  var regions: js.UndefOr[js.Array[String]] = js.undefined
  var roleArn: String
}

object Anon_AllRegions {
  @scala.inline
  def apply(roleArn: String, allRegions: js.UndefOr[Boolean] = js.undefined, regions: js.Array[String] = null): Anon_AllRegions = {
    val __obj = js.Dynamic.literal(roleArn = roleArn)
    if (!js.isUndefined(allRegions)) __obj.updateDynamic("allRegions")(allRegions)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[Anon_AllRegions]
  }
}

