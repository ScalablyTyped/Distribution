package typings.pulumiPulumi.settingsMod

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
  /**
    * Directory containing the send/receive files for making synchronous invokes to the engine.
    */
  val syncDir: js.UndefOr[String] = js.undefined
  val testModeEnabled: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dryRun: js.UndefOr[Boolean] = js.undefined,
    engineAddr: String = null,
    legacyApply: js.UndefOr[Boolean] = js.undefined,
    monitorAddr: String = null,
    parallel: js.UndefOr[Double] = js.undefined,
    project: String = null,
    queryMode: js.UndefOr[Boolean] = js.undefined,
    stack: String = null,
    syncDir: String = null,
    testModeEnabled: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.get.asInstanceOf[js.Any])
    if (engineAddr != null) __obj.updateDynamic("engineAddr")(engineAddr.asInstanceOf[js.Any])
    if (!js.isUndefined(legacyApply)) __obj.updateDynamic("legacyApply")(legacyApply.get.asInstanceOf[js.Any])
    if (monitorAddr != null) __obj.updateDynamic("monitorAddr")(monitorAddr.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.get.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(queryMode)) __obj.updateDynamic("queryMode")(queryMode.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (syncDir != null) __obj.updateDynamic("syncDir")(syncDir.asInstanceOf[js.Any])
    if (!js.isUndefined(testModeEnabled)) __obj.updateDynamic("testModeEnabled")(testModeEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

