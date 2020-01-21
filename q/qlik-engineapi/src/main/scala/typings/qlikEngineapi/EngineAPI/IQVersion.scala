package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQVersion extends js.Object {
  var qComponentVersion: String
}

object IQVersion {
  @scala.inline
  def apply(qComponentVersion: String): IQVersion = {
    val __obj = js.Dynamic.literal(qComponentVersion = qComponentVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IQVersion]
  }
}

