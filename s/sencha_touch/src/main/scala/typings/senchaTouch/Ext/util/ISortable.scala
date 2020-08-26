package typings.senchaTouch.Ext.util

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortable extends IBase {
  /** [Property] (String) */
  var defaultSortDirection: js.UndefOr[String] = js.native
  /** [Method] Performs initialization of this mixin  */
  var initSortable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Boolean) */
  var isSortable: js.UndefOr[Boolean] = js.native
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
      /* direction */ js.UndefOr[String], 
      /* where */ js.UndefOr[String], 
      /* doSort */ js.UndefOr[Boolean], 
      Array
    ]
  ] = js.native
  /** [Property] (String) */
  var sortRoot: js.UndefOr[String] = js.native
  /** [Property] (Ext.util.MixedCollection) */
  var sorters: js.UndefOr[IMixedCollection] = js.native
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
    def setDefaultSortDirection(value: String): Self = this.set("defaultSortDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSortDirection: Self = this.set("defaultSortDirection", js.undefined)
    @scala.inline
    def setInitSortable(value: () => Unit): Self = this.set("initSortable", js.Any.fromFunction0(value))
    @scala.inline
    def deleteInitSortable: Self = this.set("initSortable", js.undefined)
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSortable: Self = this.set("isSortable", js.undefined)
    @scala.inline
    def setSort(
      value: (/* sorters */ js.UndefOr[js.Any], /* direction */ js.UndefOr[String], /* where */ js.UndefOr[String], /* doSort */ js.UndefOr[Boolean]) => Array
    ): Self = this.set("sort", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortRoot(value: String): Self = this.set("sortRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortRoot: Self = this.set("sortRoot", js.undefined)
    @scala.inline
    def setSorters(value: IMixedCollection): Self = this.set("sorters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorters: Self = this.set("sorters", js.undefined)
  }
  
}

