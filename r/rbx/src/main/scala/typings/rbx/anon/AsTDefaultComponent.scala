package typings.rbx.anon

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsTDefaultComponent[TDefaultComponent /* <: ReactType[_] */] extends js.Object {
  var as: TDefaultComponent
}

object AsTDefaultComponent {
  @scala.inline
  def apply[TDefaultComponent](as: TDefaultComponent): AsTDefaultComponent[TDefaultComponent] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsTDefaultComponent[TDefaultComponent]]
  }
}

