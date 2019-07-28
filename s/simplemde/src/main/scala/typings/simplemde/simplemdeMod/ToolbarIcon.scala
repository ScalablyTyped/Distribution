package typings.simplemde.simplemdeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarIcon extends js.Object {
  var action: String | (js.Function1[/* editor */ SimpleMDE, Unit])
  var className: String
  var name: String
  var title: String
}

object ToolbarIcon {
  @scala.inline
  def apply(
    action: String | (js.Function1[/* editor */ SimpleMDE, Unit]),
    className: String,
    name: String,
    title: String
  ): ToolbarIcon = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], className = className, name = name, title = title)
  
    __obj.asInstanceOf[ToolbarIcon]
  }
}

