package typings.atStorybookReact

import typings.atStorybookAddons.distTypesMod.DecoratorFunction
import typings.atStorybookAddons.distTypesMod.Loadable
import typings.atStorybookAddons.distTypesMod.Parameters
import typings.atStorybookAddons.distTypesMod.StoryApi
import typings.atStorybookReact.distClientPreviewTypesMod.IStorybookSection
import typings.atStorybookReact.distClientPreviewTypesMod.StoryFnReactReturnType
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/react", JSImport.Namespace)
@js.native
object atStorybookReactMod extends js.Object {
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
  val storiesOf: js.Function2[/* kind */ String, /* module */ NodeModule, StoryApi[StoryFnReactReturnType]] = js.native
}

