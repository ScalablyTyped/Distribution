package typings.shiki.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Highlighter extends StObject {
  
  /**
    * Convert ansi-escaped text to HTML tokens.
    * `theme` must have been loaded.
    */
  def ansiToHtml(ansi: String): String = js.native
  def ansiToHtml(ansi: String, options: AnsiToHtmlOptions): String = js.native
  
  /**
    * Convert ansi-escaped text to themed tokens for custom processing.
    * `theme` must have been loaded.
    * You may customize the bundled HTML / SVG renderer or write your own
    * renderer for another render target.
    */
  def ansiToThemedTokens(ansi: String): js.Array[js.Array[IThemedToken]] = js.native
  def ansiToThemedTokens(ansi: String, theme: StringLiteralUnion[Theme, String]): js.Array[js.Array[IThemedToken]] = js.native
  
  /**
    * Convert code to HTML tokens.
    * `lang` and `theme` must have been loaded.
    * @deprecated Please use the `codeToHtml(code, options?)` overload instead.
    */
  def codeToHtml(code: String): String = js.native
  def codeToHtml(code: String, lang: Unit, theme: Unit, options: CodeToHtmlOptions): String = js.native
  def codeToHtml(code: String, lang: Unit, theme: StringLiteralUnion[Theme, String]): String = js.native
  def codeToHtml(code: String, lang: Unit, theme: StringLiteralUnion[Theme, String], options: CodeToHtmlOptions): String = js.native
  def codeToHtml(code: String, lang: StringLiteralUnion[Lang, String]): String = js.native
  def codeToHtml(code: String, lang: StringLiteralUnion[Lang, String], theme: Unit, options: CodeToHtmlOptions): String = js.native
  def codeToHtml(code: String, lang: StringLiteralUnion[Lang, String], theme: StringLiteralUnion[Theme, String]): String = js.native
  def codeToHtml(
    code: String,
    lang: StringLiteralUnion[Lang, String],
    theme: StringLiteralUnion[Theme, String],
    options: CodeToHtmlOptions
  ): String = js.native
  def codeToHtml(code: String, options: CodeToHtmlOptions): String = js.native
  
  /**
    * Convert code to themed tokens for custom processing.
    * `lang` and `theme` must have been loaded.
    * You may customize the bundled HTML / SVG renderer or write your own
    * renderer for another render target.
    */
  def codeToThemedTokens(code: String): js.Array[js.Array[IThemedToken]] = js.native
  def codeToThemedTokens(code: String, lang: Unit, theme: Unit, options: ThemedTokenizerOptions): js.Array[js.Array[IThemedToken]] = js.native
  def codeToThemedTokens(code: String, lang: Unit, theme: StringLiteralUnion[Theme, String]): js.Array[js.Array[IThemedToken]] = js.native
  def codeToThemedTokens(
    code: String,
    lang: Unit,
    theme: StringLiteralUnion[Theme, String],
    options: ThemedTokenizerOptions
  ): js.Array[js.Array[IThemedToken]] = js.native
  def codeToThemedTokens(code: String, lang: StringLiteralUnion[Lang, String]): js.Array[js.Array[IThemedToken]] = js.native
  def codeToThemedTokens(code: String, lang: StringLiteralUnion[Lang, String], theme: Unit, options: ThemedTokenizerOptions): js.Array[js.Array[IThemedToken]] = js.native
  def codeToThemedTokens(code: String, lang: StringLiteralUnion[Lang, String], theme: StringLiteralUnion[Theme, String]): js.Array[js.Array[IThemedToken]] = js.native
  def codeToThemedTokens(
    code: String,
    lang: StringLiteralUnion[Lang, String],
    theme: StringLiteralUnion[Theme, String],
    options: ThemedTokenizerOptions
  ): js.Array[js.Array[IThemedToken]] = js.native
  
  /**
    * Get the background color for theme. Can be used for CSS `background-color`.
    */
  def getBackgroundColor(): String = js.native
  def getBackgroundColor(theme: StringLiteralUnion[Theme, String]): String = js.native
  
  /**
    * Get the foreground color for theme. Can be used for CSS `color`.
    */
  def getForegroundColor(): String = js.native
  def getForegroundColor(theme: StringLiteralUnion[Theme, String]): String = js.native
  
  /**
    * Get all loaded languages
    */
  def getLoadedLanguages(): js.Array[Lang] = js.native
  
  /**
    * Get all loaded themes
    */
  def getLoadedThemes(): js.Array[Theme] = js.native
  
  /**
    * Get the loaded theme
    */
  def getTheme(): IShikiTheme = js.native
  def getTheme(theme: IThemeRegistration): IShikiTheme = js.native
  
  /**
    * Load a language
    */
  def loadLanguage(lang: ILanguageRegistration): js.Promise[Unit] = js.native
  def loadLanguage(lang: Lang): js.Promise[Unit] = js.native
  
  /**
    * Load a theme
    */
  def loadTheme(theme: IThemeRegistration): js.Promise[Unit] = js.native
  
  def setColorReplacements(map: Record[String, String]): Unit = js.native
}
