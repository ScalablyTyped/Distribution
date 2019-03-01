package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IMeassureList
  */
trait IMeassureList extends js.Object {
  var qItems: js.Array[IMeassureListItemLayout]
}

object IMeassureList {
  @scala.inline
  def apply(qItems: js.Array[IMeassureListItemLayout]): IMeassureList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qItems")(qItems)
    __obj.asInstanceOf[IMeassureList]
  }
}

