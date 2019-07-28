package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameTypeString extends js.Object {
  var name: String
  var `type`: String
}

object Anon_NameTypeString {
  @scala.inline
  def apply(name: String, `type`: String): Anon_NameTypeString = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NameTypeString]
  }
}

