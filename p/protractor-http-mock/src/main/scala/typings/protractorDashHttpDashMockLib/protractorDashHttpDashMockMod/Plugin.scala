package typings
package protractorDashHttpDashMockLib.protractorDashHttpDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Plugin for custom matching logic.
  */
trait Plugin extends js.Object {
  /**
    * Match function.
    * Return a truthy value to indicate successfull match.
    *
    * @param mockRequest The mock to compare request with.
    * @param requestConfig The request object to compare mock with.
    */
  def `match`[T1, T2](
    mockRequest: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.requestsNs.AllRequests[T1, T2],
    requestConfig: protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.requestsNs.AllRequests[T1, T2]
  ): scala.Boolean
}

object Plugin {
  @scala.inline
  def apply(
    `match`: (protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.requestsNs.AllRequests[js.Any, js.Any], protractorDashHttpDashMockLib.protractorDashHttpDashMockMod.requestsNs.AllRequests[js.Any, js.Any]) => scala.Boolean
  ): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Plugin]
  }
}

