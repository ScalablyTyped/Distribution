package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter extends IBase {
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of anyMatch
    * @returns Boolean
    */
  var getAnyMatch: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of caseSensitive
    * @returns Boolean
    */
  var getCaseSensitive: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of exactMatch
    * @returns Boolean
    */
  var getExactMatch: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Returns the value of filterFn
    * @returns Function
    */
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of id
    * @returns String
    */
  var getId: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of property
    * @returns String
    */
  var getProperty: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of root
    * @returns String
    */
  var getRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of value
    * @returns RegExp/Mixed
    */
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var property: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of anyMatch
    * @param anyMatch Boolean The new value.
    */
  var setAnyMatch: js.UndefOr[js.Function1[/* anyMatch */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of caseSensitive
    * @param caseSensitive Boolean The new value.
    */
  var setCaseSensitive: js.UndefOr[js.Function1[/* caseSensitive */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of exactMatch
    * @param exactMatch Boolean The new value.
    */
  var setExactMatch: js.UndefOr[js.Function1[/* exactMatch */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of filterFn
    * @param filterFn Function The new value.
    */
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of id
    * @param id String The new value.
    */
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of property
    * @param property String The new value.
    */
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of root
    * @param root String The new value.
    */
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of value
    * @param value RegExp/Mixed The new value.
    */
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (RegExp/Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IFilter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    anyMatch: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    config: js.Any = null,
    destroy: () => Unit = null,
    exactMatch: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    filterFn: js.Any = null,
    getAnyMatch: () => Boolean = null,
    getCaseSensitive: () => Boolean = null,
    getExactMatch: () => Boolean = null,
    getFilterFn: () => _ = null,
    getId: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getProperty: () => String = null,
    getRoot: () => String = null,
    getScope: () => _ = null,
    getValue: () => _ = null,
    id: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    property: String = null,
    root: String = null,
    scope: js.Any = null,
    self: IClass = null,
    setAnyMatch: /* anyMatch */ js.UndefOr[Boolean] => Unit = null,
    setCaseSensitive: /* caseSensitive */ js.UndefOr[Boolean] => Unit = null,
    setExactMatch: /* exactMatch */ js.UndefOr[Boolean] => Unit = null,
    setFilterFn: /* filterFn */ js.UndefOr[js.Any] => Unit = null,
    setId: /* id */ js.UndefOr[String] => Unit = null,
    setProperty: /* property */ js.UndefOr[String] => Unit = null,
    setRoot: /* root */ js.UndefOr[String] => Unit = null,
    setScope: /* scope */ js.UndefOr[js.Any] => Unit = null,
    setValue: /* value */ js.UndefOr[js.Any] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null,
    value: js.Any = null
  ): IFilter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(anyMatch)) __obj.updateDynamic("anyMatch")(anyMatch.get.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.get.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filterFn != null) __obj.updateDynamic("filterFn")(filterFn.asInstanceOf[js.Any])
    if (getAnyMatch != null) __obj.updateDynamic("getAnyMatch")(js.Any.fromFunction0(getAnyMatch))
    if (getCaseSensitive != null) __obj.updateDynamic("getCaseSensitive")(js.Any.fromFunction0(getCaseSensitive))
    if (getExactMatch != null) __obj.updateDynamic("getExactMatch")(js.Any.fromFunction0(getExactMatch))
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(js.Any.fromFunction0(getFilterFn))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getProperty != null) __obj.updateDynamic("getProperty")(js.Any.fromFunction0(getProperty))
    if (getRoot != null) __obj.updateDynamic("getRoot")(js.Any.fromFunction0(getRoot))
    if (getScope != null) __obj.updateDynamic("getScope")(js.Any.fromFunction0(getScope))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction0(getValue))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAnyMatch != null) __obj.updateDynamic("setAnyMatch")(js.Any.fromFunction1(setAnyMatch))
    if (setCaseSensitive != null) __obj.updateDynamic("setCaseSensitive")(js.Any.fromFunction1(setCaseSensitive))
    if (setExactMatch != null) __obj.updateDynamic("setExactMatch")(js.Any.fromFunction1(setExactMatch))
    if (setFilterFn != null) __obj.updateDynamic("setFilterFn")(js.Any.fromFunction1(setFilterFn))
    if (setId != null) __obj.updateDynamic("setId")(js.Any.fromFunction1(setId))
    if (setProperty != null) __obj.updateDynamic("setProperty")(js.Any.fromFunction1(setProperty))
    if (setRoot != null) __obj.updateDynamic("setRoot")(js.Any.fromFunction1(setRoot))
    if (setScope != null) __obj.updateDynamic("setScope")(js.Any.fromFunction1(setScope))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1(setValue))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilter]
  }
}

