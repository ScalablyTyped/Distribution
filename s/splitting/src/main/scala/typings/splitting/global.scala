package typings.splitting

import typings.splitting.mod.HTMLOptions
import typings.splitting.mod.Options
import typings.splitting.mod.Plugin
import typings.splitting.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Splitting {
    
    /**
      * @param options Configuration options
      * @returns A result object with data about the plugins that ran
      * @example
      * ```html
      * <!-- Initial DOM -->
      * <div data-splitting>ABC</div>
      * <script> Splitting(); </script>
      *
      * <!-- Output -->
      * <div data-splitting class="words chars splitting" style="--word-total:1; --char-total:3;">
      *   <span class="word" data-word="ABC" style="--word-index:0;">
      *     <span class="char" data-char="A" style="--char-index:0;">A</span>
      *     <span class="char" data-char="B" style="--char-index:1;">B</span>
      *     <span class="char" data-char="C" style="--char-index:2;">C</span>
      *   </span>
      * </div>
      * ```
      * @see {@link <https://splitting.js.org/guide.html#basic-usage>}
      */
    inline def apply(): Result = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Result]
    inline def apply(options: Options): Result = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Result]
    
    @JSGlobal("Splitting")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add a new plugin
      * @param plugin The plugin to add
      */
    inline def add(plugin: Plugin): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(plugin.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * The same as the normal splitting function, but with a required `content` property.
      * Returns a string of rendered HTML instead of {@link Result}.
      * Intended for use in JS frameworks such as Vue
      * @param options Configuration options
      * @returns Rendered HTML string
      * @example
      * ```html
      * <div v-html="Splitting.html({ content: myContentString, by: 'chars' })"></div>
      * ```
      */
    inline def html(options: HTMLOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
