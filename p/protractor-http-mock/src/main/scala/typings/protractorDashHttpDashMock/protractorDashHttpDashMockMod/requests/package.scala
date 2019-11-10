package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requests {
  /**
    * All available request types.
    */
  type AllRequests = Get[js.Any] | (PostData[js.Any, js.Any]) | Post[js.Any] | Head[js.Any] | Delete[js.Any] | Put[js.Any] | Patch[js.Any] | Jsonp[js.Any]
}
