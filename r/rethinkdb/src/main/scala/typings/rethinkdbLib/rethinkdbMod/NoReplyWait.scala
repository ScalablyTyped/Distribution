package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoReplyWait extends js.Object {
  var noreplyWait: scala.Boolean
}

object NoReplyWait {
  @scala.inline
  def apply(noreplyWait: scala.Boolean): NoReplyWait = {
    val __obj = js.Dynamic.literal(noreplyWait = noreplyWait)
  
    __obj.asInstanceOf[NoReplyWait]
  }
}

