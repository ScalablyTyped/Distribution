package typings.recast

import typings.babelParser.mod.ParserOptions
import typings.babelParser.mod.ParserPlugin
import typings.babelTypes.mod.File_
import typings.recast.recastStrings.auto
import typings.recast.recastStrings.double
import typings.recast.recastStrings.module
import typings.recast.recastStrings.script
import typings.recast.recastStrings.single
import typings.recast.recastStrings.unambiguous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Column extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Column {
    
    @scala.inline
    def apply(column: Double, line: Double): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait End extends StObject {
    
    var end: js.Any
    
    var start: js.Any
  }
  object End {
    
    @scala.inline
    def apply(end: js.Any, start: js.Any): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: String): File_ = js.native
    def apply(input: String, options: ParserOptions): File_ = js.native
  }
  
  trait Line extends StObject {
    
    var column: js.Any
    
    var line: js.Any
  }
  object Line {
    
    @scala.inline
    def apply(column: js.Any, line: js.Any): Line = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    @scala.inline
    implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: js.Any): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: js.Any): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @babel/parser.@babel/parser.ParserOptions & {  plugins :std.Array<@babel/parser.@babel/parser.ParserPlugin>} */
  trait ParserOptionspluginsArray extends StObject {
    
    /**
      * By default, await use is not allowed outside of an async function.
      * Set this to true to accept such code.
      */
    var allowAwaitOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, import and export declarations can only appear at a program's top level.
      * Setting this option to true allows them anywhere where a statement is allowed.
      */
    var allowImportExportEverywhere: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, a return statement at the top level raises an error.
      * Set this to true to accept such code.
      */
    var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.undefined
    
    var allowSuperOutsideMethod: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, exported identifiers must refer to a declared variable.
      * Set this to true to allow export statements to reference undeclared variables.
      */
    var allowUndeclaredExports: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, the parser adds information about parentheses by setting
      * `extra.parenthesized` to `true` as needed.
      * When this option is `true` the parser creates `ParenthesizedExpression`
      * AST nodes instead of using the `extra` property.
      */
    var createParenthesizedExpressions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Array containing the plugins that you want to enable.
      */
    var plugins: js.UndefOr[js.Array[ParserPlugin]] & js.Array[ParserPlugin]
    
    /**
      * Adds a ranges property to each node: [node.start, node.end]
      */
    var ranges: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Correlate output AST nodes with their source filename.
      * Useful when generating code and source maps from the ASTs of multiple input files.
      */
    var sourceFilename: js.UndefOr[String] = js.undefined
    
    /**
      * Indicate the mode the code should be parsed in.
      * Can be one of "script", "module", or "unambiguous". Defaults to "script".
      * "unambiguous" will make @babel/parser attempt to guess, based on the presence
      * of ES6 import or export statements.
      * Files with ES6 imports and exports are considered "module" and are otherwise "script".
      */
    var sourceType: js.UndefOr[script | module | unambiguous] = js.undefined
    
    /**
      * By default, the first line of code parsed is treated as line 1.
      * You can provide a line number to alternatively start with.
      * Useful for integration with other source tools.
      */
    var startLine: js.UndefOr[Double] = js.undefined
    
    /**
      * Should the parser work in strict mode.
      * Defaults to true if sourceType === 'module'. Otherwise, false.
      */
    var strictMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds all parsed tokens to a tokens property on the File node.
      */
    var tokens: js.UndefOr[Boolean] = js.undefined
  }
  object ParserOptionspluginsArray {
    
    @scala.inline
    def apply(plugins: js.UndefOr[js.Array[ParserPlugin]] & js.Array[ParserPlugin]): ParserOptionspluginsArray = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParserOptionspluginsArray]
    }
    
    @scala.inline
    implicit class ParserOptionspluginsArrayMutableBuilder[Self <: ParserOptionspluginsArray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAwaitOutsideFunction(value: Boolean): Self = StObject.set(x, "allowAwaitOutsideFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAwaitOutsideFunctionUndefined: Self = StObject.set(x, "allowAwaitOutsideFunction", js.undefined)
      
      @scala.inline
      def setAllowImportExportEverywhere(value: Boolean): Self = StObject.set(x, "allowImportExportEverywhere", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowImportExportEverywhereUndefined: Self = StObject.set(x, "allowImportExportEverywhere", js.undefined)
      
      @scala.inline
      def setAllowReturnOutsideFunction(value: Boolean): Self = StObject.set(x, "allowReturnOutsideFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReturnOutsideFunctionUndefined: Self = StObject.set(x, "allowReturnOutsideFunction", js.undefined)
      
      @scala.inline
      def setAllowSuperOutsideMethod(value: Boolean): Self = StObject.set(x, "allowSuperOutsideMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSuperOutsideMethodUndefined: Self = StObject.set(x, "allowSuperOutsideMethod", js.undefined)
      
      @scala.inline
      def setAllowUndeclaredExports(value: Boolean): Self = StObject.set(x, "allowUndeclaredExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUndeclaredExportsUndefined: Self = StObject.set(x, "allowUndeclaredExports", js.undefined)
      
      @scala.inline
      def setCreateParenthesizedExpressions(value: Boolean): Self = StObject.set(x, "createParenthesizedExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateParenthesizedExpressionsUndefined: Self = StObject.set(x, "createParenthesizedExpressions", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.UndefOr[js.Array[ParserPlugin]] & js.Array[ParserPlugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRanges(value: Boolean): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
      
      @scala.inline
      def setSourceFilename(value: String): Self = StObject.set(x, "sourceFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFilenameUndefined: Self = StObject.set(x, "sourceFilename", js.undefined)
      
      @scala.inline
      def setSourceType(value: script | module | unambiguous): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
      
      @scala.inline
      def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartLineUndefined: Self = StObject.set(x, "startLine", js.undefined)
      
      @scala.inline
      def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictModeUndefined: Self = StObject.set(x, "strictMode", js.undefined)
      
      @scala.inline
      def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  /* Inlined std.Partial<recast.recast/lib/options.Options> */
  trait PartialOptions extends StObject {
    
    var arrayBracketSpacing: js.UndefOr[Boolean] = js.undefined
    
    var arrowParensAlways: js.UndefOr[Boolean] = js.undefined
    
    var esprima: js.UndefOr[js.Any] = js.undefined
    
    var flowObjectCommas: js.UndefOr[Boolean] = js.undefined
    
    var inputSourceMap: js.UndefOr[String | Null] = js.undefined
    
    var lineTerminator: js.UndefOr[String] = js.undefined
    
    var objectCurlySpacing: js.UndefOr[Boolean] = js.undefined
    
    var parser: js.UndefOr[js.Any] = js.undefined
    
    var quote: js.UndefOr[single | double | auto | Null] = js.undefined
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var reuseWhitespace: js.UndefOr[Boolean] = js.undefined
    
    var sourceFileName: js.UndefOr[String | Null] = js.undefined
    
    var sourceMapName: js.UndefOr[String | Null] = js.undefined
    
    var sourceRoot: js.UndefOr[String | Null] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    var tokens: js.UndefOr[Boolean] = js.undefined
    
    var tolerant: js.UndefOr[Boolean] = js.undefined
    
    var trailingComma: js.UndefOr[Boolean] = js.undefined
    
    var useTabs: js.UndefOr[Boolean] = js.undefined
    
    var wrapColumn: js.UndefOr[Double] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrayBracketSpacing(value: Boolean): Self = StObject.set(x, "arrayBracketSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrayBracketSpacingUndefined: Self = StObject.set(x, "arrayBracketSpacing", js.undefined)
      
      @scala.inline
      def setArrowParensAlways(value: Boolean): Self = StObject.set(x, "arrowParensAlways", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowParensAlwaysUndefined: Self = StObject.set(x, "arrowParensAlways", js.undefined)
      
      @scala.inline
      def setEsprima(value: js.Any): Self = StObject.set(x, "esprima", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsprimaUndefined: Self = StObject.set(x, "esprima", js.undefined)
      
      @scala.inline
      def setFlowObjectCommas(value: Boolean): Self = StObject.set(x, "flowObjectCommas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowObjectCommasUndefined: Self = StObject.set(x, "flowObjectCommas", js.undefined)
      
      @scala.inline
      def setInputSourceMap(value: String): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSourceMapNull: Self = StObject.set(x, "inputSourceMap", null)
      
      @scala.inline
      def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      @scala.inline
      def setLineTerminator(value: String): Self = StObject.set(x, "lineTerminator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineTerminatorUndefined: Self = StObject.set(x, "lineTerminator", js.undefined)
      
      @scala.inline
      def setObjectCurlySpacing(value: Boolean): Self = StObject.set(x, "objectCurlySpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectCurlySpacingUndefined: Self = StObject.set(x, "objectCurlySpacing", js.undefined)
      
      @scala.inline
      def setParser(value: js.Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setQuote(value: single | double | auto): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteNull: Self = StObject.set(x, "quote", null)
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setReuseWhitespace(value: Boolean): Self = StObject.set(x, "reuseWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReuseWhitespaceUndefined: Self = StObject.set(x, "reuseWhitespace", js.undefined)
      
      @scala.inline
      def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceFileNameNull: Self = StObject.set(x, "sourceFileName", null)
      
      @scala.inline
      def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      @scala.inline
      def setSourceMapName(value: String): Self = StObject.set(x, "sourceMapName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceMapNameNull: Self = StObject.set(x, "sourceMapName", null)
      
      @scala.inline
      def setSourceMapNameUndefined: Self = StObject.set(x, "sourceMapName", js.undefined)
      
      @scala.inline
      def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
      
      @scala.inline
      def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      @scala.inline
      def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      @scala.inline
      def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      @scala.inline
      def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
      
      @scala.inline
      def setTrailingComma(value: Boolean): Self = StObject.set(x, "trailingComma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingCommaUndefined: Self = StObject.set(x, "trailingComma", js.undefined)
      
      @scala.inline
      def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
      
      @scala.inline
      def setWrapColumn(value: Double): Self = StObject.set(x, "wrapColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapColumnUndefined: Self = StObject.set(x, "wrapColumn", js.undefined)
    }
  }
}
