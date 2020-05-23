package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.ISourceKeyRecord
import typings.qlikEngineapi.EngineAPI.ITableRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Qk extends js.Object {
  var qk: js.Array[ISourceKeyRecord]
  var qtr: js.Array[ITableRecord]
}

object Qk {
  @scala.inline
  def apply(qk: js.Array[ISourceKeyRecord], qtr: js.Array[ITableRecord]): Qk = {
    val __obj = js.Dynamic.literal(qk = qk.asInstanceOf[js.Any], qtr = qtr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Qk]
  }
}

