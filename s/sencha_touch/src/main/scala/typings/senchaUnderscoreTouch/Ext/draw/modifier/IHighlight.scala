package typings.senchaUnderscoreTouch.Ext.draw.modifier

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHighlight extends IModifier {
  /** [Config Option] (Boolean) */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Filter modifier changes if overriding source attributes
  		* @param attr Object The source attributes.
  		* @param changes Object The modifier changes.
  		* @returns * The filtered changes.
  		*/
  var filterChanges: js.UndefOr[js.Function2[/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the value of enabled
  		* @returns Boolean
  		*/
  var getEnabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of highlightStyle
  		* @returns Object
  		*/
  var getHighlightStyle: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Object) */
  var highlightStyle: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of enabled
  		* @param enabled Boolean The new value.
  		*/
  var setEnabled: js.UndefOr[js.Function1[/* enabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of highlightStyle
  		* @param highlightStyle Object The new value.
  		*/
  var setHighlightStyle: js.UndefOr[js.Function1[/* highlightStyle */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IHighlight {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    filterChanges: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _ = null,
    getEnabled: () => Boolean = null,
    getHighlightStyle: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getNext: () => IHighlight = null,
    getPrevious: () => IHighlight = null,
    getSprite: () => ISprite = null,
    highlightStyle: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    next: IModifier = null,
    platformConfig: js.Any = null,
    popUp: (/* attributes */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => Unit = null,
    prepareAttributes: /* attr */ js.UndefOr[js.Any] => Unit = null,
    previous: IModifier = null,
    pushDown: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _ = null,
    self: IClass = null,
    setEnabled: /* enabled */ js.UndefOr[Boolean] => Unit = null,
    setHighlightStyle: /* highlightStyle */ js.UndefOr[js.Any] => Unit = null,
    setNext: /* next */ js.UndefOr[IHighlight] => Unit = null,
    setPrevious: /* previous */ js.UndefOr[IHighlight] => Unit = null,
    setSprite: /* sprite */ js.UndefOr[ISprite] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sprite: ISprite = null,
    statics: js.Any = null,
    uses: Array = null
  ): IHighlight = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filterChanges != null) __obj.updateDynamic("filterChanges")(js.Any.fromFunction2(filterChanges))
    if (getEnabled != null) __obj.updateDynamic("getEnabled")(js.Any.fromFunction0(getEnabled))
    if (getHighlightStyle != null) __obj.updateDynamic("getHighlightStyle")(js.Any.fromFunction0(getHighlightStyle))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getNext != null) __obj.updateDynamic("getNext")(js.Any.fromFunction0(getNext))
    if (getPrevious != null) __obj.updateDynamic("getPrevious")(js.Any.fromFunction0(getPrevious))
    if (getSprite != null) __obj.updateDynamic("getSprite")(js.Any.fromFunction0(getSprite))
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (next != null) __obj.updateDynamic("next")(next)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (popUp != null) __obj.updateDynamic("popUp")(js.Any.fromFunction2(popUp))
    if (prepareAttributes != null) __obj.updateDynamic("prepareAttributes")(js.Any.fromFunction1(prepareAttributes))
    if (previous != null) __obj.updateDynamic("previous")(previous)
    if (pushDown != null) __obj.updateDynamic("pushDown")(js.Any.fromFunction2(pushDown))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setEnabled != null) __obj.updateDynamic("setEnabled")(js.Any.fromFunction1(setEnabled))
    if (setHighlightStyle != null) __obj.updateDynamic("setHighlightStyle")(js.Any.fromFunction1(setHighlightStyle))
    if (setNext != null) __obj.updateDynamic("setNext")(js.Any.fromFunction1(setNext))
    if (setPrevious != null) __obj.updateDynamic("setPrevious")(js.Any.fromFunction1(setPrevious))
    if (setSprite != null) __obj.updateDynamic("setSprite")(js.Any.fromFunction1(setSprite))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHighlight]
  }
}

