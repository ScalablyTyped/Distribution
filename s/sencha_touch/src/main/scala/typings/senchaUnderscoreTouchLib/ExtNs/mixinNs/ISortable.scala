package typings
package senchaUnderscoreTouchLib.ExtNs.mixinNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortable
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] This method adds a sorter
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  var addSorter: js.UndefOr[
    js.Function2[
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method adds all the sorters in a passed array
  		* @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  var addSorters: js.UndefOr[
    js.Function2[
      /* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var dirtySortFn: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
  		* @param items Array The array that you want to insert the item into.
  		* @param item Mixed The item that you want to insert into the items array.
  		* @returns Number The index for the given item in the given array based on the current sorters.
  		*/
  var findInsertionIndex: js.UndefOr[
    js.Function2[
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* item */ js.UndefOr[js.Any], 
      scala.Double
    ]
  ] = js.undefined
  /** [Method] Returns the value of defaultSortDirection
  		* @returns String
  		*/
  var getDefaultSortDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns an up to date sort function
  		* @returns Function The sort function.
  		*/
  var getSortFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sortRoot
  		* @returns String
  		*/
  var getSortRoot: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** [Method] Returns the value of sorters
  		* @returns Array
  		*/
  var getSorters: js.UndefOr[js.Function0[senchaUnderscoreTouchLib.ExtNs.Array]] = js.undefined
  /** [Method] This method adds a sorter at a given index
  		* @param index Number The index at which to insert the sorter.
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  var insertSorter: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method inserts all the sorters in the passed array at the given index
  		* @param index Number The index at which to insert the sorters.
  		* @param sorters Array Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		* @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
  		*/
  var insertSorters: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method removes a sorter
  		* @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
  		*/
  var removeSorter: js.UndefOr[js.Function1[/* sorter */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method removes all the sorters in a passed array
  		* @param sorters Array Each value in the array can be a string (property name), function (sorterFn) or Sorter instance.
  		*/
  var removeSorters: js.UndefOr[
    js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of defaultSortDirection
  		* @param defaultSortDirection String The new value.
  		*/
  var setDefaultSortDirection: js.UndefOr[
    js.Function1[/* defaultSortDirection */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] Sets the value of sortRoot
  		* @param sortRoot String The new value.
  		*/
  var setSortRoot: js.UndefOr[js.Function1[/* sortRoot */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sorters
  		* @param sorters Array The new value.
  		*/
  var setSorters: js.UndefOr[
    js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit]
  ] = js.undefined
  /** [Method] This method will sort an array based on the currently configured sorters
  		* @param data Array The array you want to have sorted.
  		* @returns Array The array you passed after it is sorted.
  		*/
  var sort: js.UndefOr[
    js.Function1[
      /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Boolean) */
  var sorted: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Array) */
  var sorters: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
}

object ISortable {
  @scala.inline
  def apply(
    addSorter: js.Function2[
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    addSorters: js.Function2[
      /* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    dirtySortFn: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    findInsertionIndex: js.Function2[
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* item */ js.UndefOr[js.Any], 
      scala.Double
    ] = null,
    getDefaultSortDirection: js.Function0[java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getSortFn: js.Function0[_] = null,
    getSortRoot: js.Function0[java.lang.String] = null,
    getSorters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    insertSorter: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    insertSorters: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    removeSorter: js.Function1[/* sorter */ js.UndefOr[js.Any], scala.Unit] = null,
    removeSorters: js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setDefaultSortDirection: js.Function1[/* defaultSortDirection */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSortRoot: js.Function1[/* sortRoot */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSorters: js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function1[
      /* data */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    sortRoot: java.lang.String = null,
    sorted: js.UndefOr[scala.Boolean] = js.undefined,
    sorters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISortable = {
    val __obj = js.Dynamic.literal()
    if (addSorter != null) __obj.updateDynamic("addSorter")(addSorter)
    if (addSorters != null) __obj.updateDynamic("addSorters")(addSorters)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(findInsertionIndex)
    if (getDefaultSortDirection != null) __obj.updateDynamic("getDefaultSortDirection")(getDefaultSortDirection)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getSortFn != null) __obj.updateDynamic("getSortFn")(getSortFn)
    if (getSortRoot != null) __obj.updateDynamic("getSortRoot")(getSortRoot)
    if (getSorters != null) __obj.updateDynamic("getSorters")(getSorters)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(insertSorter)
    if (insertSorters != null) __obj.updateDynamic("insertSorters")(insertSorters)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(removeSorter)
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(removeSorters)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(setDefaultSortDirection)
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(setSortRoot)
    if (setSorters != null) __obj.updateDynamic("setSorters")(setSorters)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISortable]
  }
}

