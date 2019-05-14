package typings
package atPulumiPulumiLib.runtimeSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  val dryRun: js.UndefOr[scala.Boolean] = js.undefined
  val engineAddr: js.UndefOr[java.lang.String] = js.undefined
  val monitorAddr: js.UndefOr[java.lang.String] = js.undefined
  val parallel: js.UndefOr[scala.Double] = js.undefined
  val project: js.UndefOr[java.lang.String] = js.undefined
  val queryMode: js.UndefOr[scala.Boolean] = js.undefined
  val stack: js.UndefOr[java.lang.String] = js.undefined
  val testModeEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    engineAddr: java.lang.String = null,
    monitorAddr: java.lang.String = null,
    parallel: scala.Int | scala.Double = null,
    project: java.lang.String = null,
    queryMode: js.UndefOr[scala.Boolean] = js.undefined,
    stack: java.lang.String = null,
    testModeEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (engineAddr != null) __obj.updateDynamic("engineAddr")(engineAddr)
    if (monitorAddr != null) __obj.updateDynamic("monitorAddr")(monitorAddr)
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(queryMode)) __obj.updateDynamic("queryMode")(queryMode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (!js.isUndefined(testModeEnabled)) __obj.updateDynamic("testModeEnabled")(testModeEnabled)
    __obj.asInstanceOf[Options]
  }
}

