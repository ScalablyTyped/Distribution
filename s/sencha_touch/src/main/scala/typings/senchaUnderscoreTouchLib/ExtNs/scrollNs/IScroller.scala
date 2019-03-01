package typings
package senchaUnderscoreTouchLib.ExtNs.scrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroller
  extends senchaUnderscoreTouchLib.ExtNs.IEvented {
  /** [Config Option] (Number) */
  var acceleration: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var directionLock: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var friction: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns the value of direction
  		* @returns String
  		*/
  var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of directionLock
  		* @returns Boolean
  		*/
  var getDirectionLock: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of disabled
  		* @returns Boolean
  		*/
  var getDisabled: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
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
  var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], scala.Boolean]] = js.undefined
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
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
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
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
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
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of directionLock
  		* @param directionLock Boolean The new value.
  		*/
  var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of disabled
  		* @param disabled Boolean The new value.
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of initialOffset
  		* @param initialOffset Object/Number The new value.
  		*/
  var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of momentumEasing
  		* @param momentumEasing Object The new value.
  		*/
  var setMomentumEasing: js.UndefOr[js.Function1[/* momentumEasing */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the offset of this scroller
  		* @param offset Object The offset to move to.
  		* @returns Ext.scroll.Scroller this
  		*/
  var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of slotSnapEasing
  		* @param slotSnapEasing Object The new value.
  		*/
  var setSlotSnapEasing: js.UndefOr[js.Function1[/* slotSnapEasing */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of slotSnapSize
  		* @param slotSnapSize Number/Object The new value.
  		*/
  var setSlotSnapSize: js.UndefOr[js.Function1[/* slotSnapSize */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of translatable
  		* @param translatable Object The new value.
  		*/
  var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
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
    acceleration: scala.Int | scala.Double = null,
    addAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    addEvents: js.Function1[/* eventNames */ js.UndefOr[js.Any], scala.Unit] = null,
    addListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addManagedListener: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    direction: java.lang.String = null,
    directionLock: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enableBubble: js.Function1[/* events */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    fireAction: js.Function4[
      /* eventName */ js.UndefOr[java.lang.String], 
      /* args */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      _
    ] = null,
    fireEvent: js.Function2[/* eventName */ java.lang.String, /* repeated */ js.Any, scala.Boolean] = null,
    friction: scala.Int | scala.Double = null,
    getBubbleEvents: js.Function0[_] = null,
    getDirection: js.Function0[java.lang.String] = null,
    getDirectionLock: js.Function0[scala.Boolean] = null,
    getDisabled: js.Function0[scala.Boolean] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getInitialOffset: js.Function0[_] = null,
    getListeners: js.Function0[_] = null,
    getMomentumEasing: js.Function0[_] = null,
    getSlotSnapEasing: js.Function0[_] = null,
    getSlotSnapSize: js.Function0[_] = null,
    getTranslatable: js.Function0[_] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    initialOffset: js.Any = null,
    isAxisEnabled: js.Function1[/* axis */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    momentumEasing: js.Any = null,
    mon: js.Function5[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mun: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    on: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    onAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    onBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    platformConfig: js.Any = null,
    relayEvents: js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ] = null,
    removeAfterListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeBeforeListener: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    removeListener: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    removeManagedListener: js.Function4[
      /* object */ js.UndefOr[js.Any], 
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    resumeEvents: js.Function1[/* discardQueuedEvents */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    scrollBy: js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* animation */ js.UndefOr[js.Any], 
      IScroller
    ] = null,
    scrollTo: js.Function3[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* animation */ js.UndefOr[js.Any], 
      IScroller
    ] = null,
    scrollToEnd: js.Function1[/* animation */ js.UndefOr[js.Any], IScroller] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setDirection: js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDirectionLock: js.Function1[/* directionLock */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDisabled: js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setInitialOffset: js.Function1[/* initialOffset */ js.UndefOr[js.Any], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setMomentumEasing: js.Function1[/* momentumEasing */ js.UndefOr[js.Any], scala.Unit] = null,
    setOffset: js.Function1[/* offset */ js.UndefOr[js.Any], IScroller] = null,
    setSlotSnapEasing: js.Function1[/* slotSnapEasing */ js.UndefOr[js.Any], scala.Unit] = null,
    setSlotSnapSize: js.Function1[/* slotSnapSize */ js.UndefOr[js.Any], scala.Unit] = null,
    setTranslatable: js.Function1[/* translatable */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    slotSnapSize: js.Any = null,
    statics: js.Any = null,
    suspendEvents: js.Function0[scala.Unit] = null,
    un: js.Function5[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      /* order */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    unAfter: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    unBefore: js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    updateBoundary: js.Function0[IScroller] = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IScroller = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(directionLock)) __obj.updateDynamic("directionLock")(directionLock)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getDirection != null) __obj.updateDynamic("getDirection")(getDirection)
    if (getDirectionLock != null) __obj.updateDynamic("getDirectionLock")(getDirectionLock)
    if (getDisabled != null) __obj.updateDynamic("getDisabled")(getDisabled)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getInitialOffset != null) __obj.updateDynamic("getInitialOffset")(getInitialOffset)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getMomentumEasing != null) __obj.updateDynamic("getMomentumEasing")(getMomentumEasing)
    if (getSlotSnapEasing != null) __obj.updateDynamic("getSlotSnapEasing")(getSlotSnapEasing)
    if (getSlotSnapSize != null) __obj.updateDynamic("getSlotSnapSize")(getSlotSnapSize)
    if (getTranslatable != null) __obj.updateDynamic("getTranslatable")(getTranslatable)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initialOffset != null) __obj.updateDynamic("initialOffset")(initialOffset)
    if (isAxisEnabled != null) __obj.updateDynamic("isAxisEnabled")(isAxisEnabled)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (momentumEasing != null) __obj.updateDynamic("momentumEasing")(momentumEasing)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (scrollBy != null) __obj.updateDynamic("scrollBy")(scrollBy)
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo)
    if (scrollToEnd != null) __obj.updateDynamic("scrollToEnd")(scrollToEnd)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setDirection != null) __obj.updateDynamic("setDirection")(setDirection)
    if (setDirectionLock != null) __obj.updateDynamic("setDirectionLock")(setDirectionLock)
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(setDisabled)
    if (setInitialOffset != null) __obj.updateDynamic("setInitialOffset")(setInitialOffset)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setMomentumEasing != null) __obj.updateDynamic("setMomentumEasing")(setMomentumEasing)
    if (setOffset != null) __obj.updateDynamic("setOffset")(setOffset)
    if (setSlotSnapEasing != null) __obj.updateDynamic("setSlotSnapEasing")(setSlotSnapEasing)
    if (setSlotSnapSize != null) __obj.updateDynamic("setSlotSnapSize")(setSlotSnapSize)
    if (setTranslatable != null) __obj.updateDynamic("setTranslatable")(setTranslatable)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (slotSnapSize != null) __obj.updateDynamic("slotSnapSize")(slotSnapSize)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (updateBoundary != null) __obj.updateDynamic("updateBoundary")(updateBoundary)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IScroller]
  }
}

