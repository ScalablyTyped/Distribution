package typings.reactColor.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-color.react-color/lib/components/photoshop/Photoshop.PhotoshopPickerStylesProps> */
trait PartialPhotoshopPickerSty extends js.Object {
  var actions: js.UndefOr[CSSProperties] = js.undefined
  var body: js.UndefOr[CSSProperties] = js.undefined
  var controls: js.UndefOr[CSSProperties] = js.undefined
  var head: js.UndefOr[CSSProperties] = js.undefined
  var hue: js.UndefOr[CSSProperties] = js.undefined
  var picker: js.UndefOr[CSSProperties] = js.undefined
  var previews: js.UndefOr[CSSProperties] = js.undefined
  var saturation: js.UndefOr[CSSProperties] = js.undefined
  var top: js.UndefOr[CSSProperties] = js.undefined
}

object PartialPhotoshopPickerSty {
  @scala.inline
  def apply(
    actions: CSSProperties = null,
    body: CSSProperties = null,
    controls: CSSProperties = null,
    head: CSSProperties = null,
    hue: CSSProperties = null,
    picker: CSSProperties = null,
    previews: CSSProperties = null,
    saturation: CSSProperties = null,
    top: CSSProperties = null
  ): PartialPhotoshopPickerSty = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (controls != null) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (previews != null) __obj.updateDynamic("previews")(previews.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPhotoshopPickerSty]
  }
}

