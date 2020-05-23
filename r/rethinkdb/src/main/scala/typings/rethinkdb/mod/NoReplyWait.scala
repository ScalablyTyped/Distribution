package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoReplyWait extends js.Object {
  var noreplyWait: Boolean
}

object NoReplyWait {
  @scala.inline
  def apply(noreplyWait: Boolean): NoReplyWait = {
    val __obj = js.Dynamic.literal(noreplyWait = noreplyWait.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoReplyWait]
  }
}

