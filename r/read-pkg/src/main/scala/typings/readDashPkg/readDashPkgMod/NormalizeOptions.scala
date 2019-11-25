package typings.readDashPkg.readDashPkgMod

import typings.readDashPkg.readDashPkgNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizeOptions extends Options {
  @JSName("normalize")
  val normalize_NormalizeOptions: js.UndefOr[`true`] = js.undefined
}

object NormalizeOptions {
  @scala.inline
  def apply(cwd: String = null, normalize: `true` = null): NormalizeOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizeOptions]
  }
}

