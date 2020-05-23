package typings.reactElemental.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryDark extends js.Object {
  val primary: js.UndefOr[String] = js.undefined
  val primaryDark: js.UndefOr[String] = js.undefined
  val primaryLight: js.UndefOr[String] = js.undefined
}

object PrimaryDark {
  @scala.inline
  def apply(primary: String = null, primaryDark: String = null, primaryLight: String = null): PrimaryDark = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primaryDark != null) __obj.updateDynamic("primaryDark")(primaryDark.asInstanceOf[js.Any])
    if (primaryLight != null) __obj.updateDynamic("primaryLight")(primaryLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryDark]
  }
}

