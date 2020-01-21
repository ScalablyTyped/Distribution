package typings.storybookPreact

import typings.node.NodeModule
import typings.storybookAddons.typesMod.DecoratorFunction
import typings.storybookAddons.typesMod.Loadable
import typings.storybookAddons.typesMod.Parameters
import typings.storybookAddons.typesMod.StoryApi
import typings.storybookPreact.typesMod.IStorybookSection
import typings.storybookPreact.typesMod.StoryFnPreactReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/preact/dist/client/preview", JSImport.Namespace)
@js.native
object previewMod extends js.Object {
  val addDecorator: js.Function1[
    /* decorator */ DecoratorFunction[StoryFnPreactReturnType], 
    StoryApi[StoryFnPreactReturnType]
  ] = js.native
  val addParameters: js.Function1[/* parameter */ Parameters, StoryApi[StoryFnPreactReturnType]] = js.native
  val clearDecorators: js.Function0[Unit] = js.native
  val configure: js.Function2[/* loader */ Loadable, /* module */ NodeModule, Unit] = js.native
  val forceReRender: js.Function0[Unit] = js.native
  val getStorybook: js.Function0[js.Array[IStorybookSection]] = js.native
  val raw: js.Function0[js.Any] = js.native
  val setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  val storiesOf: js.Function2[/* kind */ String, /* module */ NodeModule, StoryApi[StoryFnPreactReturnType]] = js.native
}

