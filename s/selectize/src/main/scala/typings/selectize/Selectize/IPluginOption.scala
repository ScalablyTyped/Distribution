package typings.selectize.Selectize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/selectize/selectize.js/blob/master/docs/plugins.md
@js.native
trait IPluginOption extends js.Object {
  var name: String = js.native
  var options: js.Any = js.native
}

object IPluginOption {
  @scala.inline
  def apply(name: String, options: js.Any): IPluginOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginOption]
  }
  @scala.inline
  implicit class IPluginOptionOps[Self <: IPluginOption] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

