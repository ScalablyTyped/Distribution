package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMenu
  extends StObject
     with ISheet {
  
  /** [Method] Only fire the hide event if it is initialized */
  var doSetHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Returns the value of bottom
    * @returns Number
    */
  @JSName("getBottom")
  var getBottom_IMenu: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of height
    * @returns String
    */
  @JSName("getHeight")
  var getHeight_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of left
    * @returns Number
    */
  @JSName("getLeft")
  var getLeft_IMenu: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of right
    * @returns Number
    */
  @JSName("getRight")
  var getRight_IMenu: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of width
    * @returns String
    */
  @JSName("getWidth")
  var getWidth_IMenu: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Sets the value of bottom
    * @param bottom Number The new value.
    */
  @JSName("setBottom")
  var setBottom_IMenu: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of height
    * @param height String The new value.
    */
  @JSName("setHeight")
  var setHeight_IMenu: js.UndefOr[js.Function1[/* height */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of left
    * @param left Number The new value.
    */
  @JSName("setLeft")
  var setLeft_IMenu: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of right
    * @param right Number The new value.
    */
  @JSName("setRight")
  var setRight_IMenu: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of width
    * @param width String The new value.
    */
  @JSName("setWidth")
  var setWidth_IMenu: js.UndefOr[js.Function1[/* width */ js.UndefOr[java.lang.String], Unit]] = js.undefined
}
object IMenu {
  
  inline def apply(): IMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMenu] (val x: Self) extends AnyVal {
    
    inline def setDoSetHidden(value: () => Unit): Self = StObject.set(x, "doSetHidden", js.Any.fromFunction0(value))
    
    inline def setDoSetHiddenUndefined: Self = StObject.set(x, "doSetHidden", js.undefined)
    
    inline def setGetBottom(value: () => Double): Self = StObject.set(x, "getBottom", js.Any.fromFunction0(value))
    
    inline def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
    
    inline def setGetHeight(value: () => java.lang.String): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    inline def setGetHeightUndefined: Self = StObject.set(x, "getHeight", js.undefined)
    
    inline def setGetLeft(value: () => Double): Self = StObject.set(x, "getLeft", js.Any.fromFunction0(value))
    
    inline def setGetLeftUndefined: Self = StObject.set(x, "getLeft", js.undefined)
    
    inline def setGetRight(value: () => Double): Self = StObject.set(x, "getRight", js.Any.fromFunction0(value))
    
    inline def setGetRightUndefined: Self = StObject.set(x, "getRight", js.undefined)
    
    inline def setGetWidth(value: () => java.lang.String): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
    
    inline def setSetBottom(value: /* bottom */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setBottom", js.Any.fromFunction1(value))
    
    inline def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
    
    inline def setSetHeight(value: /* height */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetLeft(value: /* left */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setLeft", js.Any.fromFunction1(value))
    
    inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
    
    inline def setSetRight(value: /* right */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRight", js.Any.fromFunction1(value))
    
    inline def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
    
    inline def setSetWidth(value: /* width */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
  }
}
