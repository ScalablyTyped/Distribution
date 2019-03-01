package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllRegions extends js.Object {
  var allRegions: js.UndefOr[scala.Boolean] = js.undefined
  var regions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var roleArn: java.lang.String
}

object Anon_AllRegions {
  @scala.inline
  def apply(
    roleArn: java.lang.String,
    allRegions: js.UndefOr[scala.Boolean] = js.undefined,
    regions: js.Array[java.lang.String] = null
  ): Anon_AllRegions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roleArn")(roleArn)
    if (!js.isUndefined(allRegions)) __obj.updateDynamic("allRegions")(allRegions)
    if (regions != null) __obj.updateDynamic("regions")(regions)
    __obj.asInstanceOf[Anon_AllRegions]
  }
}

