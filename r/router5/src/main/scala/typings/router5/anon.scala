package typings.router5

import typings.pathParser.distEncodingMod.URLParamsEncodingType
import typings.routeNode.distRouteNodeMod.QueryParamsMode
import typings.routeNode.distRouteNodeMod.TrailingSlashMode
import typings.router5.distTypesBaseMod.Params
import typings.searchParams.distEncodeMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ErrorKey extends StObject {
    
    var errorKey: js.UndefOr[Any] = js.undefined
    
    var fromState: Any
    
    var isCancelled: Any
    
    var toState: Any
  }
  object ErrorKey {
    
    inline def apply(fromState: Any, isCancelled: Any, toState: Any): ErrorKey = {
      val __obj = js.Dynamic.literal(fromState = fromState.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any], toState = toState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorKey]
    }
    
    extension [Self <: ErrorKey](x: Self) {
      
      inline def setErrorKey(value: Any): Self = StObject.set(x, "errorKey", value.asInstanceOf[js.Any])
      
      inline def setErrorKeyUndefined: Self = StObject.set(x, "errorKey", js.undefined)
      
      inline def setFromState(value: Any): Self = StObject.set(x, "fromState", value.asInstanceOf[js.Any])
      
      inline def setIsCancelled(value: Any): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
      
      inline def setToState(value: Any): Self = StObject.set(x, "toState", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<router5.router5/dist/types/router.Options> */
  trait PartialOptions extends StObject {
    
    var allowNotFound: js.UndefOr[Boolean] = js.undefined
    
    var autoCleanUp: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var defaultParams: js.UndefOr[Params] = js.undefined
    
    var defaultRoute: js.UndefOr[String] = js.undefined
    
    var queryParams: js.UndefOr[IOptions] = js.undefined
    
    var queryParamsMode: js.UndefOr[QueryParamsMode] = js.undefined
    
    var rewritePathOnMatch: js.UndefOr[Boolean] = js.undefined
    
    var strictTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var strongMatching: js.UndefOr[Boolean] = js.undefined
    
    var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.undefined
    
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setAllowNotFound(value: Boolean): Self = StObject.set(x, "allowNotFound", value.asInstanceOf[js.Any])
      
      inline def setAllowNotFoundUndefined: Self = StObject.set(x, "allowNotFound", js.undefined)
      
      inline def setAutoCleanUp(value: Boolean): Self = StObject.set(x, "autoCleanUp", value.asInstanceOf[js.Any])
      
      inline def setAutoCleanUpUndefined: Self = StObject.set(x, "autoCleanUp", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setDefaultParams(value: Params): Self = StObject.set(x, "defaultParams", value.asInstanceOf[js.Any])
      
      inline def setDefaultParamsUndefined: Self = StObject.set(x, "defaultParams", js.undefined)
      
      inline def setDefaultRoute(value: String): Self = StObject.set(x, "defaultRoute", value.asInstanceOf[js.Any])
      
      inline def setDefaultRouteUndefined: Self = StObject.set(x, "defaultRoute", js.undefined)
      
      inline def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsModeUndefined: Self = StObject.set(x, "queryParamsMode", js.undefined)
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setRewritePathOnMatch(value: Boolean): Self = StObject.set(x, "rewritePathOnMatch", value.asInstanceOf[js.Any])
      
      inline def setRewritePathOnMatchUndefined: Self = StObject.set(x, "rewritePathOnMatch", js.undefined)
      
      inline def setStrictTrailingSlash(value: Boolean): Self = StObject.set(x, "strictTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setStrictTrailingSlashUndefined: Self = StObject.set(x, "strictTrailingSlash", js.undefined)
      
      inline def setStrongMatching(value: Boolean): Self = StObject.set(x, "strongMatching", value.asInstanceOf[js.Any])
      
      inline def setStrongMatchingUndefined: Self = StObject.set(x, "strongMatching", js.undefined)
      
      inline def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashModeUndefined: Self = StObject.set(x, "trailingSlashMode", js.undefined)
      
      inline def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      inline def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
}
