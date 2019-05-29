package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListProps extends js.Object {
  val error: js.UndefOr[java.lang.String] = js.undefined
  val height: js.UndefOr[scala.Double] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* value */ java.lang.String, scala.Unit]] = js.undefined
  val options: js.UndefOr[js.Array[reactDashElementalLib.Anon_Label]] = js.undefined
  val placeholder: js.UndefOr[java.lang.String] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  val width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object SelectListProps {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    onChange: /* value */ java.lang.String => scala.Unit = null,
    options: js.Array[reactDashElementalLib.Anon_Label] = null,
    placeholder: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    width: scala.Double | java.lang.String = null
  ): SelectListProps = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (options != null) __obj.updateDynamic("options")(options)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListProps]
  }
}

