package typings.procfsStats.mod

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], lib = lib.asInstanceOf[js.Any], resident = resident.asInstanceOf[js.Any], share = share.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemoryStat]
  }
}

