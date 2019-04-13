package typings
package rmfrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisableGlob extends js.Object {
  var disableGlob: js.UndefOr[scala.Nothing] = js.undefined
  var glob: js.UndefOr[
    (js.UndefOr[globLib.globMod.IOptions | rmfrLib.rmfrLibNumbers.`false`]) | rmfrLib.rmfrLibNumbers.`true`
  ] = js.undefined
}

object Anon_DisableGlob {
  @scala.inline
  def apply(
    disableGlob: js.UndefOr[scala.Nothing] = js.undefined,
    glob: (js.UndefOr[globLib.globMod.IOptions | rmfrLib.rmfrLibNumbers.`false`]) | rmfrLib.rmfrLibNumbers.`true` = null
  ): Anon_DisableGlob = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableGlob)) __obj.updateDynamic("disableGlob")(disableGlob)
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DisableGlob]
  }
}

