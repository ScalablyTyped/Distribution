package typings.senchaUnderscoreTouch.Ext.chart.label

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.draw.modifier.IModifier
import typings.senchaUnderscoreTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallout extends IModifier

object ICallout {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getNext: () => ICallout = null,
    getPrevious: () => ICallout = null,
    getSprite: () => ISprite = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    next: IModifier = null,
    platformConfig: js.Any = null,
    popUp: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => Unit = null,
    prepareAttributes: /* attr */ js.UndefOr[js.Any] => Unit = null,
    previous: IModifier = null,
    pushDown: (/* attr */ js.UndefOr[js.Any], /* changes */ js.UndefOr[js.Any]) => _ = null,
    self: IClass = null,
    setNext: /* next */ js.UndefOr[ICallout] => Unit = null,
    setPrevious: /* previous */ js.UndefOr[ICallout] => Unit = null,
    setSprite: /* sprite */ js.UndefOr[ISprite] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sprite: ISprite = null,
    statics: js.Any = null,
    uses: Array = null
  ): ICallout = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getNext != null) __obj.updateDynamic("getNext")(js.Any.fromFunction0(getNext))
    if (getPrevious != null) __obj.updateDynamic("getPrevious")(js.Any.fromFunction0(getPrevious))
    if (getSprite != null) __obj.updateDynamic("getSprite")(js.Any.fromFunction0(getSprite))
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
    if (setNext != null) __obj.updateDynamic("setNext")(js.Any.fromFunction1(setNext))
    if (setPrevious != null) __obj.updateDynamic("setPrevious")(js.Any.fromFunction1(setPrevious))
    if (setSprite != null) __obj.updateDynamic("setSprite")(js.Any.fromFunction1(setSprite))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ICallout]
  }
}

