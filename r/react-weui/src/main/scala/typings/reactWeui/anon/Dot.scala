package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dot extends StObject {
  
  var dot: Boolean
  
  var preset: String
}
object Dot {
  
  inline def apply(dot: Boolean, preset: String): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dot] (val x: Self) extends AnyVal {
    
    inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
    
    inline def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
  }
}
