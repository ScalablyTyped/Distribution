package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Qk extends js.Object {
  var qk: js.Array[qlikDashEngineapiLib.EngineAPINs.ISourceKeyRecord]
  var qtr: js.Array[qlikDashEngineapiLib.EngineAPINs.ITableRecord]
}

object Anon_Qk {
  @scala.inline
  def apply(
    qk: js.Array[qlikDashEngineapiLib.EngineAPINs.ISourceKeyRecord],
    qtr: js.Array[qlikDashEngineapiLib.EngineAPINs.ITableRecord]
  ): Anon_Qk = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qk")(qk)
    __obj.updateDynamic("qtr")(qtr)
    __obj.asInstanceOf[Anon_Qk]
  }
}

