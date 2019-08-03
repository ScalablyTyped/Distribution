package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.decoration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationJSON extends RangeTypeJSON {
  var anchor: js.UndefOr[PointJSON] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var focus: js.UndefOr[PointJSON] = js.undefined
  var `object`: js.UndefOr[decoration] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DecorationJSON {
  @scala.inline
  def apply(
    anchor: PointJSON = null,
    data: StringDictionary[js.Any] = null,
    focus: PointJSON = null,
    `object`: decoration = null,
    `type`: String = null
  ): DecorationJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (data != null) __obj.updateDynamic("data")(data)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DecorationJSON]
  }
}

