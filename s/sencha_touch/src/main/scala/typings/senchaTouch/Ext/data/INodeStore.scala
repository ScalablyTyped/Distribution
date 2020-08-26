package typings.senchaTouch.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INodeStore extends IStore {
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of filters
    * @returns Object
    */
  var getFilters: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of folderSort
    * @returns Boolean
    */
  var getFolderSort: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of node
    * @returns Ext.data.Model
    */
  var getNode: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Returns the value of recursive
    * @returns Boolean
    */
  var getRecursive: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of rootVisible
    * @returns Boolean
    */
  var getRootVisible: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of sorters
    * @returns Object
    */
  var getSorters: js.UndefOr[js.Function0[_]] = js.native
  /** [Method]
    * @param node Object
    * @returns Boolean
    */
  var isVisible: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (Ext.data.Model) */
  var node: js.UndefOr[IModel] = js.native
  /** [Config Option] (Boolean) */
  var recursive: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the value of filters
    * @param filters Object The new value.
    */
  @JSName("setFilters")
  var setFilters_INodeStore: js.UndefOr[js.Function1[/* filters */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of folderSort
    * @param folderSort Boolean The new value.
    */
  var setFolderSort: js.UndefOr[js.Function1[/* folderSort */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of node
    * @param node Ext.data.Model The new value.
    */
  var setNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[IModel], Unit]] = js.native
  /** [Method] Sets the value of recursive
    * @param recursive Boolean The new value.
    */
  var setRecursive: js.UndefOr[js.Function1[/* recursive */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of rootVisible
    * @param rootVisible Boolean The new value.
    */
  var setRootVisible: js.UndefOr[js.Function1[/* rootVisible */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of sorters
    * @param sorters Object The new value.
    */
  @JSName("setSorters")
  var setSorters_INodeStore: js.UndefOr[js.Function1[/* sorters */ js.UndefOr[js.Any], Unit]] = js.native
}

object INodeStore {
  @scala.inline
  def apply(): INodeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INodeStore]
  }
  @scala.inline
  implicit class INodeStoreOps[Self <: INodeStore] (val x: Self) extends AnyVal {
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
    def setFolderSort(value: Boolean): Self = this.set("folderSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolderSort: Self = this.set("folderSort", js.undefined)
    @scala.inline
    def setGetFilters(value: () => _): Self = this.set("getFilters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFilters: Self = this.set("getFilters", js.undefined)
    @scala.inline
    def setGetFolderSort(value: () => Boolean): Self = this.set("getFolderSort", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFolderSort: Self = this.set("getFolderSort", js.undefined)
    @scala.inline
    def setGetNode(value: () => IModel): Self = this.set("getNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNode: Self = this.set("getNode", js.undefined)
    @scala.inline
    def setGetRecursive(value: () => Boolean): Self = this.set("getRecursive", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecursive: Self = this.set("getRecursive", js.undefined)
    @scala.inline
    def setGetRootVisible(value: () => Boolean): Self = this.set("getRootVisible", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRootVisible: Self = this.set("getRootVisible", js.undefined)
    @scala.inline
    def setGetSorters(value: () => _): Self = this.set("getSorters", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetSorters: Self = this.set("getSorters", js.undefined)
    @scala.inline
    def setIsVisible(value: /* node */ js.UndefOr[js.Any] => Boolean): Self = this.set("isVisible", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setNode(value: IModel): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
    @scala.inline
    def setRootVisible(value: Boolean): Self = this.set("rootVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootVisible: Self = this.set("rootVisible", js.undefined)
    @scala.inline
    def setSetFilters(value: /* filters */ js.UndefOr[js.Any] => Unit): Self = this.set("setFilters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFilters: Self = this.set("setFilters", js.undefined)
    @scala.inline
    def setSetFolderSort(value: /* folderSort */ js.UndefOr[Boolean] => Unit): Self = this.set("setFolderSort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFolderSort: Self = this.set("setFolderSort", js.undefined)
    @scala.inline
    def setSetNode(value: /* node */ js.UndefOr[IModel] => Unit): Self = this.set("setNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNode: Self = this.set("setNode", js.undefined)
    @scala.inline
    def setSetRecursive(value: /* recursive */ js.UndefOr[Boolean] => Unit): Self = this.set("setRecursive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRecursive: Self = this.set("setRecursive", js.undefined)
    @scala.inline
    def setSetRootVisible(value: /* rootVisible */ js.UndefOr[Boolean] => Unit): Self = this.set("setRootVisible", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRootVisible: Self = this.set("setRootVisible", js.undefined)
    @scala.inline
    def setSetSorters(value: /* sorters */ js.UndefOr[js.Any] => Unit): Self = this.set("setSorters", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetSorters: Self = this.set("setSorters", js.undefined)
  }
  
}

