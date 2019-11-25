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
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlAST]
  }
}

