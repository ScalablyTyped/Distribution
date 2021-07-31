package typings.sourceMapSupport

import typings.sourceMap.mod.RawSourceMap
import typings.sourceMapSupport.sourceMapSupportStrings.auto
import typings.sourceMapSupport.sourceMapSupportStrings.browser
import typings.sourceMapSupport.sourceMapSupportStrings.node
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("source-map-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getErrorSource(error: Error): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorSource")(error.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def install(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")().asInstanceOf[Unit]
  @scala.inline
  def install(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def mapSourcePosition(position: Position): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("mapSourcePosition")(position.asInstanceOf[js.Any]).asInstanceOf[Position]
  
  @scala.inline
  def resetRetrieveHandlers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetRetrieveHandlers")().asInstanceOf[Unit]
  
  @scala.inline
  def retrieveSourceMap(source: String): UrlAndMap | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("retrieveSourceMap")(source.asInstanceOf[js.Any]).asInstanceOf[UrlAndMap | Null]
  
  @scala.inline
  def wrapCallSite(frame: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapCallSite")(frame.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait Options extends StObject {
    
    var emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.undefined
    
    var environment: js.UndefOr[auto | browser | node] = js.undefined
    
    var handleUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
    
    var hookRequire: js.UndefOr[Boolean] = js.undefined
    
    var overrideRetrieveFile: js.UndefOr[Boolean] = js.undefined
    
    var overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.undefined
    
    var retrieveFile: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
    
    var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ String, UrlAndMap | Null]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmptyCacheBetweenOperations(value: Boolean): Self = StObject.set(x, "emptyCacheBetweenOperations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyCacheBetweenOperationsUndefined: Self = StObject.set(x, "emptyCacheBetweenOperations", js.undefined)
      
      @scala.inline
      def setEnvironment(value: auto | browser | node): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setHandleUncaughtExceptions(value: Boolean): Self = StObject.set(x, "handleUncaughtExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUncaughtExceptionsUndefined: Self = StObject.set(x, "handleUncaughtExceptions", js.undefined)
      
      @scala.inline
      def setHookRequire(value: Boolean): Self = StObject.set(x, "hookRequire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHookRequireUndefined: Self = StObject.set(x, "hookRequire", js.undefined)
      
      @scala.inline
      def setOverrideRetrieveFile(value: Boolean): Self = StObject.set(x, "overrideRetrieveFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideRetrieveFileUndefined: Self = StObject.set(x, "overrideRetrieveFile", js.undefined)
      
      @scala.inline
      def setOverrideRetrieveSourceMap(value: Boolean): Self = StObject.set(x, "overrideRetrieveSourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideRetrieveSourceMapUndefined: Self = StObject.set(x, "overrideRetrieveSourceMap", js.undefined)
      
      @scala.inline
      def setRetrieveFile(value: /* path */ String => String): Self = StObject.set(x, "retrieveFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetrieveFileUndefined: Self = StObject.set(x, "retrieveFile", js.undefined)
      
      @scala.inline
      def setRetrieveSourceMap(value: /* source */ String => UrlAndMap | Null): Self = StObject.set(x, "retrieveSourceMap", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRetrieveSourceMapUndefined: Self = StObject.set(x, "retrieveSourceMap", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var column: Double
    
    var line: Double
    
    var source: String
  }
  object Position {
    
    @scala.inline
    def apply(column: Double, line: Double, source: String): Position = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlAndMap extends StObject {
    
    var map: String | RawSourceMap
    
    var url: String
  }
  object UrlAndMap {
    
    @scala.inline
    def apply(map: String | RawSourceMap, url: String): UrlAndMap = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlAndMap]
    }
    
    @scala.inline
    implicit class UrlAndMapMutableBuilder[Self <: UrlAndMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMap(value: String | RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
