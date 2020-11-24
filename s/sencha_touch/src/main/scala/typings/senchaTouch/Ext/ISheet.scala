package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISheet extends IPanel {
  
  /** [Config Option] (String) */
  var enter: js.UndefOr[java.lang.String] = js.native
  
  /** [Config Option] (String) */
  var exit: js.UndefOr[java.lang.String] = js.native
  
  /** [Method] Returns the value of enter
    * @returns String
    */
  var getEnter: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of exit
    * @returns String
    */
  var getExit: js.UndefOr[js.Function0[java.lang.String]] = js.native
  
  /** [Method] Returns the value of stretchX
    * @returns Boolean
    */
  var getStretchX: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of stretchY
    * @returns Boolean
    */
  var getStretchY: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Sets the value of enter
    * @param enter String The new value.
    */
  var setEnter: js.UndefOr[js.Function1[/* enter */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of exit
    * @param exit String The new value.
    */
  var setExit: js.UndefOr[js.Function1[/* exit */ js.UndefOr[java.lang.String], Unit]] = js.native
  
  /** [Method] Sets the value of stretchX
    * @param stretchX Boolean The new value.
    */
  var setStretchX: js.UndefOr[js.Function1[/* stretchX */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of stretchY
    * @param stretchY Boolean The new value.
    */
  var setStretchY: js.UndefOr[js.Function1[/* stretchY */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var stretchX: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var stretchY: js.UndefOr[Boolean] = js.native
}
object ISheet {
  
  @scala.inline
  def apply(): ISheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISheet]
  }
  
  @scala.inline
  implicit class ISheetOps[Self <: ISheet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnter(value: java.lang.String): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setExit(value: java.lang.String): Self = this.set("exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExit: Self = this.set("exit", js.undefined)
    
    @scala.inline
    def setGetEnter(value: () => java.lang.String): Self = this.set("getEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEnter: Self = this.set("getEnter", js.undefined)
    
    @scala.inline
    def setGetExit(value: () => java.lang.String): Self = this.set("getExit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetExit: Self = this.set("getExit", js.undefined)
    
    @scala.inline
    def setGetStretchX(value: () => Boolean): Self = this.set("getStretchX", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStretchX: Self = this.set("getStretchX", js.undefined)
    
    @scala.inline
    def setGetStretchY(value: () => Boolean): Self = this.set("getStretchY", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetStretchY: Self = this.set("getStretchY", js.undefined)
    
    @scala.inline
    def setSetEnter(value: /* enter */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEnter: Self = this.set("setEnter", js.undefined)
    
    @scala.inline
    def setSetExit(value: /* exit */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetExit: Self = this.set("setExit", js.undefined)
    
    @scala.inline
    def setSetStretchX(value: /* stretchX */ js.UndefOr[Boolean] => Unit): Self = this.set("setStretchX", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStretchX: Self = this.set("setStretchX", js.undefined)
    
    @scala.inline
    def setSetStretchY(value: /* stretchY */ js.UndefOr[Boolean] => Unit): Self = this.set("setStretchY", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetStretchY: Self = this.set("setStretchY", js.undefined)
    
    @scala.inline
    def setStretchX(value: Boolean): Self = this.set("stretchX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretchX: Self = this.set("stretchX", js.undefined)
    
    @scala.inline
    def setStretchY(value: Boolean): Self = this.set("stretchY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStretchY: Self = this.set("stretchY", js.undefined)
  }
}
