package typings.semanticUiReact.refRefMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictRefProps extends js.Object {
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Called when componentDidMount.
    *
    * @param {HTMLElement} node - Referred node.
    */
  var innerRef: js.UndefOr[typings.react.mod.Ref[_]] = js.native
}

object StrictRefProps {
  @scala.inline
  def apply(): StrictRefProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictRefProps]
  }
  @scala.inline
  implicit class StrictRefPropsOps[Self <: StrictRefProps] (val x: Self) extends AnyVal {
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
    def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: typings.react.mod.Ref[_]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
  }
  
}

