package typings.squareDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_In extends js.Object {
  var in: String
  var name: String
  var `type`: String
}

object Anon_In {
  @scala.inline
  def apply(in: String, name: String, `type`: String): Anon_In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_In]
  }
}

