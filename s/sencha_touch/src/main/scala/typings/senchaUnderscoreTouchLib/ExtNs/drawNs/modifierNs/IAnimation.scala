package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.modifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(senchaUnderscoreTouchLib.ExtNs.drawNs.modifierNs.IModifier because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, platformConfig, alternateClassName, singleton, callSuper, self, getInitialConfig, callParent, destroy, callOverridden, initConfig))*/

trait IAnimation
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
  /** [Method] Stop all animations effected by this modifier */
  var stop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

