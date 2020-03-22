package typings.storybookAddonInfo

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddonInfo.mod.Options
import typings.storybookAddons.typesMod.OptionsParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/addons.@storybook/addons.Parameters & {  info  :@storybook/addon-info.@storybook/addon-info.Options} */
trait ParametersinfoOptions
  extends /* key */ StringDictionary[js.Any] {
  var fileName: js.UndefOr[String] = js.undefined
  var info: Options
  var options: js.UndefOr[OptionsParameter] = js.undefined
}

object ParametersinfoOptions {
  @scala.inline
  def apply(
    info: Options,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    fileName: String = null,
    options: OptionsParameter = null
  ): ParametersinfoOptions = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersinfoOptions]
  }
}

