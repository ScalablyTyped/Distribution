package typings.seleniumDashWebdriver.seleniumDashWebdriverMod.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntryJSON extends js.Object {
  var level: String
  var message: String
  var timestamp: Double
  var `type`: String
}

object IEntryJSON {
  @scala.inline
  def apply(level: String, message: String, timestamp: Double, `type`: String): IEntryJSON = {
    val __obj = js.Dynamic.literal(level = level, message = message, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IEntryJSON]
  }
}

