package typings.slate

import org.scalablytyped.runtime.StringDictionary
import typings.slate.mod.MarkJSON
import typings.slate.mod.PointJSON
import typings.slate.slateStrings.decoration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined slate.slate.DecorationJSON & {  mark ? :slate.slate.MarkJSON} */
trait DecorationJSONmarkMarkJSO extends js.Object {
  var anchor: js.UndefOr[PointJSON] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var focus: js.UndefOr[PointJSON] = js.undefined
  var mark: js.UndefOr[MarkJSON] = js.undefined
  var `object`: js.UndefOr[decoration] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DecorationJSONmarkMarkJSO {
  @scala.inline
  def apply(
    anchor: PointJSON = null,
    data: StringDictionary[js.Any] = null,
    focus: PointJSON = null,
    mark: MarkJSON = null,
    `object`: decoration = null,
    `type`: String = null
  ): DecorationJSONmarkMarkJSO = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (mark != null) __obj.updateDynamic("mark")(mark.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationJSONmarkMarkJSO]
  }
}

