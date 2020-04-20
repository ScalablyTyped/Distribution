package typings.rbx

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsTDefaultComponent[TDefaultComponent /* <: ReactType[_] */] extends js.Object {
  var as: TDefaultComponent
}

object AnonAsTDefaultComponent {
  @scala.inline
  def apply[TDefaultComponent /* <: ReactType[_] */](as: TDefaultComponent): AnonAsTDefaultComponent[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsTDefaultComponent[TDefaultComponent]]
  }
}

