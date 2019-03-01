package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Io extends js.Object {
  var cancelled_write_bytes: java.lang.String
  var rchar: java.lang.String
  var read_bytes: java.lang.String
  var syscr: java.lang.String
  var syscw: java.lang.String
  var wchar: java.lang.String
  var write_bytes: java.lang.String
}

object Io {
  @scala.inline
  def apply(
    cancelled_write_bytes: java.lang.String,
    rchar: java.lang.String,
    read_bytes: java.lang.String,
    syscr: java.lang.String,
    syscw: java.lang.String,
    wchar: java.lang.String,
    write_bytes: java.lang.String
  ): Io = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelled_write_bytes")(cancelled_write_bytes)
    __obj.updateDynamic("rchar")(rchar)
    __obj.updateDynamic("read_bytes")(read_bytes)
    __obj.updateDynamic("syscr")(syscr)
    __obj.updateDynamic("syscw")(syscw)
    __obj.updateDynamic("wchar")(wchar)
    __obj.updateDynamic("write_bytes")(write_bytes)
    __obj.asInstanceOf[Io]
  }
}

