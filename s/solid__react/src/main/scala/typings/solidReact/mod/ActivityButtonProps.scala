package typings.solidReact.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityButtonProps extends js.Object {
  var activateLabel: js.UndefOr[String | (js.Tuple3[String, String, ReactNode])] = js.undefined
  var activateText: js.UndefOr[String] = js.undefined
  var deactivateLabel: js.UndefOr[String | (js.Tuple3[String, String, ReactNode])] = js.undefined
  var deactivateText: js.UndefOr[String] = js.undefined
  var `object`: js.UndefOr[String] = js.undefined
  var shortName: js.UndefOr[String] = js.undefined
}

object ActivityButtonProps {
  @scala.inline
  def apply(
    activateLabel: String | (js.Tuple3[String, String, ReactNode]) = null,
    activateText: String = null,
    deactivateLabel: String | (js.Tuple3[String, String, ReactNode]) = null,
    deactivateText: String = null,
    `object`: String = null,
    shortName: String = null
  ): ActivityButtonProps = {
    val __obj = js.Dynamic.literal()
    if (activateLabel != null) __obj.updateDynamic("activateLabel")(activateLabel.asInstanceOf[js.Any])
    if (activateText != null) __obj.updateDynamic("activateText")(activateText.asInstanceOf[js.Any])
    if (deactivateLabel != null) __obj.updateDynamic("deactivateLabel")(deactivateLabel.asInstanceOf[js.Any])
    if (deactivateText != null) __obj.updateDynamic("deactivateText")(deactivateText.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityButtonProps]
  }
}

