package typings.reactMathjax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathJaxContextValue extends js.Object {
  var MathJax: js.UndefOr[js.Object] = js.undefined
  def registerNode(): Unit
}

object MathJaxContextValue {
  @scala.inline
  def apply(registerNode: () => Unit, MathJax: js.Object = null): MathJaxContextValue = {
    val __obj = js.Dynamic.literal(registerNode = js.Any.fromFunction0(registerNode))
    if (MathJax != null) __obj.updateDynamic("MathJax")(MathJax.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathJaxContextValue]
  }
}

