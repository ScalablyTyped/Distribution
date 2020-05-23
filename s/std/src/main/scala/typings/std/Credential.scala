package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credential extends js.Object {
  val id: java.lang.String
  val `type`: java.lang.String
}

object Credential {
  @scala.inline
  def apply(id: java.lang.String, `type`: java.lang.String): Credential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
}

