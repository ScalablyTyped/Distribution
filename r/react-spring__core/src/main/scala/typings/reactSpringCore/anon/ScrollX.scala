package typings.reactSpringCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollX extends StObject {
  
  var scrollX: Double
  
  var scrollXProgress: Double
  
  var scrollY: Double
  
  var scrollYProgress: Double
}
object ScrollX {
  
  inline def apply(scrollX: Double, scrollXProgress: Double, scrollY: Double, scrollYProgress: Double): ScrollX = {
    val __obj = js.Dynamic.literal(scrollX = scrollX.asInstanceOf[js.Any], scrollXProgress = scrollXProgress.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], scrollYProgress = scrollYProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollX] (val x: Self) extends AnyVal {
    
    inline def setScrollX(value: Double): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    inline def setScrollXProgress(value: Double): Self = StObject.set(x, "scrollXProgress", value.asInstanceOf[js.Any])
    
    inline def setScrollY(value: Double): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    inline def setScrollYProgress(value: Double): Self = StObject.set(x, "scrollYProgress", value.asInstanceOf[js.Any])
  }
}
