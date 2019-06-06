package typings
package atStorybookComponentsLib.distTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsStateProps extends js.Object {
  var absolute: scala.Boolean
  var bordered: scala.Boolean
  var children: js.Array[reactLib.reactMod.ReactNode | FuncChilden]
  var initial: java.lang.String
}

object TabsStateProps {
  @scala.inline
  def apply(
    absolute: scala.Boolean,
    bordered: scala.Boolean,
    children: js.Array[reactLib.reactMod.ReactNode | FuncChilden],
    initial: java.lang.String
  ): TabsStateProps = {
    val __obj = js.Dynamic.literal(absolute = absolute, bordered = bordered, children = children, initial = initial)
  
    __obj.asInstanceOf[TabsStateProps]
  }
}

