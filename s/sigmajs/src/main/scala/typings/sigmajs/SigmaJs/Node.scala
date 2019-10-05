package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* key */ StringDictionary[js.Any] {
  var color: js.UndefOr[String] = js.undefined
  var id: String
  var image: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    id: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    color: String = null,
    image: js.Any = null,
    label: String = null,
    size: Int | Double = null,
    `type`: String = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Node = {
    val __obj = js.Dynamic.literal(id = id)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color)
    if (image != null) __obj.updateDynamic("image")(image)
    if (label != null) __obj.updateDynamic("label")(label)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

