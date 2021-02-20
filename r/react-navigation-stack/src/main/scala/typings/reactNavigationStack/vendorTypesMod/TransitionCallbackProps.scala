package typings.reactNavigationStack.vendorTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionCallbackProps extends StObject {
  
  var closing: Boolean = js.native
}
object TransitionCallbackProps {
  
  @scala.inline
  def apply(closing: Boolean): TransitionCallbackProps = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionCallbackProps]
  }
  
  @scala.inline
  implicit class TransitionCallbackPropsMutableBuilder[Self <: TransitionCallbackProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
  }
}
