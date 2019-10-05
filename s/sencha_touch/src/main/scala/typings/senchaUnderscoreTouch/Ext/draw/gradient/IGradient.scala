package typings.senchaUnderscoreTouch.Ext.draw.gradient

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.draw.engine.ISvgContext
import typings.senchaUnderscoreTouch.Ext.mixin.IIdentifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGradient extends IIdentifiable {
  /** [Config Option] (Array/Object) */
  var Defines: js.UndefOr[js.Any] = js.undefined
  /** [Method] Generates the gradient for the given context
  		* @param ctx Ext.draw.engine.SvgContext The context.
  		* @param bbox Object
  		* @returns Object
  		*/
  var generateGradient: js.UndefOr[
    js.Function2[/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Retrieves the id of this component
  		* @returns String id
  		*/
  @JSName("getId")
  var getId_IGradient: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object IGradient {
  @scala.inline
  def apply(
    Defines: js.Any = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    generateGradient: (/* ctx */ js.UndefOr[ISvgContext], /* bbox */ js.UndefOr[js.Any]) => _ = null,
    getId: () => java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IGradient = {
    val __obj = js.Dynamic.literal()
    if (Defines != null) __obj.updateDynamic("Defines")(Defines)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (generateGradient != null) __obj.updateDynamic("generateGradient")(js.Any.fromFunction2(generateGradient))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IGradient]
  }
}

