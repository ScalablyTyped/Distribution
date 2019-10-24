package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentType
import typings.react.reactMod._Global_.JSX.Element
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsxAST extends AST {
  @JSName("children")
  var children_JsxAST: js.Array[Element | String]
}

object JsxAST {
  @scala.inline
  def apply(
    Tag: ComponentType[js.Object],
    children: js.Array[Element | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String,
    parent: AST = null,
    priority: Map[String, js.UndefOr[Boolean]] = null,
    style: Styles = null,
    styles: String = null
  ): JsxAST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children, props = props, tag = tag)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[JsxAST]
  }
}

