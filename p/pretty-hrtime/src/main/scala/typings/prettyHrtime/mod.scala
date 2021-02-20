package typings.prettyHrtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pretty-hrtime", JSImport.Namespace)
  @js.native
  def apply(hrTime: js.Tuple2[Double, Double]): String = js.native
  @JSImport("pretty-hrtime", JSImport.Namespace)
  @js.native
  def apply(hrTime: js.Tuple2[Double, Double], options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var precise: js.UndefOr[Boolean] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
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
      def setPrecise(value: Boolean): Self = StObject.set(x, "precise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreciseUndefined: Self = StObject.set(x, "precise", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
