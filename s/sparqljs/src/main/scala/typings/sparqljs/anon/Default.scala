package typings.sparqljs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var default: js.Array[String]
  var named: js.Array[String]
}

object Default {
  @scala.inline
  def apply(default: js.Array[String], named: js.Array[String]): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

