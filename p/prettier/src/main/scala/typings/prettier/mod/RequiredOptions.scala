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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredOptions
  extends StObject
     with typings.prettier.mod.doc.printer.Options {
  
  /**
    * Include parentheses around a sole arrow function parameter.
    * @default 'always'
    */
  var arrowParens: avoid | always
  
  /**
    * Print spaces between brackets in object literals.
    * @default true
    */
  var bracketSpacing: Boolean
  
  /**
    * Control whether Prettier formats quoted code embedded in the file.
    * @default 'auto'
    */
  var embeddedLanguageFormatting: auto | off
  
  /**
    * Which end of line characters to apply.
    * @default 'lf'
    */
  var endOfLine: auto | lf | crlf | cr
  
  /**
    * Specify the input filepath. This will be used to do parser inference.
    */
  var filepath: String
  
  /**
    * How to handle whitespaces in HTML.
    * @default 'css'
    */
  var htmlWhitespaceSensitivity: css | strict | ignore
  
  /**
    * Prettier can insert a special @format marker at the top of files specifying that
    * the file has been formatted with prettier. This works well when used in tandem with
    * the --require-pragma option. If there is already a docblock at the top of
    * the file then this option will add a newline to it with the @format marker.
    * @default false
    */
  var insertPragma: Boolean
  
  /**
    * Put the `>` of a multi-line JSX element at the end of the last line instead of being alone on the next line.
    * @default false
    */
  var jsxBracketSameLine: Boolean
  
  /**
    * Use single quotes in JSX.
    * @default false
    */
  var jsxSingleQuote: Boolean
  
  /**
    * Specify which parser to use.
    */
  var parser: (LiteralUnion[BuiltInParserName, String]) | CustomParser
  
  /**
    * The plugin API is in a beta state.
    */
  var plugins: js.Array[String | Plugin[js.Any]]
  
  /**
    * By default, Prettier will wrap markdown text as-is since some services use a linebreak-sensitive renderer.
    * In some cases you may want to rely on editor/viewer soft wrapping instead, so this option allows you to opt out.
    * @default 'preserve'
    */
  var proseWrap: always | never | preserve
  
  /**
    * Change when properties in objects are quoted.
    * @default 'as-needed'
    */
  var quoteProps: `as-needed` | consistent | preserve
  
  /**
    * Format only a segment of a file.
    * @default Infinity
    */
  var rangeEnd: Double
  
  /**
    * Format only a segment of a file.
    * @default 0
    */
  var rangeStart: Double
  
  /**
    * Prettier can restrict itself to only format files that contain a special comment, called a pragma, at the top of the file.
    * This is very useful when gradually transitioning large, unformatted codebases to prettier.
    * @default false
    */
  var requirePragma: Boolean
  
  /**
    * Print semicolons at the ends of statements.
    * @default true
    */
  var semi: Boolean
  
  /**
    * Use single quotes instead of double quotes.
    * @default false
    */
  var singleQuote: Boolean
  
  /**
    * Print trailing commas wherever possible.
    * @default 'es5'
    */
  var trailingComma: none | es5 | all
  
  /**
    * Whether or not to indent the code inside <script> and <style> tags in Vue files.
    * @default false
    */
  var vueIndentScriptAndStyle: Boolean
}
object RequiredOptions {
  
  inline def apply(
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
    plugins: js.Array[String | Plugin[js.Any]],
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
  
  extension [Self <: RequiredOptions](x: Self) {
    
    inline def setArrowParens(value: avoid | always): Self = StObject.set(x, "arrowParens", value.asInstanceOf[js.Any])
    
    inline def setBracketSpacing(value: Boolean): Self = StObject.set(x, "bracketSpacing", value.asInstanceOf[js.Any])
    
    inline def setEmbeddedLanguageFormatting(value: auto | off): Self = StObject.set(x, "embeddedLanguageFormatting", value.asInstanceOf[js.Any])
    
    inline def setEndOfLine(value: auto | lf | crlf | cr): Self = StObject.set(x, "endOfLine", value.asInstanceOf[js.Any])
    
    inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
    
    inline def setHtmlWhitespaceSensitivity(value: css | strict | ignore): Self = StObject.set(x, "htmlWhitespaceSensitivity", value.asInstanceOf[js.Any])
    
    inline def setInsertPragma(value: Boolean): Self = StObject.set(x, "insertPragma", value.asInstanceOf[js.Any])
    
    inline def setJsxBracketSameLine(value: Boolean): Self = StObject.set(x, "jsxBracketSameLine", value.asInstanceOf[js.Any])
    
    inline def setJsxSingleQuote(value: Boolean): Self = StObject.set(x, "jsxSingleQuote", value.asInstanceOf[js.Any])
    
    inline def setParser(value: (LiteralUnion[BuiltInParserName, String]) | CustomParser): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    inline def setParserFunction3(value: (/* text */ String, /* parsers */ BuiltInParsers, /* options */ Options) => AST): Self = StObject.set(x, "parser", js.Any.fromFunction3(value))
    
    inline def setPlugins(value: js.Array[String | Plugin[js.Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: (String | Plugin[js.Any])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setProseWrap(value: always | never | preserve): Self = StObject.set(x, "proseWrap", value.asInstanceOf[js.Any])
    
    inline def setQuoteProps(value: `as-needed` | consistent | preserve): Self = StObject.set(x, "quoteProps", value.asInstanceOf[js.Any])
    
    inline def setRangeEnd(value: Double): Self = StObject.set(x, "rangeEnd", value.asInstanceOf[js.Any])
    
    inline def setRangeStart(value: Double): Self = StObject.set(x, "rangeStart", value.asInstanceOf[js.Any])
    
    inline def setRequirePragma(value: Boolean): Self = StObject.set(x, "requirePragma", value.asInstanceOf[js.Any])
    
    inline def setSemi(value: Boolean): Self = StObject.set(x, "semi", value.asInstanceOf[js.Any])
    
    inline def setSingleQuote(value: Boolean): Self = StObject.set(x, "singleQuote", value.asInstanceOf[js.Any])
    
    inline def setTrailingComma(value: none | es5 | all): Self = StObject.set(x, "trailingComma", value.asInstanceOf[js.Any])
    
    inline def setVueIndentScriptAndStyle(value: Boolean): Self = StObject.set(x, "vueIndentScriptAndStyle", value.asInstanceOf[js.Any])
  }
}
