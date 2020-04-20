package typings.promiseAllsettled.typesMod

import typings.promiseAllsettled.promiseAllsettledStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseRejection[E]
  extends PromiseResult[js.Any, E] {
  var reason: E
  var status: rejected
}

object PromiseRejection {
  @scala.inline
  def apply[E](reason: E, status: rejected): PromiseRejection[E] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromiseRejection[E]]
  }
}

