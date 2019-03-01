package typings
package router5Lib.typesTypesBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleState extends js.Object {
  var name: java.lang.String
  var params: Params
}

object SimpleState {
  @scala.inline
  def apply(name: java.lang.String, params: Params): SimpleState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[SimpleState]
  }
}

