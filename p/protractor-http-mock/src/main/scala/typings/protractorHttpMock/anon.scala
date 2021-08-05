package typings.protractorHttpMock

import typings.protractorHttpMock.protractorHttpMockStrings.DELETE
import typings.protractorHttpMock.protractorHttpMockStrings.GET
import typings.protractorHttpMock.protractorHttpMockStrings.HEAD
import typings.protractorHttpMock.protractorHttpMockStrings.JSONP
import typings.protractorHttpMock.protractorHttpMockStrings.PATCH
import typings.protractorHttpMock.protractorHttpMockStrings.POST
import typings.protractorHttpMock.protractorHttpMockStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    /**
      * Collection of default plugins to load for every test.
      * Default: []
      */
    var default: js.UndefOr[js.Array[String]] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value :_*))
    }
  }
  
  trait Data[TResponse] extends StObject {
    
    var data: TResponse
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object Data {
    
    inline def apply[TResponse](data: TResponse): Data[TResponse] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[TResponse]]
    }
    
    extension [Self <: Data[?], TResponse](x: Self & Data[TResponse]) {
      
      inline def setData(value: TResponse): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait Default extends StObject {
    
    /**
      * Collection of default mocks to load for every test.
      * Default: []
      */
    var default: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Name of the folder where mocks will reside.
      * Default: 'mocks'
      */
    var dir: js.UndefOr[String] = js.undefined
  }
  object Default {
    
    inline def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value :_*))
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var method: GET
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var path: String
    
    var queryString: js.UndefOr[js.Object] = js.undefined
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object Headers {
    
    inline def apply(path: String): Headers = {
      val __obj = js.Dynamic.literal(method = "GET", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setQueryString(value: js.Object): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait Method[TPayload] extends StObject {
    
    var data: TPayload
    
    var method: POST
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object Method {
    
    inline def apply[TPayload](data: TPayload, path: String): Method[TPayload] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = "POST", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method[TPayload]]
    }
    
    extension [Self <: Method[?], TPayload](x: Self & Method[TPayload]) {
      
      inline def setData(value: TPayload): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait MethodPath extends StObject {
    
    var method: DELETE
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object MethodPath {
    
    inline def apply(path: String): MethodPath = {
      val __obj = js.Dynamic.literal(method = "DELETE", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodPath]
    }
    
    extension [Self <: MethodPath](x: Self) {
      
      inline def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait MethodPathRegex extends StObject {
    
    var method: PATCH
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object MethodPathRegex {
    
    inline def apply(path: String): MethodPathRegex = {
      val __obj = js.Dynamic.literal(method = "PATCH", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodPathRegex]
    }
    
    extension [Self <: MethodPathRegex](x: Self) {
      
      inline def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait Mocks extends StObject {
    
    var mocks: js.UndefOr[Default] = js.undefined
    
    var plugins: js.UndefOr[`0`] = js.undefined
    
    /**
      * Path to protractor configuration file.
      * Default: protractor-conf.js
      */
    var protractorConfig: js.UndefOr[String] = js.undefined
    
    /**
      * Mocks directory where mock files are located.
      * Default: process.cwd()
      */
    var rootDirectory: js.UndefOr[String] = js.undefined
  }
  object Mocks {
    
    inline def apply(): Mocks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mocks]
    }
    
    extension [Self <: Mocks](x: Self) {
      
      inline def setMocks(value: Default): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      inline def setMocksUndefined: Self = StObject.set(x, "mocks", js.undefined)
      
      inline def setPlugins(value: `0`): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setProtractorConfig(value: String): Self = StObject.set(x, "protractorConfig", value.asInstanceOf[js.Any])
      
      inline def setProtractorConfigUndefined: Self = StObject.set(x, "protractorConfig", js.undefined)
      
      inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      inline def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var method: POST
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object Path {
    
    inline def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(method = "POST", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait PathRegex extends StObject {
    
    var method: PUT
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object PathRegex {
    
    inline def apply(path: String): PathRegex = {
      val __obj = js.Dynamic.literal(method = "PUT", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathRegex]
    }
    
    extension [Self <: PathRegex](x: Self) {
      
      inline def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait PathString extends StObject {
    
    var method: JSONP
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object PathString {
    
    inline def apply(path: String): PathString = {
      val __obj = js.Dynamic.literal(method = "JSONP", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathString]
    }
    
    extension [Self <: PathString](x: Self) {
      
      inline def setMethod(value: JSONP): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait Regex extends StObject {
    
    var method: HEAD
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object Regex {
    
    inline def apply(path: String): Regex = {
      val __obj = js.Dynamic.literal(method = "HEAD", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Regex]
    }
    
    extension [Self <: Regex](x: Self) {
      
      inline def setMethod(value: HEAD): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
}
