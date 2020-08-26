package typings.reactSizeme.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeMeRenderProps extends SizeMeOptions {
  def children(props: SizeMeProps): ReactElement = js.native
}

object SizeMeRenderProps {
  @scala.inline
  def apply(children: SizeMeProps => ReactElement): SizeMeRenderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[SizeMeRenderProps]
  }
  @scala.inline
  implicit class SizeMeRenderPropsOps[Self <: SizeMeRenderProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: SizeMeProps => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

