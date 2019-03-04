package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RefType[T] extends js.Object {
  @JSName(" $refType")
  var ` $refType`: T
}

object _RefType {
  @scala.inline
  def apply[T](` $refType`: T): _RefType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(" $refType")(` $refType`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_RefType[T]]
  }
}

