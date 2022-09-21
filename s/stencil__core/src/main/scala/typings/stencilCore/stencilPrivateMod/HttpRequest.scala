package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.URL
import typings.std.URLSearchParams
import typings.stencilCore.stencilCoreStrings.DELETE
import typings.stencilCore.stencilCoreStrings.GET
import typings.stencilCore.stencilCoreStrings.HEAD
import typings.stencilCore.stencilCoreStrings.OPTIONS
import typings.stencilCore.stencilCoreStrings.POST
import typings.stencilCore.stencilCoreStrings.PUT
import typings.stencilCore.stencilPublicCompilerMod.CompilerFsStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRequest extends StObject {
  
  var acceptHeader: String
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var method: GET | POST | PUT | DELETE | HEAD | OPTIONS
  
  var pathname: js.UndefOr[String] = js.undefined
  
  var searchParams: URLSearchParams
  
  var stats: js.UndefOr[CompilerFsStats] = js.undefined
  
  var url: URL
}
object HttpRequest {
  
  inline def apply(
    acceptHeader: String,
    method: GET | POST | PUT | DELETE | HEAD | OPTIONS,
    searchParams: URLSearchParams,
    url: URL
  ): HttpRequest = {
    val __obj = js.Dynamic.literal(acceptHeader = acceptHeader.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequest]
  }
  
  extension [Self <: HttpRequest](x: Self) {
    
    inline def setAcceptHeader(value: String): Self = StObject.set(x, "acceptHeader", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setMethod(value: GET | POST | PUT | DELETE | HEAD | OPTIONS): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
    
    inline def setSearchParams(value: URLSearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    inline def setStats(value: CompilerFsStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
