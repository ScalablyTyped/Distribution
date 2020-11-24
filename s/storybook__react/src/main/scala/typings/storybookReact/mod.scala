package typings.storybookReact

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Loadable
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookAddons.typesMod.StoryKind
import typings.storybookReact.typesMod.IStorybookSection
import typings.storybookReact.typesMod.StoryFnReactReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[StoryFnReactReturnType], 
    StoryApi[StoryFnReactReturnType]
  ] = js.native
  
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[StoryFnReactReturnType]] = js.native
  
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  
  val forceReRender: js.Function0[Unit] = js.native
  
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  
  val raw: js.Function0[js.Any] = js.native
  
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  
  val storiesOf: js.Function2[/* kind */ StoryKind, /* module */ NodeModule, StoryApi[StoryFnReactReturnType]] = js.native
}
