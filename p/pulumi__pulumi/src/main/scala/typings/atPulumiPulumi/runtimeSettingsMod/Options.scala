package typings.atPulumiPulumi.runtimeSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  val dryRun: js.UndefOr[Boolean] = js.undefined
  val engineAddr: js.UndefOr[String] = js.undefined
  val legacyApply: js.UndefOr[Boolean] = js.undefined
  val monitorAddr: js.UndefOr[String] = js.undefined
  val parallel: js.UndefOr[Double] = js.undefined
  val project: js.UndefOr[String] = js.undefined
  val queryMode: js.UndefOr[Boolean] = js.undefined
  val stack: js.UndefOr[String] = js.undefined
  val testModeEnabled: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dryRun: js.UndefOr[Boolean] = js.undefined,
    engineAddr: String = null,
    legacyApply: js.UndefOr[Boolean] = js.undefined,
    monitorAddr: String = null,
    parallel: Int | Double = null,
    project: String = null,
    queryMode: js.UndefOr[Boolean] = js.undefined,
    stack: String = null,
    testModeEnabled: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (engineAddr != null) __obj.updateDynamic("engineAddr")(engineAddr)
    if (!js.isUndefined(legacyApply)) __obj.updateDynamic("legacyApply")(legacyApply)
    if (monitorAddr != null) __obj.updateDynamic("monitorAddr")(monitorAddr)
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(queryMode)) __obj.updateDynamic("queryMode")(queryMode)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (!js.isUndefined(testModeEnabled)) __obj.updateDynamic("testModeEnabled")(testModeEnabled)
    __obj.asInstanceOf[Options]
  }
}

