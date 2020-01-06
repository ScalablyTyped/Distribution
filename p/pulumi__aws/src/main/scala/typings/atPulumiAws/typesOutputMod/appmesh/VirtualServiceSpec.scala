package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceSpec extends js.Object {
  var provider: js.UndefOr[VirtualServiceSpecProvider] = js.native
}

object VirtualServiceSpec {
  @scala.inline
  def apply(provider: VirtualServiceSpecProvider = null): VirtualServiceSpec = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceSpec]
  }
}

