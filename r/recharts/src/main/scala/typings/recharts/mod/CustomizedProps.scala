package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizedProps extends js.Object {
  var component: ContentRenderer[_] | ReactElement = js.native
}

object CustomizedProps {
  @scala.inline
  def apply(component: ContentRenderer[_] | ReactElement): CustomizedProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizedProps]
  }
  @scala.inline
  implicit class CustomizedPropsOps[Self <: CustomizedProps] (val x: Self) extends AnyVal {
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
    def setComponentFunction1(value: _ => ReactNode): Self = this.set("component", js.Any.fromFunction1(value))
    @scala.inline
    def setComponent(value: ContentRenderer[_] | ReactElement): Self = this.set("component", value.asInstanceOf[js.Any])
  }
  
}

