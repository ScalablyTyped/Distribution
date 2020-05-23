package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSAssertion extends js.Object {
  val id: java.lang.String
  val `type`: MSCredentialType
}

object MSAssertion {
  @scala.inline
  def apply(id: java.lang.String, `type`: MSCredentialType): MSAssertion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSAssertion]
  }
}

