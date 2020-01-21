package typings.storybookApi.initProviderApiMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.storybookApi.mod.API
import typings.storybookChannels.mod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider
  extends /* key */ StringDictionary[js.Any] {
  var channel: js.UndefOr[Channel] = js.undefined
  var renderPreview: js.UndefOr[js.Function0[ReactElement]] = js.undefined
  def handleAPI(api: API): Unit
}

object Provider {
  @scala.inline
  def apply(
    handleAPI: API => Unit,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    channel: Channel = null,
    renderPreview: () => ReactElement = null
  ): Provider = {
    val __obj = js.Dynamic.literal(handleAPI = js.Any.fromFunction1(handleAPI))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (renderPreview != null) __obj.updateDynamic("renderPreview")(js.Any.fromFunction0(renderPreview))
    __obj.asInstanceOf[Provider]
  }
}

