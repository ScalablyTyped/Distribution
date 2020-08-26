package typings.senchaTouch.Ext.data.writer

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.data.IRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWriter extends IBase {
  /** [Method] Returns the value of nameProperty
    * @returns String
    */
  var getNameProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Formats the data for each record before sending it to the server
    * @param record Object The record that we are writing to the server.
    * @returns Object An object literal of name/value keys to be written to the server. By default this method returns the data property on the record.
    */
  var getRecordData: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of writeAllFields
    * @returns Boolean
    */
  var getWriteAllFields: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (String) */
  var nameProperty: js.UndefOr[String] = js.native
  /** [Method] Sets the value of nameProperty
    * @param nameProperty String The new value.
    */
  var setNameProperty: js.UndefOr[js.Function1[/* nameProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of writeAllFields
    * @param writeAllFields Boolean The new value.
    */
  var setWriteAllFields: js.UndefOr[js.Function1[/* writeAllFields */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Prepares a Proxy s Ext data Request object
    * @param request Ext.data.Request The request object.
    * @returns Ext.data.Request The modified request object.
    */
  var write: js.UndefOr[js.Function1[/* request */ js.UndefOr[IRequest], IRequest]] = js.native
  /** [Config Option] (Boolean) */
  var writeAllFields: js.UndefOr[Boolean] = js.native
}

object IWriter {
  @scala.inline
  def apply(): IWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWriter]
  }
  @scala.inline
  implicit class IWriterOps[Self <: IWriter] (val x: Self) extends AnyVal {
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
    def setGetNameProperty(value: () => String): Self = this.set("getNameProperty", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetNameProperty: Self = this.set("getNameProperty", js.undefined)
    @scala.inline
    def setGetRecordData(value: /* record */ js.UndefOr[js.Any] => _): Self = this.set("getRecordData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetRecordData: Self = this.set("getRecordData", js.undefined)
    @scala.inline
    def setGetWriteAllFields(value: () => Boolean): Self = this.set("getWriteAllFields", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWriteAllFields: Self = this.set("getWriteAllFields", js.undefined)
    @scala.inline
    def setNameProperty(value: String): Self = this.set("nameProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameProperty: Self = this.set("nameProperty", js.undefined)
    @scala.inline
    def setSetNameProperty(value: /* nameProperty */ js.UndefOr[String] => Unit): Self = this.set("setNameProperty", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetNameProperty: Self = this.set("setNameProperty", js.undefined)
    @scala.inline
    def setSetWriteAllFields(value: /* writeAllFields */ js.UndefOr[Boolean] => Unit): Self = this.set("setWriteAllFields", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetWriteAllFields: Self = this.set("setWriteAllFields", js.undefined)
    @scala.inline
    def setWrite(value: /* request */ js.UndefOr[IRequest] => IRequest): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
    @scala.inline
    def setWriteAllFields(value: Boolean): Self = this.set("writeAllFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteAllFields: Self = this.set("writeAllFields", js.undefined)
  }
  
}

