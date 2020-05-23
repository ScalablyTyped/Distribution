package typings.reactNativeSvg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AST extends js.Object {
  var Tag: ComponentType[js.Object]
  var children: js.Array[AST | Element | String]
  var parent: AST | Null
  var priority: js.UndefOr[Map[String, js.UndefOr[Boolean]]] = js.undefined
  var props: StringDictionary[js.UndefOr[Styles | String]]
  var style: js.UndefOr[Styles] = js.undefined
  var styles: js.UndefOr[String] = js.undefined
  var tag: String
}

object AST {
  @scala.inline
  def apply(
    Tag: ComponentType[js.Object],
    children: js.Array[AST | Element | String],
    props: StringDictionary[js.UndefOr[Styles | String]],
    tag: String,
    parent: AST = null,
    priority: Map[String, js.UndefOr[Boolean]] = null,
    style: Styles = null,
    styles: String = null
  ): AST = {
    val __obj = js.Dynamic.literal(Tag = Tag.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AST]
  }
}

