package typings.storybookComponents.tabsMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsStateProps extends js.Object {
  var absolute: Boolean
  var backgroundColor: String
  var bordered: Boolean
  var children: js.Array[ReactNode | FuncChilden]
  var initial: String
}

object TabsStateProps {
  @scala.inline
  def apply(
    absolute: Boolean,
    backgroundColor: String,
    bordered: Boolean,
    children: js.Array[ReactNode | FuncChilden],
    initial: String
  ): TabsStateProps = {
    val __obj = js.Dynamic.literal(absolute = absolute.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TabsStateProps]
  }
}

