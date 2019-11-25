package typings.atStorybookTheming.distTypesMod

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
  def apply(image: String = null, title: String = null, url: String = null): Brand = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brand]
  }
}

