package typings.rcTrigger.interfaceMod

import typings.rcTrigger.anon.ClassName
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotionProps extends MotionType {
  var visible: js.UndefOr[Boolean] = js.native
  def children(props: ClassName, ref: Ref[_]): ReactElement = js.native
}

object MotionProps {
  @scala.inline
  def apply(children: (ClassName, Ref[_]) => ReactElement): MotionProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
    __obj.asInstanceOf[MotionProps]
  }
  @scala.inline
  implicit class MotionPropsOps[Self <: MotionProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: (ClassName, Ref[_]) => ReactElement): Self = this.set("children", js.Any.fromFunction2(value))
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

