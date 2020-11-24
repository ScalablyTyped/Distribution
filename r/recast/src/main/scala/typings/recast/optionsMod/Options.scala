package typings.recast.optionsMod

import typings.recast.recastStrings.auto
import typings.recast.recastStrings.double
import typings.recast.recastStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends DeprecatedOptions {
  
  /**
    * Controls the printing of spaces inside array brackets.
    * See: http://eslint.org/docs/rules/array-bracket-spacing
    * @default false
    */
  var arrayBracketSpacing: js.UndefOr[Boolean] = js.native
  
  /**
    * If you want parenthesis to wrap single-argument arrow function
    * parameter lists, pass true for this option.
    * @default false
    */
  var arrowParensAlways: js.UndefOr[Boolean] = js.native
  
  /**
    * There are 2 supported syntaxes (`,` and `;`) in Flow Object Types;
    * The use of commas is in line with the more popular style and matches
    * how objects are defined in JS, making it a bit more natural to write.
    * @default true
    */
  var flowObjectCommas: js.UndefOr[Boolean] = js.native
  
  /**
    * If you provide a source map that was generated from a previous call
    * to recast.print as options.inputSourceMap, the old source map will be
    * composed with the new source map.
    * @default null
    */
  var inputSourceMap: js.UndefOr[String | Null] = js.native
  
  /**
    * Override this option to use a different line terminator, e.g. \r\n.
    * @default require("os").EOL || "\n"
    */
  var lineTerminator: js.UndefOr[String] = js.native
  
  /**
    * Controls the printing of spaces inside object literals,
    * destructuring assignments, and import/export specifiers.
    * See: http://eslint.org/docs/rules/object-curly-spacing
    * @default true
    */
  var objectCurlySpacing: js.UndefOr[Boolean] = js.native
  
  /**
    * If you want to use a different branch of esprima, or any other module
    * that supports a .parse function, pass that module object to
    * recast.parse as options.parser (legacy synonym: options.esprima).
    * @default require("recast/parsers/esprima")
    */
  var parser: js.UndefOr[js.Any] = js.native
  
  /**
    * If you want to override the quotes used in string literals, specify
    * either "single", "double", or "auto" here ("auto" will select the one
    * which results in the shorter literal) Otherwise, use double quotes.
    * @default null
    */
  var quote: js.UndefOr[single | double | auto | Null] = js.native
  
  /**
    * If you want esprima to generate .range information (recast only uses
    * .loc internally), pass true for this option.
    * @default false
    */
  var range: js.UndefOr[Boolean] = js.native
  
  /**
    * The reprinting code leaves leading whitespace untouched unless it has
    * to reindent a line, or you pass false for this option.
    * @default true
    */
  var reuseWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * Pass a string as options.sourceFileName to recast.parse to tell the
    * reprinter to keep track of reused code so that it can construct a
    * source map automatically.
    * @default null
    */
  var sourceFileName: js.UndefOr[String | Null] = js.native
  
  /**
    * Pass a string as options.sourceMapName to recast.print, and (provided
    * you passed options.sourceFileName earlier) the PrintResult of
    * recast.print will have a .map property for the generated source map.
    * @default null
    */
  var sourceMapName: js.UndefOr[String | Null] = js.native
  
  /**
    * If provided, this option will be passed along to the source map
    * generator as a root directory for relative source file paths.
    * @default null
    */
  var sourceRoot: js.UndefOr[String | Null] = js.native
  
  /**
    * Number of spaces the pretty-printer should use per tab for
    * indentation. If you do not pass this option explicitly, it will be
    * (quite reliably!) inferred from the original code.
    * @default 4
    */
  var tabWidth: js.UndefOr[Double] = js.native
  
  /**
    * Whether to return an array of .tokens on the root AST node.
    * @default true
    */
  var tokens: js.UndefOr[Boolean] = js.native
  
  /**
    * If you want esprima not to throw exceptions when it encounters
    * non-fatal errors, keep this option true.
    * @default true
    */
  var tolerant: js.UndefOr[Boolean] = js.native
  
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
  var trailingComma: js.UndefOr[Boolean] = js.native
  
  /**
    * If you really want the pretty-printer to use tabs instead of spaces,
    * make this option true.
    * @default false
    */
  var useTabs: js.UndefOr[Boolean] = js.native
  
  /**
    * Some of the pretty-printer code (such as that for printing function
    * parameter lists) makes a valiant attempt to prevent really long
    * lines. You can adjust the limit by changing this option; however,
    * there is no guarantee that line length will fit inside this limit.
    * @default 74
    */
  var wrapColumn: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrayBracketSpacing(value: Boolean): Self = this.set("arrayBracketSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrayBracketSpacing: Self = this.set("arrayBracketSpacing", js.undefined)
    
    @scala.inline
    def setArrowParensAlways(value: Boolean): Self = this.set("arrowParensAlways", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowParensAlways: Self = this.set("arrowParensAlways", js.undefined)
    
    @scala.inline
    def setFlowObjectCommas(value: Boolean): Self = this.set("flowObjectCommas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowObjectCommas: Self = this.set("flowObjectCommas", js.undefined)
    
    @scala.inline
    def setInputSourceMap(value: String): Self = this.set("inputSourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputSourceMap: Self = this.set("inputSourceMap", js.undefined)
    
    @scala.inline
    def setInputSourceMapNull: Self = this.set("inputSourceMap", null)
    
    @scala.inline
    def setLineTerminator(value: String): Self = this.set("lineTerminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineTerminator: Self = this.set("lineTerminator", js.undefined)
    
    @scala.inline
    def setObjectCurlySpacing(value: Boolean): Self = this.set("objectCurlySpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectCurlySpacing: Self = this.set("objectCurlySpacing", js.undefined)
    
    @scala.inline
    def setParser(value: js.Any): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setQuote(value: single | double | auto): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setQuoteNull: Self = this.set("quote", null)
    
    @scala.inline
    def setRange(value: Boolean): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setReuseWhitespace(value: Boolean): Self = this.set("reuseWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReuseWhitespace: Self = this.set("reuseWhitespace", js.undefined)
    
    @scala.inline
    def setSourceFileName(value: String): Self = this.set("sourceFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceFileName: Self = this.set("sourceFileName", js.undefined)
    
    @scala.inline
    def setSourceFileNameNull: Self = this.set("sourceFileName", null)
    
    @scala.inline
    def setSourceMapName(value: String): Self = this.set("sourceMapName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMapName: Self = this.set("sourceMapName", js.undefined)
    
    @scala.inline
    def setSourceMapNameNull: Self = this.set("sourceMapName", null)
    
    @scala.inline
    def setSourceRoot(value: String): Self = this.set("sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRoot: Self = this.set("sourceRoot", js.undefined)
    
    @scala.inline
    def setSourceRootNull: Self = this.set("sourceRoot", null)
    
    @scala.inline
    def setTabWidth(value: Double): Self = this.set("tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabWidth: Self = this.set("tabWidth", js.undefined)
    
    @scala.inline
    def setTokens(value: Boolean): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokens: Self = this.set("tokens", js.undefined)
    
    @scala.inline
    def setTolerant(value: Boolean): Self = this.set("tolerant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTolerant: Self = this.set("tolerant", js.undefined)
    
    @scala.inline
    def setTrailingComma(value: Boolean): Self = this.set("trailingComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrailingComma: Self = this.set("trailingComma", js.undefined)
    
    @scala.inline
    def setUseTabs(value: Boolean): Self = this.set("useTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTabs: Self = this.set("useTabs", js.undefined)
    
    @scala.inline
    def setWrapColumn(value: Double): Self = this.set("wrapColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapColumn: Self = this.set("wrapColumn", js.undefined)
  }
}
