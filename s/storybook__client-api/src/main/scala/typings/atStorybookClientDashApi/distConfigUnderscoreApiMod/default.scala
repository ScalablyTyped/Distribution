package typings.atStorybookClientDashApi.distConfigUnderscoreApiMod

import typings.atStorybookClientDashApi.Anon_Channel
import typings.node.NodeModule
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/client-api/dist/config_api", JSImport.Default)
@js.native
class default protected () extends ConfigApi {
  def this(hasChannelStoryStoreClientApiClearDecorators: Anon_Channel) = this()
  /* CompleteClass */
  override var _channel: typings.atStorybookChannels.atStorybookChannelsMod.default = js.native
  /* CompleteClass */
  override var _storyStore: typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod.default = js.native
  /* CompleteClass */
  override var clientApi: typings.atStorybookClientDashApi.distClientUnderscoreApiMod.default = js.native
  /* CompleteClass */
  override def _clearDecorators(): Unit = js.native
  /* CompleteClass */
  override def _renderError(err: Error): Unit = js.native
  /* CompleteClass */
  override def _renderMain(): Unit = js.native
  /* CompleteClass */
  override def configure(loaders: js.Function0[Unit], module: NodeModule): Unit = js.native
}

