package typings.storybookAddonJsx.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddonJsx.mod.AddonParameters
import typings.storybookAddons.typesMod.OptionsParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/addons.@storybook/addons.Parameters & {  jsx  :storybook-addon-jsx.storybook-addon-jsx.AddonParameters} */
trait ParametersjsxAddonParamet
  extends /* key */ StringDictionary[js.Any] {
  var fileName: js.UndefOr[String] = js.undefined
  var jsx: AddonParameters
  var options: js.UndefOr[OptionsParameter] = js.undefined
}

object ParametersjsxAddonParamet {
  @scala.inline
  def apply(
    jsx: AddonParameters,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    fileName: String = null,
    options: OptionsParameter = null
  ): ParametersjsxAddonParamet = {
    val __obj = js.Dynamic.literal(jsx = jsx.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersjsxAddonParamet]
  }
}

