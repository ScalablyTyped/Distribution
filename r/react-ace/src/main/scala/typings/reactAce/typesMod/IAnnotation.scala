package typings.reactAce.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnnotation extends js.Object {
  var column: Double
  var row: Double
  var text: String
  var `type`: String
}

object IAnnotation {
  @scala.inline
  def apply(column: Double, row: Double, text: String, `type`: String): IAnnotation = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnotation]
  }
}

