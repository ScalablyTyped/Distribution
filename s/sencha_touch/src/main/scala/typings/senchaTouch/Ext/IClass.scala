package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClass extends js.Object {
  /** [Config Option] (String[]) */
  var alias: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String/String[]) */
  var alternateClassName: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var config: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var extend: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var inheritableStatics: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var mixins: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var platformConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var singleton: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var statics: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]) */
  var uses: js.UndefOr[Array] = js.undefined
}

object IClass {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    inheritableStatics: js.Any = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IClass = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClass]
  }
}

