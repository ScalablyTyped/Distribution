package typings.qiniuDashJs.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentInfoValue extends js.Object {
  var `type`: Double
  var `val`: String
}

object ExtentInfoValue {
  @scala.inline
  def apply(`type`: Double, `val`: String): ExtentInfoValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[ExtentInfoValue]
  }
}

