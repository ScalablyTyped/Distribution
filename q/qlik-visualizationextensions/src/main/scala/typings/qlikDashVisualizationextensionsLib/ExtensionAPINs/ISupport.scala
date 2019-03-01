package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISupport extends js.Object {
   // | () => boolean;
  var canTakeSnapshot: js.UndefOr[scala.Boolean] = js.undefined
   // | () => boolean;
  var export: js.UndefOr[scala.Boolean] = js.undefined
  var exportData: js.UndefOr[scala.Boolean] = js.undefined
  var snapshot: js.UndefOr[scala.Boolean] = js.undefined
}

object ISupport {
  @scala.inline
  def apply(
    canTakeSnapshot: js.UndefOr[scala.Boolean] = js.undefined,
    export: js.UndefOr[scala.Boolean] = js.undefined,
    exportData: js.UndefOr[scala.Boolean] = js.undefined,
    snapshot: js.UndefOr[scala.Boolean] = js.undefined
  ): ISupport = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canTakeSnapshot)) __obj.updateDynamic("canTakeSnapshot")(canTakeSnapshot)
    if (!js.isUndefined(export)) __obj.updateDynamic("export")(export)
    if (!js.isUndefined(exportData)) __obj.updateDynamic("exportData")(exportData)
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot)
    __obj.asInstanceOf[ISupport]
  }
}

