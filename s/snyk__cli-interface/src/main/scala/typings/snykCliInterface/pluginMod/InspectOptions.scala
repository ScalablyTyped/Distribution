package typings.snykCliInterface.pluginMod

import typings.snykCliInterface.snykCliInterfaceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.snykCliInterface.pluginMod.SingleSubprojectInspectOptions
  - typings.snykCliInterface.pluginMod.MultiSubprojectInspectOptions
*/
trait InspectOptions extends js.Object

object InspectOptions {
  @scala.inline
  def SingleSubprojectInspectOptions(
    args: js.Array[String] = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    skipUnresolved: js.UndefOr[Boolean] = js.undefined,
    subProject: String = null
  ): InspectOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnresolved)) __obj.updateDynamic("skipUnresolved")(skipUnresolved.get.asInstanceOf[js.Any])
    if (subProject != null) __obj.updateDynamic("subProject")(subProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectOptions]
  }
  @scala.inline
  def MultiSubprojectInspectOptions(
    allSubProjects: `true`,
    args: js.Array[String] = null,
    dev: js.UndefOr[Boolean] = js.undefined,
    skipUnresolved: js.UndefOr[Boolean] = js.undefined
  ): InspectOptions = {
    val __obj = js.Dynamic.literal(allSubProjects = allSubProjects.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipUnresolved)) __obj.updateDynamic("skipUnresolved")(skipUnresolved.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectOptions]
  }
}

