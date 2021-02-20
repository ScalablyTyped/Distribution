package typings.recharts.anon

import typings.recharts.mod.AllowEscapeViewBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XBoolean extends AllowEscapeViewBox {
  
  var x: Boolean = js.native
}
object XBoolean {
  
  @scala.inline
  def apply(x: Boolean): XBoolean = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XBoolean]
  }
  
  @scala.inline
  implicit class XBooleanMutableBuilder[Self <: XBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
