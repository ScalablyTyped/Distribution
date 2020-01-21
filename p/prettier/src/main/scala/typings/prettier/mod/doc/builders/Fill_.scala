package typings.prettier.mod.doc.builders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fill_ extends _Doc {
  var parts: js.Array[Doc]
  var `type`: typings.prettier.prettierStrings.fill
}

object Fill_ {
  @scala.inline
  def apply(parts: js.Array[Doc], `type`: typings.prettier.prettierStrings.fill): Fill_ = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fill_]
  }
}

