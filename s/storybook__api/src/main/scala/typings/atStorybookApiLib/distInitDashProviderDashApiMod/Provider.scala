package typings
package atStorybookApiLib.distInitDashProviderDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var channel: js.UndefOr[atStorybookChannelsLib.atStorybookChannelsMod.Channel] = js.undefined
  var renderPreview: js.UndefOr[js.Function0[reactLib.reactMod.ReactElement]] = js.undefined
  def handleAPI(api: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any): scala.Unit
}

object Provider {
  @scala.inline
  def apply(
    handleAPI: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify API */ js.Any => scala.Unit,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    channel: atStorybookChannelsLib.atStorybookChannelsMod.Channel = null,
    renderPreview: () => reactLib.reactMod.ReactElement = null
  ): Provider = {
    val __obj = js.Dynamic.literal(handleAPI = js.Any.fromFunction1(handleAPI))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (renderPreview != null) __obj.updateDynamic("renderPreview")(js.Any.fromFunction0(renderPreview))
    __obj.asInstanceOf[Provider]
  }
}

