package typings.snykCliInterface.pluginMod

import typings.snykCliInterface.snykCliInterfaceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSubprojectInspectOptions
  extends BaseInspectOptions
     with InspectOptions {
  var allSubProjects: `true`
}

object MultiSubprojectInspectOptions {
  @scala.inline
  def apply(
    allSubProjects: `true`,
    args: js.Array[String] = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    skipUnresolved: js.UndefOr[Boolean] = js.undefined
  ): MultiSubprojectInspectOptions = {
    val __obj = js.Dynamic.literal(allSubProjects = allSubProjects.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnresolved)) __obj.updateDynamic("skipUnresolved")(skipUnresolved.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSubprojectInspectOptions]
  }
}

