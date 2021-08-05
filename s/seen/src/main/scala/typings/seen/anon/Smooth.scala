package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Smooth extends StObject {
  
  var smooth: Boolean
}
object Smooth {
  
  inline def apply(smooth: Boolean): Smooth = {
    val __obj = js.Dynamic.literal(smooth = smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Smooth]
  }
  
  extension [Self <: Smooth](x: Self) {
    
    inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
  }
}
