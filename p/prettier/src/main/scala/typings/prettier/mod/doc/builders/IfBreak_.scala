package typings.prettier.mod.doc.builders

import typings.prettier.prettierStrings.`if-break`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IfBreak_ extends _Doc {
  var breakContents: Doc
  var flatContents: Doc
  var `type`: `if-break`
}

object IfBreak_ {
  @scala.inline
  def apply(breakContents: Doc, flatContents: Doc, `type`: `if-break`): IfBreak_ = {
    val __obj = js.Dynamic.literal(breakContents = breakContents.asInstanceOf[js.Any], flatContents = flatContents.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfBreak_]
  }
}

