package typings.qlikDashEngineapi

import typings.qlikDashEngineapi.EngineAPI.ISourceKeyRecord
import typings.qlikDashEngineapi.EngineAPI.ITableRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Qk extends js.Object {
  var qk: js.Array[ISourceKeyRecord]
  var qtr: js.Array[ITableRecord]
}

object Anon_Qk {
  @scala.inline
  def apply(qk: js.Array[ISourceKeyRecord], qtr: js.Array[ITableRecord]): Anon_Qk = {
    val __obj = js.Dynamic.literal(qk = qk, qtr = qtr)
  
    __obj.asInstanceOf[Anon_Qk]
  }
}

