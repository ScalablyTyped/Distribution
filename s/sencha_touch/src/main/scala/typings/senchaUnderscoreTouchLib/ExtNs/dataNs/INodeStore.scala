package typings
package senchaUnderscoreTouchLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INodeStore extends IStore {
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of filters
  		* @returns Object
  		*/
  var getFilters: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of folderSort
  		* @returns Boolean
  		*/
  var getFolderSort: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of node
  		* @returns Ext.data.Model
  		*/
  var getNode: js.UndefOr[js.Function0[IModel]] = js.undefined
  /** [Method] Returns the value of recursive
  		* @returns Boolean
  		*/
  var getRecursive: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of rootVisible
  		* @returns Boolean
  		*/
  var getRootVisible: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Returns the value of sorters
  		* @returns Object
  		*/
  var getSorters: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method]
  		* @param node Object
  		* @returns Boolean
  		*/
  var isVisible: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Config Option] (Ext.data.Model) */
  var node: js.UndefOr[IModel] = js.undefined
  /** [Config Option] (Boolean) */
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Sets the value of filters
  		* @param filters Object The new value.
  		*/
  @JSName("setFilters")
  var setFilters_INodeStore: js.UndefOr[js.Function1[/* filters */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of folderSort
  		* @param folderSort Boolean The new value.
  		*/
  var setFolderSort: js.UndefOr[js.Function1[/* folderSort */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of node
  		* @param node Ext.data.Model The new value.
  		*/
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[IModel], scala.Unit]] = js.undefined
  /** [Method] Sets the value of recursive
  		* @param recursive Boolean The new value.
  		*/
  var setRecursive: js.UndefOr[js.Function1[/* recursive */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of rootVisible
  		* @param rootVisible Boolean The new value.
  		*/
  var setRootVisible: js.UndefOr[js.Function1[/* rootVisible */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Sets the value of sorters
  		* @param sorters Object The new value.
  		*/
  @JSName("setSorters")
  var setSorters_INodeStore: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

