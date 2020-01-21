package typings.protocolBuffersSchema

import typings.protocolBuffersSchema.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOptions extends js.Object {
  var options: Options
  var value: Double
}

object AnonOptions {
  @scala.inline
  def apply(options: Options, value: Double): AnonOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOptions]
  }
}

