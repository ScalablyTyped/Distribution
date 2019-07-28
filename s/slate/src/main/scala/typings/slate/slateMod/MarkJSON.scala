package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkJSON extends js.Object {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var `object`: mark
  var `type`: String
}

object MarkJSON {
  @scala.inline
  def apply(`object`: mark, `type`: String, data: StringDictionary[js.Any] = null): MarkJSON = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[MarkJSON]
  }
}

