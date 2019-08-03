package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkJSON extends js.Object {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var `object`: js.UndefOr[mark] = js.undefined
  var `type`: String
}

object MarkJSON {
  @scala.inline
  def apply(`type`: String, data: StringDictionary[js.Any] = null, `object`: mark = null): MarkJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[MarkJSON]
  }
}

