package typings.senchaTouch.Ext.mixin

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressable extends IBase {
  
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  
  /** [Method] Returns the value of dynamic
    * @returns Boolean
    */
  var getDynamic: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /** [Method] Returns the value of maxProgressInput
    * @returns Number
    */
  var getMaxProgressInput: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of maxProgressOutput
    * @returns Number
    */
  var getMaxProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of minProgressInput
    * @returns Number
    */
  var getMinProgressInput: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of minProgressOutput
    * @returns Number
    */
  var getMinProgressOutput: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of state
    * @returns String
    */
  var getState: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.native
  
  /** [Method] Sets the value of dynamic
    * @param dynamic Boolean The new value.
    */
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[Boolean], Unit]] = js.native
  
  /** [Method] Sets the value of maxProgressInput
    * @param maxProgressInput Number The new value.
    */
  var setMaxProgressInput: js.UndefOr[js.Function1[/* maxProgressInput */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of maxProgressOutput
    * @param maxProgressOutput Number The new value.
    */
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of minProgressInput
    * @param minProgressInput Number The new value.
    */
  var setMinProgressInput: js.UndefOr[js.Function1[/* minProgressInput */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of minProgressOutput
    * @param minProgressOutput Number The new value.
    */
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of state
    * @param state String The new value.
    */
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var state: js.UndefOr[String] = js.native
}
object IProgressable {
  
  @scala.inline
  def apply(): IProgressable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressable]
  }
  
  @scala.inline
  implicit class IProgressableOps[Self <: IProgressable] (val x: Self) extends AnyVal {
    
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
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    
    @scala.inline
    def setGetDynamic(value: () => Boolean): Self = this.set("getDynamic", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDynamic: Self = this.set("getDynamic", js.undefined)
    
    @scala.inline
    def setGetMaxProgressInput(value: () => Double): Self = this.set("getMaxProgressInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxProgressInput: Self = this.set("getMaxProgressInput", js.undefined)
    
    @scala.inline
    def setGetMaxProgressOutput(value: () => Double): Self = this.set("getMaxProgressOutput", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMaxProgressOutput: Self = this.set("getMaxProgressOutput", js.undefined)
    
    @scala.inline
    def setGetMinProgressInput(value: () => Double): Self = this.set("getMinProgressInput", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinProgressInput: Self = this.set("getMinProgressInput", js.undefined)
    
    @scala.inline
    def setGetMinProgressOutput(value: () => Double): Self = this.set("getMinProgressOutput", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetMinProgressOutput: Self = this.set("getMinProgressOutput", js.undefined)
    
    @scala.inline
    def setGetState(value: () => String): Self = this.set("getState", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetState: Self = this.set("getState", js.undefined)
    
    @scala.inline
    def setMaxProgressInput(value: Double): Self = this.set("maxProgressInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxProgressInput: Self = this.set("maxProgressInput", js.undefined)
    
    @scala.inline
    def setMaxProgressOutput(value: Double): Self = this.set("maxProgressOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxProgressOutput: Self = this.set("maxProgressOutput", js.undefined)
    
    @scala.inline
    def setMinProgressInput(value: Double): Self = this.set("minProgressInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinProgressInput: Self = this.set("minProgressInput", js.undefined)
    
    @scala.inline
    def setMinProgressOutput(value: Double): Self = this.set("minProgressOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinProgressOutput: Self = this.set("minProgressOutput", js.undefined)
    
    @scala.inline
    def setSetDynamic(value: /* dynamic */ js.UndefOr[Boolean] => Unit): Self = this.set("setDynamic", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDynamic: Self = this.set("setDynamic", js.undefined)
    
    @scala.inline
    def setSetMaxProgressInput(value: /* maxProgressInput */ js.UndefOr[Double] => Unit): Self = this.set("setMaxProgressInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxProgressInput: Self = this.set("setMaxProgressInput", js.undefined)
    
    @scala.inline
    def setSetMaxProgressOutput(value: /* maxProgressOutput */ js.UndefOr[Double] => Unit): Self = this.set("setMaxProgressOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMaxProgressOutput: Self = this.set("setMaxProgressOutput", js.undefined)
    
    @scala.inline
    def setSetMinProgressInput(value: /* minProgressInput */ js.UndefOr[Double] => Unit): Self = this.set("setMinProgressInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinProgressInput: Self = this.set("setMinProgressInput", js.undefined)
    
    @scala.inline
    def setSetMinProgressOutput(value: /* minProgressOutput */ js.UndefOr[Double] => Unit): Self = this.set("setMinProgressOutput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMinProgressOutput: Self = this.set("setMinProgressOutput", js.undefined)
    
    @scala.inline
    def setSetState(value: /* state */ js.UndefOr[String] => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetState: Self = this.set("setState", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
