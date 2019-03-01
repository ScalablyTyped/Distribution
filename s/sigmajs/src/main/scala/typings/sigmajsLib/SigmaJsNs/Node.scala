package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var image: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    id: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    color: java.lang.String = null,
    image: js.Any = null,
    label: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
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

