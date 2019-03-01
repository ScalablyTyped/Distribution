package typings
package snabbdomLib.helpersAttachtoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachData
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
     with /* i */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  var placeholder: js.UndefOr[js.Any] = js.undefined
  var real: js.UndefOr[stdLib.Node] = js.undefined
}

object AttachData {
  @scala.inline
  def apply(
    NumberDictionary: /* i */ org.scalablytyped.runtime.NumberDictionary[js.Any] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    placeholder: js.Any = null,
    real: stdLib.Node = null
  ): AttachData = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (real != null) __obj.updateDynamic("real")(real)
    __obj.asInstanceOf[AttachData]
  }
}

