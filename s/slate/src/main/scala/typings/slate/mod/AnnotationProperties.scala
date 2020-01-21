package typings.slate.mod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.annotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationProperties extends RangeTypeProperties {
  var anchor: js.UndefOr[Point] = js.undefined
  var data: js.UndefOr[Data | StringDictionary[js.Any]] = js.undefined
  var focus: js.UndefOr[Point] = js.undefined
  var key: String
  var `object`: js.UndefOr[annotation] = js.undefined
  var `type`: String
}

object AnnotationProperties {
  @scala.inline
  def apply(
    key: String,
    `type`: String,
    anchor: Point = null,
    data: Data | StringDictionary[js.Any] = null,
    focus: Point = null,
    `object`: annotation = null
  ): AnnotationProperties = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`object` != null) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationProperties]
  }
}

