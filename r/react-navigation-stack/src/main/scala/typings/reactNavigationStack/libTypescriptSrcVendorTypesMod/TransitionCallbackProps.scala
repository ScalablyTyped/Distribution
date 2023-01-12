package typings.reactNavigationStack.libTypescriptSrcVendorTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionCallbackProps extends StObject {
  
  var closing: Boolean
}
object TransitionCallbackProps {
  
  inline def apply(closing: Boolean): TransitionCallbackProps = {
    val __obj = js.Dynamic.literal(closing = closing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionCallbackProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionCallbackProps] (val x: Self) extends AnyVal {
    
    inline def setClosing(value: Boolean): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
  }
}
