package typings.reactColor.photoshopMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoshopPickerStylesProps extends js.Object {
  var actions: CSSProperties
  var body: CSSProperties
  var controls: CSSProperties
  var head: CSSProperties
  var hue: CSSProperties
  var picker: CSSProperties
  var previews: CSSProperties
  var saturation: CSSProperties
  var top: CSSProperties
}

object PhotoshopPickerStylesProps {
  @scala.inline
  def apply(
    actions: CSSProperties,
    body: CSSProperties,
    controls: CSSProperties,
    head: CSSProperties,
    hue: CSSProperties,
    picker: CSSProperties,
    previews: CSSProperties,
    saturation: CSSProperties,
    top: CSSProperties
  ): PhotoshopPickerStylesProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoshopPickerStylesProps]
  }
}

