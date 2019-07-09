package typings
package rollupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mappings
  extends rollupLib.rollupMod.DecodedSourceMapOrMissing {
  var mappings: js.UndefOr[scala.Nothing] = js.undefined
  var missing: rollupLib.rollupLibNumbers.`true`
  var plugin: java.lang.String
}

object Anon_Mappings {
  @scala.inline
  def apply(
    missing: rollupLib.rollupLibNumbers.`true`,
    plugin: java.lang.String,
    mappings: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Mappings = {
    val __obj = js.Dynamic.literal(missing = missing, plugin = plugin)
    if (!js.isUndefined(mappings)) __obj.updateDynamic("mappings")(mappings)
    __obj.asInstanceOf[Anon_Mappings]
  }
}

