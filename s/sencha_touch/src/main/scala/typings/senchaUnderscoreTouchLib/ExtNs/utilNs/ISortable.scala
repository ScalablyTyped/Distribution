package typings
package senchaUnderscoreTouchLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISortable
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Property] (String) */
  var defaultSortDirection: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sorts the data in the Store by one or more of its properties
  		* @param sorters String/Ext.util.Sorter[] Either a string name of one of the fields in this Store's configured Model, or an array of sorter configurations.
  		* @param direction String The overall direction to sort the data by.
  		* @param where String
  		* @param doSort Boolean
  		* @returns Ext.util.Sorter[]
  		*/
  var sort: js.UndefOr[
    js.Function4[
      /* sorters */ js.UndefOr[js.Any], 
      /* direction */ js.UndefOr[java.lang.String], 
      /* where */ js.UndefOr[java.lang.String], 
      /* doSort */ js.UndefOr[scala.Boolean], 
      senchaUnderscoreTouchLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Property] (String) */
  var sortRoot: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.util.MixedCollection) */
  var sorters: js.UndefOr[IMixedCollection] = js.undefined
}

