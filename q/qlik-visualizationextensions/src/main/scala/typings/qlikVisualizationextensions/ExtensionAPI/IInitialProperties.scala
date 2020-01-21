package typings.qlikVisualizationextensions.ExtensionAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitialProperties extends js.Object {
   // IListObjectDef;
  var fixed: js.UndefOr[Boolean] = js.undefined
  var percent: js.UndefOr[Boolean] = js.undefined
  var qHyperCubeDef: js.UndefOr[js.Any] = js.undefined
   // IHyperCubeDef;
  var qListObjectDef: js.UndefOr[js.Any] = js.undefined
  var selectionMode: js.UndefOr[SelectionModeType] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object IInitialProperties {
  @scala.inline
  def apply(
    fixed: js.UndefOr[Boolean] = js.undefined,
    percent: js.UndefOr[Boolean] = js.undefined,
    qHyperCubeDef: js.Any = null,
    qListObjectDef: js.Any = null,
    selectionMode: SelectionModeType = null,
    width: Int | Double = null
  ): IInitialProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (qHyperCubeDef != null) __obj.updateDynamic("qHyperCubeDef")(qHyperCubeDef.asInstanceOf[js.Any])
    if (qListObjectDef != null) __obj.updateDynamic("qListObjectDef")(qListObjectDef.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitialProperties]
  }
}

