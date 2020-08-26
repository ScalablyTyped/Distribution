package typings.senchaTouch.Ext.plugin

import typings.senchaTouch.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IListPaging extends IComponent {
  /** [Config Option] (Boolean) */
  var autoPaging: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the value of autoPaging
    * @returns Boolean
    */
  var getAutoPaging: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of loadMoreText
    * @returns String
    */
  var getLoadMoreText: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of noMoreRecordsText
    * @returns String
    */
  var getNoMoreRecordsText: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var loadMoreText: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var noMoreRecordsText: js.UndefOr[String] = js.native
  /** [Method] Sets the value of autoPaging
    * @param autoPaging Boolean The new value.
    */
  var setAutoPaging: js.UndefOr[js.Function1[/* autoPaging */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of loadMoreText
    * @param loadMoreText String The new value.
    */
  var setLoadMoreText: js.UndefOr[js.Function1[/* loadMoreText */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of noMoreRecordsText
    * @param noMoreRecordsText String The new value.
    */
  var setNoMoreRecordsText: js.UndefOr[js.Function1[/* noMoreRecordsText */ js.UndefOr[String], Unit]] = js.native
}

object IListPaging {
  @scala.inline
  def apply(): IListPaging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListPaging]
  }
  @scala.inline
  implicit class IListPagingOps[Self <: IListPaging] (val x: Self) extends AnyVal {
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
    def setAutoPaging(value: Boolean): Self = this.set("autoPaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPaging: Self = this.set("autoPaging", js.undefined)
    @scala.inline
    def setGetAutoPaging(value: () => Boolean): Self = this.set("getAutoPaging", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAutoPaging: Self = this.set("getAutoPaging", js.undefined)
    @scala.inline
    def setGetLoadMoreText(value: () => String): Self = this.set("getLoadMoreText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLoadMoreText: Self = this.set("getLoadMoreText", js.undefined)
    @scala.inline
    def setGetNoMoreRecordsText(value: () => String): Self = this.set("getNoMoreRecordsText", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNoMoreRecordsText: Self = this.set("getNoMoreRecordsText", js.undefined)
    @scala.inline
    def setLoadMoreText(value: String): Self = this.set("loadMoreText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadMoreText: Self = this.set("loadMoreText", js.undefined)
    @scala.inline
    def setNoMoreRecordsText(value: String): Self = this.set("noMoreRecordsText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMoreRecordsText: Self = this.set("noMoreRecordsText", js.undefined)
    @scala.inline
    def setSetAutoPaging(value: /* autoPaging */ js.UndefOr[Boolean] => Unit): Self = this.set("setAutoPaging", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAutoPaging: Self = this.set("setAutoPaging", js.undefined)
    @scala.inline
    def setSetLoadMoreText(value: /* loadMoreText */ js.UndefOr[String] => Unit): Self = this.set("setLoadMoreText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLoadMoreText: Self = this.set("setLoadMoreText", js.undefined)
    @scala.inline
    def setSetNoMoreRecordsText(value: /* noMoreRecordsText */ js.UndefOr[String] => Unit): Self = this.set("setNoMoreRecordsText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNoMoreRecordsText: Self = this.set("setNoMoreRecordsText", js.undefined)
  }
  
}

