package typings.snabbdom.attachtoMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachData
  extends /* i */ NumberDictionary[js.Any]
     with /* key */ StringDictionary[js.Any] {
  var placeholder: js.UndefOr[js.Any] = js.undefined
  var real: js.UndefOr[Node] = js.undefined
}

object AttachData {
  @scala.inline
  def apply(
    NumberDictionary: /* key */ NumberDictionary[js.Any] = null,
    StringDictionary: /**
    * Any other extra properties that have been attached to the object will also be present on the serialized object.
    */
  /* key */ StringDictionary[js.Any] = null,
    placeholder: js.Any = null,
    real: Node = null
  ): AttachData = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (real != null) __obj.updateDynamic("real")(real.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachData]
  }
}

