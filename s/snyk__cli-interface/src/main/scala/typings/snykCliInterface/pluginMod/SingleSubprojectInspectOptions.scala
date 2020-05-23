package typings.snykCliInterface.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleSubprojectInspectOptions
  extends BaseInspectOptions
     with InspectOptions {
  var subProject: js.UndefOr[String] = js.undefined
}

object SingleSubprojectInspectOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    skipUnresolved: js.UndefOr[Boolean] = js.undefined,
    subProject: String = null
  ): SingleSubprojectInspectOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnresolved)) __obj.updateDynamic("skipUnresolved")(skipUnresolved.get.asInstanceOf[js.Any])
    if (subProject != null) __obj.updateDynamic("subProject")(subProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleSubprojectInspectOptions]
  }
}

