package typings.sketchapp

import typings.sketchapp.sketchappStrings.paragraphStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SketchMSParagraphStyle extends js.Object {
  var _class: paragraphStyle
  var alignment: Double
  var allowsDefaultTighteningForTruncation: Double
}

object SketchMSParagraphStyle {
  @scala.inline
  def apply(_class: paragraphStyle, alignment: Double, allowsDefaultTighteningForTruncation: Double): SketchMSParagraphStyle = {
    val __obj = js.Dynamic.literal(_class = _class, alignment = alignment, allowsDefaultTighteningForTruncation = allowsDefaultTighteningForTruncation)
  
    __obj.asInstanceOf[SketchMSParagraphStyle]
  }
}

