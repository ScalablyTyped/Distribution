package typings.raygun4js

import typings.raygun4js.raygun4jsMod.BreadcrumbLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: BreadcrumbLevel
  var location: String
  var message: String
  var metadata: js.Any
}

object Anon_Level {
  @scala.inline
  def apply(level: BreadcrumbLevel, location: String, message: String, metadata: js.Any): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level, location = location, message = message, metadata = metadata)
  
    __obj.asInstanceOf[Anon_Level]
  }
}

