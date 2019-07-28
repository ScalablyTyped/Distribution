package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ttl extends js.Object {
  var ttl: Double
  var `type`: String
}

object Anon_Ttl {
  @scala.inline
  def apply(ttl: Double, `type`: String): Anon_Ttl = {
    val __obj = js.Dynamic.literal(ttl = ttl)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Ttl]
  }
}

