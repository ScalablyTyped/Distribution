package typings.storybookReactRouter

import typings.react.mod.ComponentType
import typings.reactRouter.mod.MemoryRouterProps
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookReact.typesMod.StoryFnReactReturnType
import typings.storybookReactRouter.anon.Links
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-react-router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val StoryRouter: ComponentType[Links] = js.native
  def default(): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.UndefOr[scala.Nothing], routerProps: MemoryRouterProps): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.Object): DecoratorFunction[StoryFnReactReturnType] = js.native
  def default(links: js.Object, routerProps: MemoryRouterProps): DecoratorFunction[StoryFnReactReturnType] = js.native
}

