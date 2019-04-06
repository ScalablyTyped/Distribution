package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_VirtualService extends js.Object {
  var virtualService: js.UndefOr[Anon_VirtualServiceName] = js.undefined
}

object Anon_VirtualService {
  @scala.inline
  def apply(virtualService: Anon_VirtualServiceName = null): Anon_VirtualService = {
    val __obj = js.Dynamic.literal()
    if (virtualService != null) __obj.updateDynamic("virtualService")(virtualService)
    __obj.asInstanceOf[Anon_VirtualService]
  }
}

