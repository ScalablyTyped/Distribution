package typings.storybookApi.anon

import typings.storybookApi.urlMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path extends js.Object {
  var path: String
  var queryParams: QueryParams
  var storyId: js.UndefOr[String] = js.undefined
  var url: String
  var viewMode: js.UndefOr[String] = js.undefined
}

object Path {
  @scala.inline
  def apply(
    path: String,
    queryParams: QueryParams,
    url: String,
    storyId: String = null,
    viewMode: String = null
  ): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
}

