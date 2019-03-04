package typings
package raygun4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Level extends js.Object {
  var level: BreadcrumbLevel
  var location: java.lang.String
  var message: java.lang.String
  var metadata: js.Any
}

object Anon_Level {
  @scala.inline
  def apply(level: BreadcrumbLevel, location: java.lang.String, message: java.lang.String, metadata: js.Any): Anon_Level = {
    val __obj = js.Dynamic.literal(level = level, location = location, message = message, metadata = metadata)
  
    __obj.asInstanceOf[Anon_Level]
  }
}

