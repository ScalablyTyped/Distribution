package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.annotation
import typings.slate.slateStrings.decoration
import typings.slate.slateStrings.range
import typings.slate.slateStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.slate.mod.RangeJSON
  - typings.slate.mod.SelectionJSON
  - typings.slate.mod.DecorationJSON
  - typings.slate.mod.AnnotationJSON
*/
trait RangeTypeJSON extends js.Object

object RangeTypeJSON {
  @scala.inline
  def RangeJSON(anchor: PointJSON = null, focus: PointJSON = null, `object`: range = null): RangeTypeJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeTypeJSON]
  }
  @scala.inline
  def SelectionJSON(
    anchor: PointJSON = null,
    focus: PointJSON = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    marks: js.Array[MarkJSON] = null,
    `object`: selection = null
  ): RangeTypeJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeTypeJSON]
  }
  @scala.inline
  def DecorationJSON(
    anchor: PointJSON = null,
    data: StringDictionary[js.Any] = null,
    focus: PointJSON = null,
    `object`: decoration = null,
    `type`: String = null
  ): RangeTypeJSON = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeTypeJSON]
  }
  @scala.inline
  def AnnotationJSON(
    key: String,
    `type`: String,
    anchor: PointJSON = null,
    data: StringDictionary[js.Any] = null,
    focus: PointJSON = null,
    `object`: annotation = null
  ): RangeTypeJSON = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeTypeJSON]
  }
}

