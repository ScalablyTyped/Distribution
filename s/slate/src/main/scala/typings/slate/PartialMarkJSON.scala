package typings.slate

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<slate.slate.MarkJSON> */
trait PartialMarkJSON extends js.Object {
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var `object`: js.UndefOr[mark] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object PartialMarkJSON {
  @scala.inline
  def apply(data: StringDictionary[js.Any] = null, `object`: mark = null, `type`: String = null): PartialMarkJSON = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMarkJSON]
  }
}

