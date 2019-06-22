package typings
package promiseDotAllsettledLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseResolution[T]
  extends PromiseResult[T, js.Any] {
  var status: promiseDotAllsettledLib.promiseDotAllsettledLibStrings.fulfilled
  var value: T
}

object PromiseResolution {
  @scala.inline
  def apply[T](status: promiseDotAllsettledLib.promiseDotAllsettledLibStrings.fulfilled, value: T): PromiseResolution[T] = {
    val __obj = js.Dynamic.literal(status = status, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PromiseResolution[T]]
  }
}

