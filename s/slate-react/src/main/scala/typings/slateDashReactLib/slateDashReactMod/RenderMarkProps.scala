package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderMarkProps extends js.Object {
  var attributes: RenderAttributes
  var children: reactLib.reactMod.ReactNode
  var editor: Editor
  var mark: slateLib.slateMod.Mark
  var marks: immutableLib.immutableMod.Set[slateLib.slateMod.Mark]
  var node: slateLib.slateMod.Node
  var offset: scala.Double
  var text: java.lang.String
}

object RenderMarkProps {
  @scala.inline
  def apply(
    attributes: RenderAttributes,
    children: reactLib.reactMod.ReactNode,
    editor: Editor,
    mark: slateLib.slateMod.Mark,
    marks: immutableLib.immutableMod.Set[slateLib.slateMod.Mark],
    node: slateLib.slateMod.Node,
    offset: scala.Double,
    text: java.lang.String
  ): RenderMarkProps = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], editor = editor, mark = mark, marks = marks, node = node.asInstanceOf[js.Any], offset = offset, text = text)
  
    __obj.asInstanceOf[RenderMarkProps]
  }
}

