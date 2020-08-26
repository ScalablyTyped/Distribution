package typings.senchaTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMask extends IComponent {
  /** [Method] Returns the value of transparent
    * @returns Boolean
    */
  var getTransparent: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Sets the value of transparent
    * @param transparent Boolean The new value.
    */
  var setTransparent: js.UndefOr[js.Function1[/* transparent */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var transparent: js.UndefOr[Boolean] = js.native
}

object IMask {
  @scala.inline
  def apply(): IMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMask]
  }
  @scala.inline
  implicit class IMaskOps[Self <: IMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetTransparent(value: () => Boolean): Self = this.set("getTransparent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTransparent: Self = this.set("getTransparent", js.undefined)
    @scala.inline
    def setSetTransparent(value: /* transparent */ js.UndefOr[Boolean] => Unit): Self = this.set("setTransparent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTransparent: Self = this.set("setTransparent", js.undefined)
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparent: Self = this.set("transparent", js.undefined)
  }
  
}

