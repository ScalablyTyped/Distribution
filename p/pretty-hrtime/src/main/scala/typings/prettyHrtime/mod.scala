package typings.prettyHrtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(hrTime: js.Tuple2[Double, Double]): String = ^.asInstanceOf[js.Dynamic].apply(hrTime.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(hrTime: js.Tuple2[Double, Double], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(hrTime.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pretty-hrtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var precise: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
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
