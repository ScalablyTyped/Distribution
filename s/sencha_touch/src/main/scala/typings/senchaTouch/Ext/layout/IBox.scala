package typings.senchaTouch.Ext.layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBox extends IDefault {
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  /** [Method] Returns the value of align
    * @returns String
    */
  var getAlign: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of orient
    * @returns String
    */
  var getOrient: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of pack
    * @returns String
    */
  var getPack: js.UndefOr[js.Function0[String]] = js.native
  /** [Method]
    * @param item Object
    * @param isInner Object
    */
  @JSName("onItemInnerStateChange")
  var onItemInnerStateChange_IBox: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (String) */
  var pack: js.UndefOr[String] = js.native
  /** [Method] Sets the value of align
    * @param align String The new value.
    */
  var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of orient
    * @param orient String The new value.
    */
  var setOrient: js.UndefOr[js.Function1[/* orient */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of pack
    * @param pack String The new value.
    */
  var setPack: js.UndefOr[js.Function1[/* pack */ js.UndefOr[String], Unit]] = js.native
}

object IBox {
  @scala.inline
  def apply(): IBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBox]
  }
  @scala.inline
  implicit class IBoxOps[Self <: IBox] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setGetAlign(value: () => String): Self = this.set("getAlign", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetAlign: Self = this.set("getAlign", js.undefined)
    @scala.inline
    def setGetOrient(value: () => String): Self = this.set("getOrient", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetOrient: Self = this.set("getOrient", js.undefined)
    @scala.inline
    def setGetPack(value: () => String): Self = this.set("getPack", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetPack: Self = this.set("getPack", js.undefined)
    @scala.inline
    def setOnItemInnerStateChange(value: (/* item */ js.UndefOr[js.Any], /* isInner */ js.UndefOr[js.Any]) => Unit): Self = this.set("onItemInnerStateChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemInnerStateChange: Self = this.set("onItemInnerStateChange", js.undefined)
    @scala.inline
    def setPack(value: String): Self = this.set("pack", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePack: Self = this.set("pack", js.undefined)
    @scala.inline
    def setSetAlign(value: /* align */ js.UndefOr[String] => Unit): Self = this.set("setAlign", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetAlign: Self = this.set("setAlign", js.undefined)
    @scala.inline
    def setSetOrient(value: /* orient */ js.UndefOr[String] => Unit): Self = this.set("setOrient", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetOrient: Self = this.set("setOrient", js.undefined)
    @scala.inline
    def setSetPack(value: /* pack */ js.UndefOr[String] => Unit): Self = this.set("setPack", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetPack: Self = this.set("setPack", js.undefined)
  }
  
}

