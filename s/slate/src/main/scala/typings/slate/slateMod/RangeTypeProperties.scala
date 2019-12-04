package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.immutable.Immutable.Set
import typings.slate.slateStrings.annotation
import typings.slate.slateStrings.decoration
import typings.slate.slateStrings.range
import typings.slate.slateStrings.selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.slate.slateMod.RangeProperties
  - typings.slate.slateMod.SelectionProperties
  - typings.slate.slateMod.DecorationProperties
  - typings.slate.slateMod.AnnotationProperties
*/
trait RangeTypeProperties extends js.Object

object RangeTypeProperties {
  @scala.inline
  def RangeProperties(anchor: Point = null, focus: Point = null, `object`: range = null): RangeTypeProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeTypeProperties]
  }
  @scala.inline
  def SelectionProperties(
    anchor: Point = null,
    focus: Point = null,
    isFocused: js.UndefOr[Boolean] = js.undefined,
    marks: Set[Mark] | js.Array[Mark] = null,
    `object`: selection = null
  ): RangeTypeProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocused)) __obj.updateDynamic("isFocused")(isFocused.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeTypeProperties]
  }
  @scala.inline
  def DecorationProperties(
    anchor: Point = null,
    data: Data | StringDictionary[js.Any] = null,
    focus: Point = null,
    `object`: decoration = null,
    `type`: String = null
  ): RangeTypeProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeTypeProperties]
  }
  @scala.inline
  def AnnotationProperties(
    key: String,
    `type`: String,
    anchor: Point = null,
    data: Data | StringDictionary[js.Any] = null,
    focus: Point = null,
    `object`: annotation = null
  ): RangeTypeProperties = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeTypeProperties]
  }
}

