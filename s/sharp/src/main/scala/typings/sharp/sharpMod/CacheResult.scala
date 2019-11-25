package typings.sharp.sharpMod

import typings.sharp.Anon_Current
import typings.sharp.Anon_CurrentMax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheResult extends js.Object {
  var files: Anon_CurrentMax
  var items: Anon_CurrentMax
  var memory: Anon_Current
}

object CacheResult {
  @scala.inline
  def apply(files: Anon_CurrentMax, items: Anon_CurrentMax, memory: Anon_Current): CacheResult = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CacheResult]
  }
}

