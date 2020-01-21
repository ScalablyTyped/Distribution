package typings.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISupport extends js.Object {
   // | () => boolean;
  var canTakeSnapshot: js.UndefOr[Boolean] = js.undefined
   // | () => boolean;
  var export: js.UndefOr[Boolean] = js.undefined
  var exportData: js.UndefOr[Boolean] = js.undefined
  var snapshot: js.UndefOr[Boolean] = js.undefined
}

object ISupport {
  @scala.inline
  def apply(
    canTakeSnapshot: js.UndefOr[Boolean] = js.undefined,
    export: js.UndefOr[Boolean] = js.undefined,
    exportData: js.UndefOr[Boolean] = js.undefined,
    snapshot: js.UndefOr[Boolean] = js.undefined
  ): ISupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canTakeSnapshot)) __obj.updateDynamic("canTakeSnapshot")(canTakeSnapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(export)) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (!js.isUndefined(exportData)) __obj.updateDynamic("exportData")(exportData.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISupport]
  }
}

