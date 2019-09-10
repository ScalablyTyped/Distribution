package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlState extends js.Object {
  var ast: AST | Null
}

object XmlState {
  @scala.inline
  def apply(ast: AST = null): XmlState = {
    val __obj = js.Dynamic.literal()
    if (ast != null) __obj.updateDynamic("ast")(ast)
    __obj.asInstanceOf[XmlState]
  }
}

