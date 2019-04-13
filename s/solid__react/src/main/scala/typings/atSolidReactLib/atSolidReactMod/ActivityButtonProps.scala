package typings
package atSolidReactLib.atSolidReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityButtonProps extends js.Object {
  var activateLabel: js.UndefOr[
    java.lang.String | (js.Tuple3[java.lang.String, java.lang.String, reactLib.reactMod.ReactNode])
  ] = js.undefined
  var activateText: js.UndefOr[java.lang.String] = js.undefined
  var deactivateLabel: js.UndefOr[
    java.lang.String | (js.Tuple3[java.lang.String, java.lang.String, reactLib.reactMod.ReactNode])
  ] = js.undefined
  var deactivateText: js.UndefOr[java.lang.String] = js.undefined
  var `object`: js.UndefOr[java.lang.String] = js.undefined
  var shortName: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityButtonProps {
  @scala.inline
  def apply(
    activateLabel: java.lang.String | (js.Tuple3[java.lang.String, java.lang.String, reactLib.reactMod.ReactNode]) = null,
    activateText: java.lang.String = null,
    deactivateLabel: java.lang.String | (js.Tuple3[java.lang.String, java.lang.String, reactLib.reactMod.ReactNode]) = null,
    deactivateText: java.lang.String = null,
    `object`: java.lang.String = null,
    shortName: java.lang.String = null
  ): ActivityButtonProps = {
    val __obj = js.Dynamic.literal()
    if (activateLabel != null) __obj.updateDynamic("activateLabel")(activateLabel.asInstanceOf[js.Any])
    if (activateText != null) __obj.updateDynamic("activateText")(activateText)
    if (deactivateLabel != null) __obj.updateDynamic("deactivateLabel")(deactivateLabel.asInstanceOf[js.Any])
    if (deactivateText != null) __obj.updateDynamic("deactivateText")(deactivateText)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (shortName != null) __obj.updateDynamic("shortName")(shortName)
    __obj.asInstanceOf[ActivityButtonProps]
  }
}

