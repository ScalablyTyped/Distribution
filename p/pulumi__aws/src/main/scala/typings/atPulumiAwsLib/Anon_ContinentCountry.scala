package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContinentCountry extends js.Object {
  var continent: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var country: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var subdivision: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ContinentCountry {
  @scala.inline
  def apply(
    continent: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    country: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    subdivision: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ContinentCountry = {
    val __obj = js.Dynamic.literal()
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (subdivision != null) __obj.updateDynamic("subdivision")(subdivision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContinentCountry]
  }
}

