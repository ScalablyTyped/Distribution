package typings.router5.typesTypesBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleState extends js.Object {
  var name: String
  var params: Params
}

object SimpleState {
  @scala.inline
  def apply(name: String, params: Params): SimpleState = {
    val __obj = js.Dynamic.literal(name = name, params = params)
  
    __obj.asInstanceOf[SimpleState]
  }
}

