package typings.storybookReactRouter

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.reactRouter.mod.MemoryRouterProps
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookReact.typesMod.StoryFnReactReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-react-router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class StoryRouter protected ()
    extends Component[AnonLinks, ComponentState, js.Any] {
    def this(props: AnonLinks) = this()
    def this(props: AnonLinks, context: js.Any) = this()
  }
  
  def default(): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.Object): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.Object, routerProps: MemoryRouterProps): DecoratorFunction[StoryFnReactReturnType] = js.native
  @js.native
  object StoryRouter extends TopLevel[ComponentType[AnonLinks]]
  
}

