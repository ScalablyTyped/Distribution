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

object INodeStore {
  @scala.inline
  def apply(
    IStore: IStore = null,
    filters: senchaUnderscoreTouchLib.ExtNs.Array = null,
    folderSort: js.UndefOr[scala.Boolean] = js.undefined,
    getFilters: js.Function0[_] = null,
    getFolderSort: js.Function0[scala.Boolean] = null,
    getNode: js.Function0[IModel] = null,
    getRecursive: js.Function0[scala.Boolean] = null,
    getRootVisible: js.Function0[scala.Boolean] = null,
    getSorters: js.Function0[_] = null,
    isVisible: js.Function1[/* node */ js.UndefOr[js.Any], scala.Boolean] = null,
    node: IModel = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    rootVisible: js.UndefOr[scala.Boolean] = js.undefined,
    setFilters: js.Function1[/* filters */ js.UndefOr[js.Any], scala.Unit] = null,
    setFolderSort: js.Function1[/* folderSort */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setNode: js.Function1[/* node */ js.UndefOr[IModel], scala.Unit] = null,
    setRecursive: js.Function1[/* recursive */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setRootVisible: js.Function1[/* rootVisible */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    setSorters: js.Function1[/* sorters */ js.UndefOr[js.Any], scala.Unit] = null,
    sorters: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): INodeStore = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IStore)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(folderSort)) __obj.updateDynamic("folderSort")(folderSort)
    if (getFilters != null) __obj.updateDynamic("getFilters")(getFilters)
    if (getFolderSort != null) __obj.updateDynamic("getFolderSort")(getFolderSort)
    if (getNode != null) __obj.updateDynamic("getNode")(getNode)
    if (getRecursive != null) __obj.updateDynamic("getRecursive")(getRecursive)
    if (getRootVisible != null) __obj.updateDynamic("getRootVisible")(getRootVisible)
    if (getSorters != null) __obj.updateDynamic("getSorters")(getSorters)
    if (isVisible != null) __obj.updateDynamic("isVisible")(isVisible)
    if (node != null) __obj.updateDynamic("node")(node)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (!js.isUndefined(rootVisible)) __obj.updateDynamic("rootVisible")(rootVisible)
    if (setFilters != null) __obj.updateDynamic("setFilters")(setFilters)
    if (setFolderSort != null) __obj.updateDynamic("setFolderSort")(setFolderSort)
    if (setNode != null) __obj.updateDynamic("setNode")(setNode)
    if (setRecursive != null) __obj.updateDynamic("setRecursive")(setRecursive)
    if (setRootVisible != null) __obj.updateDynamic("setRootVisible")(setRootVisible)
    if (setSorters != null) __obj.updateDynamic("setSorters")(setSorters)
    if (sorters != null) __obj.updateDynamic("sorters")(sorters)
    __obj.asInstanceOf[INodeStore]
  }
}

