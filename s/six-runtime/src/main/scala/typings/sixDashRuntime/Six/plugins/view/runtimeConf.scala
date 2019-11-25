package typings.sixDashRuntime.Six.plugins.view

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
    val __obj = js.Dynamic.literal(codeKey = codeKey.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[runtimeConf]
  }
}

