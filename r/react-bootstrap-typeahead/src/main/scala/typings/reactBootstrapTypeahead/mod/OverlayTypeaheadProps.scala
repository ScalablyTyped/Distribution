package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadProps<any>, 'align' | 'dropup' | 'flip' | 'onMenuHide' | 'onMenuShow' | 'onMenuToggle'> */
@js.native
trait OverlayTypeaheadProps extends js.Object {
  var align: js.UndefOr[TypeaheadAlign] = js.native
  var dropup: js.UndefOr[Boolean] = js.native
  var flip: js.UndefOr[Boolean] = js.native
  var onMenuHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onMenuShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onMenuToggle: js.UndefOr[js.Function1[/* show */ Boolean, Unit]] = js.native
}

object OverlayTypeaheadProps {
  @scala.inline
  def apply(): OverlayTypeaheadProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayTypeaheadProps]
  }
  @scala.inline
  implicit class OverlayTypeaheadPropsOps[Self <: OverlayTypeaheadProps] (val x: Self) extends AnyVal {
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
    def setAlign(value: TypeaheadAlign): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setDropup(value: Boolean): Self = this.set("dropup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropup: Self = this.set("dropup", js.undefined)
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setOnMenuHide(value: () => Unit): Self = this.set("onMenuHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMenuHide: Self = this.set("onMenuHide", js.undefined)
    @scala.inline
    def setOnMenuShow(value: () => Unit): Self = this.set("onMenuShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMenuShow: Self = this.set("onMenuShow", js.undefined)
    @scala.inline
    def setOnMenuToggle(value: /* show */ Boolean => Unit): Self = this.set("onMenuToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMenuToggle: Self = this.set("onMenuToggle", js.undefined)
  }
  
}

