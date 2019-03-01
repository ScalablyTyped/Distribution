package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.modifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IModifier
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
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
}

object IModifier {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getNext: js.Function0[IModifier] = null,
    getPrevious: js.Function0[IModifier] = null,
    getSprite: js.Function0[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    next: IModifier = null,
    platformConfig: js.Any = null,
    popUp: js.Function2[/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], scala.Unit] = null,
    prepareAttributes: js.Function1[/* attr */ js.UndefOr[js.Any], scala.Unit] = null,
    previous: IModifier = null,
    pushDown: js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setNext: js.Function1[/* next */ js.UndefOr[IModifier], scala.Unit] = null,
    setPrevious: js.Function1[/* previous */ js.UndefOr[IModifier], scala.Unit] = null,
    setSprite: js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Unit
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sprite: senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite = null,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IModifier = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getNext != null) __obj.updateDynamic("getNext")(getNext)
    if (getPrevious != null) __obj.updateDynamic("getPrevious")(getPrevious)
    if (getSprite != null) __obj.updateDynamic("getSprite")(getSprite)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (next != null) __obj.updateDynamic("next")(next)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (popUp != null) __obj.updateDynamic("popUp")(popUp)
    if (prepareAttributes != null) __obj.updateDynamic("prepareAttributes")(prepareAttributes)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (pushDown != null) __obj.updateDynamic("pushDown")(pushDown)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setNext != null) __obj.updateDynamic("setNext")(setNext)
    if (setPrevious != null) __obj.updateDynamic("setPrevious")(setPrevious)
    if (setSprite != null) __obj.updateDynamic("setSprite")(setSprite)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IModifier]
  }
}

