package typings.storybookApi.anon

import typings.storybookApi.urlMod.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  var path: String = js.native
  var queryParams: QueryParams = js.native
  var storyId: js.UndefOr[String] = js.native
  var url: String = js.native
  var viewMode: js.UndefOr[String] = js.native
}

object Path {
  @scala.inline
  def apply(path: String, queryParams: QueryParams, url: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryParams(value: QueryParams): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoryId(value: String): Self = this.set("storyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoryId: Self = this.set("storyId", js.undefined)
    @scala.inline
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewMode: Self = this.set("viewMode", js.undefined)
  }
  
}

