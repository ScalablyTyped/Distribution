package typings.storybookAddonInfo.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookAddonInfo.mod.Options
import typings.storybookAddonInfo.storybookAddonInfoStrings.centered
import typings.storybookAddonInfo.storybookAddonInfoStrings.fullscreen
import typings.storybookAddonInfo.storybookAddonInfoStrings.none
import typings.storybookAddonInfo.storybookAddonInfoStrings.padded
import typings.storybookAddons.typesMod.OptionsParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/addons.@storybook/addons.Parameters & {  info :@storybook/addon-info.@storybook/addon-info.Options} */
@js.native
trait ParametersinfoOptions
  extends /* key */ StringDictionary[js.Any] {
  
  var docsOnly: js.UndefOr[Boolean] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var info: Options = js.native
  
  /** The layout property defines basic styles added to the preview body where the story is rendered. If you pass 'none', no styles are applied. */
  var layout: js.UndefOr[centered | fullscreen | padded | none] = js.native
  
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
    def setDocsOnly(value: Boolean): Self = this.set("docsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocsOnly: Self = this.set("docsOnly", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setLayout(value: centered | fullscreen | padded | none): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setOptions(value: OptionsParameter): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
