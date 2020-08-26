package typings.router5.routerMod

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.routeNode.routeNodeMod.QueryParamsMode
import typings.routeNode.routeNodeMod.TrailingSlashMode
import typings.router5.baseMod.Params
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowNotFound: Boolean = js.native
  var autoCleanUp: Boolean = js.native
  var caseSensitive: Boolean = js.native
  var defaultParams: js.UndefOr[Params] = js.native
  var defaultRoute: js.UndefOr[String] = js.native
  var queryParams: js.UndefOr[IOptions] = js.native
  var queryParamsMode: QueryParamsMode = js.native
  var rewritePathOnMatch: Boolean = js.native
  var strictTrailingSlash: Boolean = js.native
  var strongMatching: Boolean = js.native
  var trailingSlashMode: TrailingSlashMode = js.native
  var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.native
}

object Options {
  @scala.inline
  def apply(
    allowNotFound: Boolean,
    autoCleanUp: Boolean,
    caseSensitive: Boolean,
    queryParamsMode: QueryParamsMode,
    rewritePathOnMatch: Boolean,
    strictTrailingSlash: Boolean,
    strongMatching: Boolean,
    trailingSlashMode: TrailingSlashMode
  ): Options = {
    val __obj = js.Dynamic.literal(allowNotFound = allowNotFound.asInstanceOf[js.Any], autoCleanUp = autoCleanUp.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], queryParamsMode = queryParamsMode.asInstanceOf[js.Any], rewritePathOnMatch = rewritePathOnMatch.asInstanceOf[js.Any], strictTrailingSlash = strictTrailingSlash.asInstanceOf[js.Any], strongMatching = strongMatching.asInstanceOf[js.Any], trailingSlashMode = trailingSlashMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowNotFound(value: Boolean): Self = this.set("allowNotFound", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoCleanUp(value: Boolean): Self = this.set("autoCleanUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryParamsMode(value: QueryParamsMode): Self = this.set("queryParamsMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRewritePathOnMatch(value: Boolean): Self = this.set("rewritePathOnMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrictTrailingSlash(value: Boolean): Self = this.set("strictTrailingSlash", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrongMatching(value: Boolean): Self = this.set("strongMatching", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailingSlashMode(value: TrailingSlashMode): Self = this.set("trailingSlashMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultParams(value: Params): Self = this.set("defaultParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultParams: Self = this.set("defaultParams", js.undefined)
    @scala.inline
    def setDefaultRoute(value: String): Self = this.set("defaultRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultRoute: Self = this.set("defaultRoute", js.undefined)
    @scala.inline
    def setQueryParams(value: IOptions): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    @scala.inline
    def setUrlParamsEncoding(value: URLParamsEncodingType): Self = this.set("urlParamsEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlParamsEncoding: Self = this.set("urlParamsEncoding", js.undefined)
  }
  
}

