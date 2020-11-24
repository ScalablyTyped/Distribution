package typings.senchaTouch.Ext.draw.modifier

import typings.senchaTouch.Ext.draw.sprite.ISprite
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IAnimationOps[Self <: IAnimation] (val x: Self) extends AnyVal {
    
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
    def setClearDurationOn(value: /* attrs */ js.UndefOr[js.Any] => Unit): Self = this.set("clearDurationOn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearDurationOn: Self = this.set("clearDurationOn", js.undefined)
    
    @scala.inline
    def setClearEasingOn(value: /* attrs */ js.UndefOr[js.Any] => Unit): Self = this.set("clearEasingOn", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClearEasingOn: Self = this.set("clearEasingOn", js.undefined)
    
    @scala.inline
    def setCustomDuration(value: js.Any): Self = this.set("customDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomDuration: Self = this.set("customDuration", js.undefined)
    
    @scala.inline
    def setCustomEasings(value: js.Any): Self = this.set("customEasings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEasings: Self = this.set("customEasings", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: js.Any): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setGetCustomDuration(value: () => _): Self = this.set("getCustomDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCustomDuration: Self = this.set("getCustomDuration", js.undefined)
    
    @scala.inline
    def setGetCustomEasings(value: () => _): Self = this.set("getCustomEasings", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCustomEasings: Self = this.set("getCustomEasings", js.undefined)
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDuration: Self = this.set("getDuration", js.undefined)
    
    @scala.inline
    def setGetEasing(value: () => _): Self = this.set("getEasing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetEasing: Self = this.set("getEasing", js.undefined)
    
    @scala.inline
    def setGetNext(value: () => IAnimation): Self = this.set("getNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNext: Self = this.set("getNext", js.undefined)
    
    @scala.inline
    def setGetPrevious(value: () => IAnimation): Self = this.set("getPrevious", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetPrevious: Self = this.set("getPrevious", js.undefined)
    
    @scala.inline
    def setGetSprite(value: () => ISprite): Self = this.set("getSprite", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSprite: Self = this.set("getSprite", js.undefined)
    
    @scala.inline
    def setNext(value: IModifier): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPopUp(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit): Self = this.set("popUp", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePopUp: Self = this.set("popUp", js.undefined)
    
    @scala.inline
    def setPrepareAttributes(value: js.UndefOr[js.Any] => Unit): Self = this.set("prepareAttributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePrepareAttributes: Self = this.set("prepareAttributes", js.undefined)
    
    @scala.inline
    def setPrevious(value: IModifier): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
    
    @scala.inline
    def setPushDown(value: (js.UndefOr[js.Any], js.UndefOr[js.Any]) => _): Self = this.set("pushDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePushDown: Self = this.set("pushDown", js.undefined)
    
    @scala.inline
    def setRelayEvents(value: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable): Self = this.set("relayEvents", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRelayEvents: Self = this.set("relayEvents", js.undefined)
    
    @scala.inline
    def setSetCustomDuration(value: /* customDuration */ js.UndefOr[js.Any] => Unit): Self = this.set("setCustomDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCustomDuration: Self = this.set("setCustomDuration", js.undefined)
    
    @scala.inline
    def setSetCustomEasings(value: /* customEasings */ js.UndefOr[js.Any] => Unit): Self = this.set("setCustomEasings", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCustomEasings: Self = this.set("setCustomEasings", js.undefined)
    
    @scala.inline
    def setSetDuration(value: /* duration */ js.UndefOr[Double] => Unit): Self = this.set("setDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDuration: Self = this.set("setDuration", js.undefined)
    
    @scala.inline
    def setSetDurationOn(value: (/* attrs */ js.UndefOr[js.Any], /* duration */ js.UndefOr[Double]) => Unit): Self = this.set("setDurationOn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetDurationOn: Self = this.set("setDurationOn", js.undefined)
    
    @scala.inline
    def setSetEasing(value: /* easing */ js.UndefOr[js.Any] => Unit): Self = this.set("setEasing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetEasing: Self = this.set("setEasing", js.undefined)
    
    @scala.inline
    def setSetEasingOn(value: (/* attrs */ js.UndefOr[js.Any], /* easing */ js.UndefOr[String]) => Unit): Self = this.set("setEasingOn", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetEasingOn: Self = this.set("setEasingOn", js.undefined)
    
    @scala.inline
    def setSetNext(value: /* next */ js.UndefOr[IAnimation] => Unit): Self = this.set("setNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetNext: Self = this.set("setNext", js.undefined)
    
    @scala.inline
    def setSetPrevious(value: /* previous */ js.UndefOr[IAnimation] => Unit): Self = this.set("setPrevious", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetPrevious: Self = this.set("setPrevious", js.undefined)
    
    @scala.inline
    def setSetSprite(value: /* sprite */ js.UndefOr[ISprite] => Unit): Self = this.set("setSprite", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetSprite: Self = this.set("setSprite", js.undefined)
    
    @scala.inline
    def setSprite(value: ISprite): Self = this.set("sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSprite: Self = this.set("sprite", js.undefined)
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
}
