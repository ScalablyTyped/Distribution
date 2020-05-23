package typings.snykPhpPlugin.typesMod

import typings.snykCliInterface.pluginMod.BaseInspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhpOptions extends BaseInspectOptions {
  var composerIsFine: js.UndefOr[Boolean] = js.undefined
  var composerPharIsFine: js.UndefOr[Boolean] = js.undefined
  var systemVersions: js.UndefOr[js.Object] = js.undefined
}

object PhpOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    composerIsFine: js.UndefOr[Boolean] = js.undefined,
    composerPharIsFine: js.UndefOr[Boolean] = js.undefined,
    dev: js.UndefOr[Boolean] = js.undefined,
    skipUnresolved: js.UndefOr[Boolean] = js.undefined,
    systemVersions: js.Object = null
  ): PhpOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(composerIsFine)) __obj.updateDynamic("composerIsFine")(composerIsFine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composerPharIsFine)) __obj.updateDynamic("composerPharIsFine")(composerPharIsFine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnresolved)) __obj.updateDynamic("skipUnresolved")(skipUnresolved.get.asInstanceOf[js.Any])
    if (systemVersions != null) __obj.updateDynamic("systemVersions")(systemVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhpOptions]
  }
}

