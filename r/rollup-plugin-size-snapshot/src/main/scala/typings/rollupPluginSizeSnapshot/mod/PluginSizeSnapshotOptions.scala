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
    threshold: Int | Double = null
  ): PluginSizeSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(matchSnapshot)) __obj.updateDynamic("matchSnapshot")(matchSnapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(printInfo)) __obj.updateDynamic("printInfo")(printInfo.asInstanceOf[js.Any])
    if (snapshotPath != null) __obj.updateDynamic("snapshotPath")(snapshotPath.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginSizeSnapshotOptions]
  }
}

