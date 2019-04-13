package typings
package procfsDashStatsLib.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStat extends js.Object {
  var data: java.lang.String
  var dt: java.lang.String
  var lib: java.lang.String
  var resident: java.lang.String
  var share: java.lang.String
  var size: java.lang.String
  var text: java.lang.String
}

object MemoryStat {
  @scala.inline
  def apply(
    data: java.lang.String,
    dt: java.lang.String,
    lib: java.lang.String,
    resident: java.lang.String,
    share: java.lang.String,
    size: java.lang.String,
    text: java.lang.String
  ): MemoryStat = {
    val __obj = js.Dynamic.literal(data = data, dt = dt, lib = lib, resident = resident, share = share, size = size, text = text)
  
    __obj.asInstanceOf[MemoryStat]
  }
}

