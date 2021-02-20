package typings.senchaTouch.Ext.draw

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.senchaTouch.Ext.mixin.IObservable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifier {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.senchaTouch.Ext.IClass because Already inherited
  - typings.senchaTouch.Ext.IBase because Already inherited
  - typings.senchaTouch.Ext.draw.modifier.IModifier because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined next, previous, sprite, getNext, getPrevious, getSprite, popUp, prepareAttributes, pushDown, setNext, setPrevious, setSprite */ @js.native
  trait IAnimation extends IObservable {
    
    /** [Method] Remove special easings on the given attributes
      * @param attrs Object The source attributes.
      */
    var clearDurationOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Remove special easings on the given attributes
      * @param attrs String/Array The source attribute(s).
      */
    var clearEasingOn: js.UndefOr[js.Function1[/* attrs */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Object) */
    var customDuration: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Object) */
    var customEasings: js.UndefOr[js.Any] = js.native
    
    /** [Config Option] (Number) */
    var duration: js.UndefOr[Double] = js.native
    
    /** [Config Option] (Function) */
    var easing: js.UndefOr[js.Any] = js.native
    
    /** [Method] Returns the value of customDuration
      * @returns Object
      */
    var getCustomDuration: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of customEasings
      * @returns Object
      */
    var getCustomEasings: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of duration
      * @returns Number
      */
    var getDuration: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns the value of easing
      * @returns Function
      */
    var getEasing: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Method] Returns the value of next
      * @returns Ext.draw.modifier.Modifier
      */
    var getNext: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Method] Returns the value of previous
      * @returns Ext.draw.modifier.Modifier
      */
    var getPrevious: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Method] Returns the value of sprite
      * @returns Ext.draw.sprite.Sprite
      */
    var getSprite: js.UndefOr[js.Function0[ISprite]] = js.native
    
    /** [Config Option] (Ext.draw.modifier.Modifier) */
    var next: js.UndefOr[IModifier] = js.native
    
    /** [Method] Invoked when changes need to be popped up to the top
      * @param attributes Object The source attributes.
      * @param changes Object The changes to be popped up.
      */
    var popUp: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Validate attribute set before use
      * @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
      */
    var prepareAttributes: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Ext.draw.modifier.Modifier) */
    var previous: js.UndefOr[IModifier] = js.native
    
    /** [Method] Invoked when changes need to be pushed down to the sprite
      * @param attr Object The source attributes.
      * @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
      * @returns Mixed
      */
    var pushDown: js.UndefOr[js.Function2[js.UndefOr[js.Any], js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Relays selected events from the specified Observable as if the events were fired by this
      * @param object Object The Observable whose events this object is to relay.
      * @param events String/Array/Object Array of event names to relay.
      * @returns Ext.mixin.Observable this
      */
    @JSName("relayEvents")
    var relayEvents_IAnimation: js.UndefOr[
        js.Function2[/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any], IObservable]
      ] = js.native
    
    /** [Method] Sets the value of customDuration
      * @param customDuration Object The new value.
      */
    var setCustomDuration: js.UndefOr[js.Function1[/* customDuration */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of customEasings
      * @param customEasings Object The new value.
      */
    var setCustomEasings: js.UndefOr[js.Function1[/* customEasings */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Sets the value of duration
      * @param duration Number The new value.
      */
    var setDuration: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], Unit]] = js.native
    
    /** [Method] Set special duration on the given attributes
      * @param attrs String/Array The source attributes.
      * @param duration Number The special duration.
      */
    var setDurationOn: js.UndefOr[
        js.Function2[/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double], Unit]
      ] = js.native
    
    /** [Method] Sets the value of easing
      * @param easing Function The new value.
      */
    var setEasing: js.UndefOr[js.Function1[/* easing */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Set special easings on the given attributes
      * @param attrs String/Array The source attribute(s).
      * @param easing String The special easings.
      */
    var setEasingOn: js.UndefOr[
        js.Function2[/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[String], Unit]
      ] = js.native
    
    /** [Method] Sets the value of next
      * @param next Ext.draw.modifier.Modifier The new value.
      */
    var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], Unit]] = js.native
    
    /** [Method] Sets the value of previous
      * @param previous Ext.draw.modifier.Modifier The new value.
      */
    var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], Unit]] = js.native
    
    /** [Method] Sets the value of sprite
      * @param sprite Ext.draw.sprite.Sprite The new value.
      */
    var setSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
    
    /** [Config Option] (Ext.draw.sprite.Sprite) */
    var sprite: js.UndefOr[ISprite] = js.native
    
    /** [Method] Stop all animations effected by this modifier */
    var stop: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object IAnimation {
    
    @scala.inline
    def apply(): IAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnimation]
    }
    
    @scala.inline
    implicit class IAnimationMutableBuilder[Self <: IAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClearDurationOn(value: /* attrs */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "clearDurationOn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearDurationOnUndefined: Self = StObject.set(x, "clearDurationOn", js.undefined)
      
      @scala.inline
      def setClearEasingOn(value: /* attrs */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "clearEasingOn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClearEasingOnUndefined: Self = StObject.set(x, "clearEasingOn", js.undefined)
      
      @scala.inline
      def setCustomDuration(value: js.Any): Self = StObject.set(x, "customDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDurationUndefined: Self = StObject.set(x, "customDuration", js.undefined)
      
      @scala.inline
      def setCustomEasings(value: js.Any): Self = StObject.set(x, "customEasings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomEasingsUndefined: Self = StObject.set(x, "customEasings", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: js.Any): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setGetCustomDuration(value: () => _): Self = StObject.set(x, "getCustomDuration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCustomDurationUndefined: Self = StObject.set(x, "getCustomDuration", js.undefined)
      
      @scala.inline
      def setGetCustomEasings(value: () => _): Self = StObject.set(x, "getCustomEasings", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCustomEasingsUndefined: Self = StObject.set(x, "getCustomEasings", js.undefined)
      
      @scala.inline
      def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDurationUndefined: Self = StObject.set(x, "getDuration", js.undefined)
      
      @scala.inline
      def setGetEasing(value: () => _): Self = StObject.set(x, "getEasing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEasingUndefined: Self = StObject.set(x, "getEasing", js.undefined)
      
      @scala.inline
      def setGetNext(value: () => IAnimation): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNextUndefined: Self = StObject.set(x, "getNext", js.undefined)
      
      @scala.inline
      def setGetPrevious(value: () => IAnimation): Self = StObject.set(x, "getPrevious", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousUndefined: Self = StObject.set(x, "getPrevious", js.undefined)
      
      @scala.inline
      def setGetSprite(value: () => ISprite): Self = StObject.set(x, "getSprite", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSpriteUndefined: Self = StObject.set(x, "getSprite", js.undefined)
      
      @scala.inline
      def setNext(value: IModifier): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPopUp(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "popUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopUpUndefined: Self = StObject.set(x, "popUp", js.undefined)
      
      @scala.inline
      def setPrepareAttributes(value: js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "prepareAttributes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrepareAttributesUndefined: Self = StObject.set(x, "prepareAttributes", js.undefined)
      
      @scala.inline
      def setPrevious(value: IModifier): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setPushDown(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _): Self = StObject.set(x, "pushDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPushDownUndefined: Self = StObject.set(x, "pushDown", js.undefined)
      
      @scala.inline
      def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = StObject.set(x, "relayEvents", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRelayEventsUndefined: Self = StObject.set(x, "relayEvents", js.undefined)
      
      @scala.inline
      def setSetCustomDuration(value: /* customDuration */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCustomDuration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCustomDurationUndefined: Self = StObject.set(x, "setCustomDuration", js.undefined)
      
      @scala.inline
      def setSetCustomEasings(value: /* customEasings */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setCustomEasings", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCustomEasingsUndefined: Self = StObject.set(x, "setCustomEasings", js.undefined)
      
      @scala.inline
      def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDurationOn(value: (/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "setDurationOn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetDurationOnUndefined: Self = StObject.set(x, "setDurationOn", js.undefined)
      
      @scala.inline
      def setSetDurationUndefined: Self = StObject.set(x, "setDuration", js.undefined)
      
      @scala.inline
      def setSetEasing(value: /* easing */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setEasing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEasingOn(value: (/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "setEasingOn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetEasingOnUndefined: Self = StObject.set(x, "setEasingOn", js.undefined)
      
      @scala.inline
      def setSetEasingUndefined: Self = StObject.set(x, "setEasing", js.undefined)
      
      @scala.inline
      def setSetNext(value: /* next */ js.UndefOr[IAnimation] => Unit): Self = StObject.set(x, "setNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNextUndefined: Self = StObject.set(x, "setNext", js.undefined)
      
      @scala.inline
      def setSetPrevious(value: /* previous */ js.UndefOr[IAnimation] => Unit): Self = StObject.set(x, "setPrevious", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPreviousUndefined: Self = StObject.set(x, "setPrevious", js.undefined)
      
      @scala.inline
      def setSetSprite(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = StObject.set(x, "setSprite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSpriteUndefined: Self = StObject.set(x, "setSprite", js.undefined)
      
      @scala.inline
      def setSprite(value: ISprite): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    }
  }
  
  @js.native
  trait IHighlight extends IModifier {
    
    /** [Config Option] (Boolean) */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /** [Method] Filter modifier changes if overriding source attributes
      * @param attr Object The source attributes.
      * @param changes Object The modifier changes.
      * @returns * The filtered changes.
      */
    var filterChanges: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Returns the value of enabled
      * @returns Boolean
      */
    var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.native
    
    /** [Method] Returns the value of highlightStyle
      * @returns Object
      */
    var getHighlightStyle: js.UndefOr[js.Function0[_]] = js.native
    
    /** [Config Option] (Object) */
    var highlightStyle: js.UndefOr[js.Any] = js.native
    
    /** [Method] Sets the value of enabled
      * @param enabled Boolean The new value.
      */
    var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.native
    
    /** [Method] Sets the value of highlightStyle
      * @param highlightStyle Object The new value.
      */
    var setHighlightStyle: js.UndefOr[js.Function1[/* highlightStyle */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IHighlight {
    
    @scala.inline
    def apply(): IHighlight = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHighlight]
    }
    
    @scala.inline
    implicit class IHighlightMutableBuilder[Self <: IHighlight] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setFilterChanges(value: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "filterChanges", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterChangesUndefined: Self = StObject.set(x, "filterChanges", js.undefined)
      
      @scala.inline
      def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEnabledUndefined: Self = StObject.set(x, "getEnabled", js.undefined)
      
      @scala.inline
      def setGetHighlightStyle(value: () => _): Self = StObject.set(x, "getHighlightStyle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHighlightStyleUndefined: Self = StObject.set(x, "getHighlightStyle", js.undefined)
      
      @scala.inline
      def setHighlightStyle(value: js.Any): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
      
      @scala.inline
      def setSetEnabled(value: /* enabled */ js.UndefOr[Boolean] => Unit): Self = StObject.set(x, "setEnabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetEnabledUndefined: Self = StObject.set(x, "setEnabled", js.undefined)
      
      @scala.inline
      def setSetHighlightStyle(value: /* highlightStyle */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setHighlightStyle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetHighlightStyleUndefined: Self = StObject.set(x, "setHighlightStyle", js.undefined)
    }
  }
  
  @js.native
  trait IModifier extends IBase {
    
    /** [Method] Returns the value of next
      * @returns Ext.draw.modifier.Modifier
      */
    var getNext: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Method] Returns the value of previous
      * @returns Ext.draw.modifier.Modifier
      */
    var getPrevious: js.UndefOr[js.Function0[this.type]] = js.native
    
    /** [Method] Returns the value of sprite
      * @returns Ext.draw.sprite.Sprite
      */
    var getSprite: js.UndefOr[js.Function0[ISprite]] = js.native
    
    /** [Config Option] (Ext.draw.modifier.Modifier) */
    var next: js.UndefOr[IModifier] = js.native
    
    /** [Method] Invoked when changes need to be popped up to the top
      * @param attributes Object The source attributes.
      * @param changes Object The changes to be popped up.
      */
    var popUp: js.UndefOr[
        js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], Unit]
      ] = js.native
    
    /** [Method] Validate attribute set before use
      * @param attr Object The attribute to be validated. Note that it may be already initialized, so do not override properties that have already been used.
      */
    var prepareAttributes: js.UndefOr[js.Function1[/* attr */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Config Option] (Ext.draw.modifier.Modifier) */
    var previous: js.UndefOr[IModifier] = js.native
    
    /** [Method] Invoked when changes need to be pushed down to the sprite
      * @param attr Object The source attributes.
      * @param changes Object The changes to make. This object might be changed unexpectedly inside the method.
      * @returns Mixed
      */
    var pushDown: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.native
    
    /** [Method] Sets the value of next
      * @param next Ext.draw.modifier.Modifier The new value.
      */
    var setNext: js.UndefOr[js.Function1[/* next */ js.UndefOr[this.type], Unit]] = js.native
    
    /** [Method] Sets the value of previous
      * @param previous Ext.draw.modifier.Modifier The new value.
      */
    var setPrevious: js.UndefOr[js.Function1[/* previous */ js.UndefOr[this.type], Unit]] = js.native
    
    /** [Method] Sets the value of sprite
      * @param sprite Ext.draw.sprite.Sprite The new value.
      */
    var setSprite: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[ISprite], Unit]] = js.native
    
    /** [Config Option] (Ext.draw.sprite.Sprite) */
    var sprite: js.UndefOr[ISprite] = js.native
  }
  object IModifier {
    
    @scala.inline
    def apply(): IModifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IModifier]
    }
    
    @scala.inline
    implicit class IModifierMutableBuilder[Self <: IModifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetNext(value: () => IModifier): Self = StObject.set(x, "getNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNextUndefined: Self = StObject.set(x, "getNext", js.undefined)
      
      @scala.inline
      def setGetPrevious(value: () => IModifier): Self = StObject.set(x, "getPrevious", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetPreviousUndefined: Self = StObject.set(x, "getPrevious", js.undefined)
      
      @scala.inline
      def setGetSprite(value: () => ISprite): Self = StObject.set(x, "getSprite", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSpriteUndefined: Self = StObject.set(x, "getSprite", js.undefined)
      
      @scala.inline
      def setNext(value: IModifier): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
      
      @scala.inline
      def setPopUp(value: (/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "popUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopUpUndefined: Self = StObject.set(x, "popUp", js.undefined)
      
      @scala.inline
      def setPrepareAttributes(value: /* attr */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "prepareAttributes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrepareAttributesUndefined: Self = StObject.set(x, "prepareAttributes", js.undefined)
      
      @scala.inline
      def setPrevious(value: IModifier): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setPushDown(value: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _): Self = StObject.set(x, "pushDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPushDownUndefined: Self = StObject.set(x, "pushDown", js.undefined)
      
      @scala.inline
      def setSetNext(value: /* next */ js.UndefOr[IModifier] => Unit): Self = StObject.set(x, "setNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetNextUndefined: Self = StObject.set(x, "setNext", js.undefined)
      
      @scala.inline
      def setSetPrevious(value: /* previous */ js.UndefOr[IModifier] => Unit): Self = StObject.set(x, "setPrevious", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetPreviousUndefined: Self = StObject.set(x, "setPrevious", js.undefined)
      
      @scala.inline
      def setSetSprite(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = StObject.set(x, "setSprite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetSpriteUndefined: Self = StObject.set(x, "setSprite", js.undefined)
      
      @scala.inline
      def setSprite(value: ISprite): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    }
  }
  
  @js.native
  trait ITarget extends IModifier
  object ITarget {
    
    @scala.inline
    def apply(): ITarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITarget]
    }
  }
}
