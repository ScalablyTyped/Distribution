package typings.senchaUnderscoreTouch.Ext.scroll

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.IEvented
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends IEvented {
  /** [Method] Returns the value of cls
  		* @returns String
  		*/
  var getCls: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of element
  		* @returns Object
  		*/
  var getElement: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of indicators
  		* @returns Object
  		*/
  var getIndicators: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of indicatorsHidingDelay
  		* @returns Number
  		*/
  var getIndicatorsHidingDelay: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of indicatorsUi
  		* @returns String
  		*/
  var getIndicatorsUi: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the scroller instance in this view
  		* @returns Ext.scroll.View The scroller
  		*/
  var getScroller: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var indicatorsUi: js.UndefOr[String] = js.undefined
  /** [Method] Sets the value of cls
  		* @param cls String The new value.
  		*/
  var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of element
  		* @param element Object The new value.
  		*/
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of indicators
  		* @param indicators Object The new value.
  		*/
  var setIndicators: js.UndefOr[js.Function1[/* indicators */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of indicatorsHidingDelay
  		* @param indicatorsHidingDelay Number The new value.
  		*/
  var setIndicatorsHidingDelay: js.UndefOr[js.Function1[/* indicatorsHidingDelay */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Sets the value of indicatorsUi
  		* @param indicatorsUi String The new value.
  		*/
  var setIndicatorsUi: js.UndefOr[js.Function1[/* indicatorsUi */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of scroller
  		* @param scroller Object The new value.
  		*/
  var setScroller: js.UndefOr[js.Function1[/* scroller */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IView {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    getBubbleEvents: () => _ = null,
    getCls: () => String = null,
    getElement: () => _ = null,
    getId: () => _ = null,
    getIndicators: () => _ = null,
    getIndicatorsHidingDelay: () => Double = null,
    getIndicatorsUi: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getListeners: () => _ = null,
    getScroller: () => IView = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    indicatorsUi: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCls: /* cls */ js.UndefOr[String] => Unit = null,
    setElement: /* element */ js.UndefOr[js.Any] => Unit = null,
    setIndicators: /* indicators */ js.UndefOr[js.Any] => Unit = null,
    setIndicatorsHidingDelay: /* indicatorsHidingDelay */ js.UndefOr[Double] => Unit = null,
    setIndicatorsUi: /* indicatorsUi */ js.UndefOr[String] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setScroller: /* scroller */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IView = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCls != null) __obj.updateDynamic("getCls")(js.Any.fromFunction0(getCls))
    if (getElement != null) __obj.updateDynamic("getElement")(js.Any.fromFunction0(getElement))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getIndicators != null) __obj.updateDynamic("getIndicators")(js.Any.fromFunction0(getIndicators))
    if (getIndicatorsHidingDelay != null) __obj.updateDynamic("getIndicatorsHidingDelay")(js.Any.fromFunction0(getIndicatorsHidingDelay))
    if (getIndicatorsUi != null) __obj.updateDynamic("getIndicatorsUi")(js.Any.fromFunction0(getIndicatorsUi))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getScroller != null) __obj.updateDynamic("getScroller")(js.Any.fromFunction0(getScroller))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (indicatorsUi != null) __obj.updateDynamic("indicatorsUi")(indicatorsUi.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setElement != null) __obj.updateDynamic("setElement")(js.Any.fromFunction1(setElement))
    if (setIndicators != null) __obj.updateDynamic("setIndicators")(js.Any.fromFunction1(setIndicators))
    if (setIndicatorsHidingDelay != null) __obj.updateDynamic("setIndicatorsHidingDelay")(js.Any.fromFunction1(setIndicatorsHidingDelay))
    if (setIndicatorsUi != null) __obj.updateDynamic("setIndicatorsUi")(js.Any.fromFunction1(setIndicatorsUi))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setScroller != null) __obj.updateDynamic("setScroller")(js.Any.fromFunction1(setScroller))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IView]
  }
}

