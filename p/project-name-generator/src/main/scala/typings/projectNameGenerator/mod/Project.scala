package typings.projectNameGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  var dashed: String
  var raw: js.Array[String | Double]
  var spaced: String
}

object Project {
  @scala.inline
  def apply(dashed: String, raw: js.Array[String | Double], spaced: String): Project = {
    val __obj = js.Dynamic.literal(dashed = dashed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], spaced = spaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
}

