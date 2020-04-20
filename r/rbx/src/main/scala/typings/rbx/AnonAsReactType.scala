package typings.rbx

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsReactType extends js.Object {
  var as: ReactType[_]
}

object AnonAsReactType {
  @scala.inline
  def apply(as: ReactType[_]): AnonAsReactType = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsReactType]
  }
}

