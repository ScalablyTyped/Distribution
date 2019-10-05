package typings.senchaUnderscoreTouch.Ext.device.sqlite

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatabase extends IBase {
  /** [Method] Verifies and changes the version of the database at the same time as doing a schema update with a Ext device sqlite S
  		* @param config Object The object which contains the following config options:
  		*/
  var changeVersion: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Returns the current version of the database
  		* @returns String The database current version.
  		*/
  var getVersion: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Works the same way as transaction but performs a Ext device sqlite SQLTransaction instance in a read only mode
  		* @param config Object
  		*/
  var readTransaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Performs a Ext device sqlite SQLTransaction instance in a read write mode
  		* @param config Object The object which contains the following config options:
  		*/
  var transaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IDatabase {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    changeVersion: /* config */ js.UndefOr[js.Any] => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getVersion: () => java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    readTransaction: /* config */ js.UndefOr[js.Any] => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    transaction: /* config */ js.UndefOr[js.Any] => Unit = null,
    uses: Array = null
  ): IDatabase = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (changeVersion != null) __obj.updateDynamic("changeVersion")(js.Any.fromFunction1(changeVersion))
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getVersion != null) __obj.updateDynamic("getVersion")(js.Any.fromFunction0(getVersion))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (readTransaction != null) __obj.updateDynamic("readTransaction")(js.Any.fromFunction1(readTransaction))
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (transaction != null) __obj.updateDynamic("transaction")(js.Any.fromFunction1(transaction))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IDatabase]
  }
}

