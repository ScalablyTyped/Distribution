package typings.storybookComponents.tabsMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsStateProps extends js.Object {
  var absolute: Boolean = js.native
  var backgroundColor: String = js.native
  var bordered: Boolean = js.native
  var children: js.Array[ReactNode | FuncChilden] = js.native
  var initial: String = js.native
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

