package typings.reactOnsenui

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {} */
trait HTMLAttributesidclassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HTMLAttributesidclassName {
  @scala.inline
  def apply(className: String = null, id: String = null, style: CSSProperties = null): HTMLAttributesidclassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassName]
  }
}

