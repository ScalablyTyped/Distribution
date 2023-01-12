package typings.reactShare.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callbacks extends StObject {
  
  var Share: Count
  
  var callbacks: js.Array[js.Function1[/* count */ js.UndefOr[Double], Unit]]
}
object Callbacks {
  
  inline def apply(Share: Count, callbacks: js.Array[js.Function1[/* count */ js.UndefOr[Double], Unit]]): Callbacks = {
    val __obj = js.Dynamic.literal(Share = Share.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callbacks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callbacks] (val x: Self) extends AnyVal {
    
    inline def setCallbacks(value: js.Array[js.Function1[/* count */ js.UndefOr[Double], Unit]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksVarargs(value: (js.Function1[/* count */ js.UndefOr[Double], Unit])*): Self = StObject.set(x, "callbacks", js.Array(value*))
    
    inline def setShare(value: Count): Self = StObject.set(x, "Share", value.asInstanceOf[js.Any])
  }
}
