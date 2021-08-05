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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def render(options: Options, callback: js.Function2[/* exception */ SassException, /* result */ Result, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderSync(options: Options): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSync")(options.asInstanceOf[js.Any]).asInstanceOf[Result]
  
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
  
  trait Options extends StObject {
    
    /**
      * A string to pass to compile.
      *
      * It is recommended that you use `includePaths` in conjunction with this so that sass can find files when using the @import directive.
      *
      * @default null
      */
    var data: js.UndefOr[String] = js.undefined
    
    /**
      * Path to a file to compile.
      *
      * @default null
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * Holds a collection of custom functions that may be invoked by the sass files being compiled.
      *
      * @default undefined
      */
    var functions: js.UndefOr[StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]] = js.undefined
    
    /**
      * Handles when the @import directive is encountered.
      *
      * A custom importer allows extension of the sass engine in both a synchronous and asynchronous manner.
      *
      * @default undefined
      */
    var importer: js.UndefOr[Importer | js.Array[Importer]] = js.undefined
    
    /**
      * An array of paths that should be looked in to attempt to resolve your @import declarations.
      * When using `data`, it is recommended that you use this.
      *
      * @default []
      */
    var includePaths: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Used to determine whether to use space or tab character for indentation.
      *
      * @default 'space'
      */
    var indentType: js.UndefOr[space | tab] = js.undefined
    
    /**
      * Used to determine the number of spaces or tabs to be used for indentation.
      *
      * @default 2
      */
    var indentWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable Sass Indented Syntax for parsing the data string or file.
      *
      * @default false
      */
    var indentedSyntax: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to determine which sequence to use for line breaks.
      *
      * @default 'lf'
      */
    var linefeed: js.UndefOr[cr | crlf | lf | lfcr] = js.undefined
    
    /**
      * Disable the inclusion of source map information in the output file.
      *
      * @default false
      */
    var omitSourceMapUrl: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the intended location of the output file.
      * Strongly recommended when outputting source maps so that they can properly refer back to their intended files.
      *
      * @default null
      */
    var outFile: js.UndefOr[String] = js.undefined
    
    /**
      * Determines the output format of the final CSS style.
      *
      * @default 'expanded'
      */
    var outputStyle: js.UndefOr[compressed | expanded] = js.undefined
    
    /**
      * Enables the outputting of a source map.
      *
      * @default undefined
      */
    var sourceMap: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Includes the contents in the source map information.
      *
      * @default false
      */
    var sourceMapContents: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Embeds the source map as a data URI.
      *
      * @default false
      */
    var sourceMapEmbed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value will be emitted as `sourceRoot` in the source map information.
      *
      * @default undefined
      */
    var sourceMapRoot: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFunctions(value: StringDictionary[js.Function1[/* repeated */ SassType, SassType | Unit]]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setImporter(value: Importer | js.Array[Importer]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
      
      inline def setImporterFunction3(
        value: (/* url */ String, /* prev */ String, /* done */ js.Function1[/* data */ ImporterReturnType, Unit]) => ImporterReturnType | Unit
      ): Self = StObject.set(x, "importer", js.Any.fromFunction3(value))
      
      inline def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
      
      inline def setImporterVarargs(value: Importer*): Self = StObject.set(x, "importer", js.Array(value :_*))
      
      inline def setIncludePaths(value: js.Array[String]): Self = StObject.set(x, "includePaths", value.asInstanceOf[js.Any])
      
      inline def setIncludePathsUndefined: Self = StObject.set(x, "includePaths", js.undefined)
      
      inline def setIncludePathsVarargs(value: String*): Self = StObject.set(x, "includePaths", js.Array(value :_*))
      
      inline def setIndentType(value: space | tab): Self = StObject.set(x, "indentType", value.asInstanceOf[js.Any])
      
      inline def setIndentTypeUndefined: Self = StObject.set(x, "indentType", js.undefined)
      
      inline def setIndentWidth(value: Double): Self = StObject.set(x, "indentWidth", value.asInstanceOf[js.Any])
      
      inline def setIndentWidthUndefined: Self = StObject.set(x, "indentWidth", js.undefined)
      
      inline def setIndentedSyntax(value: Boolean): Self = StObject.set(x, "indentedSyntax", value.asInstanceOf[js.Any])
      
      inline def setIndentedSyntaxUndefined: Self = StObject.set(x, "indentedSyntax", js.undefined)
      
      inline def setLinefeed(value: cr | crlf | lf | lfcr): Self = StObject.set(x, "linefeed", value.asInstanceOf[js.Any])
      
      inline def setLinefeedUndefined: Self = StObject.set(x, "linefeed", js.undefined)
      
      inline def setOmitSourceMapUrl(value: Boolean): Self = StObject.set(x, "omitSourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setOmitSourceMapUrlUndefined: Self = StObject.set(x, "omitSourceMapUrl", js.undefined)
      
      inline def setOutFile(value: String): Self = StObject.set(x, "outFile", value.asInstanceOf[js.Any])
      
      inline def setOutFileUndefined: Self = StObject.set(x, "outFile", js.undefined)
      
      inline def setOutputStyle(value: compressed | expanded): Self = StObject.set(x, "outputStyle", value.asInstanceOf[js.Any])
      
      inline def setOutputStyleUndefined: Self = StObject.set(x, "outputStyle", js.undefined)
      
      inline def setSourceMap(value: Boolean | String): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
      
      inline def setSourceMapContents(value: Boolean): Self = StObject.set(x, "sourceMapContents", value.asInstanceOf[js.Any])
      
      inline def setSourceMapContentsUndefined: Self = StObject.set(x, "sourceMapContents", js.undefined)
      
      inline def setSourceMapEmbed(value: Boolean): Self = StObject.set(x, "sourceMapEmbed", value.asInstanceOf[js.Any])
      
      inline def setSourceMapEmbedUndefined: Self = StObject.set(x, "sourceMapEmbed", js.undefined)
      
      inline def setSourceMapRoot(value: String): Self = StObject.set(x, "sourceMapRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceMapRootUndefined: Self = StObject.set(x, "sourceMapRoot", js.undefined)
      
      inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    /**
      * The compiled CSS.
      *
      * Write this to a file, or serve it out as needed.
      */
    var css: Buffer
    
    /**
      * The source map.
      */
    var map: js.UndefOr[Buffer] = js.undefined
    
    var stats: Duration
  }
  object Result {
    
    inline def apply(css: Buffer, stats: Duration): Result = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setCss(value: Buffer): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Buffer): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setStats(value: Duration): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait SassException
    extends StObject
       with Error {
    
    /**
      * The column number of error.
      */
    var column: Double
    
    /**
      * The filename of error.
      *
      * In case file option was not set (in favour of `data`), this will reflect the value `stdin`.
      */
    var file: String
    
    /**
      * The formatted error.
      */
    var formatted: String
    
    /**
      * The line number of error.
      */
    var line: Double
    
    /**
      * The status code.
      */
    var status: Double
  }
  object SassException {
    
    inline def apply(
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
    
    extension [Self <: SassException](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ImporterReturnType extends StObject
  object _ImporterReturnType {
    
    inline def Contents(contents: String): typings.sass.anon.Contents = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sass.anon.Contents]
    }
    
    inline def File(file: String): typings.sass.anon.File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.sass.anon.File]
    }
  }
}
