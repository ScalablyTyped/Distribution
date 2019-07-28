package typings.storybookDashAddonDashJsx.storybookDashAddonDashJsxMod.atStorybookReactMod

import typings.storybookDashAddonDashJsx.storybookDashAddonDashJsxMod.displayNameFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var displayName: js.UndefOr[String | displayNameFunc] = js.undefined
  var enableBeautify: js.UndefOr[Boolean] = js.undefined
  var onBeforeRender: js.UndefOr[js.Function1[/* domString */ String, String]] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    displayName: String | displayNameFunc = null,
    enableBeautify: js.UndefOr[Boolean] = js.undefined,
    onBeforeRender: /* domString */ String => String = null,
    skip: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableBeautify)) __obj.updateDynamic("enableBeautify")(enableBeautify)
    if (onBeforeRender != null) __obj.updateDynamic("onBeforeRender")(js.Any.fromFunction1(onBeforeRender))
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

