package typings.procfsDashStats.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStat extends js.Object {
  var data: String
  var dt: String
  var lib: String
  var resident: String
  var share: String
  var size: String
  var text: String
}

object MemoryStat {
  @scala.inline
  def apply(data: String, dt: String, lib: String, resident: String, share: String, size: String, text: String): MemoryStat = {
    val __obj = js.Dynamic.literal(data = data, dt = dt, lib = lib, resident = resident, share = share, size = size, text = text)
  
    __obj.asInstanceOf[MemoryStat]
  }
}

