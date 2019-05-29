package typings
package reactDashElementalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrimaryPrimaryDark extends js.Object {
  val primary: js.UndefOr[java.lang.String] = js.undefined
  val primaryDark: js.UndefOr[java.lang.String] = js.undefined
  val primaryLight: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_PrimaryPrimaryDark {
  @scala.inline
  def apply(
    primary: java.lang.String = null,
    primaryDark: java.lang.String = null,
    primaryLight: java.lang.String = null
  ): Anon_PrimaryPrimaryDark = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (primaryDark != null) __obj.updateDynamic("primaryDark")(primaryDark)
    if (primaryLight != null) __obj.updateDynamic("primaryLight")(primaryLight)
    __obj.asInstanceOf[Anon_PrimaryPrimaryDark]
  }
}

