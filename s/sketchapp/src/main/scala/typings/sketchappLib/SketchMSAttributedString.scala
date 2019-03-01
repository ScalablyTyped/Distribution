package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSAttributedString extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.attributedString
  var archivedAttributedString: js.UndefOr[SketchMSKeyValueArchive] = js.undefined
  var attributes: js.Array[SketchMSStringAttribute]
  var string: java.lang.String
}

object SketchMSAttributedString {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.attributedString,
    attributes: js.Array[SketchMSStringAttribute],
    string: java.lang.String,
    archivedAttributedString: SketchMSKeyValueArchive = null
  ): SketchMSAttributedString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("string")(string)
    if (archivedAttributedString != null) __obj.updateDynamic("archivedAttributedString")(archivedAttributedString)
    __obj.asInstanceOf[SketchMSAttributedString]
  }
}

