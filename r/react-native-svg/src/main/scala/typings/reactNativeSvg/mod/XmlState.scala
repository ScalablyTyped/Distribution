package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlState extends js.Object {
  var ast: JsxAST | Null
}

object XmlState {
  @scala.inline
  def apply(ast: JsxAST = null): XmlState = {
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlState]
  }
}

