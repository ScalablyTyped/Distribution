package typings.router5.typesTypesBaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptions
  extends /* key */ StringDictionary[js.Any] {
  var force: js.UndefOr[Boolean] = js.undefined
  var reload: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var skipTransition: js.UndefOr[Boolean] = js.undefined
}

object NavigationOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    reload: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    skipTransition: js.UndefOr[Boolean] = js.undefined
  ): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTransition)) __obj.updateDynamic("skipTransition")(skipTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationOptions]
  }
}

