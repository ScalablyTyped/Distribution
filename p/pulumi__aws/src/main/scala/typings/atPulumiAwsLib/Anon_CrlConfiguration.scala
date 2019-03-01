package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CrlConfiguration extends js.Object {
  var crlConfiguration: js.UndefOr[Anon_CustomCname] = js.undefined
}

object Anon_CrlConfiguration {
  @scala.inline
  def apply(crlConfiguration: Anon_CustomCname = null): Anon_CrlConfiguration = {
    val __obj = js.Dynamic.literal()
    if (crlConfiguration != null) __obj.updateDynamic("crlConfiguration")(crlConfiguration)
    __obj.asInstanceOf[Anon_CrlConfiguration]
  }
}

