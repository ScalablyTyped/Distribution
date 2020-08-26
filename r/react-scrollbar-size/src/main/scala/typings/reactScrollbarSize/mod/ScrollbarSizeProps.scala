package typings.reactScrollbarSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollbarSizeProps extends js.Object {
  var onChange: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* measurement */ Measurement, Unit]] = js.native
}

object ScrollbarSizeProps {
  @scala.inline
  def apply(): ScrollbarSizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollbarSizeProps]
  }
  @scala.inline
  implicit class ScrollbarSizePropsOps[Self <: ScrollbarSizeProps] (val x: Self) extends AnyVal {
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
    def setOnChange(value: /* measurement */ Measurement => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnLoad(value: /* measurement */ Measurement => Unit): Self = this.set("onLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
  }
  
}

