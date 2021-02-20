package typings.pretty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pretty", JSImport.Namespace)
  @js.native
  def apply(str: String): String = js.native
  @JSImport("pretty", JSImport.Namespace)
  @js.native
  def apply(str: String, options: PrettyOptions): String = js.native
  
  @js.native
  trait PrettyOptions extends StObject {
    
    var ocd: Boolean = js.native
  }
  object PrettyOptions {
    
    @scala.inline
    def apply(ocd: Boolean): PrettyOptions = {
      val __obj = js.Dynamic.literal(ocd = ocd.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrettyOptions]
    }
    
    @scala.inline
    implicit class PrettyOptionsMutableBuilder[Self <: PrettyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOcd(value: Boolean): Self = StObject.set(x, "ocd", value.asInstanceOf[js.Any])
    }
  }
}
