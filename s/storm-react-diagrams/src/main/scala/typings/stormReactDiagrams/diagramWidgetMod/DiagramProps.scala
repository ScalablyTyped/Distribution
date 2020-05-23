package typings.stormReactDiagrams.diagramWidgetMod

import typings.stormReactDiagrams.baseActionMod.BaseAction
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
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
    maxNumberPointsPerLink: js.UndefOr[Double] = js.undefined,
    smartRouting: js.UndefOr[Boolean] = js.undefined
  ): DiagramProps = {
    val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    if (actionStartedFiring != null) __obj.updateDynamic("actionStartedFiring")(js.Any.fromFunction1(actionStartedFiring))
    if (actionStillFiring != null) __obj.updateDynamic("actionStillFiring")(js.Any.fromFunction1(actionStillFiring))
    if (actionStoppedFiring != null) __obj.updateDynamic("actionStoppedFiring")(js.Any.fromFunction1(actionStoppedFiring))
    if (!js.isUndefined(allowCanvasTranslation)) __obj.updateDynamic("allowCanvasTranslation")(allowCanvasTranslation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCanvasZoom)) __obj.updateDynamic("allowCanvasZoom")(allowCanvasZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowLooseLinks)) __obj.updateDynamic("allowLooseLinks")(allowLooseLinks.get.asInstanceOf[js.Any])
    if (baseClass != null) __obj.updateDynamic("baseClass")(baseClass.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (deleteKeys != null) __obj.updateDynamic("deleteKeys")(deleteKeys.asInstanceOf[js.Any])
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps.asInstanceOf[js.Any])
    if (!js.isUndefined(inverseZoom)) __obj.updateDynamic("inverseZoom")(inverseZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxNumberPointsPerLink)) __obj.updateDynamic("maxNumberPointsPerLink")(maxNumberPointsPerLink.get.asInstanceOf[js.Any])
    if (!js.isUndefined(smartRouting)) __obj.updateDynamic("smartRouting")(smartRouting.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramProps]
  }
}

