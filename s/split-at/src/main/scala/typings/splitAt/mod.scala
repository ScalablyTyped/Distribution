package typings.splitAt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("split-at", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(string: String, index: js.Array[Double]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def default(string: String, index: js.Array[Double], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def default(string: String, index: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def default(string: String, index: Double, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(string.asInstanceOf[js.Any], index.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    /**
    	Remove the chosen indices.
    	Similar to the default `String#split` behaviour.
    	@default false
    	*/
    val remove: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
}
