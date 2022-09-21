package typings.rollup.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sequential extends StObject {
  
  var sequential: js.UndefOr[Boolean] = js.undefined
}
object Sequential {
  
  inline def apply(): Sequential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sequential]
  }
  
  extension [Self <: Sequential](x: Self) {
    
    inline def setSequential(value: Boolean): Self = StObject.set(x, "sequential", value.asInstanceOf[js.Any])
    
    inline def setSequentialUndefined: Self = StObject.set(x, "sequential", js.undefined)
  }
}
