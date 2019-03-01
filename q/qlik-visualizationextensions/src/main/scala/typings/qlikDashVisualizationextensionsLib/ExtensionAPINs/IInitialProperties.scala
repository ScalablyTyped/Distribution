package typings
package qlikDashVisualizationextensionsLib.ExtensionAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitialProperties extends js.Object {
   // IListObjectDef;
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  var percent: js.UndefOr[scala.Boolean] = js.undefined
  var qHyperCubeDef: js.UndefOr[js.Any] = js.undefined
   // IHyperCubeDef;
  var qListObjectDef: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[SelectionModeType] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object IInitialProperties {
  @scala.inline
  def apply(
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    percent: js.UndefOr[scala.Boolean] = js.undefined,
    qHyperCubeDef: js.Any = null,
    qListObjectDef: js.Any = null,
    selectionMode: SelectionModeType = null,
    width: scala.Int | scala.Double = null
  ): IInitialProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent)
    if (qHyperCubeDef != null) __obj.updateDynamic("qHyperCubeDef")(qHyperCubeDef)
    if (qListObjectDef != null) __obj.updateDynamic("qListObjectDef")(qListObjectDef)
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitialProperties]
  }
}

