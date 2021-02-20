package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMask extends IComponent {
  
  /** [Method] Returns the value of transparent
    * @returns Boolean
    */
  var getTransparent: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Sets the value of transparent
    * @param transparent Boolean The new value.
    */
  var setTransparent: js.UndefOr[js.Function1[/* transparent */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.native
}
object IMask {
  
  @scala.inline
  def apply(): IMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMask]
  }
  
  @scala.inline
  implicit class IMaskMutableBuilder[Self <: IMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTransparent(value: () => Boolean): Self = StObject.set(x, "getTransparent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTransparentUndefined: Self = StObject.set(x, "getTransparent", js.undefined)
    
    @scala.inline
    def setSetTransparent(value: /* transparent */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setTransparent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTransparentUndefined: Self = StObject.set(x, "setTransparent", js.undefined)
    
    @scala.inline
    def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
  }
}
