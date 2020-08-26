package typings.storybookClientApi.configApiMod

import typings.node.NodeModule
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigApi extends js.Object {
  var _channel: typings.storybookChannels.mod.default = js.native
  var _storyStore: typings.storybookClientApi.storyStoreMod.default = js.native
  var clientApi: typings.storybookClientApi.clientApiMod.default = js.native
  def _clearDecorators(): Unit = js.native
  def _renderError(err: Error): Unit = js.native
  def _renderMain(): Unit = js.native
  def configure(loaders: js.Function0[Unit], module: NodeModule): Unit = js.native
}

object ConfigApi {
  @scala.inline
  def apply(
    _channel: typings.storybookChannels.mod.default,
    _clearDecorators: () => Unit,
    _renderError: Error => Unit,
    _renderMain: () => Unit,
    _storyStore: typings.storybookClientApi.storyStoreMod.default,
    clientApi: typings.storybookClientApi.clientApiMod.default,
    configure: (js.Function0[Unit], NodeModule) => Unit
  ): ConfigApi = {
    val __obj = js.Dynamic.literal(_channel = _channel.asInstanceOf[js.Any], _clearDecorators = js.Any.fromFunction0(_clearDecorators), _renderError = js.Any.fromFunction1(_renderError), _renderMain = js.Any.fromFunction0(_renderMain), _storyStore = _storyStore.asInstanceOf[js.Any], clientApi = clientApi.asInstanceOf[js.Any], configure = js.Any.fromFunction2(configure))
    __obj.asInstanceOf[ConfigApi]
  }
  @scala.inline
  implicit class ConfigApiOps[Self <: ConfigApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_channel(value: typings.storybookChannels.mod.default): Self = this.set("_channel", value.asInstanceOf[js.Any])
    @scala.inline
    def set_clearDecorators(value: () => Unit): Self = this.set("_clearDecorators", js.Any.fromFunction0(value))
    @scala.inline
    def set_renderError(value: Error => Unit): Self = this.set("_renderError", js.Any.fromFunction1(value))
    @scala.inline
    def set_renderMain(value: () => Unit): Self = this.set("_renderMain", js.Any.fromFunction0(value))
    @scala.inline
    def set_storyStore(value: typings.storybookClientApi.storyStoreMod.default): Self = this.set("_storyStore", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientApi(value: typings.storybookClientApi.clientApiMod.default): Self = this.set("clientApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigure(value: (js.Function0[Unit], NodeModule) => Unit): Self = this.set("configure", js.Any.fromFunction2(value))
  }
  
}

