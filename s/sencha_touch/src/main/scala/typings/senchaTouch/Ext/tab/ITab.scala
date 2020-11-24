package typings.senchaTouch.Ext.tab

import typings.senchaTouch.Ext.IButton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITab extends IButton {
  
  /** [Config Option] (Boolean) */
  var active: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var activeCls: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of active
    * @returns Boolean
    */
  var getActive: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of activeCls
    * @returns String
    */
  var getActiveCls: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of title
    * @returns String
    */
  var getTitle: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Sets the value of active
    * @param active Boolean The new value.
    */
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of activeCls
    * @param activeCls String The new value.
    */
  var setActiveCls: js.UndefOr[js.Function1[/* activeCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of title
    * @param title String The new value.
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
}
object ITab {
  
  @scala.inline
  def apply(): ITab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITab]
  }
  
  @scala.inline
  implicit class ITabOps[Self <: ITab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setActiveCls(value: String): Self = this.set("activeCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveCls: Self = this.set("activeCls", js.undefined)
    
    @scala.inline
    def setGetActive(value: () => Boolean): Self = this.set("getActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActive: Self = this.set("getActive", js.undefined)
    
    @scala.inline
    def setGetActiveCls(value: () => String): Self = this.set("getActiveCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActiveCls: Self = this.set("getActiveCls", js.undefined)
    
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTitle: Self = this.set("getTitle", js.undefined)
    
    @scala.inline
    def setSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = this.set("setActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActive: Self = this.set("setActive", js.undefined)
    
    @scala.inline
    def setSetActiveCls(value: /* activeCls */ js.UndefOr[String] => Unit): Self = this.set("setActiveCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActiveCls: Self = this.set("setActiveCls", js.undefined)
    
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
