package typings.reactDashFacebookDashLogin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var is_silhouette: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Height {
  @scala.inline
  def apply(
    height: Int | Double = null,
    is_silhouette: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    width: Int | Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(is_silhouette)) __obj.updateDynamic("is_silhouette")(is_silhouette.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

