package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: String
  var `type`: String
}

object Anon_Hash {
  @scala.inline
  def apply(hash: String, `type`: String): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Hash]
  }
}

