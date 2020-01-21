package typings.protractorHttpMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requests {
  /**
    * All available request types.
    */
  type AllRequests = typings.protractorHttpMock.mod.requests.Get[js.Any] | (typings.protractorHttpMock.mod.requests.PostData[js.Any, js.Any]) | typings.protractorHttpMock.mod.requests.Post[js.Any] | typings.protractorHttpMock.mod.requests.Head[js.Any] | typings.protractorHttpMock.mod.requests.Delete[js.Any] | typings.protractorHttpMock.mod.requests.Put[js.Any] | typings.protractorHttpMock.mod.requests.Patch[js.Any] | typings.protractorHttpMock.mod.requests.Jsonp[js.Any]
}
