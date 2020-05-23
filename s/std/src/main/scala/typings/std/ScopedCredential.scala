package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredential extends js.Object {
  val id: ArrayBuffer
  val `type`: ScopedCredentialType
}

object ScopedCredential {
  @scala.inline
  def apply(id: ArrayBuffer, `type`: ScopedCredentialType): ScopedCredential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedCredential]
  }
}

