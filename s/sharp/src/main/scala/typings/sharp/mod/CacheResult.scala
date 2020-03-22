package typings.sharp.mod

import typings.sharp.AnonCurrent
import typings.sharp.AnonMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheResult extends js.Object {
  var files: AnonMax
  var items: AnonMax
  var memory: AnonCurrent
}

object CacheResult {
  @scala.inline
  def apply(files: AnonMax, items: AnonMax, memory: AnonCurrent): CacheResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheResult]
  }
}

