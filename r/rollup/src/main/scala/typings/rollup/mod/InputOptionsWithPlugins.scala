package typings.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputOptionsWithPlugins
  extends StObject
     with InputOptions {
  
  @JSName("plugins")
  var plugins_InputOptionsWithPlugins: js.Array[Plugin]
}
object InputOptionsWithPlugins {
  
  inline def apply(plugins: js.Array[Plugin]): InputOptionsWithPlugins = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputOptionsWithPlugins]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputOptionsWithPlugins] (val x: Self) extends AnyVal {
    
    inline def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value*))
  }
}
