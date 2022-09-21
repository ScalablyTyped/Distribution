package typings.reactSketchapp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sketch extends StObject {
  
  var sketch: Any
}
object Sketch {
  
  inline def apply(sketch: Any): Sketch = {
    val __obj = js.Dynamic.literal(sketch = sketch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sketch]
  }
  
  extension [Self <: Sketch](x: Self) {
    
    inline def setSketch(value: Any): Self = StObject.set(x, "sketch", value.asInstanceOf[js.Any])
  }
}
