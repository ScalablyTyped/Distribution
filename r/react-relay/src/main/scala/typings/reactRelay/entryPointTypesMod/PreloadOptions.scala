package typings.reactRelay.entryPointTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreloadOptions extends js.Object {
  val fetchKey: js.UndefOr[String | Double] = js.undefined
  val fetchPolicy: js.UndefOr[PreloadFetchPolicy] = js.undefined
}

object PreloadOptions {
  @scala.inline
  def apply(fetchKey: String | Double = null, fetchPolicy: PreloadFetchPolicy = null): PreloadOptions = {
    val __obj = js.Dynamic.literal()
    if (fetchKey != null) __obj.updateDynamic("fetchKey")(fetchKey.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadOptions]
  }
}

