package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperSettings extends js.Object {
  var options: OptionsParameter = js.native
  var parameters: StringDictionary[js.Any] = js.native
}

object WrapperSettings {
  @scala.inline
  def apply(options: OptionsParameter, parameters: StringDictionary[js.Any]): WrapperSettings = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperSettings]
  }
  @scala.inline
  implicit class WrapperSettingsOps[Self <: WrapperSettings] (val x: Self) extends AnyVal {
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
    def setOptions(value: OptionsParameter): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = this.set("parameters", value.asInstanceOf[js.Any])
  }
  
}

