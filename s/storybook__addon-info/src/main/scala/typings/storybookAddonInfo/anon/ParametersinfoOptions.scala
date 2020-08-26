package typings.storybookAddonInfo.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddonInfo.mod.Options
import typings.storybookAddons.typesMod.OptionsParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/addons.@storybook/addons.Parameters & {  info :@storybook/addon-info.@storybook/addon-info.Options} */
@js.native
trait ParametersinfoOptions
  extends /* key */ StringDictionary[js.Any] {
  var fileName: js.UndefOr[String] = js.native
  var info: Options = js.native
  var options: js.UndefOr[OptionsParameter] = js.native
}

object ParametersinfoOptions {
  @scala.inline
  def apply(info: Options): ParametersinfoOptions = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersinfoOptions]
  }
  @scala.inline
  implicit class ParametersinfoOptionsOps[Self <: ParametersinfoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfo(value: Options): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setOptions(value: OptionsParameter): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

