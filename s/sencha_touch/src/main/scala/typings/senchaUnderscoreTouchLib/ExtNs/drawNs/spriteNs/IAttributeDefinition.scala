package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttributeDefinition
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Object) */
  var aliases: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var animationProcessors: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var defaults: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var dirty: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of aliases
  		* @returns Object
  		*/
  var getAliases: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of animationProcessors
  		* @returns Object
  		*/
  var getAnimationProcessors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of defaults
  		* @returns Object
  		*/
  var getDefaults: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of processors
  		* @returns Object
  		*/
  var getProcessors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of updaters
  		* @returns Object
  		*/
  var getUpdaters: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Normalizes the changes given via their processors before they are applied as attributes
  		* @param changes Object The changes given.
  		* @returns Object The normalized values.
  		*/
  var normalize: js.UndefOr[js.Function1[/* changes */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Config Option] (Object) */
  var processors: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of aliases
  		* @param aliases Object The new value.
  		*/
  var setAliases: js.UndefOr[js.Function1[/* aliases */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of animationProcessors
  		* @param animationProcessors Object The new value.
  		*/
  var setAnimationProcessors: js.UndefOr[js.Function1[/* animationProcessors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of defaults
  		* @param defaults Object The new value.
  		*/
  var setDefaults: js.UndefOr[js.Function1[/* defaults */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of processors
  		* @param processors Object The new value.
  		*/
  var setProcessors: js.UndefOr[js.Function1[/* processors */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of updaters
  		* @param updaters Object The new value.
  		*/
  var setUpdaters: js.UndefOr[js.Function1[/* updaters */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var updaters: js.UndefOr[js.Any] = js.undefined
}

object IAttributeDefinition {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    aliases: js.Any = null,
    alternateClassName: js.Any = null,
    animationProcessors: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    defaults: js.Any = null,
    destroy: () => scala.Unit = null,
    dirty: js.Any = null,
    extend: java.lang.String = null,
    getAliases: () => _ = null,
    getAnimationProcessors: () => _ = null,
    getDefaults: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getProcessors: () => _ = null,
    getUpdaters: () => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    normalize: /* changes */ js.UndefOr[js.Any] => _ = null,
    platformConfig: js.Any = null,
    processors: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAliases: /* aliases */ js.UndefOr[js.Any] => scala.Unit = null,
    setAnimationProcessors: /* animationProcessors */ js.UndefOr[js.Any] => scala.Unit = null,
    setDefaults: /* defaults */ js.UndefOr[js.Any] => scala.Unit = null,
    setProcessors: /* processors */ js.UndefOr[js.Any] => scala.Unit = null,
    setUpdaters: /* updaters */ js.UndefOr[js.Any] => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    updaters: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IAttributeDefinition = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (animationProcessors != null) __obj.updateDynamic("animationProcessors")(animationProcessors)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (dirty != null) __obj.updateDynamic("dirty")(dirty)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getAliases != null) __obj.updateDynamic("getAliases")(js.Any.fromFunction0(getAliases))
    if (getAnimationProcessors != null) __obj.updateDynamic("getAnimationProcessors")(js.Any.fromFunction0(getAnimationProcessors))
    if (getDefaults != null) __obj.updateDynamic("getDefaults")(js.Any.fromFunction0(getDefaults))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProcessors != null) __obj.updateDynamic("getProcessors")(js.Any.fromFunction0(getProcessors))
    if (getUpdaters != null) __obj.updateDynamic("getUpdaters")(js.Any.fromFunction0(getUpdaters))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1(normalize))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (processors != null) __obj.updateDynamic("processors")(processors)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAliases != null) __obj.updateDynamic("setAliases")(js.Any.fromFunction1(setAliases))
    if (setAnimationProcessors != null) __obj.updateDynamic("setAnimationProcessors")(js.Any.fromFunction1(setAnimationProcessors))
    if (setDefaults != null) __obj.updateDynamic("setDefaults")(js.Any.fromFunction1(setDefaults))
    if (setProcessors != null) __obj.updateDynamic("setProcessors")(js.Any.fromFunction1(setProcessors))
    if (setUpdaters != null) __obj.updateDynamic("setUpdaters")(js.Any.fromFunction1(setUpdaters))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (updaters != null) __obj.updateDynamic("updaters")(updaters)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAttributeDefinition]
  }
}

