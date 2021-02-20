package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Smooth extends StObject {
  
  var smooth: Boolean = js.native
}
object Smooth {
  
  @scala.inline
  def apply(smooth: Boolean): Smooth = {
    val __obj = js.Dynamic.literal(smooth = smooth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Smooth]
  }
  
  @scala.inline
  implicit class SmoothMutableBuilder[Self <: Smooth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
  }
}
