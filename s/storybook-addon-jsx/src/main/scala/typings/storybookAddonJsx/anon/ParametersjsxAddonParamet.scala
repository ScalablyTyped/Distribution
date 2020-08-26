package typings.storybookAddonJsx.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddonJsx.mod.AddonParameters
import typings.storybookAddons.typesMod.OptionsParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/addons.@storybook/addons.Parameters & {  jsx :storybook-addon-jsx.storybook-addon-jsx.AddonParameters} */
@js.native
trait ParametersjsxAddonParamet
  extends /* key */ StringDictionary[js.Any] {
  var fileName: js.UndefOr[String] = js.native
  var jsx: AddonParameters = js.native
  var options: js.UndefOr[OptionsParameter] = js.native
}

object ParametersjsxAddonParamet {
  @scala.inline
  def apply(jsx: AddonParameters): ParametersjsxAddonParamet = {
    val __obj = js.Dynamic.literal(jsx = jsx.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersjsxAddonParamet]
  }
  @scala.inline
  implicit class ParametersjsxAddonParametOps[Self <: ParametersjsxAddonParamet] (val x: Self) extends AnyVal {
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
    def setJsx(value: AddonParameters): Self = this.set("jsx", value.asInstanceOf[js.Any])
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

