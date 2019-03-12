package typings
package storybookDashAddonDashJsxLib.storybookDashAddonDashJsxMod.atStorybookReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var displayName: js.UndefOr[
    java.lang.String | storybookDashAddonDashJsxLib.storybookDashAddonDashJsxMod.displayNameFunc
  ] = js.undefined
  var enableBeautify: js.UndefOr[scala.Boolean] = js.undefined
  var onBeforeRender: js.UndefOr[js.Function1[/* domString */ java.lang.String, java.lang.String]] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    displayName: java.lang.String | storybookDashAddonDashJsxLib.storybookDashAddonDashJsxMod.displayNameFunc = null,
    enableBeautify: js.UndefOr[scala.Boolean] = js.undefined,
    onBeforeRender: /* domString */ java.lang.String => java.lang.String = null,
    skip: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBeautify)) __obj.updateDynamic("enableBeautify")(enableBeautify)
    if (onBeforeRender != null) __obj.updateDynamic("onBeforeRender")(js.Any.fromFunction1(onBeforeRender))
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

