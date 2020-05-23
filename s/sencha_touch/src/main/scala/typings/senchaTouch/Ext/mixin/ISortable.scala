package typings.senchaTouch.Ext.mixin

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortable extends IBase {
  /** [Method] This method adds a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var addSorter: js.UndefOr[
    js.Function2[/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Method] This method adds all the sorters in a passed array
    * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var addSorters: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String], Unit]
  ] = js.undefined
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var dirtySortFn: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
    * @param items Array The array that you want to insert the item into.
    * @param item Mixed The item that you want to insert into the items array.
    * @returns Number The index for the given item in the given array based on the current sorters.
    */
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any], Double]
  ] = js.undefined
  /** [Method] Returns the value of defaultSortDirection
    * @returns String
    */
  var getDefaultSortDirection: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns an up to date sort function
    * @returns Function The sort function.
    */
  var getSortFn: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of sortRoot
    * @returns String
    */
  var getSortRoot: js.UndefOr[js.Function0[String]] = js.undefined
  /** [Method] Returns the value of sorters
    * @returns Array
    */
  var getSorters: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] This method adds a sorter at a given index
    * @param index Number The index at which to insert the sorter.
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var insertSorter: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* sorter */ js.UndefOr[js.Any], 
      /* defaultDirection */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /** [Method] This method inserts all the sorters in the passed array at the given index
    * @param index Number The index at which to insert the sorters.
    * @param sorters Array Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var insertSorters: js.UndefOr[
    js.Function3[
      /* index */ js.UndefOr[Double], 
      /* sorters */ js.UndefOr[Array], 
      /* defaultDirection */ js.UndefOr[String], 
      Unit
    ]
  ] = js.undefined
  /** [Method] This method removes a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    */
  var removeSorter: js.UndefOr[js.Function1[/* sorter */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method removes all the sorters in a passed array
    * @param sorters Array Each value in the array can be a string (property name), function (sorterFn) or Sorter instance.
    */
  var removeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of defaultSortDirection
    * @param defaultSortDirection String The new value.
    */
  var setDefaultSortDirection: js.UndefOr[js.Function1[/* defaultSortDirection */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of sortRoot
    * @param sortRoot String The new value.
    */
  var setSortRoot: js.UndefOr[js.Function1[/* sortRoot */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of sorters
    * @param sorters Array The new value.
    */
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] This method will sort an array based on the currently configured sorters
    * @param data Array The array you want to have sorted.
    * @returns Array The array you passed after it is sorted.
    */
  var sort: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.undefined
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.undefined
  /** [Property] (Boolean) */
  var sorted: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Array) */
  var sorters: js.UndefOr[Array] = js.undefined
}

object ISortable {
  @scala.inline
  def apply(
    addSorter: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Unit = null,
    addSorters: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    currentSortFn: js.Any = null,
    defaultSortDirection: String = null,
    destroy: () => Unit = null,
    dirtySortFn: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    findInsertionIndex: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => Double = null,
    getDefaultSortDirection: () => String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getSortFn: () => _ = null,
    getSortRoot: () => String = null,
    getSorters: () => Array = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    insertSorter: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Unit = null,
    insertSorters: (/* index */ js.UndefOr[Double], /* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String]) => Unit = null,
    mixins: js.Any = null,
    platformConfig: js.Any = null,
    removeSorter: /* sorter */ js.UndefOr[js.Any] => Unit = null,
    removeSorters: /* sorters */ js.UndefOr[Array] => Unit = null,
    self: IClass = null,
    setDefaultSortDirection: /* defaultSortDirection */ js.UndefOr[String] => Unit = null,
    setSortRoot: /* sortRoot */ js.UndefOr[String] => Unit = null,
    setSorters: /* sorters */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sort: /* data */ js.UndefOr[Array] => Array = null,
    sortRoot: String = null,
    sorted: js.UndefOr[Boolean] = js.undefined,
    sorters: Array = null,
    statics: js.Any = null,
    uses: Array = null
  ): ISortable = {
    val __obj = js.Dynamic.literal()
    if (addSorter != null) __obj.updateDynamic("addSorter")(js.Any.fromFunction2(addSorter))
    if (addSorters != null) __obj.updateDynamic("addSorters")(js.Any.fromFunction2(addSorters))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (currentSortFn != null) __obj.updateDynamic("currentSortFn")(currentSortFn.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(dirtySortFn)) __obj.updateDynamic("dirtySortFn")(dirtySortFn.get.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (findInsertionIndex != null) __obj.updateDynamic("findInsertionIndex")(js.Any.fromFunction2(findInsertionIndex))
    if (getDefaultSortDirection != null) __obj.updateDynamic("getDefaultSortDirection")(js.Any.fromFunction0(getDefaultSortDirection))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getSortFn != null) __obj.updateDynamic("getSortFn")(js.Any.fromFunction0(getSortFn))
    if (getSortRoot != null) __obj.updateDynamic("getSortRoot")(js.Any.fromFunction0(getSortRoot))
    if (getSorters != null) __obj.updateDynamic("getSorters")(js.Any.fromFunction0(getSorters))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (insertSorter != null) __obj.updateDynamic("insertSorter")(js.Any.fromFunction3(insertSorter))
    if (insertSorters != null) __obj.updateDynamic("insertSorters")(js.Any.fromFunction3(insertSorters))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (removeSorter != null) __obj.updateDynamic("removeSorter")(js.Any.fromFunction1(removeSorter))
    if (removeSorters != null) __obj.updateDynamic("removeSorters")(js.Any.fromFunction1(removeSorters))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDefaultSortDirection != null) __obj.updateDynamic("setDefaultSortDirection")(js.Any.fromFunction1(setDefaultSortDirection))
    if (setSortRoot != null) __obj.updateDynamic("setSortRoot")(js.Any.fromFunction1(setSortRoot))
    if (setSorters != null) __obj.updateDynamic("setSorters")(js.Any.fromFunction1(setSorters))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction1(sort))
    if (sortRoot != null) __obj.updateDynamic("sortRoot")(sortRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(sorted)) __obj.updateDynamic("sorted")(sorted.get.asInstanceOf[js.Any])
    if (sorters != null) __obj.updateDynamic("sorters")(sorters.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISortable]
  }
}

