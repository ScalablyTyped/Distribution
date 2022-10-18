package typings.sass

import typings.node.bufferMod.global.Buffer
import typings.sass.anon.Duration
import typings.sass.sassStrings.async
import typings.sass.sassStrings.sync
import typings.sass.typesLegacyExceptionMod.LegacyException
import typings.sass.typesLegacyOptionsMod.LegacyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLegacyRenderMod {
  
  @JSImport("sass/types/legacy/render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderSync_sync(options: LegacyOptions[sync]): LegacyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("renderSync")(options.asInstanceOf[js.Any]).asInstanceOf[LegacyResult]
  
  inline def render_async(
    options: LegacyOptions[async],
    callback: js.Function2[
      /* exception */ js.UndefOr[LegacyException], 
      /* result */ js.UndefOr[LegacyResult], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait LegacyResult extends StObject {
    
    /**
      * The compiled CSS. This can be converted to a string by calling
      * [Buffer.toString](https://nodejs.org/api/buffer.html#buffer_buf_tostring_encoding_start_end).
      *
      * @example
      *
      * ```js
      * const result = sass.renderSync({file: "style.scss"});
      *
      * console.log(result.css.toString());
      * ```
      */
    var css: Buffer
    
    /**
      * The source map that maps the compiled CSS to the source files from which it
      * was generated. This can be converted to a string by calling
      * [Buffer.toString](https://nodejs.org/api/buffer.html#buffer_buf_tostring_encoding_start_end).
      *
      * This is `undefined` unless either
      *
      * * [[LegacySharedOptions.sourceMap]] is a string; or
      * * [[LegacySharedOptions.sourceMap]] is `true` and
      *   [[LegacySharedOptions.outFile]] is set.
      *
      * The source map uses absolute [`file:`
      * URLs](https://en.wikipedia.org/wiki/File_URI_scheme) to link to the Sass
      * source files, except if the source file comes from
      * [[LegacyStringOptions.data]] in which case it lists its URL as `"stdin"`.
      *
      * @example
      *
      * ```js
      * const result = sass.renderSync({
      *   file: "style.scss",
      *   sourceMap: true,
      *   outFile: "style.css"
      * })
      *
      * console.log(result.map.toString());
      * ```
      */
    var map: js.UndefOr[Buffer] = js.undefined
    
    /** Additional information about the compilation. */
    var stats: Duration
  }
  object LegacyResult {
    
    inline def apply(css: Buffer, stats: Duration): LegacyResult = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyResult]
    }
    
    extension [Self <: LegacyResult](x: Self) {
      
      inline def setCss(value: Buffer): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Buffer): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setStats(value: Duration): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
}
