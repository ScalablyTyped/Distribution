package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMask
  extends StObject
     with IComponent {
  
  /** [Method] Returns the value of transparent
    * @returns Boolean
    */
  var getTransparent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Sets the value of transparent
    * @param transparent Boolean The new value.
    */
  var setTransparent: js.UndefOr[js.Function1[/* transparent */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.undefined
}
object IMask {
  
  inline def apply(): IMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMask] (val x: Self) extends AnyVal {
    
    inline def setGetTransparent(value: () => Boolean): Self = StObject.set(x, "getTransparent", js.Any.fromFunction0(value))
    
    inline def setGetTransparentUndefined: Self = StObject.set(x, "getTransparent", js.undefined)
    
    inline def setSetTransparent(value: /* transparent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setTransparent", js.Any.fromFunction1(value))
    
    inline def setSetTransparentUndefined: Self = StObject.set(x, "setTransparent", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
