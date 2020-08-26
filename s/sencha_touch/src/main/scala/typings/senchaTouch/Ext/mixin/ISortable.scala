package typings.senchaTouch.Ext.mixin

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortable extends IBase {
  /** [Method] This method adds a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var addSorter: js.UndefOr[
    js.Function2[/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] This method adds all the sorters in a passed array
    * @param sorters Array An array with sorters. A sorter can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    * @param defaultDirection String The default direction for each sorter in the array. Defaults to the value of defaultSortDirection. Can be either 'ASC' or 'DESC'.
    */
  var addSorters: js.UndefOr[
    js.Function2[/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var dirtySortFn: js.UndefOr[Boolean] = js.native
  /** [Method] This method returns the index that a given item would be inserted into a given array based on the current sorters
    * @param items Array The array that you want to insert the item into.
    * @param item Mixed The item that you want to insert into the items array.
    * @returns Number The index for the given item in the given array based on the current sorters.
    */
  var findInsertionIndex: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any], Double]
  ] = js.native
  /** [Method] Returns the value of defaultSortDirection
    * @returns String
    */
  var getDefaultSortDirection: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns an up to date sort function
    * @returns Function The sort function.
    */
  var getSortFn: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of sortRoot
    * @returns String
    */
  var getSortRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of sorters
    * @returns Array
    */
  var getSorters: js.UndefOr[js.Function0[Array]] = js.native
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
  ] = js.native
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
  ] = js.native
  /** [Method] This method removes a sorter
    * @param sorter Ext.util.Sorter/String/Function/Object Can be an instance of Ext.util.Sorter, a string indicating a property name, an object representing an Ext.util.Sorter configuration, or a sort function.
    */
  var removeSorter: js.UndefOr[js.Function1[/* sorter */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] This method removes all the sorters in a passed array
    * @param sorters Array Each value in the array can be a string (property name), function (sorterFn) or Sorter instance.
    */
  var removeSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of defaultSortDirection
    * @param defaultSortDirection String The new value.
    */
  var setDefaultSortDirection: js.UndefOr[js.Function1[/* defaultSortDirection */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of sortRoot
    * @param sortRoot String The new value.
    */
  var setSortRoot: js.UndefOr[js.Function1[/* sortRoot */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of sorters
    * @param sorters Array The new value.
    */
  var setSorters: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] This method will sort an array based on the currently configured sorters
    * @param data Array The array you want to have sorted.
    * @returns Array The array you passed after it is sorted.
    */
  var sort: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.native
  /** [Config Option] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  /** [Property] (Boolean) */
  var sorted: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Array) */
  var sorters: js.UndefOr[Array] = js.native
}

object ISortable {
  @scala.inline
  def apply(): ISortable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISortable]
  }
  @scala.inline
  implicit class ISortableOps[Self <: ISortable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddSorter(value: (/* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Unit): Self = this.set("addSorter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddSorter: Self = this.set("addSorter", js.undefined)
    @scala.inline
    def setAddSorters(value: (/* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String]) => Unit): Self = this.set("addSorters", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddSorters: Self = this.set("addSorters", js.undefined)
    @scala.inline
    def setCurrentSortFn(value: js.Any): Self = this.set("currentSortFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSortFn: Self = this.set("currentSortFn", js.undefined)
    @scala.inline
    def setDefaultSortDirection(value: String): Self = this.set("defaultSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortDirection: Self = this.set("defaultSortDirection", js.undefined)
    @scala.inline
    def setDirtySortFn(value: Boolean): Self = this.set("dirtySortFn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirtySortFn: Self = this.set("dirtySortFn", js.undefined)
    @scala.inline
    def setFindInsertionIndex(value: (/* items */ js.UndefOr[Array], /* item */ js.UndefOr[js.Any]) => Double): Self = this.set("findInsertionIndex", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFindInsertionIndex: Self = this.set("findInsertionIndex", js.undefined)
    @scala.inline
    def setGetDefaultSortDirection(value: () => String): Self = this.set("getDefaultSortDirection", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDefaultSortDirection: Self = this.set("getDefaultSortDirection", js.undefined)
    @scala.inline
    def setGetSortFn(value: () => _): Self = this.set("getSortFn", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSortFn: Self = this.set("getSortFn", js.undefined)
    @scala.inline
    def setGetSortRoot(value: () => String): Self = this.set("getSortRoot", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSortRoot: Self = this.set("getSortRoot", js.undefined)
    @scala.inline
    def setGetSorters(value: () => Array): Self = this.set("getSorters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSorters: Self = this.set("getSorters", js.undefined)
    @scala.inline
    def setInsertSorter(
      value: (/* index */ js.UndefOr[Double], /* sorter */ js.UndefOr[js.Any], /* defaultDirection */ js.UndefOr[String]) => Unit
    ): Self = this.set("insertSorter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertSorter: Self = this.set("insertSorter", js.undefined)
    @scala.inline
    def setInsertSorters(
      value: (/* index */ js.UndefOr[Double], /* sorters */ js.UndefOr[Array], /* defaultDirection */ js.UndefOr[String]) => Unit
    ): Self = this.set("insertSorters", js.Any.fromFunction3(value))
    @scala.inline
    def deleteInsertSorters: Self = this.set("insertSorters", js.undefined)
    @scala.inline
    def setRemoveSorter(value: /* sorter */ js.UndefOr[js.Any] => Unit): Self = this.set("removeSorter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveSorter: Self = this.set("removeSorter", js.undefined)
    @scala.inline
    def setRemoveSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = this.set("removeSorters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveSorters: Self = this.set("removeSorters", js.undefined)
    @scala.inline
    def setSetDefaultSortDirection(value: /* defaultSortDirection */ js.UndefOr[String] => Unit): Self = this.set("setDefaultSortDirection", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDefaultSortDirection: Self = this.set("setDefaultSortDirection", js.undefined)
    @scala.inline
    def setSetSortRoot(value: /* sortRoot */ js.UndefOr[String] => Unit): Self = this.set("setSortRoot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSortRoot: Self = this.set("setSortRoot", js.undefined)
    @scala.inline
    def setSetSorters(value: /* sorters */ js.UndefOr[Array] => Unit): Self = this.set("setSorters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSorters: Self = this.set("setSorters", js.undefined)
    @scala.inline
    def setSort(value: /* data */ js.UndefOr[Array] => Array): Self = this.set("sort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortRoot(value: String): Self = this.set("sortRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRoot: Self = this.set("sortRoot", js.undefined)
    @scala.inline
    def setSorted(value: Boolean): Self = this.set("sorted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorted: Self = this.set("sorted", js.undefined)
    @scala.inline
    def setSorters(value: Array): Self = this.set("sorters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorters: Self = this.set("sorters", js.undefined)
  }
  
}

