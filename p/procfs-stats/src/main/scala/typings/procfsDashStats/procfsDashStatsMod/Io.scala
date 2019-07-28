package typings.procfsDashStats.procfsDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Io extends js.Object {
  var cancelled_write_bytes: String
  var rchar: String
  var read_bytes: String
  var syscr: String
  var syscw: String
  var wchar: String
  var write_bytes: String
}

object Io {
  @scala.inline
  def apply(
    cancelled_write_bytes: String,
    rchar: String,
    read_bytes: String,
    syscr: String,
    syscw: String,
    wchar: String,
    write_bytes: String
  ): Io = {
    val __obj = js.Dynamic.literal(cancelled_write_bytes = cancelled_write_bytes, rchar = rchar, read_bytes = read_bytes, syscr = syscr, syscw = syscw, wchar = wchar, write_bytes = write_bytes)
  
    __obj.asInstanceOf[Io]
  }
}

