package typings.snykPaketParser.lockParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaketLock extends js.Object {
  var groups: js.Array[Group]
}

object PaketLock {
  @scala.inline
  def apply(groups: js.Array[Group]): PaketLock = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaketLock]
  }
}

