package typings.reduxMockStore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispatch[DispatchExts] extends js.Object {
  var dispatch: DispatchExts
}

object AnonDispatch {
  @scala.inline
  def apply[DispatchExts](dispatch: DispatchExts): AnonDispatch[DispatchExts] = {
    val __obj = js.Dynamic.literal(dispatch = dispatch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDispatch[DispatchExts]]
  }
}

