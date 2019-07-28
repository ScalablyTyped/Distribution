package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieDuration extends js.Object {
  var cookieDuration: Double
  var enabled: Boolean
  var `type`: String
}

object Anon_CookieDuration {
  @scala.inline
  def apply(cookieDuration: Double, enabled: Boolean, `type`: String): Anon_CookieDuration = {
    val __obj = js.Dynamic.literal(cookieDuration = cookieDuration, enabled = enabled)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_CookieDuration]
  }
}

