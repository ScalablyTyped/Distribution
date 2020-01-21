package typings.raygun4js

import typings.raygun4js.mod.BreadcrumbLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: BreadcrumbLevel
  var location: String
  var message: String
  var metadata: js.Any
}

object AnonLevel {
  @scala.inline
  def apply(level: BreadcrumbLevel, location: String, message: String, metadata: js.Any): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLevel]
  }
}

