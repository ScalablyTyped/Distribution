package typings.saslprep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("saslprep", JSImport.Namespace)
  @js.native
  def apply(input: String): String = js.native
  @JSImport("saslprep", JSImport.Namespace)
  @js.native
  def apply(input: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var allowUnassigned: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUnassigned(value: Boolean): Self = StObject.set(x, "allowUnassigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnassignedUndefined: Self = StObject.set(x, "allowUnassigned", js.undefined)
    }
  }
}
