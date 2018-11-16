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

