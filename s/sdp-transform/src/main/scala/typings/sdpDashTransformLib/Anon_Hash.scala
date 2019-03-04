package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hash extends js.Object {
  var hash: java.lang.String
  var `type`: java.lang.String
}

object Anon_Hash {
  @scala.inline
  def apply(hash: java.lang.String, `type`: java.lang.String): Anon_Hash = {
    val __obj = js.Dynamic.literal(hash = hash)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Hash]
  }
}

