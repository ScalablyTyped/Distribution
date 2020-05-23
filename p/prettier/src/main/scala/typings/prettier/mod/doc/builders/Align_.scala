package typings.prettier.mod.doc.builders

import typings.prettier.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align_ extends _Doc {
  var contents: Doc
  var n: Double | String | Type
  var `type`: typings.prettier.prettierStrings.align
}

object Align_ {
  @scala.inline
  def apply(contents: Doc, n: Double | String | Type, `type`: typings.prettier.prettierStrings.align): Align_ = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align_]
  }
}

