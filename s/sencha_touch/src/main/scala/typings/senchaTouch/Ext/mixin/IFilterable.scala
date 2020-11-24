package typings.senchaTouch.Ext.mixin

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterable extends IBase {
  
  /** [Method] This method adds a filter
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    */
  var addFilter: js.UndefOr[js.Function1[/* filter */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] This method adds all the filters in a passed array
    * @param filters Array An array with filters. A filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Object
    */
  var addFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], _]] = js.native
  
  /** [Property] (Object) */
  var currentSortFn: js.UndefOr[js.Any] = js.native
  
  /** [Property] (Boolean) */
  var dirtyFilterFn: js.UndefOr[Boolean] = js.native
  
  /** [Method] This method will sort an array based on the currently configured sorters
    * @param data Array The array you want to have sorted.
    * @returns Array The array you passed after it is sorted.
    */
  var filter: js.UndefOr[js.Function1[/* data */ js.UndefOr[Array], Array]] = js.native
  
  /** [Config Option] (String) */
  var filterRoot: js.UndefOr[String] = js.native
  
  /** [Property] (Boolean) */
  var filtered: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Array) */
  var filters: js.UndefOr[Array] = js.native
  
  /** [Method] Returns an up to date sort function
    * @returns Function sortFn The sort function.
    */
  var getFilterFn: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of filterRoot
    * @returns String
    */
  var getFilterRoot: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of filters
    * @returns Array
    */
  var getFilters: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] This method adds a filter at a given index
    * @param index Number The index at which to insert the filter.
    * @param filter Ext.util.Sorter/Function/Object Can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Object
    */
  var insertFilter: js.UndefOr[js.Function2[/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] This method inserts all the filters in the passed array at the given index
    * @param index Number The index at which to insert the filters.
    * @param filters Array Each filter can be an instance of Ext.util.Filter, an object representing an Ext.util.Filter configuration, or a filter function.
    * @returns Array
    */
  var insertFilters: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array], Array]
  ] = js.native
  
  /** [Method] This method removes all the filters in a passed array
    * @param filters Array Each value in the array can be a string (property name), function (sorterFn), an object containing a property and value keys or Sorter instance.
    */
  var removeFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of filterRoot
    * @param filterRoot String The new value.
    */
  var setFilterRoot: js.UndefOr[js.Function1[/* filterRoot */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of filters
    * @param filters Array The new value.
    */
  var setFilters: js.UndefOr[js.Function1[/* filters */ js.UndefOr[Array], Unit]] = js.native
}
object IFilterable {
  
  @scala.inline
  def apply(): IFilterable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFilterable]
  }
  
  @scala.inline
  implicit class IFilterableOps[Self <: IFilterable] (val x: Self) extends AnyVal {
    
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
    def setAddFilter(value: /* filter */ js.UndefOr[js.Any] => Unit): Self = this.set("addFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddFilter: Self = this.set("addFilter", js.undefined)
    
    @scala.inline
    def setAddFilters(value: /* filters */ js.UndefOr[Array] => _): Self = this.set("addFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddFilters: Self = this.set("addFilters", js.undefined)
    
    @scala.inline
    def setCurrentSortFn(value: js.Any): Self = this.set("currentSortFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentSortFn: Self = this.set("currentSortFn", js.undefined)
    
    @scala.inline
    def setDirtyFilterFn(value: Boolean): Self = this.set("dirtyFilterFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirtyFilterFn: Self = this.set("dirtyFilterFn", js.undefined)
    
    @scala.inline
    def setFilter(value: /* data */ js.UndefOr[Array] => Array): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFilterRoot(value: String): Self = this.set("filterRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterRoot: Self = this.set("filterRoot", js.undefined)
    
    @scala.inline
    def setFiltered(value: Boolean): Self = this.set("filtered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiltered: Self = this.set("filtered", js.undefined)
    
    @scala.inline
    def setFilters(value: Array): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setGetFilterFn(value: () => _): Self = this.set("getFilterFn", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFilterFn: Self = this.set("getFilterFn", js.undefined)
    
    @scala.inline
    def setGetFilterRoot(value: () => String): Self = this.set("getFilterRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFilterRoot: Self = this.set("getFilterRoot", js.undefined)
    
    @scala.inline
    def setGetFilters(value: () => Array): Self = this.set("getFilters", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetFilters: Self = this.set("getFilters", js.undefined)
    
    @scala.inline
    def setInsertFilter(value: (/* index */ js.UndefOr[Double], /* filter */ js.UndefOr[js.Any]) => _): Self = this.set("insertFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsertFilter: Self = this.set("insertFilter", js.undefined)
    
    @scala.inline
    def setInsertFilters(value: (/* index */ js.UndefOr[Double], /* filters */ js.UndefOr[Array]) => Array): Self = this.set("insertFilters", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInsertFilters: Self = this.set("insertFilters", js.undefined)
    
    @scala.inline
    def setRemoveFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = this.set("removeFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemoveFilters: Self = this.set("removeFilters", js.undefined)
    
    @scala.inline
    def setSetFilterRoot(value: /* filterRoot */ js.UndefOr[String] => Unit): Self = this.set("setFilterRoot", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFilterRoot: Self = this.set("setFilterRoot", js.undefined)
    
    @scala.inline
    def setSetFilters(value: /* filters */ js.UndefOr[Array] => Unit): Self = this.set("setFilters", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFilters: Self = this.set("setFilters", js.undefined)
  }
}
