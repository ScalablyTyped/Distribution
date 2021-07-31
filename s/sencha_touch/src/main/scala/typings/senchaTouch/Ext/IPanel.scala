package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanel
  extends StObject
     with IContainer {
  
  /** [Config Option] (Number/Boolean/String) */
  var bodyBorder: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Number/Boolean/String) */
  var bodyMargin: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (Number/Boolean/String) */
  var bodyPadding: js.UndefOr[js.Any] = js.undefined
  
  /** [Method] Returns the value of bodyBorder
    * @returns Number/Boolean/String
    */
  var getBodyBorder: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of bodyMargin
    * @returns Number/Boolean/String
    */
  var getBodyMargin: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of bodyPadding
    * @returns Number/Boolean/String
    */
  var getBodyPadding: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Sets the value of bodyBorder
    * @param bodyBorder Number/Boolean/String The new value.
    */
  var setBodyBorder: js.UndefOr[js.Function1[/* bodyBorder */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of bodyMargin
    * @param bodyMargin Number/Boolean/String The new value.
    */
  var setBodyMargin: js.UndefOr[js.Function1[/* bodyMargin */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of bodyPadding
    * @param bodyPadding Number/Boolean/String The new value.
    */
  var setBodyPadding: js.UndefOr[js.Function1[/* bodyPadding */ js.UndefOr[js.Any], Unit]] = js.undefined
}
object IPanel {
  
  @scala.inline
  def apply(): IPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPanel]
  }
  
  @scala.inline
  implicit class IPanelMutableBuilder[Self <: IPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyBorder(value: js.Any): Self = StObject.set(x, "bodyBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyBorderUndefined: Self = StObject.set(x, "bodyBorder", js.undefined)
    
    @scala.inline
    def setBodyMargin(value: js.Any): Self = StObject.set(x, "bodyMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyMarginUndefined: Self = StObject.set(x, "bodyMargin", js.undefined)
    
    @scala.inline
    def setBodyPadding(value: js.Any): Self = StObject.set(x, "bodyPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyPaddingUndefined: Self = StObject.set(x, "bodyPadding", js.undefined)
    
    @scala.inline
    def setGetBodyBorder(value: () => js.Any): Self = StObject.set(x, "getBodyBorder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBodyBorderUndefined: Self = StObject.set(x, "getBodyBorder", js.undefined)
    
    @scala.inline
    def setGetBodyMargin(value: () => js.Any): Self = StObject.set(x, "getBodyMargin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBodyMarginUndefined: Self = StObject.set(x, "getBodyMargin", js.undefined)
    
    @scala.inline
    def setGetBodyPadding(value: () => js.Any): Self = StObject.set(x, "getBodyPadding", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBodyPaddingUndefined: Self = StObject.set(x, "getBodyPadding", js.undefined)
    
    @scala.inline
    def setSetBodyBorder(value: /* bodyBorder */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBodyBorder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBodyBorderUndefined: Self = StObject.set(x, "setBodyBorder", js.undefined)
    
    @scala.inline
    def setSetBodyMargin(value: /* bodyMargin */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBodyMargin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBodyMarginUndefined: Self = StObject.set(x, "setBodyMargin", js.undefined)
    
    @scala.inline
    def setSetBodyPadding(value: /* bodyPadding */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setBodyPadding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBodyPaddingUndefined: Self = StObject.set(x, "setBodyPadding", js.undefined)
  }
}
