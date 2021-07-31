package typings.storybookReact

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Loadable
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookReact.typesMod.IStorybookSection
import typings.storybookReact.typesMod.StoryFnReactReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/react", "addDecorator")
  @js.native
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[StoryFnReactReturnType], 
    StoryApi[StoryFnReactReturnType]
  ] = js.native
  
  @JSImport("@storybook/react", "addParameters")
  @js.native
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[StoryFnReactReturnType]] = js.native
  
  @JSImport("@storybook/react", "configure")
  @js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  @JSImport("@storybook/react", "forceReRender")
  @js.native
  val forceReRender: js.Function0[Unit] = js.native
  
  @JSImport("@storybook/react", "getStorybook")
  @js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  @JSImport("@storybook/react", "raw")
  @js.native
  val raw: js.Function0[js.Any] = js.native
  
  @JSImport("@storybook/react", "setAddon")
  @js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  
  @JSImport("@storybook/react", "storiesOf")
  @js.native
  val storiesOf: js.Function2[/* kind */ StoryKind, /* module */ NodeModule, StoryApi[StoryFnReactReturnType]] = js.native
}
