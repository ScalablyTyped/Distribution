package typings.sparkly

import typings.sparkly.sparklyStrings._empty
import typings.sparkly.sparklyStrings.fire
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sparkly", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(numbers: js.Array[Double | _empty]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(numbers.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(numbers: js.Array[Double | _empty], options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(numbers.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Maximum range.
    	*/
    val maximum: js.UndefOr[Double] = js.undefined
    
    /**
    	Minimum range.
    	*/
    val minimum: js.UndefOr[Double] = js.undefined
    
    /**
    	Style for the sparklines.
    	*/
    val style: js.UndefOr[fire] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
      
      inline def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
      
      inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      
      inline def setStyle(value: fire): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
