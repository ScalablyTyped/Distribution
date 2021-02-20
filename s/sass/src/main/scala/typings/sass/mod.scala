package typings.sass

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.sass.anon.Duration
import typings.sass.mod.types.SassType
import typings.sass.sassBooleans.`false`
import typings.sass.sassBooleans.`true`
import typings.sass.sassStrings.compressed
import typings.sass.sassStrings.cr
import typings.sass.sassStrings.crlf
import typings.sass.sassStrings.expanded
import typings.sass.sassStrings.lf
import typings.sass.sassStrings.lfcr
import typings.sass.sassStrings.space
import typings.sass.sassStrings.tab
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sass", "render")
  @js.native
  def render(options: Options, callback: js.Function2[/* exception */ SassException, /* result */ Result, Unit]): Unit = js.native
  
  @JSImport("sass", "renderSync")
  @js.native
  def renderSync(options: Options): Result = js.native
  
  object types {
    
    @JSImport("sass", "types.Boolean")
    @js.native
    class Boolean[T /* <: scala.Boolean */] protected () extends SassType {
      def this(value: T) = this()
      
      def getValue(): T = js.native
    }
    object Boolean {
      
      /* static member */
      @JSImport("sass", "types.Boolean.FALSE")
      @js.native
      val FALSE: Boolean[`false`] = js.native
      
      /* static member */
      @JSImport("sass", "types.Boolean.TRUE")
      @js.native
      val TRUE: Boolean[`true`] = js.native
    }
    
    @JSImport("sass", "types.Color")
    @js.native
    class Color protected () extends SassType {
      def this(r: Double, g: Double, b: Double) = this()
      def this(r: Double, g: Double, b: Double, a: Double) = this()
      
      def getA(): Double = js.native
      
      def getB(): Double = js.native
      
      def getG(): Double = js.native
      
      def getR(): Double = js.native
      
      def setA(value: Double): Unit = js.native
      
      def setB(value: Double): Unit = js.native
      
      def setG(value: Double): Unit = js.native
      
      def setR(value: Double): Unit = js.native
    }
    
    @JSImport("sass", "types.List")
    @js.native
    class List[T /* <: SassType */] protected () extends SassType {
      def this(length: Double) = this()
      def this(length: Double, commaSeparator: scala.Boolean) = this()
      
      def getLength(): Double = js.native
      
      def getSeparator(): scala.Boolean = js.native
      
      def getValue(index: Double): js.UndefOr[T] = js.native
      
      def setSeparator(isComma: scala.Boolean): Unit = js.native
      
      def setValue(index: Double, value: T): Unit = js.native
    }
    
    @JSImport("sass", "types.Map")
    @js.native
    class Map[K /* <: SassType */, V /* <: SassType */] protected () extends SassType {
      def this(length: Double) = this()
      
      def getKey(index: Double): K = js.native
      
      def getLength(): Double = js.native
      
      def getValue(index: Double): V = js.native
      
      def setKey(index: Double, key: K): Unit = js.native
      
      def setValue(index: Double, value: V): Unit = js.native
    }
    
    @js.native
    trait Null extends SassType {
      
      var NULL: typings.sass.mod.types.Null = js.native
    }
    @JSImport("sass", "types.Null")
    @js.native
    val Null: typings.sass.mod.types.Null = js.native
    
    @JSImport("sass", "types.Number")
    @js.native
    class Number protected () extends SassType {
      def this(value: Double) = this()
      def this(value: Double, unit: java.lang.String) = this()
      
      def getUnit(): java.lang.String = js.native
      
      def getValue(): Double = js.native
      
      def setUnit(unit: java.lang.String): Unit = js.native
      
      def setValue(value: Double): Unit = js.native
    }
    
    @JSImport("sass", "types.SassType")
    @js.native
    abstract class SassType () extends StObject
    
    @JSImport("sass", "types.String")
    @js.native
    class String protected () extends SassType {
      def this(value: java.lang.String) = this()
      
      def getValue(): java.lang.String = js.native
      
      def setValue(value: java.lang.String): Unit = js.native
    }
  }
  
  type Importer = js.Function3[
    /* url */ String, 
    /* prev */ String, 
    /* done */ js.Function1[/* data */ ImporterReturnType, Unit], 
    ImporterReturnType | Unit
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sass.anon.File
    - typings.sass.anon.Contents
    - typings.std.Error
    - scala.Null
  */
  type ImporterReturnType = _ImporterReturnType | Error | Null
  
  @js.native
  trait Options extends StObject {
    
    /**
      * A string to pass to compile.
      *
      * It is recommended that you use `includePaths` in conjunction with this so that sass can find files when using the @import directive.
      *
      * @default null
      */
    var data: js.UndefOr[String] = js.native
    
    /**
      * Path to a file to compile.
      *
      * @default null
      */
    var file: js.UndefOr[String] = js.native
    
    /**
      * Holds a collection of custom functions that may be invoked by the sass files being compiled.
      *
      * @default undefined
      */
    var functions: js.UndefOr[StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]] = js.native
    
    /**
      * Handles when the @import directive is encountered.
      *
      * A custom importer allows extension of the sass engine in both a synchronous and asynchronous manner.
      *
      * @default undefined
      */
    var importer: js.UndefOr[Importer | js.Array[Importer]] = js.native
    
    /**
      * An array of paths that should be looked in to attempt to resolve your @import declarations.
      * When using `data`, it is recommended that you use this.
      *
      * @default []
      */
    var includePaths: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Used to determine whether to use space or tab character for indentation.
      *
      * @default 'space'
      */
    var indentType: js.UndefOr[space | tab] = js.native
    
    /**
      * Used to determine the number of spaces or tabs to be used for indentation.
      *
      * @default 2
      */
    var indentWidth: js.UndefOr[Double] = js.native
    
    /**
      * Enable Sass Indented Syntax for parsing the data string or file.
      *
      * @default false
      */
    var indentedSyntax: js.UndefOr[Boolean] = js.native
    
    /**
      * Used to determine which sequence to use for line breaks.
      *
      * @default 'lf'
      */
    var linefeed: js.UndefOr[cr | crlf | lf | lfcr] = js.native
    
    /**
      * Disable the inclusion of source map information in the output file.
      *
      * @default false
      */
    var omitSourceMapUrl: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify the intended location of the output file.
      * Strongly recommended when outputting source maps so that they can properly refer back to their intended files.
      *
      * @default null
      */
    var outFile: js.UndefOr[String] = js.native
    
    /**
      * Determines the output format of the final CSS style.
      *
      * @default 'expanded'
      */
    var outputStyle: js.UndefOr[compressed | expanded] = js.native
    
    /**
      * Enables the outputting of a source map.
      *
      * @default undefined
      */
    var sourceMap: js.UndefOr[Boolean | String] = js.native
    
    /**
      * Includes the contents in the source map information.
      *
      * @default false
      */
    var sourceMapContents: js.UndefOr[Boolean] = js.native
    
    /**
      * Embeds the source map as a data URI.
      *
      * @default false
      */
    var sourceMapEmbed: js.UndefOr[Boolean] = js.native
    
    /**
      * The value will be emitted as `sourceRoot` in the source map information.
      *
      * @default undefined
      */
    var sourceMapRoot: js.UndefOr[String] = js.native
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
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFunctions(value: StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      @scala.inline
      def setImporter(value: Importer | js.Array[Importer]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImporterFunction3(
        value: (/* url */ String, /* prev */ String, /* done */ js.Function1[/* data */ ImporterReturnType, Unit]) => ImporterReturnType | Unit
      ): Self = StObject.set(x, "importer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
      
      @scala.inline
      def setImporterVarargs(value: Importer*): Self = StObject.set(x, "importer", js.Array(value :_*))
      
      @scala.inline
      def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      @scala.inline
      def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
      
      @scala.inline
      def setIndentType(value: space | tab): Self = StObject.set(x, "indentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentTypeUndefined: Self = StObject.set(x, "indentType", js.undefined)
      
      @scala.inline
      def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      @scala.inline
      def setIndentedSyntax(value: Boolean): Self = StObject.set(x, "indentedSyntax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentedSyntaxUndefined: Self = StObject.set(x, "indentedSyntax", js.undefined)
      
      @scala.inline
      def setLinefeed(value: cr | crlf | lf | lfcr): Self = StObject.set(x, "linefeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinefeedUndefined: Self = StObject.set(x, "linefeed", js.undefined)
      
      @scala.inline
      def setOmitSourceMapUrl(value: Boolean): Self = StObject.set(x, "omitSourceMapUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOmitSourceMapUrlUndefined: Self = StObject.set(x, "omitSourceMapUrl", js.undefined)
      
      @scala.inline
      def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      @scala.inline
      def setOutputStyle(value: compressed | expanded): Self = StObject.set(x, "outputStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputStyleUndefined: Self = StObject.set(x, "outputStyle", js.undefined)
      
      @scala.inline
      def setSourceMap(value: Boolean | String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapContents(value: Boolean): Self = StObject.set(x, "sourceMapContents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapContentsUndefined: Self = StObject.set(x, "sourceMapContents", js.undefined)
      
      @scala.inline
      def setSourceMapEmbed(value: Boolean): Self = StObject.set(x, "sourceMapEmbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapEmbedUndefined: Self = StObject.set(x, "sourceMapEmbed", js.undefined)
      
      @scala.inline
      def setSourceMapRoot(value: String): Self = StObject.set(x, "sourceMapRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapRootUndefined: Self = StObject.set(x, "sourceMapRoot", js.undefined)
      
      @scala.inline
      def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    /**
      * The compiled CSS.
      *
      * Write this to a file, or serve it out as needed.
      */
    var css: Buffer = js.native
    
    /**
      * The source map.
      */
    var map: js.UndefOr[Buffer] = js.native
    
    var stats: Duration = js.native
  }
  object Result {
    
    @scala.inline
    def apply(css: Buffer, stats: Duration): Result = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCss(value: Buffer): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: Buffer): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      @scala.inline
      def setStats(value: Duration): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SassException extends Error {
    
    /**
      * The column number of error.
      */
    var column: Double = js.native
    
    /**
      * The filename of error.
      *
      * In case file option was not set (in favour of `data`), this will reflect the value `stdin`.
      */
    var file: String = js.native
    
    /**
      * The formatted error.
      */
    var formatted: String = js.native
    
    /**
      * The line number of error.
      */
    var line: Double = js.native
    
    /**
      * The status code.
      */
    var status: Double = js.native
  }
  object SassException {
    
    @scala.inline
    def apply(
      column: Double,
      file: String,
      formatted: String,
      line: Double,
      message: String,
      name: String,
      status: Double
    ): SassException = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[SassException]
    }
    
    @scala.inline
    implicit class SassExceptionMutableBuilder[Self <: SassException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ImporterReturnType extends StObject
  object _ImporterReturnType {
    
    @scala.inline
    def Contents(contents: String): typings.sass.anon.Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sass.anon.Contents]
    }
    
    @scala.inline
    def File(file: String): typings.sass.anon.File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sass.anon.File]
    }
  }
}
