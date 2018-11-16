package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.mockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestsNs {
  /**
           * All available request types.
           */
  type AllRequests[T1, T2] = Get[T1] | (PostData[T1, T2]) | Post[T1] | Head[T1] | Delete[T1] | Put[T1] | Patch[T1] | Jsonp[T1]
  /**
           * Request methods type
           */
  type Method = protractorDashHttpDashMockLib.protractorDashHttpDashMockLibStrings.GET | protractorDashHttpDashMockLib.protractorDashHttpDashMockLibStrings.POST | protractorDashHttpDashMockLib.protractorDashHttpDashMockLibStrings.DELETE | protractorDashHttpDashMockLib.protractorDashHttpDashMockLibStrings.PUT | protractorDashHttpDashMockLib.protractorDashHttpDashMockLibStrings.HEAD | protractorDashHttpDashMockLib.protractorDashHttpDashMockLibStrings.PATCH | protractorDashHttpDashMockLib.protractorDashHttpDashMockLibStrings.JSONP
}
