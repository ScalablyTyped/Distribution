package typings.atStorybookApi.distInitDashProviderDashApiMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  var renderPreview: js.UndefOr[js.Function0[ReactElement]] = js.undefined
}

object SubAPI {
  @scala.inline
  def apply(renderPreview: () => ReactElement = null): SubAPI = {
    val __obj = js.Dynamic.literal()
    if (renderPreview != null) __obj.updateDynamic("renderPreview")(js.Any.fromFunction0(renderPreview))
    __obj.asInstanceOf[SubAPI]
  }
}

