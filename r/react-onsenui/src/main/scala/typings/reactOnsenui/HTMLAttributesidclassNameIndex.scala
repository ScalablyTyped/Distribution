package typings.reactOnsenui

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  index ? :number,   tabbarId ? :string,   modifier ? :string,   onPostChange ? :(): void} */
trait HTMLAttributesidclassNameIndex extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onPostChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabbarId: js.UndefOr[String] = js.undefined
}

object HTMLAttributesidclassNameIndex {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    index: Int | Double = null,
    modifier: String = null,
    onPostChange: () => Unit = null,
    style: CSSProperties = null,
    tabbarId: String = null
  ): HTMLAttributesidclassNameIndex = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier.asInstanceOf[js.Any])
    if (onPostChange != null) __obj.updateDynamic("onPostChange")(js.Any.fromFunction0(onPostChange))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabbarId != null) __obj.updateDynamic("tabbarId")(tabbarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameIndex]
  }
}

