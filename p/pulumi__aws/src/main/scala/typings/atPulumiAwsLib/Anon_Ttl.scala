package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ttl extends js.Object {
  var ttl: scala.Double
  var `type`: java.lang.String
}

object Anon_Ttl {
  @scala.inline
  def apply(ttl: scala.Double, `type`: java.lang.String): Anon_Ttl = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("ttl")(ttl)
    __obj.asInstanceOf[Anon_Ttl]
  }
}

