package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs.purchasesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISencha
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Checks if the current user is able to make payments
  		* @param config Object
  		*/
  var canMakePayments: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns a Ext data Store instance of all purchases delivered to the current user
  		* @param config Object
  		*/
  var getCompletedPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns a Ext data Store instance of all products available to purchase
  		* @param config Object
  		*/
  var getProducts: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns a Ext data Store instance of all purchases the current user has been charged
  		* @param config Object
  		*/
  var getPurchases: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object ISencha {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    canMakePayments: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    getCompletedPurchases: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getProducts: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    getPurchases: js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISencha = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (canMakePayments != null) __obj.updateDynamic("canMakePayments")(canMakePayments)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getCompletedPurchases != null) __obj.updateDynamic("getCompletedPurchases")(getCompletedPurchases)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getProducts != null) __obj.updateDynamic("getProducts")(getProducts)
    if (getPurchases != null) __obj.updateDynamic("getPurchases")(getPurchases)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISencha]
  }
}

