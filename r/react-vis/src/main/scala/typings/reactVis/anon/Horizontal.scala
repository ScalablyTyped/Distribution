package typings.reactVis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Horizontal extends StObject {
  
  var horizontal: String = js.native
  
  var vertical: String = js.native
}
object Horizontal {
  
  @scala.inline
  def apply(horizontal: String, vertical: String): Horizontal = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
  
  @scala.inline
  implicit class HorizontalMutableBuilder[Self <: Horizontal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
  }
}
