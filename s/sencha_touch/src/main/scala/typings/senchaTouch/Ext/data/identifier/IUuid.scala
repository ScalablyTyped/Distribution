package typings.senchaTouch.Ext.data.identifier

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUuid extends ISimple {
  /** [Method] Returns the value of id
    * @returns Object
    */
  var getId: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of version
    * @returns Number
    */
  var getVersion: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Object) */
  var id: js.UndefOr[js.Any] = js.undefined
  /** [Method] Reconfigures this generator given new config properties
    * @param config Object
    */
  var reconfigure: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (Number/Object) */
  var salt: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of id
    * @param id Object The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of version
    * @param version Number The new value.
    */
  var setVersion: js.UndefOr[js.Function1[/* version */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Property] (Number/Object) */
  var timestamp: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var version: js.UndefOr[Double] = js.undefined
}

object IUuid {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: String = null,
    getId: () => _ = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getPrefix: () => String = null,
    getVersion: () => Double = null,
    id: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    reconfigure: /* config */ js.UndefOr[js.Any] => Unit = null,
    salt: js.Any = null,
    self: IClass = null,
    setId: /* id */ js.UndefOr[js.Any] => Unit = null,
    setPrefix: /* prefix */ js.UndefOr[String] => Unit = null,
    setVersion: /* version */ js.UndefOr[Double] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    timestamp: js.Any = null,
    uses: Array = null,
    version: js.UndefOr[Double] = js.undefined
  ): IUuid = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getPrefix != null) __obj.updateDynamic("getPrefix")(js.Any.fromFunction0(getPrefix))
    if (getVersion != null) __obj.updateDynamic("getVersion")(js.Any.fromFunction0(getVersion))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (reconfigure != null) __obj.updateDynamic("reconfigure")(js.Any.fromFunction1(reconfigure))
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1(setId))
    if (setPrefix != null) __obj.updateDynamic("setPrefix")(js.Any.fromFunction1(setPrefix))
    if (setVersion != null) __obj.updateDynamic("setVersion")(js.Any.fromFunction1(setVersion))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUuid]
  }
}

