package typings.prettier.mod

import typings.prettier.prettierStrings.`as-needed`
import typings.prettier.prettierStrings.all
import typings.prettier.prettierStrings.always
import typings.prettier.prettierStrings.auto
import typings.prettier.prettierStrings.avoid
import typings.prettier.prettierStrings.consistent
import typings.prettier.prettierStrings.cr
import typings.prettier.prettierStrings.crlf
import typings.prettier.prettierStrings.css
import typings.prettier.prettierStrings.es5
import typings.prettier.prettierStrings.ignore
import typings.prettier.prettierStrings.lf
import typings.prettier.prettierStrings.never
import typings.prettier.prettierStrings.none
import typings.prettier.prettierStrings.off
import typings.prettier.prettierStrings.preserve
import typings.prettier.prettierStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequiredOptions
  extends typings.prettier.mod.doc.printer.Options {
  
  /**
    * Include parentheses around a sole arrow function parameter.
    * @default 'always'
    */
  var arrowParens: avoid | always = js.native
  
  /**
    * Print spaces between brackets in object literals.
    * @default true
    */
  var bracketSpacing: Boolean = js.native
  
  /**
    * Control whether Prettier formats quoted code embedded in the file.
    * @default 'auto'
    */
  var embeddedLanguageFormatting: auto | off = js.native
  
  /**
    * Which end of line characters to apply.
    * @default 'lf'
    */
  var endOfLine: auto | lf | crlf | cr = js.native
  
  /**
    * Specify the input filepath. This will be used to do parser inference.
    */
  var filepath: String = js.native
  
  /**
    * How to handle whitespaces in HTML.
    * @default 'css'
    */
  var htmlWhitespaceSensitivity: css | strict | ignore = js.native
  
  /**
    * Prettier can insert a special @format marker at the top of files specifying that
    * the file has been formatted with prettier. This works well when used in tandem with
    * the --require-pragma option. If there is already a docblock at the top of
    * the file then this option will add a newline to it with the @format marker.
    * @default false
    */
  var insertPragma: Boolean = js.native
  
  /**
    * Put the `>` of a multi-line JSX element at the end of the last line instead of being alone on the next line.
    * @default false
    */
  var jsxBracketSameLine: Boolean = js.native
  
  /**
    * Use single quotes in JSX.
    * @default false
    */
  var jsxSingleQuote: Boolean = js.native
  
  /**
    * Specify which parser to use.
    */
  var parser: (LiteralUnion[BuiltInParserName, String]) | CustomParser = js.native
  
  /**
    * The plugin API is in a beta state.
    */
  var plugins: js.Array[String | Plugin[_]] = js.native
  
  /**
    * By default, Prettier will wrap markdown text as-is since some services use a linebreak-sensitive renderer.
    * In some cases you may want to rely on editor/viewer soft wrapping instead, so this option allows you to opt out.
    * @default 'preserve'
    */
  var proseWrap: always | never | preserve = js.native
  
  /**
    * Change when properties in objects are quoted.
    * @default 'as-needed'
    */
  var quoteProps: `as-needed` | consistent | preserve = js.native
  
  /**
    * Format only a segment of a file.
    * @default Infinity
    */
  var rangeEnd: Double = js.native
  
  /**
    * Format only a segment of a file.
    * @default 0
    */
  var rangeStart: Double = js.native
  
  /**
    * Prettier can restrict itself to only format files that contain a special comment, called a pragma, at the top of the file.
    * This is very useful when gradually transitioning large, unformatted codebases to prettier.
    * @default false
    */
  var requirePragma: Boolean = js.native
  
  /**
    * Print semicolons at the ends of statements.
    * @default true
    */
  var semi: Boolean = js.native
  
  /**
    * Use single quotes instead of double quotes.
    * @default false
    */
  var singleQuote: Boolean = js.native
  
  /**
    * Print trailing commas wherever possible.
    * @default 'es5'
    */
  var trailingComma: none | es5 | all = js.native
  
  /**
    * Whether or not to indent the code inside <script> and <style> tags in Vue files.
    * @default false
    */
  var vueIndentScriptAndStyle: Boolean = js.native
}
object RequiredOptions {
  
