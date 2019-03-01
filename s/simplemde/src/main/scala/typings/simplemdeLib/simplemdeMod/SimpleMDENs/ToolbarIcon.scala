package typings
package simplemdeLib.simplemdeMod.SimpleMDENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarIcon extends js.Object {
  var action: java.lang.String | (js.Function1[/* editor */ simplemdeLib.simplemdeMod.SimpleMDE, scala.Unit])
  var className: java.lang.String
  var name: java.lang.String
  var title: java.lang.String
}

object ToolbarIcon {
  @scala.inline
  def apply(
    action: java.lang.String | (js.Function1[/* editor */ simplemdeLib.simplemdeMod.SimpleMDE, scala.Unit]),
    className: java.lang.String,
    name: java.lang.String,
    title: java.lang.String
  ): ToolbarIcon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ToolbarIcon]
  }
}

