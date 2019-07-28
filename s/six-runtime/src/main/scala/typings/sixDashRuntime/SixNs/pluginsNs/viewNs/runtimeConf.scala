package typings.sixDashRuntime.SixNs.pluginsNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait runtimeConf extends js.Object {
  var codeKey: String
  var dataKey: String
  var msgKey: String
}

object runtimeConf {
  @scala.inline
  def apply(codeKey: String, dataKey: String, msgKey: String): runtimeConf = {
    val __obj = js.Dynamic.literal(codeKey = codeKey, dataKey = dataKey, msgKey = msgKey)
  
    __obj.asInstanceOf[runtimeConf]
  }
}

