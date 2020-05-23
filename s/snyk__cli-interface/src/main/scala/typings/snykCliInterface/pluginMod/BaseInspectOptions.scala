package typings.snykCliInterface.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseInspectOptions extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.undefined
  var dev: js.UndefOr[Boolean] = js.undefined
  var skipUnresolved: js.UndefOr[Boolean] = js.undefined
}

object BaseInspectOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    skipUnresolved: js.UndefOr[Boolean] = js.undefined
  ): BaseInspectOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnresolved)) __obj.updateDynamic("skipUnresolved")(skipUnresolved.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseInspectOptions]
  }
}

