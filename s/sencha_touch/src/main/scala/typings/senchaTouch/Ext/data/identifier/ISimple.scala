package typings.senchaTouch.Ext.data.identifier

import typings.senchaTouch.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISimple extends IBase {
  /** [Method] Returns the value of prefix
    * @returns String
    */
  var getPrefix: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Sets the value of prefix
    * @param prefix String The new value.
    */
  var setPrefix: js.UndefOr[js.Function1[/* prefix */ js.UndefOr[String], Unit]] = js.native
}

object ISimple {
  @scala.inline
  def apply(): ISimple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISimple]
  }
  @scala.inline
  implicit class ISimpleOps[Self <: ISimple] (val x: Self) extends AnyVal {
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
    def setGetPrefix(value: () => String): Self = this.set("getPrefix", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPrefix: Self = this.set("getPrefix", js.undefined)
    @scala.inline
    def setSetPrefix(value: /* prefix */ js.UndefOr[String] => Unit): Self = this.set("setPrefix", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPrefix: Self = this.set("setPrefix", js.undefined)
  }
  
}

