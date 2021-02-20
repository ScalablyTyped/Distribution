package typings.recharts.anon

import typings.recharts.mod.AllowEscapeViewBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Y extends AllowEscapeViewBox {
  
  var y: Boolean = js.native
}
object Y {
  
  @scala.inline
  def apply(y: Boolean): Y = {
    val __obj = js.Dynamic.literal(y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
