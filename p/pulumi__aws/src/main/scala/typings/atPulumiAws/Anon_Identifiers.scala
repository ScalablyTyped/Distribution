package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Identifiers extends js.Object {
  var identifiers: js.Array[String]
  var `type`: String
}

object Anon_Identifiers {
  @scala.inline
  def apply(identifiers: js.Array[String], `type`: String): Anon_Identifiers = {
    val __obj = js.Dynamic.literal(identifiers = identifiers)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Identifiers]
  }
}

