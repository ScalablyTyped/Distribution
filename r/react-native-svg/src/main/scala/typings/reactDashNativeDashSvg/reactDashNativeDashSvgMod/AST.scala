package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AST extends js.Object {
  var Tag: ComponentType[js.Object]
  var children: js.Array[AST | Element | String]
  var tag: String
}

object AST {
  @scala.inline
  def apply(Tag: ComponentType[js.Object], children: js.Array[AST | Element | String], tag: String): AST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children, tag = tag)
  
    __obj.asInstanceOf[AST]
  }
}

