package typings
package reduxDashMockDashStoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispatch[DispatchExts] extends js.Object {
  var dispatch: DispatchExts
}

object Anon_Dispatch {
  @scala.inline
  def apply[DispatchExts](dispatch: DispatchExts): Anon_Dispatch[DispatchExts] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dispatch[DispatchExts]]
  }
}