  @scala.inline
  def apply(
    arrowParens: avoid | always,
    bracketSpacing: Boolean,
    embeddedInHtml: Boolean,
    embeddedLanguageFormatting: auto | off,
    endOfLine: auto | lf | crlf | cr,
    filepath: String,
    htmlWhitespaceSensitivity: css | strict | ignore,
    insertPragma: Boolean,
    jsxBracketSameLine: Boolean,
    jsxSingleQuote: Boolean,
    parser: (LiteralUnion[BuiltInParserName, String]) | CustomParser,
    plugins: js.Array[String | Plugin[_]],
    printWidth: Double,
    proseWrap: always | never | preserve,
    quoteProps: `as-needed` | consistent | preserve,
    rangeEnd: Double,
    rangeStart: Double,
    requirePragma: Boolean,
    semi: Boolean,
    singleQuote: Boolean,
    tabWidth: Double,
    trailingComma: none | es5 | all,
    useTabs: Boolean,
    vueIndentScriptAndStyle: Boolean
  ): RequiredOptions = {
    val __obj = js.Dynamic.literal(arrowParens = arrowParens.asInstanceOf[js.Any], bracketSpacing = bracketSpacing.asInstanceOf[js.Any], embeddedInHtml = embeddedInHtml.asInstanceOf[js.Any], embeddedLanguageFormatting = embeddedLanguageFormatting.asInstanceOf[js.Any], endOfLine = endOfLine.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], htmlWhitespaceSensitivity = htmlWhitespaceSensitivity.asInstanceOf[js.Any], insertPragma = insertPragma.asInstanceOf[js.Any], jsxBracketSameLine = jsxBracketSameLine.asInstanceOf[js.Any], jsxSingleQuote = jsxSingleQuote.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], printWidth = printWidth.asInstanceOf[js.Any], proseWrap = proseWrap.asInstanceOf[js.Any], quoteProps = quoteProps.asInstanceOf[js.Any], rangeEnd = rangeEnd.asInstanceOf[js.Any], rangeStart = rangeStart.asInstanceOf[js.Any], requirePragma = requirePragma.asInstanceOf[js.Any], semi = semi.asInstanceOf[js.Any], singleQuote = singleQuote.asInstanceOf[js.Any], tabWidth = tabWidth.asInstanceOf[js.Any], trailingComma = trailingComma.asInstanceOf[js.Any], useTabs = useTabs.asInstanceOf[js.Any], vueIndentScriptAndStyle = vueIndentScriptAndStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOptions]
  }
  
  @scala.inline
  implicit class RequiredOptionsOps[Self <: RequiredOptions] (val x: Self) extends AnyVal {
    
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
    def setArrowParens(value: avoid | always): Self = this.set("arrowParens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketSpacing(value: Boolean): Self = this.set("bracketSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedLanguageFormatting(value: auto | off): Self = this.set("embeddedLanguageFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfLine(value: auto | lf | crlf | cr): Self = this.set("endOfLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepath(value: String): Self = this.set("filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = this.set("htmlWhitespaceSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPragma(value: Boolean): Self = this.set("insertPragma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxBracketSameLine(value: Boolean): Self = this.set("jsxBracketSameLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsxSingleQuote(value: Boolean): Self = this.set("jsxSingleQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParserFunction3(value: (/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options) => AST): Self = this.set("parser", js.Any.fromFunction3(value))
    
    @scala.inline
    def setParser(value: (LiteralUnion[BuiltInParserName, String]) | CustomParser): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsVarargs(value: (String | Plugin[js.Any])*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[String | Plugin[_]]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProseWrap(value: always | never | preserve): Self = this.set("proseWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteProps(value: `as-needed` | consistent | preserve): Self = this.set("quoteProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeEnd(value: Double): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeStart(value: Double): Self = this.set("rangeStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirePragma(value: Boolean): Self = this.set("requirePragma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemi(value: Boolean): Self = this.set("semi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleQuote(value: Boolean): Self = this.set("singleQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailingComma(value: none | es5 | all): Self = this.set("trailingComma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVueIndentScriptAndStyle(value: Boolean): Self = this.set("vueIndentScriptAndStyle", value.asInstanceOf[js.Any])
  }
}
