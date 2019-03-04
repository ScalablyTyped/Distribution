package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentInfoValue extends js.Object {
  var `type`: scala.Double
  var `val`: java.lang.String
}

object ExtentInfoValue {
  @scala.inline
  def apply(`type`: scala.Double, `val`: java.lang.String): ExtentInfoValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[ExtentInfoValue]
  }
}

