package typings.rethinkdb.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoReplyWait extends js.Object {
  var noreplyWait: Boolean
}

object NoReplyWait {
  @scala.inline
  def apply(noreplyWait: Boolean): NoReplyWait = {
    val __obj = js.Dynamic.literal(noreplyWait = noreplyWait)
  
    __obj.asInstanceOf[NoReplyWait]
  }
}

