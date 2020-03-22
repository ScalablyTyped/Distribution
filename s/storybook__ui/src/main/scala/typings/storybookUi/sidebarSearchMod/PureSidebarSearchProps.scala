package typings.storybookUi.sidebarSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @storybook/ui.@storybook/ui/dist/components/sidebar/SidebarSearch.FilterFieldProps & {onChange (arg : string): void} */
trait PureSidebarSearchProps extends js.Object {
  def onChange(arg: String): Unit
}

object PureSidebarSearchProps {
  @scala.inline
  def apply(onChange: String => Unit): PureSidebarSearchProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
  
    __obj.asInstanceOf[PureSidebarSearchProps]
  }
}

