package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicOptions extends js.Object {
  var public: js.UndefOr[Boolean] = js.undefined
}

object PublicOptions {
  @scala.inline
  def apply(public: js.UndefOr[Boolean] = js.undefined): PublicOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicOptions]
  }
}

