package typings
package atPulumiPulumiLib.runtimeSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  val engineAddr: js.UndefOr[java.lang.String] = js.undefined
  val monitorAddr: js.UndefOr[java.lang.String] = js.undefined
  val parallel: js.UndefOr[scala.Double] = js.undefined
  val project: js.UndefOr[java.lang.String] = js.undefined
  val stack: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    engineAddr: java.lang.String = null,
    monitorAddr: java.lang.String = null,
    parallel: scala.Int | scala.Double = null,
    project: java.lang.String = null,
    stack: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (engineAddr != null) __obj.updateDynamic("engineAddr")(engineAddr)
    if (monitorAddr != null) __obj.updateDynamic("monitorAddr")(monitorAddr)
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[Options]
  }
}

