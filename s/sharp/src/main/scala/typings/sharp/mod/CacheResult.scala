package typings.sharp.mod

import typings.sharp.anon.Current
import typings.sharp.anon.Max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheResult extends js.Object {
  var files: Max
  var items: Max
  var memory: Current
}

object CacheResult {
  @scala.inline
  def apply(files: Max, items: Max, memory: Current): CacheResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheResult]
  }
}

