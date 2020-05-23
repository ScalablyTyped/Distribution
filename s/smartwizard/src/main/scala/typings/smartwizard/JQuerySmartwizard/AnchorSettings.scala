package typings.smartwizard.JQuerySmartwizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorSettings extends js.Object {
  var anchorClickable: js.UndefOr[Boolean] = js.undefined
  var enableAllAnchors: js.UndefOr[Boolean] = js.undefined
  var enableAnchorOnDoneStep: js.UndefOr[Boolean] = js.undefined
  var markAllPreviousStepsAsDone: js.UndefOr[Boolean] = js.undefined
  var markDoneStep: js.UndefOr[Boolean] = js.undefined
  var removeDoneStepOnNavigateBack: js.UndefOr[Boolean] = js.undefined
}

object AnchorSettings {
  @scala.inline
  def apply(
    anchorClickable: js.UndefOr[Boolean] = js.undefined,
    enableAllAnchors: js.UndefOr[Boolean] = js.undefined,
    enableAnchorOnDoneStep: js.UndefOr[Boolean] = js.undefined,
    markAllPreviousStepsAsDone: js.UndefOr[Boolean] = js.undefined,
    markDoneStep: js.UndefOr[Boolean] = js.undefined,
    removeDoneStepOnNavigateBack: js.UndefOr[Boolean] = js.undefined
  ): AnchorSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(anchorClickable)) __obj.updateDynamic("anchorClickable")(anchorClickable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAllAnchors)) __obj.updateDynamic("enableAllAnchors")(enableAllAnchors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnchorOnDoneStep)) __obj.updateDynamic("enableAnchorOnDoneStep")(enableAnchorOnDoneStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markAllPreviousStepsAsDone)) __obj.updateDynamic("markAllPreviousStepsAsDone")(markAllPreviousStepsAsDone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(markDoneStep)) __obj.updateDynamic("markDoneStep")(markDoneStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(removeDoneStepOnNavigateBack)) __obj.updateDynamic("removeDoneStepOnNavigateBack")(removeDoneStepOnNavigateBack.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorSettings]
  }
}

