package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveConfigOptions extends StObject {
  
  /**
    * Pass directly the path of the config file if you don't wish to search for it.
    */
  var config: js.UndefOr[String] = js.undefined
  
  /**
    * If set to `true` and an `.editorconfig` file is in your project,
    * Prettier will parse it and convert its properties to the corresponding prettier configuration.
    * This configuration will be overridden by `.prettierrc`, etc. Currently,
    * the following EditorConfig properties are supported:
    * - indent_style
    * - indent_size/tab_width
    * - max_line_length
    */
  var editorconfig: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to `false`, all caching will be bypassed.
    */
  var useCache: js.UndefOr[Boolean] = js.undefined
}
object ResolveConfigOptions {
  
  inline def apply(): ResolveConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveConfigOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveConfigOptions] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setEditorconfig(value: Boolean): Self = StObject.set(x, "editorconfig", value.asInstanceOf[js.Any])
    
    inline def setEditorconfigUndefined: Self = StObject.set(x, "editorconfig", js.undefined)
    
    inline def setUseCache(value: Boolean): Self = StObject.set(x, "useCache", value.asInstanceOf[js.Any])
    
    inline def setUseCacheUndefined: Self = StObject.set(x, "useCache", js.undefined)
  }
}
