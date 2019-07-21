package typings
package readDashPkgLib.readDashPkgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalizeOptions extends Options {
  @JSName("normalize")
  val normalize_NormalizeOptions: js.UndefOr[readDashPkgLib.readDashPkgLibNumbers.`true`] = js.undefined
}

object NormalizeOptions {
  @scala.inline
  def apply(cwd: java.lang.String = null, normalize: readDashPkgLib.readDashPkgLibNumbers.`true` = null): NormalizeOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (normalize != null) __obj.updateDynamic("normalize")(normalize)
    __obj.asInstanceOf[NormalizeOptions]
  }
}

