package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.modifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- senchaUnderscoreTouchLib.ExtNs.drawNs.modifierNs.IModifier because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined next, previous, sprite, getNext, getPrevious, getSprite, popUp, prepareAttributes, pushDown, setNext, setPrevious, setSprite */ trait IAnimation
  extends senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable {
  /** [Method] Remove special easings on the given attributes
  		* @param attrs Object The source attributes.
  		*/
  var clearDurationOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Remove special easings on the given attributes
  		* @param attrs String/Array The source attribute(s).
  		*/
  var clearEasingOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var customDuration: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var customEasings: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var duration: js.UndefOr[scala.Double] = js.undefined
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
  var getDuration: js.UndefOr[js.Function0[scala.Double]] = js.undefined
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
  var getSprite: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite]] = js.undefined
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var next: js.UndefOr[IModifier] = js.undefined
  /** [Method] Invoked when changes need to be popped up to the top
  		* @param attributes Object The source attributes.
  		* @param changes Object The changes to be popped up.
  		*/
  var popUp: js.UndefOr[
    js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Validate attribute set before use
  		* @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
  		*/
  var prepareAttributes: js.UndefOr[js.Function1[/* attr */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Ext.draw.modifier.Modifier) */
  var previous: js.UndefOr[IModifier] = js.undefined
  /** [Method] Invoked when changes need to be pushed down to the sprite
  		* @param attr Object The source attributes.
  		* @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
  		* @returns Mixed
  		*/
  var pushDown: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
  		* @param object Object The Observable whose events this object is to relay.
  		* @param events String/Array/Object Array of event names to relay.
  		* @returns Ext.mixin.Observable this
  		*/
  @JSName("relayEvents")
  var relayEvents_IAnimation: js.UndefOr[
    js.Function2[
      /* object */ js.UndefOr[js.Any], 
      /* events */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.mixinNs.IObservable
    ]
  ] = js.undefined
  /** [Method] Sets the value of customDuration
  		* @param customDuration Object The new value.
  		*/
  var setCustomDuration: js.UndefOr[js.Function1[/* customDuration */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of customEasings
  		* @param customEasings Object The new value.
  		*/
  var setCustomEasings: js.UndefOr[js.Function1[/* customEasings */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of duration
  		* @param duration Number The new value.
  		*/
  var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Set special duration on the given attributes
  		* @param attrs String/Array The source attributes.
  		* @param duration Number The special duration.
  		*/
  var setDurationOn: js.UndefOr[
    js.Function2[/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of easing
  		* @param easing Function The new value.
  		*/
  var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Set special easings on the given attributes
  		* @param attrs String/Array The source attribute(s).
  		* @param easing String The special easings.
  		*/
  var setEasingOn: js.UndefOr[
    js.Function2[
      /* attrs */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the value of next
  		* @param next Ext.draw.modifier.Modifier The new value.
  		*/
  var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Sets the value of previous
  		* @param previous Ext.draw.modifier.Modifier The new value.
  		*/
  var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sprite
  		* @param sprite Ext.draw.sprite.Sprite The new value.
  		*/
  var setSprite: js.UndefOr[
    js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Ext.draw.sprite.Sprite) */
  var sprite: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite] = js.undefined
  /** [Method] Stop all animations effected by this modifier */
  var stop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IAnimation {
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
    bubbleEvents: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clearDurationOn: js.Function1[/* attrs */ js.UndefOr[js.Any], scala.Unit] = null,
    clearEasingOn: js.Function1[/* attrs */ js.UndefOr[js.Any], scala.Unit] = null,
    clearListeners: js.Function0[scala.Unit] = null,
    config: js.Any = null,
    customDuration: js.Any = null,
    customEasings: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    duration: scala.Int | scala.Double = null,
    easing: js.Any = null,
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
    getBubbleEvents: js.Function0[_] = null,
    getCustomDuration: js.Function0[_] = null,
    getCustomEasings: js.Function0[_] = null,
    getDuration: js.Function0[scala.Double] = null,
    getEasing: js.Function0[_] = null,
    getId: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getListeners: js.Function0[_] = null,
    getNext: js.Function0[IAnimation] = null,
    getPrevious: js.Function0[IAnimation] = null,
    getSprite: js.Function0[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite] = null,
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
    next: IModifier = null,
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
    popUp: js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], scala.Unit] = null,
    prepareAttributes: js.Function1[/* attr */ js.UndefOr[js.Any], scala.Unit] = null,
    previous: IModifier = null,
    pushDown: js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _] = null,
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
    setBubbleEvents: js.Function1[/* bubbleEvents */ js.UndefOr[js.Any], scala.Unit] = null,
    setCustomDuration: js.Function1[/* customDuration */ js.UndefOr[js.Any], scala.Unit] = null,
    setCustomEasings: js.Function1[/* customEasings */ js.UndefOr[js.Any], scala.Unit] = null,
    setDuration: js.Function1[/* duration */ js.UndefOr[scala.Double], scala.Unit] = null,
    setDurationOn: js.Function2[/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[scala.Double], scala.Unit] = null,
    setEasing: js.Function1[/* easing */ js.UndefOr[js.Any], scala.Unit] = null,
    setEasingOn: js.Function2[
      /* attrs */ js.UndefOr[js.Any], 
      /* easing */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    setListeners: js.Function1[/* listeners */ js.UndefOr[js.Any], scala.Unit] = null,
    setNext: js.Function1[/* next */ js.UndefOr[IAnimation], scala.Unit] = null,
    setPrevious: js.Function1[/* previous */ js.UndefOr[IAnimation], scala.Unit] = null,
    setSprite: js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Unit
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sprite: senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite = null,
    statics: js.Any = null,
    stop: js.Function0[scala.Unit] = null,
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
  ): IAnimation = {
    val __obj = js.Dynamic.literal()
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
    if (clearDurationOn != null) __obj.updateDynamic("clearDurationOn")(clearDurationOn)
    if (clearEasingOn != null) __obj.updateDynamic("clearEasingOn")(clearEasingOn)
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(clearListeners)
    if (config != null) __obj.updateDynamic("config")(config)
    if (customDuration != null) __obj.updateDynamic("customDuration")(customDuration)
    if (customEasings != null) __obj.updateDynamic("customEasings")(customEasings)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(enableBubble)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fireAction != null) __obj.updateDynamic("fireAction")(fireAction)
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(fireEvent)
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(getBubbleEvents)
    if (getCustomDuration != null) __obj.updateDynamic("getCustomDuration")(getCustomDuration)
    if (getCustomEasings != null) __obj.updateDynamic("getCustomEasings")(getCustomEasings)
    if (getDuration != null) __obj.updateDynamic("getDuration")(getDuration)
    if (getEasing != null) __obj.updateDynamic("getEasing")(getEasing)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getListeners != null) __obj.updateDynamic("getListeners")(getListeners)
    if (getNext != null) __obj.updateDynamic("getNext")(getNext)
    if (getPrevious != null) __obj.updateDynamic("getPrevious")(getPrevious)
    if (getSprite != null) __obj.updateDynamic("getSprite")(getSprite)
    if (hasListener != null) __obj.updateDynamic("hasListener")(hasListener)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (mon != null) __obj.updateDynamic("mon")(mon)
    if (mun != null) __obj.updateDynamic("mun")(mun)
    if (next != null) __obj.updateDynamic("next")(next)
    if (on != null) __obj.updateDynamic("on")(on)
    if (onAfter != null) __obj.updateDynamic("onAfter")(onAfter)
    if (onBefore != null) __obj.updateDynamic("onBefore")(onBefore)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (popUp != null) __obj.updateDynamic("popUp")(popUp)
    if (prepareAttributes != null) __obj.updateDynamic("prepareAttributes")(prepareAttributes)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (pushDown != null) __obj.updateDynamic("pushDown")(pushDown)
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(relayEvents)
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(removeAfterListener)
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(removeBeforeListener)
    if (removeListener != null) __obj.updateDynamic("removeListener")(removeListener)
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(removeManagedListener)
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(resumeEvents)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(setBubbleEvents)
    if (setCustomDuration != null) __obj.updateDynamic("setCustomDuration")(setCustomDuration)
    if (setCustomEasings != null) __obj.updateDynamic("setCustomEasings")(setCustomEasings)
    if (setDuration != null) __obj.updateDynamic("setDuration")(setDuration)
    if (setDurationOn != null) __obj.updateDynamic("setDurationOn")(setDurationOn)
    if (setEasing != null) __obj.updateDynamic("setEasing")(setEasing)
    if (setEasingOn != null) __obj.updateDynamic("setEasingOn")(setEasingOn)
    if (setListeners != null) __obj.updateDynamic("setListeners")(setListeners)
    if (setNext != null) __obj.updateDynamic("setNext")(setNext)
    if (setPrevious != null) __obj.updateDynamic("setPrevious")(setPrevious)
    if (setSprite != null) __obj.updateDynamic("setSprite")(setSprite)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stop != null) __obj.updateDynamic("stop")(stop)
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(suspendEvents)
    if (un != null) __obj.updateDynamic("un")(un)
    if (unAfter != null) __obj.updateDynamic("unAfter")(unAfter)
    if (unBefore != null) __obj.updateDynamic("unBefore")(unBefore)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAnimation]
  }
}

