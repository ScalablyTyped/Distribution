package typings.storybookClientApi

import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/client-api/dist/decorators", JSImport.Namespace)
@js.native
object decoratorsMod extends js.Object {
  
  def decorateStory(storyFn: StoryFn[_], decorator: DecoratorFunction[_]): js.Function1[/* context */ js.UndefOr[StoryContext], _] = js.native
  
  def defaultDecorateStory(storyFn: StoryFn[_], decorators: js.Array[DecoratorFunction[_]]): js.Function1[/* context */ js.UndefOr[StoryContext], _] = js.native
}
