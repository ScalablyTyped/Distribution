package typings.slate.slateMod

import org.scalablytyped.runtime.StringDictionary
import typings.slate.slateStrings.annotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationJSON extends RangeTypeJSON {
  var anchor: js.UndefOr[PointJSON] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var focus: js.UndefOr[PointJSON] = js.undefined
  var key: String
  var `object`: js.UndefOr[annotation] = js.undefined
  var `type`: String
}

object AnnotationJSON {
  @scala.inline
  def apply(
    key: String,
    `type`: String,
    anchor: PointJSON = null,
    data: StringDictionary[js.Any] = null,
    focus: PointJSON = null,
    `object`: annotation = null
  ): AnnotationJSON = {
    val __obj = js.Dynamic.literal(key = key)
    __obj.updateDynamic("type")(`type`)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (data != null) __obj.updateDynamic("data")(data)
    if (focus != null) __obj.updateDynamic("focus")(focus)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[AnnotationJSON]
  }
}

