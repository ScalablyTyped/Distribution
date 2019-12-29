package typings.senchaUnderscoreTouch.Ext.mixin

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IBase
import typings.senchaUnderscoreTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterable extends IBase {
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  var addFilter: js.UndefOr[js.Function1[/* filter */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method adds all the filters in a passed array
  		* @param filters Array An array with filters. A filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var addFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], _]] = js.undefined
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param data Array The array you want to have sorted.
  		* @returns Array The array you passed after it is sorted.
  		*/
  var filter: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.undefined
  /** [Config Option] (String) */
  var filterRoot: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Array) */
  var filters: js.UndefOr[Array] = js.undefined
  /** [Method] Returns an up to date sort function
  		* @returns Function sortFn The sort function.
  		*/
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of filterRoot
  		* @returns String
  		*/
  var getFilterRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of filters
  		* @returns Array
  		*/
  var getFilters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] This method adds a filter at a given index
  		* @param index Number The index at which to insert the filter.
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var insertFilter: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  var insertFilters: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array], Array]
  ] = js.undefined
  /** [Method] This method removes all the filters in a passed array
  		* @param filters Array Each value in the array can be a string (property name), function (sorterFn), an object containing a property and value keys or Sorter instance.
  		*/
  var removeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  var setFilterRoot: js.UndefOr[js.Function1[/* filterRoot */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.undefined
}

object IFilterable {
  @scala.inline
  def apply(
    addFilter: /* filter */ js.UndefOr[js.Any] => Unit = null,
    addFilters: /* filters */ js.UndefOr[Array] => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    currentSortFn: js.Any = null,
    destroy: () => Unit = null,
    dirtyFilterFn: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    filter: /* data */ js.UndefOr[Array] => Array = null,
    filterRoot: String = null,
    filtered: js.UndefOr[Boolean] = js.undefined,
    filters: Array = null,
    getFilterFn: () => _ = null,
    getFilterRoot: () => String = null,
    getFilters: () => Array = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insertFilter: (/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any]) => _ = null,
    insertFilters: (/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array]) => Array = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    removeFilters: /* filters */ js.UndefOr[Array] => Unit = null,
    self: IClass = null,
    setFilterRoot: /* filterRoot */ js.UndefOr[String] => Unit = null,
    setFilters: /* filters */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IFilterable = {
    val __obj = js.Dynamic.literal()
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction1(addFilter))
    if (addFilters != null) __obj.updateDynamic("addFilters")(js.Any.fromFunction1(addFilters))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(js.Any.fromFunction0(getFilterFn))
    if (getFilterRoot != null) __obj.updateDynamic("getFilterRoot")(js.Any.fromFunction0(getFilterRoot))
    if (getFilters != null) __obj.updateDynamic("getFilters")(js.Any.fromFunction0(getFilters))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(js.Any.fromFunction2(insertFilter))
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(js.Any.fromFunction2(insertFilters))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(js.Any.fromFunction1(removeFilters))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(js.Any.fromFunction1(setFilterRoot))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1(setFilters))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterable]
  }
}

