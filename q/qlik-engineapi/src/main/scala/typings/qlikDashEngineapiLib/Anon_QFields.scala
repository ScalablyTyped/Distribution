package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QFields extends js.Object {
  var qFields: js.Array[qlikDashEngineapiLib.EngineAPINs.IDataField]
  var qFormatSpec: java.lang.String
}

object Anon_QFields {
  @scala.inline
  def apply(qFields: js.Array[qlikDashEngineapiLib.EngineAPINs.IDataField], qFormatSpec: java.lang.String): Anon_QFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qFields")(qFields)
    __obj.updateDynamic("qFormatSpec")(qFormatSpec)
    __obj.asInstanceOf[Anon_QFields]
  }
}

