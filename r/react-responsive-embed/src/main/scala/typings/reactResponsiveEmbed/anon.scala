package typings.reactResponsiveEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Ratio extends StObject {
    
    var ratio: js.UndefOr[String] = js.undefined
  }
  object Ratio {
    
    inline def apply(): Ratio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Ratio]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Ratio] (val x: Self) extends AnyVal {
      
      inline def setRatio(value: String): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
}
