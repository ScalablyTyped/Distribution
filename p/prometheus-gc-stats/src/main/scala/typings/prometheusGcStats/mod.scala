package typings.prometheusGcStats

import typings.prometheusGcStats.mod.prometheusGcStats.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // register is typeof require('prom-client').Registry which has its own .d.ts
  @JSImport("prometheus-gc-stats", JSImport.Namespace)
  @js.native
  def apply(register: js.Any): js.Function0[Unit] = js.native
  @JSImport("prometheus-gc-stats", JSImport.Namespace)
  @js.native
  def apply(register: js.Any, config: Config): js.Function0[Unit] = js.native
  
  object prometheusGcStats {
    
    @js.native
    trait Config extends StObject {
      
      var prefix: js.UndefOr[String] = js.native
    }
    object Config {
      
      @scala.inline
      def apply(): Config = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      }
    }
  }
}
