package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Viewport extends StObject {
  
  var postscale: Matrix
  
  var prescale: Matrix
}
object Viewport {
  
  inline def apply(postscale: Matrix, prescale: Matrix): Viewport = {
    val __obj = js.Dynamic.literal(postscale = postscale.asInstanceOf[js.Any], prescale = prescale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Viewport] (val x: Self) extends AnyVal {
    
    inline def setPostscale(value: Matrix): Self = StObject.set(x, "postscale", value.asInstanceOf[js.Any])
    
    inline def setPrescale(value: Matrix): Self = StObject.set(x, "prescale", value.asInstanceOf[js.Any])
  }
}
