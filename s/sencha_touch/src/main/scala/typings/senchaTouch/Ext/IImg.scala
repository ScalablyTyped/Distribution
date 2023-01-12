package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImg
  extends StObject
     with IComponent {
  
  /** [Config Option] (String) */
  var backgroundCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of backgroundCls
    * @returns String
    */
  var getBackgroundCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of imageCls
    * @returns String
    */
  var getImageCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of mode
    * @returns String
    */
  var getMode: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of src
    * @returns String
    */
  var getSrc: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Hides this Component optionally using an animation
    * @returns Ext.Component
    */
  @JSName("hide")
  var hide_IImg: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Config Option] (String) */
  var imageCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Config Option] (String) */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Sets the value of backgroundCls
    * @param backgroundCls String The new value.
    */
  var setBackgroundCls: js.UndefOr[js.Function1[/* backgroundCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of imageCls
    * @param imageCls String The new value.
    */
  var setImageCls: js.UndefOr[js.Function1[/* imageCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of mode
    * @param mode String The new value.
    */
  var setMode: js.UndefOr[js.Function1[/* mode */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of src
    * @param src String The new value.
    */
  var setSrc: js.UndefOr[js.Function1[/* src */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Shows this component optionally using an animation
    * @returns Ext.Component
    */
  @JSName("show")
  var show_IImg: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Config Option] (String) */
  var src: js.UndefOr[java.lang.String] = js.undefined
}
object IImg {
  
  inline def apply(): IImg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IImg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IImg] (val x: Self) extends AnyVal {
    
    inline def setBackgroundCls(value: java.lang.String): Self = StObject.set(x, "backgroundCls", value.asInstanceOf[js.Any])
    
    inline def setBackgroundClsUndefined: Self = StObject.set(x, "backgroundCls", js.undefined)
    
    inline def setGetBackgroundCls(value: () => java.lang.String): Self = StObject.set(x, "getBackgroundCls", js.Any.fromFunction0(value))
    
    inline def setGetBackgroundClsUndefined: Self = StObject.set(x, "getBackgroundCls", js.undefined)
    
    inline def setGetImageCls(value: () => java.lang.String): Self = StObject.set(x, "getImageCls", js.Any.fromFunction0(value))
    
    inline def setGetImageClsUndefined: Self = StObject.set(x, "getImageCls", js.undefined)
    
    inline def setGetMode(value: () => java.lang.String): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
    
    inline def setGetModeUndefined: Self = StObject.set(x, "getMode", js.undefined)
    
    inline def setGetSrc(value: () => java.lang.String): Self = StObject.set(x, "getSrc", js.Any.fromFunction0(value))
    
    inline def setGetSrcUndefined: Self = StObject.set(x, "getSrc", js.undefined)
    
    inline def setHide(value: () => IComponent): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setImageCls(value: java.lang.String): Self = StObject.set(x, "imageCls", value.asInstanceOf[js.Any])
    
    inline def setImageClsUndefined: Self = StObject.set(x, "imageCls", js.undefined)
    
    inline def setMode(value: java.lang.String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSetBackgroundCls(value: /* backgroundCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setBackgroundCls", js.Any.fromFunction1(value))
    
    inline def setSetBackgroundClsUndefined: Self = StObject.set(x, "setBackgroundCls", js.undefined)
    
    inline def setSetImageCls(value: /* imageCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setImageCls", js.Any.fromFunction1(value))
    
    inline def setSetImageClsUndefined: Self = StObject.set(x, "setImageCls", js.undefined)
    
    inline def setSetMode(value: /* mode */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
    
    inline def setSetModeUndefined: Self = StObject.set(x, "setMode", js.undefined)
    
    inline def setSetSrc(value: /* src */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setSrc", js.Any.fromFunction1(value))
    
    inline def setSetSrcUndefined: Self = StObject.set(x, "setSrc", js.undefined)
    
    inline def setShow(value: () => IComponent): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSrc(value: java.lang.String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
