package typings
package router5Lib.typesTypesBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationOptions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var reload: js.UndefOr[scala.Boolean] = js.undefined
  var replace: js.UndefOr[scala.Boolean] = js.undefined
  var skipTransition: js.UndefOr[scala.Boolean] = js.undefined
}

object NavigationOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    reload: js.UndefOr[scala.Boolean] = js.undefined,
    replace: js.UndefOr[scala.Boolean] = js.undefined,
    skipTransition: js.UndefOr[scala.Boolean] = js.undefined
  ): NavigationOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload)
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace)
    if (!js.isUndefined(skipTransition)) __obj.updateDynamic("skipTransition")(skipTransition)
    __obj.asInstanceOf[NavigationOptions]
  }
}

