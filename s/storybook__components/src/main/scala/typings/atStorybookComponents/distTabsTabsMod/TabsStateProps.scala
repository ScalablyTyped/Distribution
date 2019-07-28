package typings.atStorybookComponents.distTabsTabsMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsStateProps extends js.Object {
  var absolute: Boolean
  var bordered: Boolean
  var children: js.Array[ReactNode | FuncChilden]
  var initial: String
}

object TabsStateProps {
  @scala.inline
  def apply(absolute: Boolean, bordered: Boolean, children: js.Array[ReactNode | FuncChilden], initial: String): TabsStateProps = {
    val __obj = js.Dynamic.literal(absolute = absolute, bordered = bordered, children = children, initial = initial)
  
    __obj.asInstanceOf[TabsStateProps]
  }
}

