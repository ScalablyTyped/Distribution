package typings.storybookComponents.mod

import typings.react.mod.Component
import typings.storybookComponents.anon.OnSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/components", "TabsState")
@js.native
open class TabsState protected () extends Component[TabsStateProps, TabsStateState, Any] {
  def this(props: TabsStateProps) = this()
  
  var handlers: OnSelect = js.native
}
/* static members */
object TabsState {
  
  @JSImport("@storybook/components", "TabsState")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/components", "TabsState.defaultProps")
  @js.native
  def defaultProps: TabsStateProps = js.native
  inline def defaultProps_=(x: TabsStateProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
