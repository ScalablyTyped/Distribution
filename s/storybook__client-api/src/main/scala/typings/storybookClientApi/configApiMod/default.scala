package typings.storybookClientApi.configApiMod

import typings.node.NodeModule
import typings.std.Error
import typings.storybookClientApi.anon.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api/dist/config_api", JSImport.Default)
@js.native
class default protected () extends ConfigApi {
  def this(hasChannelStoryStoreClientApiClearDecorators: Channel) = this()
  /* CompleteClass */
  override var _channel: typings.storybookChannels.mod.default = js.native
  /* CompleteClass */
  override var _storyStore: typings.storybookClientApi.storyStoreMod.default = js.native
  /* CompleteClass */
  override var clientApi: typings.storybookClientApi.clientApiMod.default = js.native
  /* CompleteClass */
  override def _clearDecorators(): Unit = js.native
  /* CompleteClass */
  override def _renderError(err: Error): Unit = js.native
  /* CompleteClass */
  override def _renderMain(): Unit = js.native
  /* CompleteClass */
  override def configure(loaders: js.Function0[Unit], module: NodeModule): Unit = js.native
}

