package typings.senchaTouch.Ext.scroll.indicator

import typings.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAbstract extends IComponent {
  
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of active
    * @returns Boolean
    */
  var getActive: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of autoHide
    * @returns Boolean
    */
  var getAutoHide: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of axis
    * @returns String
    */
  var getAxis: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of barCls
    * @returns String
    */
  var getBarCls: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of length
    * @returns Object
    */
  var getLength: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of minLength
    * @returns Number
    */
  var getMinLength: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of ratio
    * @returns Number
    */
  var getRatio: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of value
    * @returns Object
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Sets the value of active
    * @param active Boolean The new value.
    */
  var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of autoHide
    * @param autoHide Boolean The new value.
    */
  var setAutoHide: js.UndefOr[js.Function1[/* autoHide */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of axis
    * @param axis String The new value.
    */
  var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of barCls
    * @param barCls String The new value.
    */
  var setBarCls: js.UndefOr[js.Function1[/* barCls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of length
    * @param length Object The new value.
    */
  var setLength: js.UndefOr[js.Function1[/* length */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of minLength
    * @param minLength Number The new value.
    */
  var setMinLength: js.UndefOr[js.Function1[/* minLength */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of ratio
    * @param ratio Number The new value.
    */
  var setRatio: js.UndefOr[js.Function1[/* ratio */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of value
    * @param value Object The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
}
object IAbstract {
  
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
    
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
    def setAutoHide(value: Boolean): Self = this.set("autoHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoHide: Self = this.set("autoHide", js.undefined)
    
    @scala.inline
    def setGetActive(value: () => Boolean): Self = this.set("getActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetActive: Self = this.set("getActive", js.undefined)
    
    @scala.inline
    def setGetAutoHide(value: () => Boolean): Self = this.set("getAutoHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAutoHide: Self = this.set("getAutoHide", js.undefined)
    
    @scala.inline
    def setGetAxis(value: () => String): Self = this.set("getAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAxis: Self = this.set("getAxis", js.undefined)
    
    @scala.inline
    def setGetBarCls(value: () => String): Self = this.set("getBarCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetBarCls: Self = this.set("getBarCls", js.undefined)
    
    @scala.inline
    def setGetLength(value: () => _): Self = this.set("getLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLength: Self = this.set("getLength", js.undefined)
    
    @scala.inline
    def setGetMinLength(value: () => Double): Self = this.set("getMinLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinLength: Self = this.set("getMinLength", js.undefined)
    
    @scala.inline
    def setGetRatio(value: () => Double): Self = this.set("getRatio", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRatio: Self = this.set("getRatio", js.undefined)
    
    @scala.inline
    def setGetValue(value: () => _): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    
    @scala.inline
    def setSetActive(value: /* active */ js.UndefOr[Boolean] => Unit): Self = this.set("setActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetActive: Self = this.set("setActive", js.undefined)
    
    @scala.inline
    def setSetAutoHide(value: /* autoHide */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAutoHide: Self = this.set("setAutoHide", js.undefined)
    
    @scala.inline
    def setSetAxis(value: /* axis */ js.UndefOr[String] => Unit): Self = this.set("setAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAxis: Self = this.set("setAxis", js.undefined)
    
    @scala.inline
    def setSetBarCls(value: /* barCls */ js.UndefOr[String] => Unit): Self = this.set("setBarCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetBarCls: Self = this.set("setBarCls", js.undefined)
    
    @scala.inline
    def setSetLength(value: /* length */ js.UndefOr[js.Any] => Unit): Self = this.set("setLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLength: Self = this.set("setLength", js.undefined)
    
    @scala.inline
    def setSetMinLength(value: /* minLength */ js.UndefOr[Double] => Unit): Self = this.set("setMinLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinLength: Self = this.set("setMinLength", js.undefined)
    
    @scala.inline
    def setSetRatio(value: /* ratio */ js.UndefOr[Double] => Unit): Self = this.set("setRatio", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRatio: Self = this.set("setRatio", js.undefined)
    
    @scala.inline
    def setSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetValue: Self = this.set("setValue", js.undefined)
  }
}
