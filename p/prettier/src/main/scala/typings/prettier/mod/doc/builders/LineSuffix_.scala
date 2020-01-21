package typings.prettier.mod.doc.builders

import typings.prettier.prettierStrings.`line-suffix`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineSuffix_ extends _Doc {
  var contents: Doc
  var `type`: `line-suffix`
}

object LineSuffix_ {
  @scala.inline
  def apply(contents: Doc, `type`: `line-suffix`): LineSuffix_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSuffix_]
  }
}

