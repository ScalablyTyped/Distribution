package typings.rbx.anon

import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsReactType extends js.Object {
  var as: ReactType[_]
}

object AsReactType {
  @scala.inline
  def apply(as: ReactType[_]): AsReactType = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsReactType]
  }
}

