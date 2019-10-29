package typings.stellarDashSdk.libServerUnderscoreApiMod.ServerApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRecordSigners extends js.Object {
  var key: String
  var `type`: String
  var weight: Double
}

object AccountRecordSigners {
  @scala.inline
  def apply(key: String, `type`: String, weight: Double): AccountRecordSigners = {
    val __obj = js.Dynamic.literal(key = key, weight = weight)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AccountRecordSigners]
  }
}

