package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlAST extends AST {
  @JSName("children")
  var children_XmlAST: js.Array[XmlAST | String]
  @JSName("parent")
  var parent_XmlAST: XmlAST | Null
}

object XmlAST {
  @scala.inline
  def apply(
    Tag: ComponentType[js.Object],
    children: js.Array[XmlAST | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String,
    parent: XmlAST = null,
    priority: Map[String, js.UndefOr[Boolean]] = null,
    style: Styles = null,
    styles: String = null
  ): XmlAST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children, props = props, tag = tag)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[XmlAST]
  }
}

