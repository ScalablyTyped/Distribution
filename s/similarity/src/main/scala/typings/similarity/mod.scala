package typings.similarity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("similarity", JSImport.Namespace)
  @js.native
  def apply(left: String, right: String): Double = js.native
  @JSImport("similarity", JSImport.Namespace)
  @js.native
  def apply(left: String, right: String, options: Options): Double = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * treat casing differences as differences
      */
    var sensitive: js.UndefOr[Boolean] = js.native
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
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    }
  }
}
