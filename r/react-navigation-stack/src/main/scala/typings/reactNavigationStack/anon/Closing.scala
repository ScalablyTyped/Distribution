package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Closing extends StObject {
  
  var closing: Boolean = js.native
}
object Closing {
  
  @scala.inline
  def apply(closing: Boolean): Closing = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closing]
  }
  
  @scala.inline
  implicit class ClosingMutableBuilder[Self <: Closing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
  }
}
