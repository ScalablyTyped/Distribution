package typings.rcResizeObserver.mod

import typings.rcResizeObserver.anon.Height
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeObserverProps extends js.Object {
  var children: ReactNode = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  /** Trigger if element resized. Will always trigger when first time render. */
  var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.native
}

object ResizeObserverProps {
  @scala.inline
  def apply(): ResizeObserverProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeObserverProps]
  }
  @scala.inline
  implicit class ResizeObserverPropsOps[Self <: ResizeObserverProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnResize(value: /* size */ Height => Unit): Self = this.set("onResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
  }
  
}

