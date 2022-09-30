package typings.sass

import typings.sass.anon.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginThisMod {
  
  trait LegacyPluginThis extends StObject {
    
    /**
      * A partial representation of the options passed to [[render]] or
      * [[renderSync]].
      */
    var options: Context
  }
  object LegacyPluginThis {
    
    inline def apply(options: Context): LegacyPluginThis = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[LegacyPluginThis]
    }
    
    extension [Self <: LegacyPluginThis](x: Self) {
      
      inline def setOptions(value: Context): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
