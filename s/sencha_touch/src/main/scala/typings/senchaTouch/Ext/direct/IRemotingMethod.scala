package typings.senchaTouch.Ext.direct

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingMethod extends IBase {
  /** [Method] Takes the arguments for the Direct function and splits the arguments from the scope and the callback
    * @param args Array The arguments passed to the direct call
    * @returns Object An object with 3 properties, args, callback &amp; scope.
    */
  var getCallData: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], _]] = js.native
  /** [Method] Returns the value of formHandler
    * @returns Object
    */
  var getFormHandler: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of len
    * @returns Object
    */
  var getLen: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of name
    * @returns Object
    */
  var getName: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of ordered
    * @returns Boolean
    */
  var getOrdered: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of params
    * @returns Object
    */
  var getParams: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of formHandler
    * @param formHandler Object The new value.
    */
  var setFormHandler: js.UndefOr[js.Function1[/* formHandler */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of len
    * @param len Object The new value.
    */
  var setLen: js.UndefOr[js.Function1[/* len */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of name
    * @param name Object The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of ordered
    * @param ordered Boolean The new value.
    */
  var setOrdered: js.UndefOr[js.Function1[/* ordered */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of params
    * @param params Object The new value.
    */
  var setParams: js.UndefOr[js.Function1[/* params */ js.UndefOr[js.Any], Unit]] = js.native
}

object IRemotingMethod {
  @scala.inline
  def apply(): IRemotingMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingMethod]
  }
  @scala.inline
  implicit class IRemotingMethodOps[Self <: IRemotingMethod] (val x: Self) extends AnyVal {
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
    def setGetCallData(value: /* args */ js.UndefOr[Array] => _): Self = this.set("getCallData", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetCallData: Self = this.set("getCallData", js.undefined)
    @scala.inline
    def setGetFormHandler(value: () => _): Self = this.set("getFormHandler", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetFormHandler: Self = this.set("getFormHandler", js.undefined)
    @scala.inline
    def setGetLen(value: () => _): Self = this.set("getLen", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetLen: Self = this.set("getLen", js.undefined)
    @scala.inline
    def setGetName(value: () => _): Self = this.set("getName", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetName: Self = this.set("getName", js.undefined)
    @scala.inline
    def setGetOrdered(value: () => Boolean): Self = this.set("getOrdered", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOrdered: Self = this.set("getOrdered", js.undefined)
    @scala.inline
    def setGetParams(value: () => _): Self = this.set("getParams", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetParams: Self = this.set("getParams", js.undefined)
    @scala.inline
    def setSetFormHandler(value: /* formHandler */ js.UndefOr[js.Any] => Unit): Self = this.set("setFormHandler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetFormHandler: Self = this.set("setFormHandler", js.undefined)
    @scala.inline
    def setSetLen(value: /* len */ js.UndefOr[js.Any] => Unit): Self = this.set("setLen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetLen: Self = this.set("setLen", js.undefined)
    @scala.inline
    def setSetName(value: /* name */ js.UndefOr[js.Any] => Unit): Self = this.set("setName", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetName: Self = this.set("setName", js.undefined)
    @scala.inline
    def setSetOrdered(value: /* ordered */ js.UndefOr[Boolean] => Unit): Self = this.set("setOrdered", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOrdered: Self = this.set("setOrdered", js.undefined)
    @scala.inline
    def setSetParams(value: /* params */ js.UndefOr[js.Any] => Unit): Self = this.set("setParams", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetParams: Self = this.set("setParams", js.undefined)
  }
  
}

