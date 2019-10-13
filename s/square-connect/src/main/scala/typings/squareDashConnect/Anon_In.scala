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
    val __obj = js.Dynamic.literal(in = in, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_In]
  }
}

