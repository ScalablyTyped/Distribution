package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieDuration extends js.Object {
  var cookieDuration: scala.Double
  var enabled: scala.Boolean
  var `type`: java.lang.String
}

object Anon_CookieDuration {
  @scala.inline
  def apply(cookieDuration: scala.Double, enabled: scala.Boolean, `type`: java.lang.String): Anon_CookieDuration = {
    val __obj = js.Dynamic.literal(cookieDuration = cookieDuration, enabled = enabled)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_CookieDuration]
  }
}

