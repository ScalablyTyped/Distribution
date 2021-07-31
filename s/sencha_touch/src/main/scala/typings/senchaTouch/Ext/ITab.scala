package typings.senchaTouch.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITab
  extends StObject
     with IButton {
  
  /** [Config Option] (Boolean) */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] Returns the value of active
    * @returns Boolean
    */
  var getActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of activeCls
    * @returns String
    */
  var getActiveCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  
  /** [Method] Sets the value of active
    * @param active Boolean The new value.
    */
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of activeCls
    * @param activeCls String The new value.
    */
  var setActiveCls: js.UndefOr[js.Function1[/* activeCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var title: js.UndefOr[java.lang.String] = js.undefined
}
object ITab {
  
  @scala.inline
  def apply(): ITab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITab]
  }
  
  @scala.inline
  implicit class ITabMutableBuilder[Self <: ITab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setGetActive(value: () => Boolean): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveCls(value: () => java.lang.String): Self = StObject.set(x, "getActiveCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActiveClsUndefined: Self = StObject.set(x, "getActiveCls", js.undefined)
    
    @scala.inline
    def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
    
    @scala.inline
    def setGetTitle(value: () => java.lang.String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
    
    @scala.inline
    def setSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveCls(value: /* activeCls */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setActiveCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetActiveClsUndefined: Self = StObject.set(x, "setActiveCls", js.undefined)
    
    @scala.inline
    def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Unit): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
