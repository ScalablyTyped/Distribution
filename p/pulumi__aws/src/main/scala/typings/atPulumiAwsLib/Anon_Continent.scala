package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Continent extends js.Object {
  var continent: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var subdivision: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Continent {
  @scala.inline
  def apply(
    continent: java.lang.String = null,
    country: java.lang.String = null,
    subdivision: java.lang.String = null
  ): Anon_Continent = {
    val __obj = js.Dynamic.literal()
    if (continent != null) __obj.updateDynamic("continent")(continent)
    if (country != null) __obj.updateDynamic("country")(country)
    if (subdivision != null) __obj.updateDynamic("subdivision")(subdivision)
    __obj.asInstanceOf[Anon_Continent]
  }
}

