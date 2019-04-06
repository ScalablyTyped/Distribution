package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Provider extends js.Object {
  var provider: js.UndefOr[Anon_VirtualNodeVirtualRouter] = js.undefined
}

object Anon_Provider {
  @scala.inline
  def apply(provider: Anon_VirtualNodeVirtualRouter = null): Anon_Provider = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[Anon_Provider]
  }
}

