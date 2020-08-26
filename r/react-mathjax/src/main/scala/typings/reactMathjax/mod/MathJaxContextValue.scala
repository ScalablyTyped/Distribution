package typings.reactMathjax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MathJaxContextValue extends js.Object {
  var MathJax: js.UndefOr[js.Object] = js.native
  def registerNode(): Unit = js.native
}

object MathJaxContextValue {
  @scala.inline
  def apply(registerNode: () => Unit): MathJaxContextValue = {
    val __obj = js.Dynamic.literal(registerNode = js.Any.fromFunction0(registerNode))
    __obj.asInstanceOf[MathJaxContextValue]
  }
  @scala.inline
  implicit class MathJaxContextValueOps[Self <: MathJaxContextValue] (val x: Self) extends AnyVal {
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
    def setRegisterNode(value: () => Unit): Self = this.set("registerNode", js.Any.fromFunction0(value))
    @scala.inline
    def setMathJax(value: js.Object): Self = this.set("MathJax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMathJax: Self = this.set("MathJax", js.undefined)
  }
  
}

