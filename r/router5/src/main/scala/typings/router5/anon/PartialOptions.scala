package typings.router5.anon

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.routeNode.routeNodeMod.QueryParamsMode
import typings.routeNode.routeNodeMod.TrailingSlashMode
import typings.router5.baseMod.Params
import typings.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<router5.router5/dist/types/router.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var allowNotFound: js.UndefOr[Boolean] = js.native
  
  var autoCleanUp: js.UndefOr[Boolean] = js.native
  
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  var defaultParams: js.UndefOr[Params] = js.native
  
  var defaultRoute: js.UndefOr[String] = js.native
  
  var queryParams: js.UndefOr[IOptions] = js.native
  
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.native
  
  var rewritePathOnMatch: js.UndefOr[Boolean] = js.native
  
  var strictTrailingSlash: js.UndefOr[Boolean] = js.native
  
  var strongMatching: js.UndefOr[Boolean] = js.native
  
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.native
  
  var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def deleteAllowNotFound: Self = this.set("allowNotFound", js.undefined)
    
    @scala.inline
    def setAutoCleanUp(value: Boolean): Self = this.set("autoCleanUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCleanUp: Self = this.set("autoCleanUp", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
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
    def setQueryParamsMode(value: QueryParamsMode): Self = this.set("queryParamsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParamsMode: Self = this.set("queryParamsMode", js.undefined)
    
    @scala.inline
    def setRewritePathOnMatch(value: Boolean): Self = this.set("rewritePathOnMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewritePathOnMatch: Self = this.set("rewritePathOnMatch", js.undefined)
    
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
