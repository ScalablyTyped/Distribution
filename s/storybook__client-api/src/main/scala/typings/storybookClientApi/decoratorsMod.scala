package typings.storybookClientApi

import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.StoryContext
import typings.storybookAddons.typesMod.StoryFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("@storybook/client-api/dist/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decorateStory(storyFn: StoryFn[js.Any], decorator: DecoratorFunction[js.Any]): js.Function1[/* context */ js.UndefOr[StoryContext], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("decorateStory")(storyFn.asInstanceOf[js.Any], decorator.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* context */ js.UndefOr[StoryContext], js.Any]]
  
  inline def defaultDecorateStory(storyFn: StoryFn[js.Any], decorators: js.Array[DecoratorFunction[js.Any]]): js.Function1[/* context */ js.UndefOr[StoryContext], js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDecorateStory")(storyFn.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* context */ js.UndefOr[StoryContext], js.Any]]
}
