package typings
package reactDashJsonschemaDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactElement[_]
  var className: java.lang.String
  var disabled: scala.Boolean
  var hasMoveDown: scala.Boolean
  var hasMoveUp: scala.Boolean
  var hasRemove: scala.Boolean
  var hasToolbar: scala.Boolean
  var index: scala.Double
  var readonly: scala.Boolean
  def onDropIndexClick(index: scala.Double): js.Function1[/* event */ js.Any, scala.Unit]
  def onReorderClick(index: scala.Double, newIndex: scala.Double): js.Function1[/* event */ js.Any, scala.Unit]
}

object Anon_Children {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactElement[_],
    className: java.lang.String,
    disabled: scala.Boolean,
    hasMoveDown: scala.Boolean,
    hasMoveUp: scala.Boolean,
    hasRemove: scala.Boolean,
    hasToolbar: scala.Boolean,
    index: scala.Double,
    onDropIndexClick: js.Function1[scala.Double, js.Function1[/* event */ js.Any, scala.Unit]],
    onReorderClick: js.Function2[scala.Double, scala.Double, js.Function1[/* event */ js.Any, scala.Unit]],
    readonly: scala.Boolean
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("disabled")(disabled)
    __obj.updateDynamic("hasMoveDown")(hasMoveDown)
    __obj.updateDynamic("hasMoveUp")(hasMoveUp)
    __obj.updateDynamic("hasRemove")(hasRemove)
    __obj.updateDynamic("hasToolbar")(hasToolbar)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("onDropIndexClick")(onDropIndexClick)
    __obj.updateDynamic("onReorderClick")(onReorderClick)
    __obj.updateDynamic("readonly")(readonly)
    __obj.asInstanceOf[Anon_Children]
  }
}

