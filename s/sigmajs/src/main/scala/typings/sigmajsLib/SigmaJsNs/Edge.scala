package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var size: js.UndefOr[scala.Double] = js.undefined
  var source: java.lang.String
  var target: java.lang.String
}

object Edge {
  @scala.inline
  def apply(
    id: java.lang.String,
    source: java.lang.String,
    target: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    color: java.lang.String = null,
    size: scala.Int | scala.Double = null
  ): Edge = {
    val __obj = js.Dynamic.literal(id = id, source = source, target = target)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

