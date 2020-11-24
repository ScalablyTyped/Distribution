package typings.senchaTouch.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpinner
  extends typings.senchaTouch.Ext.field.INumber {
  
  /** [Config Option] (Boolean) */
  var accelerateOnTapHold: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var cycle: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Number) */
  var defaultValue: js.UndefOr[Double] = js.native
  
  /** [Method] Returns the value of accelerateOnTapHold
    * @returns Boolean
    */
  var getAccelerateOnTapHold: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_ISpinner: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of cycle
    * @returns Boolean
    */
  var getCycle: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of defaultValue
    * @returns Number
    */
  var getDefaultValue: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of groupButtons
    * @returns Boolean
    */
  var getGroupButtons: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Config Option] (Boolean) */
  var groupButtons: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (String) */
  var increment: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var incrementValue: js.UndefOr[String] = js.native
  
  /** [Method] Sets the value of accelerateOnTapHold
    * @param accelerateOnTapHold Boolean The new value.
    */
  var setAccelerateOnTapHold: js.UndefOr[js.Function1[/* accelerateOnTapHold */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_ISpinner: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of cycle
    * @param cycle Boolean The new value.
    */
  var setCycle: js.UndefOr[js.Function1[/* cycle */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of defaultValue
    * @param defaultValue Number The new value.
    */
  var setDefaultValue: js.UndefOr[js.Function1[/* defaultValue */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of groupButtons
    * @param groupButtons Boolean The new value.
    */
  var setGroupButtons: js.UndefOr[js.Function1[/* groupButtons */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Updates the component configuration
    * @param newComponent Object
    */
  var updateComponent: js.UndefOr[js.Function1[/* newComponent */ js.UndefOr[js.Any], Unit]] = js.native
}
object ISpinner {
  
  @scala.inline
  def apply(): ISpinner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpinner]
  }
  
  @scala.inline
  implicit class ISpinnerOps[Self <: ISpinner] (val x: Self) extends AnyVal {
    
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
    def setAccelerateOnTapHold(value: Boolean): Self = this.set("accelerateOnTapHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccelerateOnTapHold: Self = this.set("accelerateOnTapHold", js.undefined)
    
    @scala.inline
    def setCycle(value: Boolean): Self = this.set("cycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setGetAccelerateOnTapHold(value: () => Boolean): Self = this.set("getAccelerateOnTapHold", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetAccelerateOnTapHold: Self = this.set("getAccelerateOnTapHold", js.undefined)
    
    @scala.inline
    def setGetCls(value: () => String): Self = this.set("getCls", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCls: Self = this.set("getCls", js.undefined)
    
    @scala.inline
    def setGetCycle(value: () => Boolean): Self = this.set("getCycle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCycle: Self = this.set("getCycle", js.undefined)
    
    @scala.inline
    def setGetDefaultValue(value: () => Double): Self = this.set("getDefaultValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDefaultValue: Self = this.set("getDefaultValue", js.undefined)
    
    @scala.inline
    def setGetGroupButtons(value: () => Boolean): Self = this.set("getGroupButtons", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetGroupButtons: Self = this.set("getGroupButtons", js.undefined)
    
    @scala.inline
    def setGroupButtons(value: Boolean): Self = this.set("groupButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupButtons: Self = this.set("groupButtons", js.undefined)
    
    @scala.inline
    def setIncrement(value: String): Self = this.set("increment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    
    @scala.inline
    def setIncrementValue(value: String): Self = this.set("incrementValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementValue: Self = this.set("incrementValue", js.undefined)
    
    @scala.inline
    def setSetAccelerateOnTapHold(value: /* accelerateOnTapHold */ js.UndefOr[Boolean] => Unit): Self = this.set("setAccelerateOnTapHold", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetAccelerateOnTapHold: Self = this.set("setAccelerateOnTapHold", js.undefined)
    
    @scala.inline
    def setSetCls(value: /* cls */ js.UndefOr[String] => Unit): Self = this.set("setCls", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCls: Self = this.set("setCls", js.undefined)
    
    @scala.inline
    def setSetCycle(value: /* cycle */ js.UndefOr[Boolean] => Unit): Self = this.set("setCycle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCycle: Self = this.set("setCycle", js.undefined)
    
    @scala.inline
    def setSetDefaultValue(value: /* defaultValue */ js.UndefOr[Double] => Unit): Self = this.set("setDefaultValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDefaultValue: Self = this.set("setDefaultValue", js.undefined)
    
    @scala.inline
    def setSetGroupButtons(value: /* groupButtons */ js.UndefOr[Boolean] => Unit): Self = this.set("setGroupButtons", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetGroupButtons: Self = this.set("setGroupButtons", js.undefined)
    
    @scala.inline
    def setUpdateComponent(value: /* newComponent */ js.UndefOr[js.Any] => Unit): Self = this.set("updateComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdateComponent: Self = this.set("updateComponent", js.undefined)
  }
}
