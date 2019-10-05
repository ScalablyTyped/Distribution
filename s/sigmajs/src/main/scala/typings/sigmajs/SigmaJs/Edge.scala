package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge
  extends /* key */ StringDictionary[js.Any] {
  var color: js.UndefOr[String] = js.undefined
  var id: String
  var size: js.UndefOr[Double] = js.undefined
  var source: String
  var target: String
}

object Edge {
  @scala.inline
  def apply(
    id: String,
    source: String,
    target: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    color: String = null,
    size: Int | Double = null
  ): Edge = {
    val __obj = js.Dynamic.literal(id = id, source = source, target = target)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

