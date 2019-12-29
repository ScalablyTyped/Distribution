package typings.senchaUnderscoreTouch.Ext.fx.animation

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFadeIn extends IAbstract {
  /** [Method] Returns the value of out
  		* @returns Boolean
  		*/
  var getOut: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Config Option] (Boolean) */
  var out: js.UndefOr[Boolean] = js.undefined
  /** [Method] Sets the value of out
  		* @param out Boolean The new value.
  		*/
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[Boolean], Unit]] = js.undefined
}

object IFadeIn {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    before: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    easing: String = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    getAfter: () => _ = null,
    getBefore: () => _ = null,
    getBubbleEvents: () => _ = null,
    getDelay: () => Double = null,
    getDirection: () => String = null,
    getDuration: () => Double = null,
    getEasing: () => String = null,
    getElement: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getIteration: () => Double = null,
    getListeners: () => _ = null,
    getName: () => String = null,
    getOnBeforeEnd: () => _ = null,
    getOnBeforeStart: () => _ = null,
    getOnEnd: () => _ = null,
    getOut: () => Boolean = null,
    getPreserveEndState: () => Boolean = null,
    getReplacePrevious: () => Boolean = null,
    getReverse: () => _ = null,
    getScope: () => _ = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    out: js.UndefOr[Boolean] = js.undefined,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setAfter: /* after */ js.UndefOr[js.Any] => Unit = null,
    setBefore: /* before */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setDelay: /* delay */ js.UndefOr[Double] => Unit = null,
    setDirection: /* direction */ js.UndefOr[String] => Unit = null,
    setDuration: /* duration */ js.UndefOr[Double] => Unit = null,
    setEasing: /* easing */ js.UndefOr[String] => Unit = null,
    setElement: /* element */ js.UndefOr[js.Any] => Unit = null,
    setIteration: /* iteration */ js.UndefOr[Double] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setName: /* name */ js.UndefOr[String] => Unit = null,
    setOnBeforeEnd: /* onBeforeEnd */ js.UndefOr[js.Any] => Unit = null,
    setOnBeforeStart: /* onBeforeStart */ js.UndefOr[js.Any] => Unit = null,
    setOnEnd: /* onEnd */ js.UndefOr[js.Any] => Unit = null,
    setOut: /* out */ js.UndefOr[Boolean] => Unit = null,
    setPreserveEndState: /* preserveEndState */ js.UndefOr[Boolean] => Unit = null,
    setReplacePrevious: /* replacePrevious */ js.UndefOr[Boolean] => Unit = null,
    setReverse: /* reverse */ js.UndefOr[js.Any] => Unit = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IFadeIn = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getAfter != null) __obj.updateDynamic("getAfter")(js.Any.fromFunction0(getAfter))
    if (getBefore != null) __obj.updateDynamic("getBefore")(js.Any.fromFunction0(getBefore))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getDelay != null) __obj.updateDynamic("getDelay")(js.Any.fromFunction0(getDelay))
    if (getDirection != null) __obj.updateDynamic("getDirection")(js.Any.fromFunction0(getDirection))
    if (getDuration != null) __obj.updateDynamic("getDuration")(js.Any.fromFunction0(getDuration))
    if (getEasing != null) __obj.updateDynamic("getEasing")(js.Any.fromFunction0(getEasing))
    if (getElement != null) __obj.updateDynamic("getElement")(js.Any.fromFunction0(getElement))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getIteration != null) __obj.updateDynamic("getIteration")(js.Any.fromFunction0(getIteration))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getName != null) __obj.updateDynamic("getName")(js.Any.fromFunction0(getName))
    if (getOnBeforeEnd != null) __obj.updateDynamic("getOnBeforeEnd")(js.Any.fromFunction0(getOnBeforeEnd))
    if (getOnBeforeStart != null) __obj.updateDynamic("getOnBeforeStart")(js.Any.fromFunction0(getOnBeforeStart))
    if (getOnEnd != null) __obj.updateDynamic("getOnEnd")(js.Any.fromFunction0(getOnEnd))
    if (getOut != null) __obj.updateDynamic("getOut")(js.Any.fromFunction0(getOut))
    if (getPreserveEndState != null) __obj.updateDynamic("getPreserveEndState")(js.Any.fromFunction0(getPreserveEndState))
    if (getReplacePrevious != null) __obj.updateDynamic("getReplacePrevious")(js.Any.fromFunction0(getReplacePrevious))
    if (getReverse != null) __obj.updateDynamic("getReverse")(js.Any.fromFunction0(getReverse))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (!js.isUndefined(out)) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAfter != null) __obj.updateDynamic("setAfter")(js.Any.fromFunction1(setAfter))
    if (setBefore != null) __obj.updateDynamic("setBefore")(js.Any.fromFunction1(setBefore))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setDelay != null) __obj.updateDynamic("setDelay")(js.Any.fromFunction1(setDelay))
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1(setDirection))
    if (setDuration != null) __obj.updateDynamic("setDuration")(js.Any.fromFunction1(setDuration))
    if (setEasing != null) __obj.updateDynamic("setEasing")(js.Any.fromFunction1(setEasing))
    if (setElement != null) __obj.updateDynamic("setElement")(js.Any.fromFunction1(setElement))
    if (setIteration != null) __obj.updateDynamic("setIteration")(js.Any.fromFunction1(setIteration))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setName != null) __obj.updateDynamic("setName")(js.Any.fromFunction1(setName))
    if (setOnBeforeEnd != null) __obj.updateDynamic("setOnBeforeEnd")(js.Any.fromFunction1(setOnBeforeEnd))
    if (setOnBeforeStart != null) __obj.updateDynamic("setOnBeforeStart")(js.Any.fromFunction1(setOnBeforeStart))
    if (setOnEnd != null) __obj.updateDynamic("setOnEnd")(js.Any.fromFunction1(setOnEnd))
    if (setOut != null) __obj.updateDynamic("setOut")(js.Any.fromFunction1(setOut))
    if (setPreserveEndState != null) __obj.updateDynamic("setPreserveEndState")(js.Any.fromFunction1(setPreserveEndState))
    if (setReplacePrevious != null) __obj.updateDynamic("setReplacePrevious")(js.Any.fromFunction1(setReplacePrevious))
    if (setReverse != null) __obj.updateDynamic("setReverse")(js.Any.fromFunction1(setReverse))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFadeIn]
  }
}

