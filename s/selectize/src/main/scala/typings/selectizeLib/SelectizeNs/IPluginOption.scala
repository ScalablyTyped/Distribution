package typings
package selectizeLib.SelectizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// see https://github.com/selectize/selectize.js/blob/master/docs/plugins.md
trait IPluginOption extends js.Object {
  var name: java.lang.String
  var options: js.Any
}

object IPluginOption {
  @scala.inline
  def apply(name: java.lang.String, options: js.Any): IPluginOption = {
    val __obj = js.Dynamic.literal(name = name, options = options)
  
    __obj.asInstanceOf[IPluginOption]
  }
}

