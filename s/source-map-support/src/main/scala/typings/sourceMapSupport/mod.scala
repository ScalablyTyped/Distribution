package typings.sourceMapSupport

import typings.sourceMap.mod.RawSourceMap
import typings.sourceMapSupport.sourceMapSupportStrings.auto
import typings.sourceMapSupport.sourceMapSupportStrings.browser
import typings.sourceMapSupport.sourceMapSupportStrings.node
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("source-map-support", "getErrorSource")
  @js.native
  def getErrorSource(error: Error): String | Null = js.native
  
  @JSImport("source-map-support", "install")
  @js.native
  def install(): Unit = js.native
  @JSImport("source-map-support", "install")
  @js.native
  def install(options: Options): Unit = js.native
  
  @JSImport("source-map-support", "mapSourcePosition")
  @js.native
  def mapSourcePosition(position: Position): Position = js.native
  
  @JSImport("source-map-support", "resetRetrieveHandlers")
  @js.native
  def resetRetrieveHandlers(): Unit = js.native
  
  @JSImport("source-map-support", "retrieveSourceMap")
  @js.native
  def retrieveSourceMap(source: String): UrlAndMap | Null = js.native
  
  @JSImport("source-map-support", "wrapCallSite")
  @js.native
  def wrapCallSite(frame: js.Any): js.Any = js.native
  
  @js.native
  trait Options extends StObject {
    
    var emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.native
    
    var environment: js.UndefOr[auto | browser | node] = js.native
    
    var handleUncaughtExceptions: js.UndefOr[Boolean] = js.native
    
    var hookRequire: js.UndefOr[Boolean] = js.native
    
    var overrideRetrieveFile: js.UndefOr[Boolean] = js.native
    
    var overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.native
    
    var retrieveFile: js.UndefOr[js.Function1[/* path */ String, String]] = js.native
    
    var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ String, UrlAndMap | Null]] = js.native
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
  
  @js.native
  trait Position extends StObject {
    
    var column: Double = js.native
    
    var line: Double = js.native
    
    var source: String = js.native
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
  
  @js.native
  trait UrlAndMap extends StObject {
    
    var map: String | RawSourceMap = js.native
    
    var url: String = js.native
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
