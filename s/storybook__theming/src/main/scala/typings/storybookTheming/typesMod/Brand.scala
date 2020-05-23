package typings.storybookTheming.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brand extends js.Object {
  var image: js.UndefOr[String | Null] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String | Null] = js.undefined
}

object Brand {
  @scala.inline
  def apply(
    image: js.UndefOr[Null | String] = js.undefined,
    title: String = null,
    url: js.UndefOr[Null | String] = js.undefined
  ): Brand = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(image)) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(url)) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
}

