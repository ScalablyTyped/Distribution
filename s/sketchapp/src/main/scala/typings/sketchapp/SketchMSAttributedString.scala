package typings.sketchapp

import typings.sketchapp.sketchappStrings.attributedString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSAttributedString extends js.Object {
  var _class: attributedString
  var archivedAttributedString: js.UndefOr[SketchMSKeyValueArchive] = js.undefined
  var attributes: js.Array[SketchMSStringAttribute]
  var string: String
}

object SketchMSAttributedString {
  @scala.inline
  def apply(
    _class: attributedString,
    attributes: js.Array[SketchMSStringAttribute],
    string: String,
    archivedAttributedString: SketchMSKeyValueArchive = null
  ): SketchMSAttributedString = {
    val __obj = js.Dynamic.literal(_class = _class, attributes = attributes, string = string)
    if (archivedAttributedString != null) __obj.updateDynamic("archivedAttributedString")(archivedAttributedString)
    __obj.asInstanceOf[SketchMSAttributedString]
  }
}

