package typings
package promiseDotAllsettledLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromiseRejection[E]
  extends PromiseResult[js.Any, E] {
  var reason: E
  var status: promiseDotAllsettledLib.promiseDotAllsettledLibStrings.rejected
}

object PromiseRejection {
  @scala.inline
  def apply[E](reason: E, status: promiseDotAllsettledLib.promiseDotAllsettledLibStrings.rejected): PromiseRejection[E] = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = status)
  
    __obj.asInstanceOf[PromiseRejection[E]]
  }
}

