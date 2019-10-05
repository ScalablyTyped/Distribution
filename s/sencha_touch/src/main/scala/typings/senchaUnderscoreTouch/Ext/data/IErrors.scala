package typings.senchaUnderscoreTouch.Ext.data

import typings.senchaUnderscoreTouch.Ext.Array
import typings.senchaUnderscoreTouch.Ext.IClass
import typings.senchaUnderscoreTouch.Ext.util.ICollection
import typings.senchaUnderscoreTouch.Ext.util.IMixedCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrors extends ICollection {
  /** [Method] Adds an item to the collection
  		* @returns Object The item added.
  		*/
  @JSName("add")
  var add_IErrors: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns all of the errors for the given field
  		* @param fieldName String The field to get errors for.
  		* @returns Object[] All errors for the given field.
  		*/
  var getByField: js.UndefOr[js.Function1[/* fieldName */ js.UndefOr[java.lang.String], Array]] = js.undefined
  /** [Method] Returns true if there are no errors in the collection
  		* @returns Boolean
  		*/
  var isValid: js.UndefOr[js.Function0[Boolean]] = js.undefined
}

object IErrors {
  @scala.inline
  def apply(
    add: () => _ = null,
    addAll: /* addItems */ js.UndefOr[js.Any] => Unit = null,
    addFilter: /* filter */ js.UndefOr[js.Any] => Unit = null,
    addFilters: /* filters */ js.UndefOr[js.Any] => _ = null,
    addSorter: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    addSorters: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    alias: Array = null,
    all: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: () => Unit = null,
    clone: () => IMixedCollection = null,
    config: js.Any = null,
    contains: /* item */ js.UndefOr[js.Any] => Boolean = null,
    containsKey: /* key */ js.UndefOr[java.lang.String] => Boolean = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: java.lang.String = null,
    destroy: () => Unit = null,
    dirtyFilterFn: js.UndefOr[Boolean] = js.undefined,
    dirtySortFn: js.UndefOr[Boolean] = js.undefined,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    eachKey: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    extend: java.lang.String = null,
    filter: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], /* anyMatch */ js.UndefOr[js.Any], /* caseSensitive */ js.UndefOr[js.Any]) => Array = null,
    filterBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => IMixedCollection = null,
    filterRoot: java.lang.String = null,
    filtered: js.UndefOr[Boolean] = js.undefined,
    filters: Array = null,
    findBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    findIndexBy: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* start */ js.UndefOr[Double]) => Double = null,
    findInsertionIndex: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => Double = null,
    first: () => _ = null,
    get: /* key */ js.UndefOr[js.Any] => _ = null,
    getAt: /* index */ js.UndefOr[Double] => _ = null,
    getAutoFilter: () => Boolean = null,
    getAutoSort: () => Boolean = null,
    getByField: /* fieldName */ js.UndefOr[java.lang.String] => Array = null,
    getByKey: /* key */ js.UndefOr[js.Any] => _ = null,
    getCount: () => Double = null,
    getDefaultSortDirection: () => java.lang.String = null,
    getFilterFn: () => _ = null,
    getFilterRoot: () => java.lang.String = null,
    getFilters: () => Array = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getKey: /* item */ js.UndefOr[js.Any] => _ = null,
    getRange: (/* start */ js.UndefOr[Double], /* end */ js.UndefOr[Double]) => Array = null,
    getSortFn: () => _ = null,
    getSortRoot: () => java.lang.String = null,
    getSorters: () => Array = null,
    indexOf: /* item */ js.UndefOr[js.Any] => Double = null,
    indexOfKey: /* key */ js.UndefOr[java.lang.String] => Double = null,
    indices: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insert: (/* index */ js.UndefOr[Double], /* key */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any]) => _ = null,
    insertFilter: (/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any]) => _ = null,
    insertFilters: (/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array]) => Array = null,
    insertSorter: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[java.lang.String]) => Unit = null,
    insertSorters: () => IErrors = null,
    isValid: () => Boolean = null,
    items: Array = null,
    keys: Array = null,
    last: () => _ = null,
    length: Int | Double = null,
    map: js.Any = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    remove: /* item */ js.UndefOr[js.Any] => _ = null,
    removeAll: /* items */ js.UndefOr[Array] => IMixedCollection = null,
    removeAt: /* index */ js.UndefOr[Double] => _ = null,
    removeAtKey: /* key */ js.UndefOr[java.lang.String] => _ = null,
    removeFilters: /* filters */ js.UndefOr[js.Any] => IErrors = null,
    removeSorter: /* sorter */ js.UndefOr[js.Any] => Unit = null,
    removeSorters: /* sorters */ js.UndefOr[js.Any] => IErrors = null,
    replace: (/* oldKey */ js.UndefOr[java.lang.String], /* item */ js.UndefOr[js.Any]) => _ = null,
    self: IClass = null,
    setAutoFilter: /* autoFilter */ js.UndefOr[Boolean] => Unit = null,
    setAutoSort: /* autoSort */ js.UndefOr[Boolean] => Unit = null,
    setDefaultSortDirection: /* defaultSortDirection */ js.UndefOr[java.lang.String] => Unit = null,
    setFilterRoot: /* filterRoot */ js.UndefOr[java.lang.String] => Unit = null,
    setFilters: /* filters */ js.UndefOr[Array] => Unit = null,
    setSortRoot: /* sortRoot */ js.UndefOr[java.lang.String] => Unit = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: (/* sorters */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[js.Any]) => Array = null,
    sortRoot: java.lang.String = null,
    sorted: js.UndefOr[Boolean] = js.undefined,
    sorters: Array = null,
    statics: js.Any = null,
    uses: Array = null
  ): IErrors = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction0(add))
    if (addAll != null) __obj.updateDynamic("addAll")(js.Any.fromFunction1(addAll))
    if (addFilter != null) __obj.updateDynamic("addFilter")(js.Any.fromFunction1(addFilter))
    if (addFilters != null) __obj.updateDynamic("addFilters")(js.Any.fromFunction1(addFilters))
    if (addSorter != null) __obj.updateDynamic("addSorter")(js.Any.fromFunction2(addSorter))
    if (addSorters != null) __obj.updateDynamic("addSorters")(js.Any.fromFunction2(addSorters))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (all != null) __obj.updateDynamic("all")(all)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (clone != null) __obj.updateDynamic("clone")(js.Any.fromFunction0(clone))
    if (config != null) __obj.updateDynamic("config")(config)
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (containsKey != null) __obj.updateDynamic("containsKey")(js.Any.fromFunction1(containsKey))
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn)
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(dirtyFilterFn)) __obj.updateDynamic("dirtyFilterFn")(dirtyFilterFn)
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn)
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (eachKey != null) __obj.updateDynamic("eachKey")(js.Any.fromFunction2(eachKey))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction4(filter))
    if (filterBy != null) __obj.updateDynamic("filterBy")(js.Any.fromFunction2(filterBy))
    if (filterRoot != null) __obj.updateDynamic("filterRoot")(filterRoot)
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (findBy != null) __obj.updateDynamic("findBy")(js.Any.fromFunction2(findBy))
    if (findIndexBy != null) __obj.updateDynamic("findIndexBy")(js.Any.fromFunction3(findIndexBy))
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(js.Any.fromFunction2(findInsertionIndex))
    if (first != null) __obj.updateDynamic("first")(js.Any.fromFunction0(first))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (getAt != null) __obj.updateDynamic("getAt")(js.Any.fromFunction1(getAt))
    if (getAutoFilter != null) __obj.updateDynamic("getAutoFilter")(js.Any.fromFunction0(getAutoFilter))
    if (getAutoSort != null) __obj.updateDynamic("getAutoSort")(js.Any.fromFunction0(getAutoSort))
    if (getByField != null) __obj.updateDynamic("getByField")(js.Any.fromFunction1(getByField))
    if (getByKey != null) __obj.updateDynamic("getByKey")(js.Any.fromFunction1(getByKey))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getDefaultSortDirection != null) __obj.updateDynamic("getDefaultSortDirection")(js.Any.fromFunction0(getDefaultSortDirection))
    if (getFilterFn != null) __obj.updateDynamic("getFilterFn")(js.Any.fromFunction0(getFilterFn))
    if (getFilterRoot != null) __obj.updateDynamic("getFilterRoot")(js.Any.fromFunction0(getFilterRoot))
    if (getFilters != null) __obj.updateDynamic("getFilters")(js.Any.fromFunction0(getFilters))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1(getKey))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction2(getRange))
    if (getSortFn != null) __obj.updateDynamic("getSortFn")(js.Any.fromFunction0(getSortFn))
    if (getSortRoot != null) __obj.updateDynamic("getSortRoot")(js.Any.fromFunction0(getSortRoot))
    if (getSorters != null) __obj.updateDynamic("getSorters")(js.Any.fromFunction0(getSorters))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (indexOfKey != null) __obj.updateDynamic("indexOfKey")(js.Any.fromFunction1(indexOfKey))
    if (indices != null) __obj.updateDynamic("indices")(indices)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction3(insert))
    if (insertFilter != null) __obj.updateDynamic("insertFilter")(js.Any.fromFunction2(insertFilter))
    if (insertFilters != null) __obj.updateDynamic("insertFilters")(js.Any.fromFunction2(insertFilters))
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(js.Any.fromFunction3(insertSorter))
    if (insertSorters != null) __obj.updateDynamic("insertSorters")(js.Any.fromFunction0(insertSorters))
    if (isValid != null) __obj.updateDynamic("isValid")(js.Any.fromFunction0(isValid))
    if (items != null) __obj.updateDynamic("items")(items)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (last != null) __obj.updateDynamic("last")(js.Any.fromFunction0(last))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeAll != null) __obj.updateDynamic("removeAll")(js.Any.fromFunction1(removeAll))
    if (removeAt != null) __obj.updateDynamic("removeAt")(js.Any.fromFunction1(removeAt))
    if (removeAtKey != null) __obj.updateDynamic("removeAtKey")(js.Any.fromFunction1(removeAtKey))
    if (removeFilters != null) __obj.updateDynamic("removeFilters")(js.Any.fromFunction1(removeFilters))
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(js.Any.fromFunction1(removeSorter))
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(js.Any.fromFunction1(removeSorters))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction2(replace))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setAutoFilter != null) __obj.updateDynamic("setAutoFilter")(js.Any.fromFunction1(setAutoFilter))
    if (setAutoSort != null) __obj.updateDynamic("setAutoSort")(js.Any.fromFunction1(setAutoSort))
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(js.Any.fromFunction1(setDefaultSortDirection))
    if (setFilterRoot != null) __obj.updateDynamic("setFilterRoot")(js.Any.fromFunction1(setFilterRoot))
    if (setFilters != null) __obj.updateDynamic("setFilters")(js.Any.fromFunction1(setFilters))
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(js.Any.fromFunction1(setSortRoot))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1(setSorters))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot)
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IErrors]
  }
}

