package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  /**
    * x-offset for the clickable point relative to the top-left corner of the border box.
    */
  var x: Double
  
  /**
    * y-offset for the clickable point relative to the top-left corner of the border box.
    */
  var y: Double
}
object Offset {
  
  inline def apply(x: Double, y: Double): Offset = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
