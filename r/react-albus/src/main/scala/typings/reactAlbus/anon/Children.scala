package typings.reactAlbus.anon

import typings.react.mod.ReactNode
import typings.reactAlbus.mod.WizardContext
import typings.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends WizardContextRenderProps {
  def children(wizard: WizardContext): ReactNode = js.native
}

object Children {
  @scala.inline
  def apply(children: WizardContext => ReactNode): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
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
    def setChildren(value: WizardContext => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

