package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSFontAttribute extends js.Object {
  var _archive: js.UndefOr[java.lang.String] = js.undefined
  var _class: sketchappLib.sketchappLibStrings.fontDescriptor
  var attributes: Anon_Name
}

object SketchMSFontAttribute {
  @scala.inline
  def apply(
    _class: sketchappLib.sketchappLibStrings.fontDescriptor,
    attributes: Anon_Name,
    _archive: java.lang.String = null
  ): SketchMSFontAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("attributes")(attributes)
    if (_archive != null) __obj.updateDynamic("_archive")(_archive)
    __obj.asInstanceOf[SketchMSFontAttribute]
  }
}

