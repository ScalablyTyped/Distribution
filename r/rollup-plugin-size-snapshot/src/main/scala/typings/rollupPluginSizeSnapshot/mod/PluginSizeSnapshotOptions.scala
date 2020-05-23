package typings.rollupPluginSizeSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginSizeSnapshotOptions extends js.Object {
  var matchSnapshot: js.UndefOr[Boolean] = js.undefined
  var printInfo: js.UndefOr[Boolean] = js.undefined
  var snapshotPath: js.UndefOr[String] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object PluginSizeSnapshotOptions {
  @scala.inline
  def apply(
    matchSnapshot: js.UndefOr[Boolean] = js.undefined,
    printInfo: js.UndefOr[Boolean] = js.undefined,
    snapshotPath: String = null,
    threshold: js.UndefOr[Double] = js.undefined
  ): PluginSizeSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchSnapshot)) __obj.updateDynamic("matchSnapshot")(matchSnapshot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(printInfo)) __obj.updateDynamic("printInfo")(printInfo.get.asInstanceOf[js.Any])
    if (snapshotPath != null) __obj.updateDynamic("snapshotPath")(snapshotPath.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSizeSnapshotOptions]
  }
}

