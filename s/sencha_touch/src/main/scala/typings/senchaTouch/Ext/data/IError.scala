package typings.senchaTouch.Ext.data

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IError extends IBase {
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  /** [Method] Returns the value of field
    * @returns String
    */
  var getField: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of message
    * @returns String
    */
  var getMessage: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (String) */
  var message: js.UndefOr[String] = js.native
  /** [Method] Sets the value of field
    * @param field String The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of message
    * @param message String The new value.
    */
  var setMessage: js.UndefOr[js.Function1[/* message */ js.UndefOr[String], Unit]] = js.native
}

object IError {
  @scala.inline
  def apply(): IError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IError]
  }
  @scala.inline
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setGetField(value: () => String): Self = this.set("getField", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetField: Self = this.set("getField", js.undefined)
    @scala.inline
    def setGetMessage(value: () => String): Self = this.set("getMessage", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetMessage: Self = this.set("getMessage", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSetField(value: /* field */ js.UndefOr[String] => Unit): Self = this.set("setField", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetField: Self = this.set("setField", js.undefined)
    @scala.inline
    def setSetMessage(value: /* message */ js.UndefOr[String] => Unit): Self = this.set("setMessage", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetMessage: Self = this.set("setMessage", js.undefined)
  }
  
}

