package typings.atStorybookUi

import typings.atStorybookUi.atStorybookUiStrings.button
import typings.atStorybookUi.atStorybookUiStrings.form
import typings.atStorybookUi.atStorybookUiStrings.input
import typings.atStorybookUi.distComponentsSidebarSidebarSearchMod.FilterFieldProps
import typings.atStorybookUi.distComponentsSidebarSidebarSearchMod.PureSidebarSearchProps
import typings.react.reactMod.ComponentProps
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarSearch", JSImport.Namespace)
@js.native
object distComponentsSidebarSidebarSearchMod extends js.Object {
  def PureSidebarSearch(hasClassNameOnChangeProps: PureSidebarSearchProps): Element = js.native
  def default(hasClassNameOnChangeProps: PureSidebarSearchProps): Element = js.native
  type CancelButtonProps = ComponentProps[button]
  type FilterFieldProps = ComponentProps[input]
  type FilterFormProps = ComponentProps[form] with Anon_Focussed
  type PureSidebarSearchProps = FilterFieldProps with Anon_Arg
}

