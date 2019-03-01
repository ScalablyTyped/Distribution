package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheResult extends js.Object {
  var files: sharpLib.Anon_CurrentMax
  var items: sharpLib.Anon_CurrentMax
  var memory: sharpLib.Anon_Current
}

object CacheResult {
  @scala.inline
  def apply(files: sharpLib.Anon_CurrentMax, items: sharpLib.Anon_CurrentMax, memory: sharpLib.Anon_Current): CacheResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("memory")(memory)
    __obj.asInstanceOf[CacheResult]
  }
}

