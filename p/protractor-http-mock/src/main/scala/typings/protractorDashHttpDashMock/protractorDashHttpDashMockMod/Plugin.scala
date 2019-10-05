package typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod

import typings.protractorDashHttpDashMock.protractorDashHttpDashMockMod.requests.AllRequests
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
  def `match`[T1, T2](mockRequest: AllRequests[T1, T2], requestConfig: AllRequests[T1, T2]): Boolean
}

object Plugin {
  @scala.inline
  def apply(`match`: (AllRequests[js.Any, js.Any], AllRequests[js.Any, js.Any]) => Boolean): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
    __obj.asInstanceOf[Plugin]
  }
}

