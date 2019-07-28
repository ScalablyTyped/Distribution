package typings.stormDashReactDashDiagrams.distSrcWidgetsDiagramWidgetMod

import typings.stormDashReactDashDiagrams.distSrcActionsBaseActionMod.BaseAction
import typings.stormDashReactDashDiagrams.distSrcDiagramEngineMod.DiagramEngine
import typings.stormDashReactDashDiagrams.distSrcWidgetsBaseWidgetMod.BaseWidgetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramProps extends BaseWidgetProps {
  var actionStartedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Boolean]] = js.undefined
  var actionStillFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.undefined
  var actionStoppedFiring: js.UndefOr[js.Function1[/* action */ BaseAction, Unit]] = js.undefined
  var allowCanvasTranslation: js.UndefOr[Boolean] = js.undefined
  var allowCanvasZoom: js.UndefOr[Boolean] = js.undefined
  var allowLooseLinks: js.UndefOr[Boolean] = js.undefined
  var deleteKeys: js.UndefOr[js.Array[Double]] = js.undefined
  var diagramEngine: DiagramEngine
  var inverseZoom: js.UndefOr[Boolean] = js.undefined
  var maxNumberPointsPerLink: js.UndefOr[Double] = js.undefined
  var smartRouting: js.UndefOr[Boolean] = js.undefined
}

object DiagramProps {
  @scala.inline
  def apply(
    diagramEngine: DiagramEngine,
    actionStartedFiring: /* action */ BaseAction => Boolean = null,
    actionStillFiring: /* action */ BaseAction => Unit = null,
    actionStoppedFiring: /* action */ BaseAction => Unit = null,
    allowCanvasTranslation: js.UndefOr[Boolean] = js.undefined,
    allowCanvasZoom: js.UndefOr[Boolean] = js.undefined,
    allowLooseLinks: js.UndefOr[Boolean] = js.undefined,
    baseClass: String = null,
    className: String = null,
    deleteKeys: js.Array[Double] = null,
    extraProps: js.Any = null,
    inverseZoom: js.UndefOr[Boolean] = js.undefined,
    maxNumberPointsPerLink: Int | Double = null,
    smartRouting: js.UndefOr[Boolean] = js.undefined
  ): DiagramProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine)
    if (actionStartedFiring != null) __obj.updateDynamic("actionStartedFiring")(js.Any.fromFunction1(actionStartedFiring))
    if (actionStillFiring != null) __obj.updateDynamic("actionStillFiring")(js.Any.fromFunction1(actionStillFiring))
    if (actionStoppedFiring != null) __obj.updateDynamic("actionStoppedFiring")(js.Any.fromFunction1(actionStoppedFiring))
    if (!js.isUndefined(allowCanvasTranslation)) __obj.updateDynamic("allowCanvasTranslation")(allowCanvasTranslation)
    if (!js.isUndefined(allowCanvasZoom)) __obj.updateDynamic("allowCanvasZoom")(allowCanvasZoom)
    if (!js.isUndefined(allowLooseLinks)) __obj.updateDynamic("allowLooseLinks")(allowLooseLinks)
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass)
    if (className != null) __obj.updateDynamic("className")(className)
    if (deleteKeys != null) __obj.updateDynamic("deleteKeys")(deleteKeys)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    if (!js.isUndefined(inverseZoom)) __obj.updateDynamic("inverseZoom")(inverseZoom)
    if (maxNumberPointsPerLink != null) __obj.updateDynamic("maxNumberPointsPerLink")(maxNumberPointsPerLink.asInstanceOf[js.Any])
    if (!js.isUndefined(smartRouting)) __obj.updateDynamic("smartRouting")(smartRouting)
    __obj.asInstanceOf[DiagramProps]
  }
}

