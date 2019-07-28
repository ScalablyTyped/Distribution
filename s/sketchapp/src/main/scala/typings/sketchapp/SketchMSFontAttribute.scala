package typings.sketchapp

import typings.sketchapp.sketchappStrings.fontDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSFontAttribute extends js.Object {
  var _archive: js.UndefOr[String] = js.undefined
  var _class: fontDescriptor
  var attributes: Anon_Name
}

object SketchMSFontAttribute {
  @scala.inline
  def apply(_class: fontDescriptor, attributes: Anon_Name, _archive: String = null): SketchMSFontAttribute = {
    val __obj = js.Dynamic.literal(_class = _class, attributes = attributes)
    if (_archive != null) __obj.updateDynamic("_archive")(_archive)
    __obj.asInstanceOf[SketchMSFontAttribute]
  }
}

