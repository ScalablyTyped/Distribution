package typings.reactMove.animateMod

import typings.react.mod.ReactElement
import typings.reactMove.mod.GetInterpolator
import typings.reactMove.mod.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimateProps extends js.Object {
  var enter: js.UndefOr[js.Any] = js.native
  var interpolation: js.UndefOr[GetInterpolator] = js.native
  var leave: js.UndefOr[js.Any] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var start: js.Any = js.native
  var update: js.UndefOr[js.Any] = js.native
  def children(state: HashMap): ReactElement = js.native
}

object IAnimateProps {
  @scala.inline
  def apply(children: HashMap => ReactElement, start: js.Any): IAnimateProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimateProps]
  }
  @scala.inline
  implicit class IAnimatePropsOps[Self <: IAnimateProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: HashMap => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: js.Any): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnter(value: js.Any): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    @scala.inline
    def setInterpolation(
      value: (/* begValue */ js.UndefOr[js.Any], /* endValue */ js.UndefOr[js.Any], /* attr */ js.UndefOr[String], /* namespace */ js.UndefOr[String]) => js.Function1[/* t */ Double, js.Any]
    ): Self = this.set("interpolation", js.Any.fromFunction4(value))
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    @scala.inline
    def setLeave(value: js.Any): Self = this.set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setUpdate(value: js.Any): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

