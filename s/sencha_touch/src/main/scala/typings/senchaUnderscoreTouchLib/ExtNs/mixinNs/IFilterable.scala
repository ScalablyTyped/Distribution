package typings
package senchaUnderscoreTouchLib.ExtNs.mixinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterable
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] This method adds a filter
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		*/
  var addFilter: js.UndefOr[js.Function1[/* filter */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method adds all the filters in a passed array
  		* @param filters Array An array with filters. A filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var addFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], _]] = js.undefined
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param data Array The array you want to have sorted.
  		* @returns Array The array you passed after it is sorted.
  		*/
  var filter: js.UndefOr[
    js.Function1[
      /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var filterRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Array) */
  var filters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Returns an up to date sort function
  		* @returns Function sortFn The sort function.
  		*/
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of filterRoot
  		* @returns String
  		*/
  var getFilterRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of filters
  		* @returns Array
  		*/
  var getFilters: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] This method adds a filter at a given index
  		* @param index Number The index at which to insert the filter.
  		* @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Object
  		*/
  var insertFilter: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[scala.Double], /* filter */ js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] This method inserts all the filters in the passed array at the given index
  		* @param index Number The index at which to insert the filters.
  		* @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
  		* @returns Array
  		*/
  var insertFilters: js.UndefOr[
    js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] This method removes all the filters in a passed array
  		* @param filters Array Each value in the array can be a string (property name), function (sorterFn), an object containing a property and value keys or Sorter instance.
  		*/
  var removeFilters: js.UndefOr[
    js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of filterRoot
  		* @param filterRoot String The new value.
  		*/
  var setFilterRoot: js.UndefOr[js.Function1[/* filterRoot */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Array The new value.
  		*/
  var setFilters: js.UndefOr[
    js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
}

object IFilterable {
  @scala.inline
  def apply(
    addFilter: js.Function1[/* filter */ js.UndefOr[js.Any], scala.Unit] = null,
    addFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], _] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    currentSortFn: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    dirtyFilterFn: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    filter: js.Function1[
      /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    filterRoot: java.lang.String = null,
    filtered: js.UndefOr[scala.Boolean] = js.undefined,
    filters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    getFilterFn: js.Function0[_] = null,
    getFilterRoot: js.Function0[java.lang.String] = null,
    getFilters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    insertFilter: js.Function2[/* index */ js.UndefOr[scala.Double], /* filter */ js.UndefOr[js.Any], _] = null,
    insertFilters: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    removeFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setFilterRoot: js.Function1[/* filterRoot */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IFilterable = {
    val __obj = js.Dynamic.literal()
    if (addFilter != null) __obj.updateDynamic("addFilter")(addFilter)
    if (addFilters != null) __obj.updateDynamic("addFilters")(addFilters)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot)
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(getFilterFn)
    if (getFilterRoot != null) __obj.updateDynamic("getFilterRoot")(getFilterRoot)
    if (getFilters != null) __obj.updateDynamic("getFilters")(getFilters)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(insertFilter)
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(insertFilters)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(removeFilters)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(setFilterRoot)
    if (setFilters != null) __obj.updateDynamic("setFilters")(setFilters)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IFilterable]
  }
}

