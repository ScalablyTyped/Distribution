package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkProperties extends js.Object {
  var data: js.UndefOr[Data | StringDictionary[js.Any]] = js.undefined
  var `object`: js.UndefOr[mark] = js.undefined
  var `type`: String
}

object MarkProperties {
  @scala.inline
  def apply(`type`: String, data: Data | StringDictionary[js.Any] = null, `object`: mark = null): MarkProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkProperties]
  }
}

