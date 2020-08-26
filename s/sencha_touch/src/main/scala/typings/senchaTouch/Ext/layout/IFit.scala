package typings.senchaTouch.Ext.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFit extends IDefault {
  /** [Method]
    * @param item Object
    * @param isInner Object
    */
  @JSName("onItemInnerStateChange")
  var onItemInnerStateChange_IFit: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any], Unit]
  ] = js.native
}

object IFit {
  @scala.inline
  def apply(): IFit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFit]
  }
  @scala.inline
  implicit class IFitOps[Self <: IFit] (val x: Self) extends AnyVal {
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
    def setOnItemInnerStateChange(value: (/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any]) => Unit): Self = this.set("onItemInnerStateChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemInnerStateChange: Self = this.set("onItemInnerStateChange", js.undefined)
  }
  
}

