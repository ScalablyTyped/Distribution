package typings
package sassDashWebpackDashPluginLib.sassDashWebpackDashPluginMod.SassPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var autoprefixer: js.UndefOr[scala.Boolean] = js.undefined
  var sass: js.UndefOr[nodeDashSassLib.nodeDashSassMod.Options] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    autoprefixer: js.UndefOr[scala.Boolean] = js.undefined,
    sass: nodeDashSassLib.nodeDashSassMod.Options = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoprefixer)) __obj.updateDynamic("autoprefixer")(autoprefixer)
    if (sass != null) __obj.updateDynamic("sass")(sass)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[Config]
  }
}

