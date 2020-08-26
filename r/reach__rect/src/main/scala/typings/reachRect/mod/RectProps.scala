package typings.reachRect.mod

import typings.reachRect.anon.Rect
import typings.react.mod.ReactNode
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RectProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ Rect, ReactNode]] = js.native
  var observe: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* rect */ DOMRect, Unit]] = js.native
}

object RectProps {
  @scala.inline
  def apply(): RectProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RectProps]
  }
  @scala.inline
  implicit class RectPropsOps[Self <: RectProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: /* args */ Rect => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setObserve(value: Boolean): Self = this.set("observe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserve: Self = this.set("observe", js.undefined)
    @scala.inline
    def setOnChange(value: /* rect */ DOMRect => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

