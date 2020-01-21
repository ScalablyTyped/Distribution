package typings.rrule

import typings.rrule.typesMod.ParsedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParsedOptions extends js.Object {
  var parsedOptions: ParsedOptions
}

object AnonParsedOptions {
  @scala.inline
  def apply(parsedOptions: ParsedOptions): AnonParsedOptions = {
    val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParsedOptions]
  }
}

