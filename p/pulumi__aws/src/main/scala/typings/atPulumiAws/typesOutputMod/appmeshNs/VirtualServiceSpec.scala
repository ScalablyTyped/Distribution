package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceSpec extends js.Object {
  var provider: js.UndefOr[VirtualServiceSpecProvider] = js.undefined
}

object VirtualServiceSpec {
  @scala.inline
  def apply(provider: VirtualServiceSpecProvider = null): VirtualServiceSpec = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider)
    __obj.asInstanceOf[VirtualServiceSpec]
  }
}

