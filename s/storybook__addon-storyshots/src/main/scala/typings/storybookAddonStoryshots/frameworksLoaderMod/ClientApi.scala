package typings.storybookAddonStoryshots.frameworksLoaderMod

import typings.node.NodeModule
import typings.storybookAddonStoryshots.storybookAddonStoryshotsBooleans.`false`
import typings.storybookAddons.typesMod.ClientStoryApi
import typings.storybookAddons.typesMod.Loadable
import typings.storybookClientApi.AnonFileName
import typings.storybookClientApi.typesMod.StoreItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApi
  extends ClientStoryApi[js.Any] {
  var clearDecorators: js.Function0[Unit] = js.native
  var getStorybook: js.Function0[js.Array[AnonFileName]] = js.native
  var raw: js.Function0[js.Array[StoreItem]] = js.native
  var setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  def configure(loader: Loadable, module: NodeModule): Unit = js.native
  @JSName("configure")
  def configure_false(loader: Loadable, module: `false`): Unit = js.native
  def forceReRender(): Unit = js.native
}

