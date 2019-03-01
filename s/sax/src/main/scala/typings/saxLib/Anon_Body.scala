package typings
package saxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String
  var name: java.lang.String
}

object Anon_Body {
  @scala.inline
  def apply(body: java.lang.String, name: java.lang.String): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Body]
  }
}

