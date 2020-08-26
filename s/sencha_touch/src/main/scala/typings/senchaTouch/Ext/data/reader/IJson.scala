package typings.senchaTouch.Ext.data.reader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJson extends IReader {
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of useSimpleAccessors
    * @returns Boolean
    */
  var getUseSimpleAccessors: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of useSimpleAccessors
    * @param useSimpleAccessors Boolean The new value.
    */
  var setUseSimpleAccessors: js.UndefOr[js.Function1[/* useSimpleAccessors */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[Boolean] = js.native
}

object IJson {
  @scala.inline
  def apply(): IJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJson]
  }
  @scala.inline
  implicit class IJsonOps[Self <: IJson] (val x: Self) extends AnyVal {
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
    def setGetRecord(value: () => String): Self = this.set("getRecord", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecord: Self = this.set("getRecord", js.undefined)
    @scala.inline
    def setGetUseSimpleAccessors(value: () => Boolean): Self = this.set("getUseSimpleAccessors", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetUseSimpleAccessors: Self = this.set("getUseSimpleAccessors", js.undefined)
    @scala.inline
    def setRecord(value: String): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    @scala.inline
    def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = this.set("setRecord", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRecord: Self = this.set("setRecord", js.undefined)
    @scala.inline
    def setSetUseSimpleAccessors(value: /* useSimpleAccessors */ js.UndefOr[Boolean] => Unit): Self = this.set("setUseSimpleAccessors", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetUseSimpleAccessors: Self = this.set("setUseSimpleAccessors", js.undefined)
    @scala.inline
    def setUseSimpleAccessors(value: Boolean): Self = this.set("useSimpleAccessors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSimpleAccessors: Self = this.set("useSimpleAccessors", js.undefined)
  }
  
}

