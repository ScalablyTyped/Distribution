package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IXmlWriter
  extends typings.senchaTouch.Ext.data.writer.IWriter {
  /** [Config Option] (String) */
  var defaultDocumentRoot: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var documentRoot: js.UndefOr[String] = js.native
  /** [Method] Returns the value of defaultDocumentRoot
    * @returns String
    */
  var getDefaultDocumentRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of documentRoot
    * @returns String
    */
  var getDocumentRoot: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of header
    * @returns String
    */
  var getHeader: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of record
    * @returns String
    */
  var getRecord: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.native
  /** [Method] Sets the value of defaultDocumentRoot
    * @param defaultDocumentRoot String The new value.
    */
  var setDefaultDocumentRoot: js.UndefOr[js.Function1[/* defaultDocumentRoot */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of documentRoot
    * @param documentRoot String The new value.
    */
  var setDocumentRoot: js.UndefOr[js.Function1[/* documentRoot */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of header
    * @param header String The new value.
    */
  var setHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of record
    * @param record String The new value.
    */
  var setRecord: js.UndefOr[js.Function1[/* record */ js.UndefOr[String], Unit]] = js.native
  /** [Method]
    * @param request Object
    * @param data Array
    * @returns Object
    */
  var writeRecords: js.UndefOr[js.Function2[/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array], _]] = js.native
}

object IXmlWriter {
  @scala.inline
  def apply(): IXmlWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlWriter]
  }
  @scala.inline
  implicit class IXmlWriterOps[Self <: IXmlWriter] (val x: Self) extends AnyVal {
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
    def setDefaultDocumentRoot(value: String): Self = this.set("defaultDocumentRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultDocumentRoot: Self = this.set("defaultDocumentRoot", js.undefined)
    @scala.inline
    def setDocumentRoot(value: String): Self = this.set("documentRoot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentRoot: Self = this.set("documentRoot", js.undefined)
    @scala.inline
    def setGetDefaultDocumentRoot(value: () => String): Self = this.set("getDefaultDocumentRoot", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDefaultDocumentRoot: Self = this.set("getDefaultDocumentRoot", js.undefined)
    @scala.inline
    def setGetDocumentRoot(value: () => String): Self = this.set("getDocumentRoot", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetDocumentRoot: Self = this.set("getDocumentRoot", js.undefined)
    @scala.inline
    def setGetHeader(value: () => String): Self = this.set("getHeader", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetHeader: Self = this.set("getHeader", js.undefined)
    @scala.inline
    def setGetRecord(value: () => String): Self = this.set("getRecord", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRecord: Self = this.set("getRecord", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setRecord(value: String): Self = this.set("record", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecord: Self = this.set("record", js.undefined)
    @scala.inline
    def setSetDefaultDocumentRoot(value: /* defaultDocumentRoot */ js.UndefOr[String] => Unit): Self = this.set("setDefaultDocumentRoot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDefaultDocumentRoot: Self = this.set("setDefaultDocumentRoot", js.undefined)
    @scala.inline
    def setSetDocumentRoot(value: /* documentRoot */ js.UndefOr[String] => Unit): Self = this.set("setDocumentRoot", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetDocumentRoot: Self = this.set("setDocumentRoot", js.undefined)
    @scala.inline
    def setSetHeader(value: /* header */ js.UndefOr[String] => Unit): Self = this.set("setHeader", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetHeader: Self = this.set("setHeader", js.undefined)
    @scala.inline
    def setSetRecord(value: /* record */ js.UndefOr[String] => Unit): Self = this.set("setRecord", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRecord: Self = this.set("setRecord", js.undefined)
    @scala.inline
    def setWriteRecords(value: (/* request */ js.UndefOr[js.Any], /* data */ js.UndefOr[Array]) => _): Self = this.set("writeRecords", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWriteRecords: Self = this.set("writeRecords", js.undefined)
  }
  
}

