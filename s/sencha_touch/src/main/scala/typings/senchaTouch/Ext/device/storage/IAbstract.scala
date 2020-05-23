package typings.senchaTouch.Ext.device.storage

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstract extends IBase {
  /** [Method] Returns the value of databaseDisplayName
    * @returns String
    */
  var getDatabaseDisplayName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of databaseName
    * @returns String
    */
  var getDatabaseName: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of databaseSize
    * @returns Object
    */
  var getDatabaseSize: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of databaseVersion
    * @returns String
    */
  var getDatabaseVersion: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Sets the value of databaseDisplayName
    * @param databaseDisplayName String The new value.
    */
  var setDatabaseDisplayName: js.UndefOr[js.Function1[/* databaseDisplayName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of databaseName
    * @param databaseName String The new value.
    */
  var setDatabaseName: js.UndefOr[js.Function1[/* databaseName */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of databaseSize
    * @param databaseSize Object The new value.
    */
  var setDatabaseSize: js.UndefOr[js.Function1[/* databaseSize */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of databaseVersion
    * @param databaseVersion String The new value.
    */
  var setDatabaseVersion: js.UndefOr[js.Function1[/* databaseVersion */ js.UndefOr[String], Unit]] = js.undefined
}

object IAbstract {
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
    getDatabaseDisplayName: () => String = null,
    getDatabaseName: () => String = null,
    getDatabaseSize: () => _ = null,
    getDatabaseVersion: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: IClass = null,
    setDatabaseDisplayName: /* databaseDisplayName */ js.UndefOr[String] => Unit = null,
    setDatabaseName: /* databaseName */ js.UndefOr[String] => Unit = null,
    setDatabaseSize: /* databaseSize */ js.UndefOr[js.Any] => Unit = null,
    setDatabaseVersion: /* databaseVersion */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IAbstract = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getDatabaseDisplayName != null) __obj.updateDynamic("getDatabaseDisplayName")(js.Any.fromFunction0(getDatabaseDisplayName))
    if (getDatabaseName != null) __obj.updateDynamic("getDatabaseName")(js.Any.fromFunction0(getDatabaseName))
    if (getDatabaseSize != null) __obj.updateDynamic("getDatabaseSize")(js.Any.fromFunction0(getDatabaseSize))
    if (getDatabaseVersion != null) __obj.updateDynamic("getDatabaseVersion")(js.Any.fromFunction0(getDatabaseVersion))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDatabaseDisplayName != null) __obj.updateDynamic("setDatabaseDisplayName")(js.Any.fromFunction1(setDatabaseDisplayName))
    if (setDatabaseName != null) __obj.updateDynamic("setDatabaseName")(js.Any.fromFunction1(setDatabaseName))
    if (setDatabaseSize != null) __obj.updateDynamic("setDatabaseSize")(js.Any.fromFunction1(setDatabaseSize))
    if (setDatabaseVersion != null) __obj.updateDynamic("setDatabaseVersion")(js.Any.fromFunction1(setDatabaseVersion))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAbstract]
  }
}

