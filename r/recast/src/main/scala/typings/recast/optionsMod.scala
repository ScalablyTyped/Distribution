package typings.recast

import typings.recast.recastStrings.auto
import typings.recast.recastStrings.double
import typings.recast.recastStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @JSImport("recast/lib/options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def normalize(): NormalizedOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[NormalizedOptions]
  inline def normalize(opts: Options): NormalizedOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(opts.asInstanceOf[js.Any]).asInstanceOf[NormalizedOptions]
  
  trait DeprecatedOptions extends StObject {
    
    /** @deprecated */
    var esprima: js.UndefOr[js.Any] = js.undefined
  }
  object DeprecatedOptions {
    
    inline def apply(): DeprecatedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecatedOptions]
    }
    
    extension [Self <: DeprecatedOptions](x: Self) {
      
      inline def setEsprima(value: js.Any): Self = StObject.set(x, "esprima", value.asInstanceOf[js.Any])
      
      inline def setEsprimaUndefined: Self = StObject.set(x, "esprima", js.undefined)
    }
  }
  
  /* Inlined std.Required<ast-types.ast-types/types.Omit<recast.recast/lib/options.Options, keyof recast.recast/lib/options.DeprecatedOptions>> */
  trait NormalizedOptions extends StObject {
    
    var arrayBracketSpacing: Boolean
    
    var arrowParensAlways: Boolean
    
    var flowObjectCommas: Boolean
    
    var inputSourceMap: String
    
    var lineTerminator: String
    
    var objectCurlySpacing: Boolean
    
    var parser: js.Any
    
    var quote: single | double | auto
    
    var range: Boolean
    
    var reuseWhitespace: Boolean
    
    var sourceFileName: String
    
    var sourceMapName: String
    
    var sourceRoot: String
    
    var tabWidth: Double
    
    var tokens: Boolean
    
    var tolerant: Boolean
    
    var trailingComma: Boolean
    
    var useTabs: Boolean
    
    var wrapColumn: Double
  }
  object NormalizedOptions {
    
    inline def apply(
      arrayBracketSpacing: Boolean,
      arrowParensAlways: Boolean,
      flowObjectCommas: Boolean,
      inputSourceMap: String,
      lineTerminator: String,
      objectCurlySpacing: Boolean,
      parser: js.Any,
      quote: single | double | auto,
      range: Boolean,
      reuseWhitespace: Boolean,
      sourceFileName: String,
      sourceMapName: String,
      sourceRoot: String,
      tabWidth: Double,
      tokens: Boolean,
      tolerant: Boolean,
      trailingComma: Boolean,
      useTabs: Boolean,
      wrapColumn: Double
    ): NormalizedOptions = {
      val __obj = js.Dynamic.literal(arrayBracketSpacing = arrayBracketSpacing.asInstanceOf[js.Any], arrowParensAlways = arrowParensAlways.asInstanceOf[js.Any], flowObjectCommas = flowObjectCommas.asInstanceOf[js.Any], inputSourceMap = inputSourceMap.asInstanceOf[js.Any], lineTerminator = lineTerminator.asInstanceOf[js.Any], objectCurlySpacing = objectCurlySpacing.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], reuseWhitespace = reuseWhitespace.asInstanceOf[js.Any], sourceFileName = sourceFileName.asInstanceOf[js.Any], sourceMapName = sourceMapName.asInstanceOf[js.Any], sourceRoot = sourceRoot.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], tolerant = tolerant.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], wrapColumn = wrapColumn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOptions]
    }
    
    extension [Self <: NormalizedOptions](x: Self) {
      
      inline def setArrayBracketSpacing(value: Boolean): Self = StObject.set(x, "arrayBracketSpacing", value.asInstanceOf[js.Any])
      
      inline def setArrowParensAlways(value: Boolean): Self = StObject.set(x, "arrowParensAlways", value.asInstanceOf[js.Any])
      
      inline def setFlowObjectCommas(value: Boolean): Self = StObject.set(x, "flowObjectCommas", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMap(value: String): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      inline def setLineTerminator(value: String): Self = StObject.set(x, "lineTerminator", value.asInstanceOf[js.Any])
      
      inline def setObjectCurlySpacing(value: Boolean): Self = StObject.set(x, "objectCurlySpacing", value.asInstanceOf[js.Any])
      
      inline def setParser(value: js.Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setQuote(value: single | double | auto): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setReuseWhitespace(value: Boolean): Self = StObject.set(x, "reuseWhitespace", value.asInstanceOf[js.Any])
      
      inline def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      inline def setSourceMapName(value: String): Self = StObject.set(x, "sourceMapName", value.asInstanceOf[js.Any])
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTrailingComma(value: Boolean): Self = StObject.set(x, "trailingComma", value.asInstanceOf[js.Any])
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def setWrapColumn(value: Double): Self = StObject.set(x, "wrapColumn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options
    extends StObject
       with DeprecatedOptions {
    
    /**
      * Controls the printing of spaces inside array brackets.
      * See: http://eslint.org/docs/rules/array-bracket-spacing
      * @default false
      */
    var arrayBracketSpacing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you want parenthesis to wrap single-argument arrow function
      * parameter lists, pass true for this option.
      * @default false
      */
    var arrowParensAlways: js.UndefOr[Boolean] = js.undefined
    
    /**
      * There are 2 supported syntaxes (`,` and `;`) in Flow Object Types;
      * The use of commas is in line with the more popular style and matches
      * how objects are defined in JS, making it a bit more natural to write.
      * @default true
      */
    var flowObjectCommas: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you provide a source map that was generated from a previous call
      * to recast.print as options.inputSourceMap, the old source map will be
      * composed with the new source map.
      * @default null
      */
    var inputSourceMap: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Override this option to use a different line terminator, e.g. \r\n.
      * @default require("os").EOL || "\n"
      */
    var lineTerminator: js.UndefOr[String] = js.undefined
    
    /**
      * Controls the printing of spaces inside object literals,
      * destructuring assignments, and import/export specifiers.
      * See: http://eslint.org/docs/rules/object-curly-spacing
      * @default true
      */
    var objectCurlySpacing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you want to use a different branch of esprima, or any other module
      * that supports a .parse function, pass that module object to
      * recast.parse as options.parser (legacy synonym: options.esprima).
      * @default require("recast/parsers/esprima")
      */
    var parser: js.UndefOr[js.Any] = js.undefined
    
    /**
      * If you want to override the quotes used in string literals, specify
      * either "single", "double", or "auto" here ("auto" will select the one
      * which results in the shorter literal) Otherwise, use double quotes.
      * @default null
      */
    var quote: js.UndefOr[single | double | auto | Null] = js.undefined
    
    /**
      * If you want esprima to generate .range information (recast only uses
      * .loc internally), pass true for this option.
      * @default false
      */
    var range: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The reprinting code leaves leading whitespace untouched unless it has
      * to reindent a line, or you pass false for this option.
      * @default true
      */
    var reuseWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass a string as options.sourceFileName to recast.parse to tell the
      * reprinter to keep track of reused code so that it can construct a
      * source map automatically.
      * @default null
      */
    var sourceFileName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Pass a string as options.sourceMapName to recast.print, and (provided
      * you passed options.sourceFileName earlier) the PrintResult of
      * recast.print will have a .map property for the generated source map.
      * @default null
      */
    var sourceMapName: js.UndefOr[String | Null] = js.undefined
    
    /**
      * If provided, this option will be passed along to the source map
      * generator as a root directory for relative source file paths.
      * @default null
      */
    var sourceRoot: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Number of spaces the pretty-printer should use per tab for
      * indentation. If you do not pass this option explicitly, it will be
      * (quite reliably!) inferred from the original code.
      * @default 4
      */
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to return an array of .tokens on the root AST node.
      * @default true
      */
    var tokens: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you want esprima not to throw exceptions when it encounters
      * non-fatal errors, keep this option true.
      * @default true
      */
    var tolerant: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls the printing of trailing commas in object literals, array
      * expressions and function parameters.
      *
      * This option could either be:
      * * Boolean - enable/disable in all contexts (objects, arrays and function params).
      * * Object - enable/disable per context.
      *
      * Example:
      * trailingComma: {
      *   objects: true,
      *   arrays: true,
      *   parameters: false,
      * }
      *
      * @default false
      */
    var trailingComma: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you really want the pretty-printer to use tabs instead of spaces,
      * make this option true.
      * @default false
      */
    var useTabs: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Some of the pretty-printer code (such as that for printing function
      * parameter lists) makes a valiant attempt to prevent really long
      * lines. You can adjust the limit by changing this option; however,
      * there is no guarantee that line length will fit inside this limit.
      * @default 74
      */
    var wrapColumn: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setArrayBracketSpacing(value: Boolean): Self = StObject.set(x, "arrayBracketSpacing", value.asInstanceOf[js.Any])
      
      inline def setArrayBracketSpacingUndefined: Self = StObject.set(x, "arrayBracketSpacing", js.undefined)
      
      inline def setArrowParensAlways(value: Boolean): Self = StObject.set(x, "arrowParensAlways", value.asInstanceOf[js.Any])
      
      inline def setArrowParensAlwaysUndefined: Self = StObject.set(x, "arrowParensAlways", js.undefined)
      
      inline def setFlowObjectCommas(value: Boolean): Self = StObject.set(x, "flowObjectCommas", value.asInstanceOf[js.Any])
      
      inline def setFlowObjectCommasUndefined: Self = StObject.set(x, "flowObjectCommas", js.undefined)
      
      inline def setInputSourceMap(value: String): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInputSourceMapNull: Self = StObject.set(x, "inputSourceMap", null)
      
      inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
      
      inline def setLineTerminator(value: String): Self = StObject.set(x, "lineTerminator", value.asInstanceOf[js.Any])
      
      inline def setLineTerminatorUndefined: Self = StObject.set(x, "lineTerminator", js.undefined)
      
      inline def setObjectCurlySpacing(value: Boolean): Self = StObject.set(x, "objectCurlySpacing", value.asInstanceOf[js.Any])
      
      inline def setObjectCurlySpacingUndefined: Self = StObject.set(x, "objectCurlySpacing", js.undefined)
      
      inline def setParser(value: js.Any): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      inline def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      inline def setQuote(value: single | double | auto): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      inline def setQuoteNull: Self = StObject.set(x, "quote", null)
      
      inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setReuseWhitespace(value: Boolean): Self = StObject.set(x, "reuseWhitespace", value.asInstanceOf[js.Any])
      
      inline def setReuseWhitespaceUndefined: Self = StObject.set(x, "reuseWhitespace", js.undefined)
      
      inline def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
      
      inline def setSourceFileNameNull: Self = StObject.set(x, "sourceFileName", null)
      
      inline def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
      
      inline def setSourceMapName(value: String): Self = StObject.set(x, "sourceMapName", value.asInstanceOf[js.Any])
      
      inline def setSourceMapNameNull: Self = StObject.set(x, "sourceMapName", null)
      
      inline def setSourceMapNameUndefined: Self = StObject.set(x, "sourceMapName", js.undefined)
      
      inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
      
      inline def setSourceRootNull: Self = StObject.set(x, "sourceRoot", null)
      
      inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
      
      inline def setTrailingComma(value: Boolean): Self = StObject.set(x, "trailingComma", value.asInstanceOf[js.Any])
      
      inline def setTrailingCommaUndefined: Self = StObject.set(x, "trailingComma", js.undefined)
      
      inline def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      inline def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
      
      inline def setWrapColumn(value: Double): Self = StObject.set(x, "wrapColumn", value.asInstanceOf[js.Any])
      
      inline def setWrapColumnUndefined: Self = StObject.set(x, "wrapColumn", js.undefined)
    }
  }
}
