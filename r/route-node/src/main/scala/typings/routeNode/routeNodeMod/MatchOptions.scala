package typings.routeNode.routeNodeMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var queryParams: js.UndefOr[IOptions] = js.native
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.native
  var strictTrailingSlash: js.UndefOr[Boolean] = js.native
  var strongMatching: js.UndefOr[Boolean] = js.native
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.native
  var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.native
}

object MatchOptions {
  @scala.inline
  def apply(): MatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchOptions]
  }
  @scala.inline
  implicit class MatchOptionsOps[Self <: MatchOptions] (val x: Self) extends AnyVal {
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setQueryParams(value: IOptions): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setQueryParamsMode(value: QueryParamsMode): Self = this.set("queryParamsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParamsMode: Self = this.set("queryParamsMode", js.undefined)
    @scala.inline
    def setStrictTrailingSlash(value: Boolean): Self = this.set("strictTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictTrailingSlash: Self = this.set("strictTrailingSlash", js.undefined)
    @scala.inline
    def setStrongMatching(value: Boolean): Self = this.set("strongMatching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrongMatching: Self = this.set("strongMatching", js.undefined)
    @scala.inline
    def setTrailingSlashMode(value: TrailingSlashMode): Self = this.set("trailingSlashMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailingSlashMode: Self = this.set("trailingSlashMode", js.undefined)
    @scala.inline
    def setUrlParamsEncoding(value: URLParamsEncodingType): Self = this.set("urlParamsEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlParamsEncoding: Self = this.set("urlParamsEncoding", js.undefined)
  }
  
}

