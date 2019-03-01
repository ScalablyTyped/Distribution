package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrors
  extends senchaUnderscoreTouchLib.ExtNs.utilNs.ICollection {
  /** [Method] Adds an item to the collection
  		* @returns Object The item added.
  		*/
  @JSName("add")
  var add_IErrors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns all of the errors for the given field
  		* @param fieldName String The field to get errors for.
  		* @returns Object[] All errors for the given field.
  		*/
  var getByField: js.UndefOr[
    js.Function1[/* fieldName */ js.UndefOr[java.lang.String], senchaUnderscoreTouchLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Returns true if there are no errors in the collection
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object IErrors {
  @scala.inline
  def apply(
    add: js.Function0[_] = null,
    addAll: js.Function1[/* addItems */ js.UndefOr[js.Any], scala.Unit] = null,
    addFilter: js.Function1[/* filter */ js.UndefOr[js.Any], scala.Unit] = null,
    addFilters: js.Function1[/* filters */ js.UndefOr[js.Any], _] = null,
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
    all: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    clear: js.Function0[scala.Unit] = null,
    clone: js.Function0[senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection] = null,
    config: js.Any = null,
    contains: js.Function1[/* item */ js.UndefOr[js.Any], scala.Boolean] = null,
    containsKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Boolean] = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: java.lang.String = null,
    destroy: js.Function0[scala.Unit] = null,
    dirtyFilterFn: js.UndefOr[scala.Boolean] = js.undefined,
    dirtySortFn: js.UndefOr[scala.Boolean] = js.undefined,
    each: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    eachKey: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit] = null,
    extend: java.lang.String = null,
    filter: js.Function4[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      /* anyMatch */ js.UndefOr[js.Any], 
      /* caseSensitive */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    filterBy: js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection
    ] = null,
    filterRoot: java.lang.String = null,
    filtered: js.UndefOr[scala.Boolean] = js.undefined,
    filters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    findBy: js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _] = null,
    findIndexBy: js.Function3[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* start */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    findInsertionIndex: js.Function2[
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      /* item */ js.UndefOr[js.Any], 
      scala.Double
    ] = null,
    first: js.Function0[_] = null,
    get: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    getAutoFilter: js.Function0[scala.Boolean] = null,
    getAutoSort: js.Function0[scala.Boolean] = null,
    getByField: js.Function1[/* fieldName */ js.UndefOr[java.lang.String], senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getByKey: js.Function1[/* key */ js.UndefOr[js.Any], _] = null,
    getCount: js.Function0[scala.Double] = null,
    getDefaultSortDirection: js.Function0[java.lang.String] = null,
    getFilterFn: js.Function0[_] = null,
    getFilterRoot: js.Function0[java.lang.String] = null,
    getFilters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getKey: js.Function1[/* item */ js.UndefOr[js.Any], _] = null,
    getRange: js.Function2[
      /* start */ js.UndefOr[scala.Double], 
      /* end */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    getSortFn: js.Function0[_] = null,
    getSortRoot: js.Function0[java.lang.String] = null,
    getSorters: js.Function0[senchaUnderscoreTouchLib.ExtNs.Array] = null,
    indexOf: js.Function1[/* item */ js.UndefOr[js.Any], scala.Double] = null,
    indexOfKey: js.Function1[/* key */ js.UndefOr[java.lang.String], scala.Double] = null,
    indices: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* instanceConfig */ js.UndefOr[js.Any], _] = null,
    insert: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* key */ js.UndefOr[java.lang.String], 
      /* item */ js.UndefOr[js.Any], 
      _
    ] = null,
    insertFilter: js.Function2[/* index */ js.UndefOr[scala.Double], /* filter */ js.UndefOr[js.Any], _] = null,
    insertFilters: js.Function2[
      /* index */ js.UndefOr[scala.Double], 
      /* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    insertSorter: js.Function3[
      /* index */ js.UndefOr[scala.Double], 
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[java.lang.String], 
      scala.Unit
    ] = null,
    insertSorters: js.Function0[IErrors] = null,
    isValid: js.Function0[scala.Boolean] = null,
    items: senchaUnderscoreTouchLib.ExtNs.Array = null,
    keys: senchaUnderscoreTouchLib.ExtNs.Array = null,
    last: js.Function0[_] = null,
    length: scala.Int | scala.Double = null,
    map: js.Any = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    remove: js.Function1[/* item */ js.UndefOr[js.Any], _] = null,
    removeAll: js.Function1[
      /* items */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], 
      senchaUnderscoreTouchLib.ExtNs.utilNs.IMixedCollection
    ] = null,
    removeAt: js.Function1[/* index */ js.UndefOr[scala.Double], _] = null,
    removeAtKey: js.Function1[/* key */ js.UndefOr[java.lang.String], _] = null,
    removeFilters: js.Function1[/* filters */ js.UndefOr[js.Any], IErrors] = null,
    removeSorter: js.Function1[/* sorter */ js.UndefOr[js.Any], scala.Unit] = null,
    removeSorters: js.Function1[/* sorters */ js.UndefOr[js.Any], IErrors] = null,
    replace: js.Function2[/* oldKey */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any], _] = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setAutoFilter: js.Function1[/* autoFilter */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setAutoSort: js.Function1[/* autoSort */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setDefaultSortDirection: js.Function1[/* defaultSortDirection */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFilterRoot: js.Function1[/* filterRoot */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setFilters: js.Function1[/* filters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    setSortRoot: js.Function1[/* sortRoot */ js.UndefOr[java.lang.String], scala.Unit] = null,
    setSorters: js.Function1[/* sorters */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.Function2[
      /* sorters */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[js.Any], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ] = null,
    sortRoot: java.lang.String = null,
    sorted: js.UndefOr[scala.Boolean] = js.undefined,
    sorters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    statics: js.Any = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): IErrors = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addAll != null) __obj.updateDynamic("addAll")(addAll)
    if (addFilter != null) __obj.updateDynamic("addFilter")(addFilter)
    if (addFilters != null) __obj.updateDynamic("addFilters")(addFilters)
    if (addSorter != null) __obj.updateDynamic("addSorter")(addSorter)
    if (addSorters != null) __obj.updateDynamic("addSorters")(addSorters)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (all != null) __obj.updateDynamic("all")(all)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (clone != null) __obj.updateDynamic("clone")(clone)
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (containsKey != null) __obj.updateDynamic("containsKey")(containsKey)
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn)
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn)
    if (each != null) __obj.updateDynamic("each")(each)
    if (eachKey != null) __obj.updateDynamic("eachKey")(eachKey)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterBy != null) __obj.updateDynamic("filterBy")(filterBy)
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot)
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (findBy != null) __obj.updateDynamic("findBy")(findBy)
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(findIndexBy)
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(findInsertionIndex)
    if (first != null) __obj.updateDynamic("first")(first)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getAt != null) __obj.updateDynamic("getAt")(getAt)
    if (getAutoFilter != null) __obj.updateDynamic("getAutoFilter")(getAutoFilter)
    if (getAutoSort != null) __obj.updateDynamic("getAutoSort")(getAutoSort)
    if (getByField != null) __obj.updateDynamic("getByField")(getByField)
    if (getByKey != null) __obj.updateDynamic("getByKey")(getByKey)
    if (getCount != null) __obj.updateDynamic("getCount")(getCount)
    if (getDefaultSortDirection != null) __obj.updateDynamic("getDefaultSortDirection")(getDefaultSortDirection)
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(getFilterFn)
    if (getFilterRoot != null) __obj.updateDynamic("getFilterRoot")(getFilterRoot)
    if (getFilters != null) __obj.updateDynamic("getFilters")(getFilters)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getKey != null) __obj.updateDynamic("getKey")(getKey)
    if (getRange != null) __obj.updateDynamic("getRange")(getRange)
    if (getSortFn != null) __obj.updateDynamic("getSortFn")(getSortFn)
    if (getSortRoot != null) __obj.updateDynamic("getSortRoot")(getSortRoot)
    if (getSorters != null) __obj.updateDynamic("getSorters")(getSorters)
    if (indexOf != null) __obj.updateDynamic("indexOf")(indexOf)
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(indexOfKey)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (insert != null) __obj.updateDynamic("insert")(insert)
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(insertFilter)
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(insertFilters)
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(insertSorter)
    if (insertSorters != null) __obj.updateDynamic("insertSorters")(insertSorters)
    if (isValid != null) __obj.updateDynamic("isValid")(isValid)
    if (items != null) __obj.updateDynamic("items")(items)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (last != null) __obj.updateDynamic("last")(last)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeAll != null) __obj.updateDynamic("removeAll")(removeAll)
    if (removeAt != null) __obj.updateDynamic("removeAt")(removeAt)
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(removeAtKey)
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(removeFilters)
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(removeSorter)
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(removeSorters)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAutoFilter != null) __obj.updateDynamic("setAutoFilter")(setAutoFilter)
    if (setAutoSort != null) __obj.updateDynamic("setAutoSort")(setAutoSort)
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(setDefaultSortDirection)
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(setFilterRoot)
    if (setFilters != null) __obj.updateDynamic("setFilters")(setFilters)
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(setSortRoot)
    if (setSorters != null) __obj.updateDynamic("setSorters")(setSorters)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IErrors]
  }
}

