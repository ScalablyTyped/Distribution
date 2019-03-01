package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeStringOptional extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TypeStringOptional {
  @scala.inline
  def apply(`type`: java.lang.String = null): Anon_TypeStringOptional = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeStringOptional]
  }
}

