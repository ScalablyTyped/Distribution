package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.modifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlight extends IModifier {
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Filter modifier changes if overriding source attributes
  		* @param attr Object The source attributes.
  		* @param changes Object The modifier changes.
  		* @returns * The filtered changes.
  		*/
  var filterChanges: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of enabled
  		* @returns Boolean
  		*/
  var getEnabled: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of highlightStyle
  		* @returns Object
  		*/
  var getHighlightStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object) */
  var highlightStyle: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of enabled
  		* @param enabled Boolean The new value.
  		*/
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of highlightStyle
  		* @param highlightStyle Object The new value.
  		*/
  var setHighlightStyle: js.UndefOr[js.Function1[/* highlightStyle */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IHighlight {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    filterChanges: js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _] = null,
    getEnabled: js.Function0[scala.Boolean] = null,
    getHighlightStyle: js.Function0[_] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getNext: js.Function0[IHighlight] = null,
    getPrevious: js.Function0[IHighlight] = null,
    getSprite: js.Function0[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite] = null,
    highlightStyle: js.Any = null,
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
    setEnabled: js.Function1[/* enabled */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setHighlightStyle: js.Function1[/* highlightStyle */ js.UndefOr[js.Any], scala.Unit] = null,
    setNext: js.Function1[/* next */ js.UndefOr[IHighlight], scala.Unit] = null,
    setPrevious: js.Function1[/* previous */ js.UndefOr[IHighlight], scala.Unit] = null,
    setSprite: js.Function1[
      /* sprite */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite], 
      scala.Unit
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sprite: senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs.ISprite = null,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IHighlight = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filterChanges != null) __obj.updateDynamic("filterChanges")(filterChanges)
    if (getEnabled != null) __obj.updateDynamic("getEnabled")(getEnabled)
    if (getHighlightStyle != null) __obj.updateDynamic("getHighlightStyle")(getHighlightStyle)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getNext != null) __obj.updateDynamic("getNext")(getNext)
    if (getPrevious != null) __obj.updateDynamic("getPrevious")(getPrevious)
    if (getSprite != null) __obj.updateDynamic("getSprite")(getSprite)
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle)
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
    if (setEnabled != null) __obj.updateDynamic("setEnabled")(setEnabled)
    if (setHighlightStyle != null) __obj.updateDynamic("setHighlightStyle")(setHighlightStyle)
    if (setNext != null) __obj.updateDynamic("setNext")(setNext)
    if (setPrevious != null) __obj.updateDynamic("setPrevious")(setPrevious)
    if (setSprite != null) __obj.updateDynamic("setSprite")(setSprite)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHighlight]
  }
}

