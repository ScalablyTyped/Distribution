package typings.storybookDashReactDashRouter

import org.scalablytyped.runtime.TopLevel
import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookReact.distClientPreviewTypesMod.StoryFnReactReturnType
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.reactDashRouter.reactDashRouterMod.MemoryRouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-react-router", JSImport.Namespace)
@js.native
object storybookDashReactDashRouterMod extends js.Object {
  @js.native
  class StoryRouter protected ()
    extends Component[Anon_Links, ComponentState, js.Any] {
    def this(props: Anon_Links) = this()
    def this(props: Anon_Links, context: js.Any) = this()
  }
  
  def default(): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.Object): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.Object, routerProps: MemoryRouterProps): DecoratorFunction[StoryFnReactReturnType] = js.native
  @js.native
  object StoryRouter extends TopLevel[ComponentType[Anon_Links]]
  
}

