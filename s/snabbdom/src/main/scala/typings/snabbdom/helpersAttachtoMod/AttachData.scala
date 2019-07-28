package typings.snabbdom.helpersAttachtoMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachData
  extends /* key */ StringDictionary[js.Any]
     with /* i */ NumberDictionary[js.Any] {
  var placeholder: js.UndefOr[js.Any] = js.undefined
  var real: js.UndefOr[Node] = js.undefined
}

object AttachData {
  @scala.inline
  def apply(
    NumberDictionary: /* i */ NumberDictionary[js.Any] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    placeholder: js.Any = null,
    real: Node = null
  ): AttachData = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (real != null) __obj.updateDynamic("real")(real)
    __obj.asInstanceOf[AttachData]
  }
}

