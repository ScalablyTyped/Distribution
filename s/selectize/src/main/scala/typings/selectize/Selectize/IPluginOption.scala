package typings.selectize.Selectize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/selectize/selectize.js/blob/master/docs/plugins.md
trait IPluginOption extends js.Object {
  var name: String
  var options: js.Any
}

object IPluginOption {
  @scala.inline
  def apply(name: String, options: js.Any): IPluginOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginOption]
  }
}

