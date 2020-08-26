package typings.senchaTouch.Ext.util.sizemonitor

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbstract extends IBase {
  /** [Method] Returns the value of args
    * @returns Array
    */
  var getArgs: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the value of callback
    * @returns Object
    */
  var getCallback: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of element
    * @returns Object
    */
  var getElement: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of scope
    * @returns Object
    */
  var getScope: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Sets the value of args
    * @param args Array The new value.
    */
  var setArgs: js.UndefOr[js.Function1[/* args */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] Sets the value of callback
    * @param callback Object The new value.
    */
  var setCallback: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of element
    * @param element Object The new value.
    */
  var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of scope
    * @param scope Object The new value.
    */
  var setScope: js.UndefOr[js.Function1[/* scope */ js.UndefOr[js.Any], Unit]] = js.native
}

object IAbstract {
  @scala.inline
  def apply(): IAbstract = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbstract]
  }
  @scala.inline
  implicit class IAbstractOps[Self <: IAbstract] (val x: Self) extends AnyVal {
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
    def setGetArgs(value: () => Array): Self = this.set("getArgs", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetArgs: Self = this.set("getArgs", js.undefined)
    @scala.inline
    def setGetCallback(value: () => _): Self = this.set("getCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetCallback: Self = this.set("getCallback", js.undefined)
    @scala.inline
    def setGetElement(value: () => _): Self = this.set("getElement", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetElement: Self = this.set("getElement", js.undefined)
    @scala.inline
    def setGetScope(value: () => _): Self = this.set("getScope", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetScope: Self = this.set("getScope", js.undefined)
    @scala.inline
    def setSetArgs(value: /* args */ js.UndefOr[Array] => Unit): Self = this.set("setArgs", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetArgs: Self = this.set("setArgs", js.undefined)
    @scala.inline
    def setSetCallback(value: /* callback */ js.UndefOr[js.Any] => Unit): Self = this.set("setCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetCallback: Self = this.set("setCallback", js.undefined)
    @scala.inline
    def setSetElement(value: /* element */ js.UndefOr[js.Any] => Unit): Self = this.set("setElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetElement: Self = this.set("setElement", js.undefined)
    @scala.inline
    def setSetScope(value: /* scope */ js.UndefOr[js.Any] => Unit): Self = this.set("setScope", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetScope: Self = this.set("setScope", js.undefined)
  }
  
}

