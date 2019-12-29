package typings.senchaUnderscoreTouch.Ext.scroll

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.IEvented
import typings.senchaUnderscoreTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroller extends IEvented {
  /** [Config Option] (Number) */
  var acceleration: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var direction: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var directionLock: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var friction: js.UndefOr[Double] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of initialOffset
  		* @returns Object/Number
  		*/
  var getInitialOffset: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of momentumEasing
  		* @returns Object
  		*/
  var getMomentumEasing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of slotSnapEasing
  		* @returns Object
  		*/
  var getSlotSnapEasing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of slotSnapSize
  		* @returns Number/Object
  		*/
  var getSlotSnapSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of translatable
  		* @returns Object
  		*/
  var getTranslatable: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object/Number) */
  var initialOffset: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns true if a specified axis is enabled
  		* @param axis String The axis to check (x or y).
  		* @returns Boolean true if the axis is enabled.
  		*/
  var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[String], Boolean]] = js.undefined
  /** [Config Option] (Object) */
  var momentumEasing: js.UndefOr[js.Any] = js.undefined
  /** [Method] Change the scroll offset by the given amount
  		* @param x Number The offset to scroll by on the x axis.
  		* @param y Number The offset to scroll by on the y axis.
  		* @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollBy: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* animation */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls to the given location
  		* @param x Number The scroll position on the x axis.
  		* @param y Number The scroll position on the y axis.
  		* @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollTo: js.UndefOr[
    js.Function3[
      /* x */ js.UndefOr[Double], 
      /* y */ js.UndefOr[Double], 
      /* animation */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Scrolls to the end of the scrollable view
  		* @param animation Object
  		* @returns Ext.scroll.Scroller this
  		*/
  var scrollToEnd: js.UndefOr[js.Function1[/* animation */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of direction
  		* @param direction String The new value.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of initialOffset
  		* @param initialOffset Object/Number The new value.
  		*/
  var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of momentumEasing
  		* @param momentumEasing Object The new value.
  		*/
  var setMomentumEasing: js.UndefOr[js.Function1[/* momentumEasing */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the offset of this scroller
  		* @param offset Object The offset to move to.
  		* @returns Ext.scroll.Scroller this
  		*/
  var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of slotSnapEasing
  		* @param slotSnapEasing Object The new value.
  		*/
  var setSlotSnapEasing: js.UndefOr[js.Function1[/* slotSnapEasing */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of slotSnapSize
  		* @param slotSnapSize Number/Object The new value.
  		*/
  var setSlotSnapSize: js.UndefOr[js.Function1[/* slotSnapSize */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number/Object) */
  var slotSnapSize: js.UndefOr[js.Any] = js.undefined
  /** [Method] Updates the boundary information for this scroller
  		* @returns Ext.scroll.Scroller this
  		*/
  var updateBoundary: js.UndefOr[js.Function0[this.type]] = js.undefined
}

object IScroller {
  @scala.inline
  def apply(
    acceleration: Int | Double = null,
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
    direction: String = null,
    directionLock: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    friction: Int | Double = null,
    getBubbleEvents: () => _ = null,
    getDirection: () => String = null,
    getDirectionLock: () => Boolean = null,
    getDisabled: () => Boolean = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getInitialOffset: () => _ = null,
    getListeners: () => _ = null,
    getMomentumEasing: () => _ = null,
    getSlotSnapEasing: () => _ = null,
    getSlotSnapSize: () => _ = null,
    getTranslatable: () => _ = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    initialOffset: js.Any = null,
    isAxisEnabled: /* axis */ js.UndefOr[String] => Boolean = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    momentumEasing: js.Any = null,
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
    scrollBy: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller = null,
    scrollTo: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[js.Any]) => IScroller = null,
    scrollToEnd: /* animation */ js.UndefOr[js.Any] => IScroller = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setDirection: /* direction */ js.UndefOr[String] => Unit = null,
    setDirectionLock: /* directionLock */ js.UndefOr[Boolean] => Unit = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Unit = null,
    setInitialOffset: /* initialOffset */ js.UndefOr[js.Any] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMomentumEasing: /* momentumEasing */ js.UndefOr[js.Any] => Unit = null,
    setOffset: /* offset */ js.UndefOr[js.Any] => IScroller = null,
    setSlotSnapEasing: /* slotSnapEasing */ js.UndefOr[js.Any] => Unit = null,
    setSlotSnapSize: /* slotSnapSize */ js.UndefOr[js.Any] => Unit = null,
    setTranslatable: /* translatable */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slotSnapSize: js.Any = null,
    statics: js.Any = null,
    suspendEvents: () => Unit = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    updateBoundary: () => IScroller = null,
    uses: Array = null
  ): IScroller = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
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
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(directionLock)) __obj.updateDynamic("directionLock")(directionLock.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getDirection != null) __obj.updateDynamic("getDirection")(js.Any.fromFunction0(getDirection))
    if (getDirectionLock != null) __obj.updateDynamic("getDirectionLock")(js.Any.fromFunction0(getDirectionLock))
    if (getDisabled != null) __obj.updateDynamic("getDisabled")(js.Any.fromFunction0(getDisabled))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getInitialOffset != null) __obj.updateDynamic("getInitialOffset")(js.Any.fromFunction0(getInitialOffset))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMomentumEasing != null) __obj.updateDynamic("getMomentumEasing")(js.Any.fromFunction0(getMomentumEasing))
    if (getSlotSnapEasing != null) __obj.updateDynamic("getSlotSnapEasing")(js.Any.fromFunction0(getSlotSnapEasing))
    if (getSlotSnapSize != null) __obj.updateDynamic("getSlotSnapSize")(js.Any.fromFunction0(getSlotSnapSize))
    if (getTranslatable != null) __obj.updateDynamic("getTranslatable")(js.Any.fromFunction0(getTranslatable))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initialOffset != null) __obj.updateDynamic("initialOffset")(initialOffset.asInstanceOf[js.Any])
    if (isAxisEnabled != null) __obj.updateDynamic("isAxisEnabled")(js.Any.fromFunction1(isAxisEnabled))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (momentumEasing != null) __obj.updateDynamic("momentumEasing")(momentumEasing.asInstanceOf[js.Any])
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
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(js.Any.fromFunction3(scrollBy))
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction3(scrollTo))
    if (scrollToEnd != null) __obj.updateDynamic("scrollToEnd")(js.Any.fromFunction1(scrollToEnd))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1(setDirection))
    if (setDirectionLock != null) __obj.updateDynamic("setDirectionLock")(js.Any.fromFunction1(setDirectionLock))
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1(setDisabled))
    if (setInitialOffset != null) __obj.updateDynamic("setInitialOffset")(js.Any.fromFunction1(setInitialOffset))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMomentumEasing != null) __obj.updateDynamic("setMomentumEasing")(js.Any.fromFunction1(setMomentumEasing))
    if (setOffset != null) __obj.updateDynamic("setOffset")(js.Any.fromFunction1(setOffset))
    if (setSlotSnapEasing != null) __obj.updateDynamic("setSlotSnapEasing")(js.Any.fromFunction1(setSlotSnapEasing))
    if (setSlotSnapSize != null) __obj.updateDynamic("setSlotSnapSize")(js.Any.fromFunction1(setSlotSnapSize))
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(js.Any.fromFunction1(setTranslatable))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (slotSnapSize != null) __obj.updateDynamic("slotSnapSize")(slotSnapSize.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (updateBoundary != null) __obj.updateDynamic("updateBoundary")(js.Any.fromFunction0(updateBoundary))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScroller]
  }
}

