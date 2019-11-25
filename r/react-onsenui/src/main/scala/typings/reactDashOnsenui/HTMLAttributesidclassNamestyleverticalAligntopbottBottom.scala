package typings.reactDashOnsenui

import typings.react.reactMod.CSSProperties
import typings.reactDashOnsenui.reactDashOnsenuiStrings.bottom
import typings.reactDashOnsenui.reactDashOnsenuiStrings.center
import typings.reactDashOnsenui.reactDashOnsenuiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  verticalAlign ? :'top' | 'bottom' | 'center'} */
trait HTMLAttributesidclassNamestyleverticalAligntopbottBottom extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var verticalAlign: js.UndefOr[top | bottom | center] = js.undefined
}

object HTMLAttributesidclassNamestyleverticalAligntopbottBottom {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    style: CSSProperties = null,
    verticalAlign: top | bottom | center = null
  ): HTMLAttributesidclassNamestyleverticalAligntopbottBottom = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNamestyleverticalAligntopbottBottom]
  }
}

