package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.mixin.IProgressable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined dynamic, maxProgressInput, maxProgressOutput, minProgressInput, minProgressOutput, state, getDynamic, getMaxProgressInput, getMaxProgressOutput, getMinProgressInput, getMinProgressOutput, getState, setDynamic, setMaxProgressInput, setMaxProgressOutput, setMinProgressInput, setMinProgressOutput, setState */ @js.native
trait IProgressIndicator extends IContainer {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Object) */
  var fallbackText: js.UndefOr[js.Any] = js.native
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
  /** [Method] Returns the value of monitoredStates
    * @returns Object
    */
  var getMonitoredStates: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of state
    * @returns String
    */
  var getState: js.UndefOr[js.Function0[java.lang.String]] = js.native
  /** [Config Option] (String/Ext.XTemplate/Object) */
  var loadingText: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var maxProgressInput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var maxProgressOutput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minProgressInput: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minProgressOutput: js.UndefOr[Double] = js.native
  /** [Config Option] (Object) */
  var monitoredStates: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of dynamic
    * @param dynamic Boolean The new value.
    */
  var setDynamic: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of fallbackText
    * @param fallbackText String/Object The new value.
    */
  var setFallbackText: js.UndefOr[js.Function1[/* fallbackText */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of loadingText
    * @param loadingText String/Ext.XTemplate/Object The new value.
    */
  var setLoadingText: js.UndefOr[js.Function1[/* loadingText */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of maxProgressInput
    * @param maxProgressInput Number The new value.
    */
  var setMaxProgressInput: js.UndefOr[js.Function1[js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of maxProgressOutput
    * @param maxProgressOutput Number The new value.
    */
  var setMaxProgressOutput: js.UndefOr[js.Function1[/* maxProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minProgressInput
    * @param minProgressInput Number The new value.
    */
  var setMinProgressInput: js.UndefOr[js.Function1[js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of minProgressOutput
    * @param minProgressOutput Number The new value.
    */
  var setMinProgressOutput: js.UndefOr[js.Function1[/* minProgressOutput */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Sets the value of monitoredStates
    * @param monitoredStates Object The new value.
    */
  var setMonitoredStates: js.UndefOr[js.Function1[/* monitoredStates */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of state
    * @param state String The new value.
    */
  var setState: js.UndefOr[js.Function1[/* state */ js.UndefOr[java.lang.String], Unit]] = js.native
  /** [Config Option] (String) */
  var state: js.UndefOr[java.lang.String] = js.native
}

object IProgressIndicator {
  @scala.inline
  def apply(): IProgressIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressIndicator]
  }
  @scala.inline
  implicit class IProgressIndicatorOps[Self <: IProgressIndicator] (val x: Self) extends AnyVal {
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
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
    @scala.inline
    def setFallbackText(value: js.Any): Self = this.set("fallbackText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallbackText: Self = this.set("fallbackText", js.undefined)
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
    def setGetMonitoredStates(value: () => _): Self = this.set("getMonitoredStates", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMonitoredStates: Self = this.set("getMonitoredStates", js.undefined)
    @scala.inline
    def setGetState(value: () => java.lang.String): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetState: Self = this.set("getState", js.undefined)
    @scala.inline
    def setLoadingText(value: js.Any): Self = this.set("loadingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingText: Self = this.set("loadingText", js.undefined)
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
    def setMonitoredStates(value: js.Any): Self = this.set("monitoredStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoredStates: Self = this.set("monitoredStates", js.undefined)
    @scala.inline
    def setSetDynamic(value: js.UndefOr[Boolean] => Unit): Self = this.set("setDynamic", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDynamic: Self = this.set("setDynamic", js.undefined)
    @scala.inline
    def setSetFallbackText(value: /* fallbackText */ js.UndefOr[js.Any] => Unit): Self = this.set("setFallbackText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFallbackText: Self = this.set("setFallbackText", js.undefined)
    @scala.inline
    def setSetLoadingText(value: /* loadingText */ js.UndefOr[js.Any] => Unit): Self = this.set("setLoadingText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLoadingText: Self = this.set("setLoadingText", js.undefined)
    @scala.inline
    def setSetMaxProgressInput(value: js.UndefOr[Double] => Unit): Self = this.set("setMaxProgressInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxProgressInput: Self = this.set("setMaxProgressInput", js.undefined)
    @scala.inline
    def setSetMaxProgressOutput(value: /* maxProgressOutput */ js.UndefOr[Double] => Unit): Self = this.set("setMaxProgressOutput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMaxProgressOutput: Self = this.set("setMaxProgressOutput", js.undefined)
    @scala.inline
    def setSetMinProgressInput(value: js.UndefOr[Double] => Unit): Self = this.set("setMinProgressInput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinProgressInput: Self = this.set("setMinProgressInput", js.undefined)
    @scala.inline
    def setSetMinProgressOutput(value: /* minProgressOutput */ js.UndefOr[Double] => Unit): Self = this.set("setMinProgressOutput", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMinProgressOutput: Self = this.set("setMinProgressOutput", js.undefined)
    @scala.inline
    def setSetMonitoredStates(value: /* monitoredStates */ js.UndefOr[js.Any] => Unit): Self = this.set("setMonitoredStates", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMonitoredStates: Self = this.set("setMonitoredStates", js.undefined)
    @scala.inline
    def setSetState(value: /* state */ js.UndefOr[java.lang.String] => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetState: Self = this.set("setState", js.undefined)
    @scala.inline
    def setState(value: java.lang.String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

