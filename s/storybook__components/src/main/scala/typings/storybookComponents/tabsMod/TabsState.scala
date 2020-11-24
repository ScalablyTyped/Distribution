package typings.storybookComponents.tabsMod

import typings.react.mod.Component
import typings.storybookComponents.anon.OnSelect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components/dist/tabs/tabs", "TabsState")
@js.native
class TabsState protected ()
  extends Component[TabsStateProps, TabsStateState, js.Any] {
  def this(props: TabsStateProps) = this()
  
  var handlers: OnSelect = js.native
}
/* static members */
@JSImport("@storybook/components/dist/tabs/tabs", "TabsState")
@js.native
object TabsState extends js.Object {
  
  var defaultProps: TabsStateProps = js.native
}
