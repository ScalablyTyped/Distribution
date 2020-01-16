package typings.atStorybookAddonDashStoryshots.distFrameworksLoaderMod

import typings.atStorybookAddonDashStoryshots.atStorybookAddonDashStoryshotsBooleans.`false`
import typings.atStorybookAddons.distTypesMod.ClientStoryApi
import typings.atStorybookAddons.distTypesMod.Loadable
import typings.atStorybookClientDashApi.Anon_FileName
import typings.atStorybookClientDashApi.distTypesMod.StoreItem
import typings.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientApi
  extends ClientStoryApi[js.Any] {
  var clearDecorators: js.Function0[Unit] = js.native
  var getStorybook: js.Function0[js.Array[Anon_FileName]] = js.native
  var raw: js.Function0[js.Array[StoreItem]] = js.native
  var setAddon: js.Function1[/* addon */ js.Any, Unit] = js.native
  def configure(loader: Loadable, module: NodeModule): Unit = js.native
  @JSName("configure")
  def configure_false(loader: Loadable, module: `false`): Unit = js.native
  def forceReRender(): Unit = js.native
}

