package typings.senchaUnderscoreTouch.ExtNs.drawNs.modifierNs

import typings.senchaUnderscoreTouch.ExtNs.Array
import typings.senchaUnderscoreTouch.ExtNs.IClass
import typings.senchaUnderscoreTouch.ExtNs.drawNs.spriteNs.ISprite
import typings.senchaUnderscoreTouch.ExtNs.mixinNs.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.senchaUnderscoreTouch.ExtNs.drawNs.modifierNs.IModifier because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined next, previous, sprite, getNext, getPrevious, getSprite, popUp, prepareAttributes, pushDown, setNext, setPrevious, setSprite */ trait IAnimation extends IObservable {
  /** [Method] Remove special easings on the given attributes
  		* @param attrs Object The source attributes.
  		*/
  var clearDurationOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Remove special easings on the given attributes
  		* @param attrs String/Array The source attribute(s).
  		*/
  var clearEasingOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Object) */
  var customDuration: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var customEasings: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var duration: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Function) */
  var easing: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of customDuration
  		* @returns Object
  		*/
  var getCustomDuration: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of customEasings
  		* @returns Object
  		*/
  var getCustomEasings: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of duration
  		* @returns Number
  		*/
  var getDuration: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Method] Returns the value of easing
  		* @returns Function
  		*/
  var getEasing: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of next
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getNext: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of previous
  		* @returns Ext.draw.modifier.Modifier
  		*/
  var getPrevious: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Returns the value of sprite
  		* @returns Ext.draw.sprite.Sprite
  		*/
  var getSprite: js.UndefOr[js.Function0[ISprite]] = js.undefined
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var next: js.UndefOr[IModifier] = js.undefined
  /** [Method] Invoked when changes need to be popped up to the top
  		* @param attributes Object The source attributes.
  		* @param changes Object The changes to be popped up.
  		*/
  var popUp: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Validate attribute set before use
  		* @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
  		*/
  var prepareAttributes: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var previous: js.UndefOr[IModifier] = js.undefined
  /** [Method] Invoked when changes need to be pushed down to the sprite
  		* @param attr Object The source attributes.
  		* @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
  		* @returns Mixed
  		*/
  var pushDown: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAnimation: js.UndefOr[
    js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
  ] = js.undefined
  /** [Method] Sets the value of customDuration
  		* @param customDuration Object The new value.
  		*/
  var setCustomDuration: js.UndefOr[js.Function1[/* customDuration */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of customEasings
  		* @param customEasings Object The new value.
  		*/
  var setCustomEasings: js.UndefOr[js.Function1[/* customEasings */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of duration
  		* @param duration Number The new value.
  		*/
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Set special duration on the given attributes
  		* @param attrs String/Array The source attributes.
  		* @param duration Number The special duration.
  		*/
  var setDurationOn: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double], Unit]
  ] = js.undefined
  /** [Method] Sets the value of easing
  		* @param easing Function The new value.
  		*/
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Set special easings on the given attributes
  		* @param attrs String/Array The source attribute(s).
  		* @param easing String The special easings.
  		*/
  var setEasingOn: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[java.lang.String], Unit]
  ] = js.undefined
  /** [Method] Sets the value of next
  		* @param next Ext.draw.modifier.Modifier The new value.
  		*/
  var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], Unit]] = js.undefined
  /** [Method] Sets the value of previous
  		* @param previous Ext.draw.modifier.Modifier The new value.
  		*/
  var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], Unit]] = js.undefined
  /** [Method] Sets the value of sprite
  		* @param sprite Ext.draw.sprite.Sprite The new value.
  		*/
  var setSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.undefined
  /** [Config Option] (Ext.draw.sprite.Sprite) */
  var sprite: js.UndefOr[ISprite] = js.undefined
  /** [Method] Stop all animations effected by this modifier */
  var stop: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IAnimation {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    bubbleEvents: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearDurationOn: /* attrs */ js.UndefOr[js.Any] => Unit = null,
    clearEasingOn: /* attrs */ js.UndefOr[js.Any] => Unit = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    customDuration: js.Any = null,
    customEasings: js.Any = null,
    destroy: () => Unit = null,
    duration: Int | Double = null,
    easing: js.Any = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: java.lang.String = null,
    fireAction: (/* eventName */ js.UndefOr[java.lang.String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ java.lang.String, /* repeated */ js.Any) => Boolean = null,
    getBubbleEvents: () => _ = null,
    getCustomDuration: () => _ = null,
    getCustomEasings: () => _ = null,
    getDuration: () => Double = null,
    getEasing: () => _ = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getListeners: () => _ = null,
    getNext: () => IAnimation = null,
    getPrevious: () => IAnimation = null,
    getSprite: () => ISprite = null,
    hasListener: /* eventName */ js.UndefOr[java.lang.String] => Boolean = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    next: IModifier = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    popUp: (/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => Unit = null,
    prepareAttributes: /* attr */ js.UndefOr[js.Any] => Unit = null,
    previous: IModifier = null,
    pushDown: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _ = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    self: IClass = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCustomDuration: /* customDuration */ js.UndefOr[js.Any] => Unit = null,
    setCustomEasings: /* customEasings */ js.UndefOr[js.Any] => Unit = null,
    setDuration: /* duration */ js.UndefOr[Double] => Unit = null,
    setDurationOn: (/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double]) => Unit = null,
    setEasing: /* easing */ js.UndefOr[js.Any] => Unit = null,
    setEasingOn: (/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[java.lang.String]) => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setNext: /* next */ js.UndefOr[IAnimation] => Unit = null,
    setPrevious: /* previous */ js.UndefOr[IAnimation] => Unit = null,
    setSprite: /* sprite */ js.UndefOr[ISprite] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sprite: ISprite = null,
    statics: js.Any = null,
    stop: () => Unit = null,
    suspendEvents: () => Unit = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[java.lang.String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IAnimation = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearDurationOn != null) __obj.updateDynamic("clearDurationOn")(js.Any.fromFunction1(clearDurationOn))
    if (clearEasingOn != null) __obj.updateDynamic("clearEasingOn")(js.Any.fromFunction1(clearEasingOn))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config)
    if (customDuration != null) __obj.updateDynamic("customDuration")(customDuration)
    if (customEasings != null) __obj.updateDynamic("customEasings")(customEasings)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCustomDuration != null) __obj.updateDynamic("getCustomDuration")(js.Any.fromFunction0(getCustomDuration))
    if (getCustomEasings != null) __obj.updateDynamic("getCustomEasings")(js.Any.fromFunction0(getCustomEasings))
    if (getDuration != null) __obj.updateDynamic("getDuration")(js.Any.fromFunction0(getDuration))
    if (getEasing != null) __obj.updateDynamic("getEasing")(js.Any.fromFunction0(getEasing))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getNext != null) __obj.updateDynamic("getNext")(js.Any.fromFunction0(getNext))
    if (getPrevious != null) __obj.updateDynamic("getPrevious")(js.Any.fromFunction0(getPrevious))
    if (getSprite != null) __obj.updateDynamic("getSprite")(js.Any.fromFunction0(getSprite))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (next != null) __obj.updateDynamic("next")(next)
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (popUp != null) __obj.updateDynamic("popUp")(js.Any.fromFunction2(popUp))
    if (prepareAttributes != null) __obj.updateDynamic("prepareAttributes")(js.Any.fromFunction1(prepareAttributes))
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (pushDown != null) __obj.updateDynamic("pushDown")(js.Any.fromFunction2(pushDown))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCustomDuration != null) __obj.updateDynamic("setCustomDuration")(js.Any.fromFunction1(setCustomDuration))
    if (setCustomEasings != null) __obj.updateDynamic("setCustomEasings")(js.Any.fromFunction1(setCustomEasings))
    if (setDuration != null) __obj.updateDynamic("setDuration")(js.Any.fromFunction1(setDuration))
    if (setDurationOn != null) __obj.updateDynamic("setDurationOn")(js.Any.fromFunction2(setDurationOn))
    if (setEasing != null) __obj.updateDynamic("setEasing")(js.Any.fromFunction1(setEasing))
    if (setEasingOn != null) __obj.updateDynamic("setEasingOn")(js.Any.fromFunction2(setEasingOn))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setNext != null) __obj.updateDynamic("setNext")(js.Any.fromFunction1(setNext))
    if (setPrevious != null) __obj.updateDynamic("setPrevious")(js.Any.fromFunction1(setPrevious))
    if (setSprite != null) __obj.updateDynamic("setSprite")(js.Any.fromFunction1(setSprite))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction0(stop))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAnimation]
  }
}

