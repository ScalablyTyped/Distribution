package typings.storybookUi

import typings.react.mod.ComponentProps
import typings.react.mod.global.JSX.Element
import typings.storybookUi.anon.Focussed
import typings.storybookUi.anon.OnChange
import typings.storybookUi.storybookUiStrings.button
import typings.storybookUi.storybookUiStrings.form
import typings.storybookUi.storybookUiStrings.input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarSearch", JSImport.Namespace)
@js.native
object sidebarSearchMod extends js.Object {
  def PureSidebarSearch(hasClassNameOnChangeProps: PureSidebarSearchProps): Element = js.native
  def default(hasClassNameOnChangeProps: PureSidebarSearchProps): Element = js.native
  type CancelButtonProps = ComponentProps[button]
  type FilterFieldProps = ComponentProps[input]
  type FilterFormProps = ComponentProps[form] with Focussed
  type PureSidebarSearchProps = FilterFieldProps with OnChange
}

