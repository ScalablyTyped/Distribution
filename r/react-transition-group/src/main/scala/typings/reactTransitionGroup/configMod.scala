package typings.reactTransitionGroup

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod extends Shortcut {
  
  @JSImport("react-transition-group/config", JSImport.Default)
  @js.native
  val default: Config = js.native
  
  @js.native
  trait Config extends StObject {
    
    var disabled: Boolean = js.native
  }
  object Config {
    
    @scala.inline
    def apply(disabled: Boolean): Config = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Config
  
  /* This means you don't have to write `default`, but can instead just say `configMod.foo` */
  override def _to: Config = default
}
