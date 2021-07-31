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
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value :_*))
    }
  }
  
  trait Data[TResponse] extends StObject {
    
    var data: TResponse
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply[TResponse](data: TResponse): Data[TResponse] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[TResponse]]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data[?], TResponse] (val x: Self & Data[TResponse]) extends AnyVal {
      
      @scala.inline
      def setData(value: TResponse): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
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
    
    @scala.inline
    def apply(): Default = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
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
    
    @scala.inline
    def apply(path: String): Headers = {
      val __obj = js.Dynamic.literal(method = "GET", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryString(value: js.Object): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringUndefined: Self = StObject.set(x, "queryString", js.undefined)
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait Method[TPayload] extends StObject {
    
    var data: TPayload
    
    var method: POST
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object Method {
    
    @scala.inline
    def apply[TPayload](data: TPayload, path: String): Method[TPayload] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = "POST", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method[TPayload]]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method[?], TPayload] (val x: Self & Method[TPayload]) extends AnyVal {
      
      @scala.inline
      def setData(value: TPayload): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait MethodPath extends StObject {
    
    var method: DELETE
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object MethodPath {
    
    @scala.inline
    def apply(path: String): MethodPath = {
      val __obj = js.Dynamic.literal(method = "DELETE", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodPath]
    }
    
    @scala.inline
    implicit class MethodPathMutableBuilder[Self <: MethodPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: DELETE): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait MethodPathRegex extends StObject {
    
    var method: PATCH
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object MethodPathRegex {
    
    @scala.inline
    def apply(path: String): MethodPathRegex = {
      val __obj = js.Dynamic.literal(method = "PATCH", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MethodPathRegex]
    }
    
    @scala.inline
    implicit class MethodPathRegexMutableBuilder[Self <: MethodPathRegex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
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
    
    @scala.inline
    def apply(): Mocks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mocks]
    }
    
    @scala.inline
    implicit class MocksMutableBuilder[Self <: Mocks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMocks(value: Default): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMocksUndefined: Self = StObject.set(x, "mocks", js.undefined)
      
      @scala.inline
      def setPlugins(value: `0`): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setProtractorConfig(value: String): Self = StObject.set(x, "protractorConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtractorConfigUndefined: Self = StObject.set(x, "protractorConfig", js.undefined)
      
      @scala.inline
      def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    var method: POST
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object Path {
    
    @scala.inline
    def apply(path: String): Path = {
      val __obj = js.Dynamic.literal(method = "POST", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: POST): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait PathRegex extends StObject {
    
    var method: PUT
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object PathRegex {
    
    @scala.inline
    def apply(path: String): PathRegex = {
      val __obj = js.Dynamic.literal(method = "PUT", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathRegex]
    }
    
    @scala.inline
    implicit class PathRegexMutableBuilder[Self <: PathRegex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: PUT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait PathString extends StObject {
    
    var method: JSONP
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object PathString {
    
    @scala.inline
    def apply(path: String): PathString = {
      val __obj = js.Dynamic.literal(method = "JSONP", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathString]
    }
    
    @scala.inline
    implicit class PathStringMutableBuilder[Self <: PathString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: JSONP): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
  
  trait Regex extends StObject {
    
    var method: HEAD
    
    var path: String
    
    var regex: js.UndefOr[Boolean] = js.undefined
  }
  object Regex {
    
    @scala.inline
    def apply(path: String): Regex = {
      val __obj = js.Dynamic.literal(method = "HEAD", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Regex]
    }
    
    @scala.inline
    implicit class RegexMutableBuilder[Self <: Regex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: HEAD): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    }
  }
}
