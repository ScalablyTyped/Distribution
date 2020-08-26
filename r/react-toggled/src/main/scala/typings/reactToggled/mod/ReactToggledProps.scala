package typings.reactToggled.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactToggledProps extends js.Object {
  val children: ChildrenFunction = js.native
  val defaultOn: js.UndefOr[Boolean] = js.native
  val on: js.UndefOr[Boolean] = js.native
  val onToggle: js.UndefOr[js.Function2[/* on */ Boolean, /* object */ TogglerStateAndHelpers, Unit]] = js.native
}

object ReactToggledProps {
  @scala.inline
  def apply(children: /* options */ TogglerStateAndHelpers => ReactNode): ReactToggledProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ReactToggledProps]
  }
  @scala.inline
  implicit class ReactToggledPropsOps[Self <: ReactToggledProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: /* options */ TogglerStateAndHelpers => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setDefaultOn(value: Boolean): Self = this.set("defaultOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOn: Self = this.set("defaultOn", js.undefined)
    @scala.inline
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    @scala.inline
    def setOnToggle(value: (/* on */ Boolean, /* object */ TogglerStateAndHelpers) => Unit): Self = this.set("onToggle", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnToggle: Self = this.set("onToggle", js.undefined)
  }
  
}

