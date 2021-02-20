package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dot extends StObject {
  
  var dot: Boolean = js.native
  
  var preset: String = js.native
}
object Dot {
  
  @scala.inline
  def apply(dot: Boolean, preset: String): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
  
  @scala.inline
  implicit class DotMutableBuilder[Self <: Dot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreset(value: String): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
  }
}
