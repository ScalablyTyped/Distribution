package typings
package senchaUnderscoreTouchLib.ExtNs.fxNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlideIn extends IAbstract {
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the value of isElementBoxFit
  		* @returns Boolean
  		*/
  var getIsElementBoxFit: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of offset
  		* @returns Number
  		*/
  var getOffset: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Returns the value of out
  		* @returns Boolean
  		*/
  var getOut: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of useCssTransform
  		* @returns Boolean
  		*/
  var getUseCssTransform: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Config Option] (Number) */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var out: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of containerBox
  		* @param containerBox String The new value.
  		*/
  var setContainerBox: js.UndefOr[js.Function1[/* containerBox */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of elementBox
  		* @param elementBox String The new value.
  		*/
  var setElementBox: js.UndefOr[js.Function1[/* elementBox */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of isElementBoxFit
  		* @param isElementBoxFit Boolean The new value.
  		*/
  var setIsElementBoxFit: js.UndefOr[js.Function1[/* isElementBoxFit */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of offset
  		* @param offset Number The new value.
  		*/
  var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Sets the value of out
  		* @param out Boolean The new value.
  		*/
  var setOut: js.UndefOr[js.Function1[/* out */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of useCssTransform
  		* @param useCssTransform Boolean The new value.
  		*/
  var setUseCssTransform: js.UndefOr[js.Function1[/* useCssTransform */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

object ISlideIn {
  @scala.inline
  def apply(
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
    before: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    direction: java.lang.String = null,
    easing: java.lang.String = null,
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
    getAfter: js.Function0[_] = null,
    getBefore: js.Function0[_] = null,
    getBubbleEvents: js.Function0[_] = null,
    getDelay: js.Function0[scala.Double] = null,
    getDirection: js.Function0[java.lang.String] = null,
    getDuration: js.Function0[scala.Double] = null,
    getEasing: js.Function0[java.lang.String] = null,
    getElement: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getIsElementBoxFit: js.Function0[scala.Boolean] = null,
    getIteration: js.Function0[scala.Double] = null,
    getListeners: js.Function0[_] = null,
    getName: js.Function0[java.lang.String] = null,
    getOffset: js.Function0[scala.Double] = null,
    getOnBeforeEnd: js.Function0[_] = null,
    getOnBeforeStart: js.Function0[_] = null,
    getOnEnd: js.Function0[_] = null,
    getOut: js.Function0[scala.Boolean] = null,
    getPreserveEndState: js.Function0[scala.Boolean] = null,
    getReplacePrevious: js.Function0[scala.Boolean] = null,
    getReverse: js.Function0[_] = null,
    getScope: js.Function0[_] = null,
    getUseCssTransform: js.Function0[scala.Boolean] = null,
    hasListener: js.Function1[/* eventName */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
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
    offset: scala.Int | scala.Double = null,
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
    out: js.UndefOr[scala.Boolean] = js.undefined,
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
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAfter: js.Function1[/* after */ js.UndefOr[js.Any], scala.Unit] = null,
    setBefore: js.Function1[/* before */ js.UndefOr[js.Any], scala.Unit] = null,
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setContainerBox: js.Function1[/* containerBox */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDelay: js.Function1[/* delay */ js.UndefOr[scala.Double], scala.Unit] = null,
    setDirection: js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setDuration: js.Function1[/* duration */ js.UndefOr[scala.Double], scala.Unit] = null,
    setEasing: js.Function1[/* easing */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setElement: js.Function1[/* element */ js.UndefOr[js.Any], scala.Unit] = null,
    setElementBox: js.Function1[/* elementBox */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setIsElementBoxFit: js.Function1[/* isElementBoxFit */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setIteration: js.Function1[/* iteration */ js.UndefOr[scala.Double], scala.Unit] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setName: js.Function1[/* name */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setOffset: js.Function1[/* offset */ js.UndefOr[scala.Double], scala.Unit] = null,
    setOnBeforeEnd: js.Function1[/* onBeforeEnd */ js.UndefOr[js.Any], scala.Unit] = null,
    setOnBeforeStart: js.Function1[/* onBeforeStart */ js.UndefOr[js.Any], scala.Unit] = null,
    setOnEnd: js.Function1[/* onEnd */ js.UndefOr[js.Any], scala.Unit] = null,
    setOut: js.Function1[/* out */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setPreserveEndState: js.Function1[/* preserveEndState */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setReplacePrevious: js.Function1[/* replacePrevious */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setReverse: js.Function1[/* reverse */ js.UndefOr[js.Any], scala.Unit] = null,
    setScope: js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    setUseCssTransform: js.Function1[/* useCssTransform */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
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
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISlideIn = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(addAfterListener)
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(addBeforeListener)
    if (addEvents != null) __obj.updateDynamic("addEvents")(addEvents)
    if (addListener != null) __obj.updateDynamic("addListener")(addListener)
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(addManagedListener)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (before != null) __obj.updateDynamic("before")(before)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getAfter != null) __obj.updateDynamic("getAfter")(getAfter)
    if (getBefore != null) __obj.updateDynamic("getBefore")(getBefore)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getDelay != null) __obj.updateDynamic("getDelay")(getDelay)
    if (getDirection != null) __obj.updateDynamic("getDirection")(getDirection)
    if (getDuration != null) __obj.updateDynamic("getDuration")(getDuration)
    if (getEasing != null) __obj.updateDynamic("getEasing")(getEasing)
    if (getElement != null) __obj.updateDynamic("getElement")(getElement)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getIsElementBoxFit != null) __obj.updateDynamic("getIsElementBoxFit")(getIsElementBoxFit)
    if (getIteration != null) __obj.updateDynamic("getIteration")(getIteration)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getName != null) __obj.updateDynamic("getName")(getName)
    if (getOffset != null) __obj.updateDynamic("getOffset")(getOffset)
    if (getOnBeforeEnd != null) __obj.updateDynamic("getOnBeforeEnd")(getOnBeforeEnd)
    if (getOnBeforeStart != null) __obj.updateDynamic("getOnBeforeStart")(getOnBeforeStart)
    if (getOnEnd != null) __obj.updateDynamic("getOnEnd")(getOnEnd)
    if (getOut != null) __obj.updateDynamic("getOut")(getOut)
    if (getPreserveEndState != null) __obj.updateDynamic("getPreserveEndState")(getPreserveEndState)
    if (getReplacePrevious != null) __obj.updateDynamic("getReplacePrevious")(getReplacePrevious)
    if (getReverse != null) __obj.updateDynamic("getReverse")(getReverse)
    if (getScope != null) __obj.updateDynamic("getScope")(getScope)
    if (getUseCssTransform != null) __obj.updateDynamic("getUseCssTransform")(getUseCssTransform)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (!js.isUndefined(out)) __obj.updateDynamic("out")(out)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAfter != null) __obj.updateDynamic("setAfter")(setAfter)
    if (setBefore != null) __obj.updateDynamic("setBefore")(setBefore)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setContainerBox != null) __obj.updateDynamic("setContainerBox")(setContainerBox)
    if (setDelay != null) __obj.updateDynamic("setDelay")(setDelay)
    if (setDirection != null) __obj.updateDynamic("setDirection")(setDirection)
    if (setDuration != null) __obj.updateDynamic("setDuration")(setDuration)
    if (setEasing != null) __obj.updateDynamic("setEasing")(setEasing)
    if (setElement != null) __obj.updateDynamic("setElement")(setElement)
    if (setElementBox != null) __obj.updateDynamic("setElementBox")(setElementBox)
    if (setIsElementBoxFit != null) __obj.updateDynamic("setIsElementBoxFit")(setIsElementBoxFit)
    if (setIteration != null) __obj.updateDynamic("setIteration")(setIteration)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setName != null) __obj.updateDynamic("setName")(setName)
    if (setOffset != null) __obj.updateDynamic("setOffset")(setOffset)
    if (setOnBeforeEnd != null) __obj.updateDynamic("setOnBeforeEnd")(setOnBeforeEnd)
    if (setOnBeforeStart != null) __obj.updateDynamic("setOnBeforeStart")(setOnBeforeStart)
    if (setOnEnd != null) __obj.updateDynamic("setOnEnd")(setOnEnd)
    if (setOut != null) __obj.updateDynamic("setOut")(setOut)
    if (setPreserveEndState != null) __obj.updateDynamic("setPreserveEndState")(setPreserveEndState)
    if (setReplacePrevious != null) __obj.updateDynamic("setReplacePrevious")(setReplacePrevious)
    if (setReverse != null) __obj.updateDynamic("setReverse")(setReverse)
    if (setScope != null) __obj.updateDynamic("setScope")(setScope)
    if (setUseCssTransform != null) __obj.updateDynamic("setUseCssTransform")(setUseCssTransform)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISlideIn]
  }
}

