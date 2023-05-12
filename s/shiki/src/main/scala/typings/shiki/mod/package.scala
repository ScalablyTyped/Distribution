package typings.shiki.mod

import typings.shiki.mod.^
import typings.std.Response
import typings.vscodeTextmate.releaseThemeMod.IRawTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BUNDLED_LANGUAGES: js.Array[ILanguageRegistration] = ^.asInstanceOf[js.Dynamic].selectDynamic("BUNDLED_LANGUAGES").asInstanceOf[js.Array[ILanguageRegistration]]

inline def BUNDLED_THEMES: js.Array[Theme] = ^.asInstanceOf[js.Dynamic].selectDynamic("BUNDLED_THEMES").asInstanceOf[js.Array[Theme]]

inline def getHighlighter(options: HighlighterOptions): js.Promise[Highlighter] = ^.asInstanceOf[js.Dynamic].applyDynamic("getHighlighter")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Highlighter]]

/**
  * @param themePath related path to theme.json
  */
inline def loadTheme(themePath: String): js.Promise[IShikiTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTheme")(themePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IShikiTheme]]

inline def renderToHtml(lines: js.Array[js.Array[IThemedToken]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToHtml")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
inline def renderToHtml(lines: js.Array[js.Array[IThemedToken]], options: HtmlRendererOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToHtml")(lines.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * Set the route for loading the assets
  * URL should end with `/`
  *
  * For example:
  * ```ts
  * setCDN('https://unpkg.com/shiki/') // use unpkg
  * setCDN('/assets/shiki/') // serve by yourself
  * ```
  */
inline def setCDN(root: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCDN")(root.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** @deprecated use setWasm instead, will be removed in a future version */
inline def setOnigasmWASM(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnigasmWASM")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setOnigasmWASM(path: js.typedarray.ArrayBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnigasmWASM")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
  * Explicitly set the source for loading the oniguruma web assembly module.
  *  *
  * Accepts ArrayBuffer or Response (usage of string is deprecated)
  */
inline def setWasm(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasm")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setWasm(data: js.typedarray.ArrayBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasm")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setWasm(data: Response): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWasm")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def toShikiTheme(rawTheme: IRawTheme): IShikiTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("toShikiTheme")(rawTheme.asInstanceOf[js.Any]).asInstanceOf[IShikiTheme]

type CodeElementProps = ElementProps

type IThemeRegistration = IShikiTheme | (StringLiteralUnion[Theme, String])

/**
  * type StringLiteralUnion<'foo'> = 'foo' | string
  * This has auto completion whereas `'foo' | string` doesn't
  * Adapted from https://github.com/microsoft/TypeScript/issues/29729
  */
type StringLiteralUnion[T /* <: U */, U] = T | (U & Nothing)
