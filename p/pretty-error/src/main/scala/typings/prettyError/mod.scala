package typings.prettyError

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pretty-error", JSImport.Namespace)
  @js.native
  class ^ () extends PrettyError
  
  @JSImport("pretty-error", "ParsedError")
  @js.native
  class ParsedError protected () extends StObject {
    def this(error: Error) = this()
  }
  
  @JSImport("pretty-error", "start")
  @js.native
  def start(): js.Any = js.native
  
  @JSImport("pretty-error", "stop")
  @js.native
  def stop(): js.Any = js.native
  
  @js.native
  trait Callback extends StObject {
    
    var lineNumber: Double = js.native
    
    var traceLine: js.Object | js.Any = js.native
  }
  object Callback {
    
    @scala.inline
    def apply(lineNumber: Double, traceLine: js.Object | js.Any): Callback = {
      val __obj = js.Dynamic.literal(lineNumber = lineNumber.asInstanceOf[js.Any], traceLine = traceLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceLine(value: js.Object | js.Any): Self = StObject.set(x, "traceLine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfigObject extends StObject {
    
    var aliases: js.UndefOr[Boolean | js.Object] = js.native
    
    // assuming this is optional
    var filters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
    
    var maxItems: js.UndefOr[Double] = js.native
    
    var parsedErrorFilters: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
    
    var skip: js.UndefOr[Boolean | Callback | js.Array[Callback]] = js.native
    
    var skipNodeFiles: js.UndefOr[Boolean | js.Any] = js.native
    
    var skipPackages: js.UndefOr[Boolean | js.Array[String]] = js.native
    
    var skipPaths: js.UndefOr[Boolean | js.Array[String]] = js.native
  }
  object ConfigObject {
    
    @scala.inline
    def apply(): ConfigObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigObject]
    }
    
    @scala.inline
    implicit class ConfigObjectMutableBuilder[Self <: ConfigObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: Boolean | js.Object): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      @scala.inline
      def setFilters(value: Boolean | Callback | js.Array[Callback]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: Callback*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setMaxItems(value: Double): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
      
      @scala.inline
      def setParsedErrorFilters(value: Boolean | Callback | js.Array[Callback]): Self = StObject.set(x, "parsedErrorFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParsedErrorFiltersUndefined: Self = StObject.set(x, "parsedErrorFilters", js.undefined)
      
      @scala.inline
      def setParsedErrorFiltersVarargs(value: Callback*): Self = StObject.set(x, "parsedErrorFilters", js.Array(value :_*))
      
      @scala.inline
      def setSkip(value: Boolean | Callback | js.Array[Callback]): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipNodeFiles(value: Boolean | js.Any): Self = StObject.set(x, "skipNodeFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipNodeFilesUndefined: Self = StObject.set(x, "skipNodeFiles", js.undefined)
      
      @scala.inline
      def setSkipPackages(value: Boolean | js.Array[String]): Self = StObject.set(x, "skipPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPackagesUndefined: Self = StObject.set(x, "skipPackages", js.undefined)
      
      @scala.inline
      def setSkipPackagesVarargs(value: String*): Self = StObject.set(x, "skipPackages", js.Array(value :_*))
      
      @scala.inline
      def setSkipPaths(value: Boolean | js.Array[String]): Self = StObject.set(x, "skipPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipPathsUndefined: Self = StObject.set(x, "skipPaths", js.undefined)
      
      @scala.inline
      def setSkipPathsVarargs(value: String*): Self = StObject.set(x, "skipPaths", js.Array(value :_*))
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setSkipVarargs(value: Callback*): Self = StObject.set(x, "skip", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PrettyError extends StObject {
    
    def alias(stringOrRx: String, alias: String): PrettyError = js.native
    
    def appendStyle(toAppend: js.Object): PrettyError = js.native
    
    def config(configObject: ConfigObject): PrettyError = js.native
    
    def filter(callbacks: Callback): PrettyError = js.native
    
    def filterParsedError(callbacks: Callback): PrettyError = js.native
    
    def getObject(e: js.Object): js.Object = js.native
    
    def removeAlias(stringOrRx: String): PrettyError = js.native
    
    def removeAllAliases(): PrettyError = js.native
    
    def removeAllFilters(): PrettyError = js.native
    
    def removeAllParsedErrorFilters(): PrettyError = js.native
    
    def removeFilter(callbacks: Callback): PrettyError = js.native
    
    def removeParsedErrorFilter(callbacks: Callback): PrettyError = js.native
    
    def render(e: ParsedError): String = js.native
    def render(e: ParsedError, logIt: js.UndefOr[scala.Nothing], useColors: Boolean): String = js.native
    def render(e: ParsedError, logIt: Boolean): String = js.native
    def render(e: ParsedError, logIt: Boolean, useColors: Boolean): String = js.native
    
    def setMaxItems(maxItems: Double): PrettyError = js.native
    
    def skip(callbacks: Callback): PrettyError = js.native
    
    def skipNodeFiles(): js.Any = js.native
    
    def skipPackage(packages: String*): PrettyError = js.native
    
    def skipPath(paths: String*): PrettyError = js.native
    
    def start(): PrettyError = js.native
    
    def stop(): js.Any = js.native
    
    def unskip(callbacks: Callback): PrettyError = js.native
    
    def unskipAll(): PrettyError = js.native
    
    def unskipAllPackages(): PrettyError = js.native
    
    def unskipAllPaths(): PrettyError = js.native
    
    def unskipNodeFiles(): js.Any = js.native
    
    def unskipPackage(packages: String*): PrettyError = js.native
    
    def unskipPath(paths: String*): PrettyError = js.native
    
    def withColors(): PrettyError = js.native
    
    def withoutColors(): PrettyError = js.native
  }
}
