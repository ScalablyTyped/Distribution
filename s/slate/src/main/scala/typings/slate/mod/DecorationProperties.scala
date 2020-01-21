package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.decoration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecorationProperties extends RangeTypeProperties {
  var anchor: js.UndefOr[Point] = js.undefined
  var data: js.UndefOr[Data | StringDictionary[js.Any]] = js.undefined
  var focus: js.UndefOr[Point] = js.undefined
  var `object`: js.UndefOr[decoration] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DecorationProperties {
  @scala.inline
  def apply(
    anchor: Point = null,
    data: Data | StringDictionary[js.Any] = null,
    focus: Point = null,
    `object`: decoration = null,
    `type`: String = null
  ): DecorationProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecorationProperties]
  }
}

