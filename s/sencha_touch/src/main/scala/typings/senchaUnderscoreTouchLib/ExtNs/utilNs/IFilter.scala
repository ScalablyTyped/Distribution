package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilter
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Config Option] (Boolean) */
  var anyMatch: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var exactMatch: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Function) */
  var filterFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of anyMatch
  		* @returns Boolean
  		*/
  var getAnyMatch: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of caseSensitive
  		* @returns Boolean
  		*/
  var getCaseSensitive: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of exactMatch
  		* @returns Boolean
  		*/
  var getExactMatch: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of filterFn
  		* @returns Function
  		*/
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of id
  		* @returns String
  		*/
  var getId: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of property
  		* @returns String
  		*/
  var getProperty: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of root
  		* @returns String
  		*/
  var getRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of scope
  		* @returns Object
  		*/
  var getScope: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of value
  		* @returns RegExp/Mixed
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (String) */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var property: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the value of anyMatch
  		* @param anyMatch Boolean The new value.
  		*/
  var setAnyMatch: js.UndefOr[js.Function1[/* anyMatch */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of caseSensitive
  		* @param caseSensitive Boolean The new value.
  		*/
  var setCaseSensitive: js.UndefOr[js.Function1[/* caseSensitive */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of exactMatch
  		* @param exactMatch Boolean The new value.
  		*/
  var setExactMatch: js.UndefOr[js.Function1[/* exactMatch */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of filterFn
  		* @param filterFn Function The new value.
  		*/
  var setFilterFn: js.UndefOr[js.Function1[/* filterFn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of id
  		* @param id String The new value.
  		*/
  var setId: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of property
  		* @param property String The new value.
  		*/
  var setProperty: js.UndefOr[js.Function1[/* property */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of root
  		* @param root String The new value.
  		*/
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of scope
  		* @param scope Object The new value.
  		*/
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of value
  		* @param value RegExp/Mixed The new value.
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (RegExp/Mixed) */
  var value: js.UndefOr[js.Any] = js.undefined
}

object IFilter {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    anyMatch: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    config: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    exactMatch: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    filterFn: js.Any = null,
    getAnyMatch: js.Function0[scala.Boolean] = null,
    getCaseSensitive: js.Function0[scala.Boolean] = null,
    getExactMatch: js.Function0[scala.Boolean] = null,
    getFilterFn: js.Function0[_] = null,
    getId: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getProperty: js.Function0[java.lang.String] = null,
    getRoot: js.Function0[java.lang.String] = null,
    getScope: js.Function0[_] = null,
    getValue: js.Function0[_] = null,
    id: java.lang.String = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    property: java.lang.String = null,
    root: java.lang.String = null,
    scope: js.Any = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAnyMatch: js.Function1[/* anyMatch */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setCaseSensitive: js.Function1[/* caseSensitive */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setExactMatch: js.Function1[/* exactMatch */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setFilterFn: js.Function1[/* filterFn */ js.UndefOr[js.Any], scala.Unit] = null,
    setId: js.Function1[/* id */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setProperty: js.Function1[/* property */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setRoot: js.Function1[/* root */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setScope: js.Function1[/* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    setValue: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null,
    value: js.Any = null
  ): IFilter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(anyMatch)) __obj.updateDynamic("anyMatch")(anyMatch)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (config != null) __obj.updateDynamic("config")(config)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filterFn != null) __obj.updateDynamic("filterFn")(filterFn)
    if (getAnyMatch != null) __obj.updateDynamic("getAnyMatch")(getAnyMatch)
    if (getCaseSensitive != null) __obj.updateDynamic("getCaseSensitive")(getCaseSensitive)
    if (getExactMatch != null) __obj.updateDynamic("getExactMatch")(getExactMatch)
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(getFilterFn)
    if (getId != null) __obj.updateDynamic("getId")(getId)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getProperty != null) __obj.updateDynamic("getProperty")(getProperty)
    if (getRoot != null) __obj.updateDynamic("getRoot")(getRoot)
    if (getScope != null) __obj.updateDynamic("getScope")(getScope)
    if (getValue != null) __obj.updateDynamic("getValue")(getValue)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (property != null) __obj.updateDynamic("property")(property)
    if (root != null) __obj.updateDynamic("root")(root)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAnyMatch != null) __obj.updateDynamic("setAnyMatch")(setAnyMatch)
    if (setCaseSensitive != null) __obj.updateDynamic("setCaseSensitive")(setCaseSensitive)
    if (setExactMatch != null) __obj.updateDynamic("setExactMatch")(setExactMatch)
    if (setFilterFn != null) __obj.updateDynamic("setFilterFn")(setFilterFn)
    if (setId != null) __obj.updateDynamic("setId")(setId)
    if (setProperty != null) __obj.updateDynamic("setProperty")(setProperty)
    if (setRoot != null) __obj.updateDynamic("setRoot")(setRoot)
    if (setScope != null) __obj.updateDynamic("setScope")(setScope)
    if (setValue != null) __obj.updateDynamic("setValue")(setValue)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IFilter]
  }
}

